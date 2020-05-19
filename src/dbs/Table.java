package dbs;

//This class depicts the key table

import static dbs.NewJFrame.jTable1;
import static dbs.NewJFrame.table;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Table{

	private int globalDepth = -999;
	//A table contains array if bucket objects
	private Bucket[] bucks;
	//Length of the table
	private int size;
        
	public Table(){
		globalDepth = 3;
		size = (int)(Math.pow(2, (int)globalDepth));
		bucks = new Bucket[size];
	}

	public Table(int globalDepth){
		this.globalDepth = globalDepth;
		size = (int)(Math.pow(2, (int)globalDepth));
		bucks = new Bucket[size];
	}

	//Function which takes in value and returns the hashed one
	public int hashMe(int k){
		return (k%size);
	}

	//Function to add element to the table
	public void addElement(int value){
		int position = hashMe(value);
		//If that element of the table is null then add a new bucket to the table
		if(bucks[position] == null)
			addNewBucket(position);
		if(!bucks[position].isFull())
			bucks[position].addElementToBucket(value,true);
		else{
			showTable();
			collisionDetection(position);
			showTable();
			addElement(value);
		}
	}

	//Function to add bucket to the table 
	public void addNewBucket(int position){
		Bucket b = new Bucket();
		System.out.println("New Bucket Added");
		int i = 0;
		if(position%2 != 0){
			i = 1;
			b.setCluster(1);
		}
		while(i < size){
			bucks[i] = b;
			i += 2;
		}
	}

	//Function to deal with collision
	public void collisionDetection(int position){
		if(globalDepth == bucks[position].getLocalDepth())
			doubleTable(position);
		else
			splitBucket(position);
	}

	//Function to increase the global depth and double the size of table
	public void doubleTable(int position){
		System.out.println("Double the size of table");
		globalDepth = globalDepth + 1;
                NewJFrame.checkGD = globalDepth;
                NewJFrame.jTextField_SetGD.setText(globalDepth + "");
		Bucket[] newbuks = new Bucket[size*2];
		for(int i=0;i<size;i++){
			newbuks[i] = bucks[i];
			newbuks[size+i] = bucks[i];
		}
		bucks = newbuks;
		size = size*2;
		splitBucket(position);
	}

	//Function to split a bucket into two buckets and distribute the elements accordingly
	public void splitBucket(int position){
		Bucket b = new Bucket();
		Bucket a = bucks[position];
		int ld = a.getLocalDepth();
		System.out.println("Bucket Split to local depth " + (ld+1));
		int y = (int)(Math.pow(2,ld));
		int i = 0;
		while(i < size){
			if((i%y) == (position%y)){
				if((i&y) == y){
					bucks[i] = b;
				}
				else{
					bucks[i] = a;
				}
			}
			i++;
		}
		b.setLocalDepth(ld+1);
		a.setLocalDepth(ld+1);
		b.setCluster(y + (position%y));
		for(int j=0;j<a.getBfr();j++){
			int x = a.elements[j].getValue();			
			if((x&y) == y){
				b.addElementToBucket(x,true);
				a.elements[j].setValue(0);
				a.elements[j].setIsFull(false);
			}
		}
	}

	//Function to show all elements of the table
	public void showTable(){
		int i = 0;
                table = (DefaultTableModel) NewJFrame.jTable1.getModel();
                table.setRowCount(0);
		while(i < size){
			if(bucks[i] != null){
				System.out.print(i + " : ");
                                String bin = "";
                                        StringBuilder input1 = new StringBuilder();
                                        int x = i;
                                        for(int j = 0;j<globalDepth;j++){
                                            if((x&1) == 1)
                                                bin += 1 + "";
                                            else
                                                bin += 0 + "";
                                            x = x>>1;
                                        }
                                        input1.append(bin);
                                        input1 = input1.reverse();
				if(bucks[i].getCluster() < i){
					System.out.print("Bucket same as " + bucks[i].getCluster());
                                        Object[] data = {"(" + i + ") " + input1,"Bucket same as " + bucks[i].getCluster(),bucks[i].getLocalDepth()};
                                        
                                        
                                        NewJFrame.table.addRow(data);
                                        table.fireTableDataChanged();
                                }
				else{
					System.out.print(bucks[i].showBucket());
                                        Object[] data = {"(" + i + ") " + input1,bucks[i].showBucket(),bucks[i].getLocalDepth()};
                                        
                                        NewJFrame.table.addRow(data);
                                        table.fireTableDataChanged();
				}
				System.out.println();
			}
			i++;
		}
	}

	//Function to search for a key in database
	public int searchTable(int key){
            if(globalDepth == -999)
                return -999;
		int position = hashMe(key);
            if(bucks[position] == null)
                return -999;
		Bucket a = bucks[position];
		for(int j=0;j<a.getBfr();j++){
			int x = a.elements[j].getValue();
			if(x == key){
				System.out.println("Key found at position " + bucks[position].getCluster() + " in the table.");
                                
				return bucks[position].getCluster();
			}
		}
		System.out.println("Key not found.");
                return -999;
	}

}