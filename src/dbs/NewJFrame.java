/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbs;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Manan patel
 */
public class NewJFrame extends javax.swing.JFrame {
    
    public static DefaultTableModel table;
    public static Table t;
    public static int checkBFR;
    public static int checkGD;
    public static int flag;
    public static int[] allKeys = new int[100000];
    public static int length = 0;
    public static int maxLD = 0;
    
    public NewJFrame() {
        this.setTitle("DBS Module 2");
        checkBFR = -999;
        checkGD = -999;
        flag = 0;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_EnterKey = new javax.swing.JTextField();
        jTextField_SearchKey = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_EnterGd = new javax.swing.JButton();
        jButton_EnterKey = new javax.swing.JButton();
        jTextField_SetBFR = new javax.swing.JTextField();
        jTextField_SetGD = new javax.swing.JTextField();
        jButton_SetBFR = new javax.swing.JButton();
        jButton_SearchKey = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INPUT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), java.awt.Color.blue)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("ENTER KEY(S)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("SEARCH KEY");

        jButton_EnterGd.setText("Set GD");
        jButton_EnterGd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_EnterGd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_EnterGdMouseClicked(evt);
            }
        });

        jButton_EnterKey.setText("Enter");
        jButton_EnterKey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_EnterKey.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton_EnterKey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_EnterKeyMouseClicked(evt);
            }
        });

        jButton_SetBFR.setText("Set BFR");
        jButton_SetBFR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_SetBFR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SetBFRMouseClicked(evt);
            }
        });

        jButton_SearchKey.setText("Search");
        jButton_SearchKey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_SearchKey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SearchKeyMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("GLOBAL DEPTH");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("BFR");

        jLabel5.setText("<html>*Keep space between keys for multiple inputs.</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addGap(119, 119, 119)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(171, 171, 171))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField_EnterKey)
                    .addComponent(jButton_EnterKey, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_SearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_EnterGd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_SetGD, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_SetBFR, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SetBFR, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_EnterKey, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_SearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_SetGD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_SetBFR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_EnterKey)
                    .addComponent(jButton_EnterGd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_SetBFR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_SearchKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OUTPUT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), java.awt.Color.blue)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Directories", "Buckets", "Local Depth"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane2.setViewportView(jTable1);

    jButton_Reset.setText("RESET PROGRAM");
    jButton_Reset.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButton_ResetMouseClicked(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(216, 216, 216))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jButton_Reset)
                    .addGap(420, 420, 420))))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButton_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_EnterKeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EnterKeyMouseClicked

        String val = jTextField_EnterKey.getText();
        try{
            if(checkBFR == -999){
                JOptionPane.showMessageDialog(null, "Enter BFR Value");
            }
            else if(checkGD == -999){
                JOptionPane.showMessageDialog(null, "Enter Global Depth");
            }
            else if(val.equals("")){
                JOptionPane.showMessageDialog(null, "Enter Key value");
            }
            else{
                
                int[] keys = new int[val.length()];
                int ctr = 0;
                String store = "";
                for(int i=0;i<val.length();i++){
                    if(val.charAt(i) == ' '){
                        
                        keys[ctr] = Integer.parseInt(store);
                        ctr++;
                        store = "";
                    }
                    else{
                        store += val.charAt(i) + "";
                    }
                }
                keys[ctr] = Integer.parseInt(store);
                ctr++;
                int f = 0;
                    for(int i=0;i<ctr;i++){
                            if(keys[i] <= 0){
                                JOptionPane.showMessageDialog(null, keys[i] + " is invalid. Enter positive integer only");
                                f = 1;
                                break;
                            }
                            else{
                                            
                                    if( t != null && t.searchTable(keys[i]) >= 0 ){
                                        JOptionPane.showMessageDialog(null, keys[i] + " already present in database");
                                        f = 1;
                                        break;
                                    }    
                            }
                    }
                if(f == 0){
                    for(int i=0;i<ctr;i++){
                                    if(flag == 0){
                                        t = new Table(checkGD);
                                        flag = 1;
                                    }        
                                    if( t.searchTable(keys[i]) >= 0 ){
                                        JOptionPane.showMessageDialog(null, keys[i] + " added only once in database");
                                       
                                    }    
                                    else{       
                                            t.addElement(keys[i]);
                                            allKeys[length] = keys[i];
                                            length++;
                                            t.showTable();
                                    }
                    }
                }
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter valid integer for key");
        }
    }//GEN-LAST:event_jButton_EnterKeyMouseClicked

    private void jButton_EnterGdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EnterGdMouseClicked
            String gd = jTextField_SetGD.getText();
            if(gd.equals("")){
                JOptionPane.showMessageDialog(null, "Enter Global Depth");
            }
            else{
                try{
                int GD = Integer.parseInt(gd);
                if(GD <= 0 || GD > 25){
                    JOptionPane.showMessageDialog(null, "Value of GD should from to 1 and 25");
                    jTextField_SetGD.setText(checkGD + "");
                }
                else{
                    if(checkGD == -999){
                        checkGD = GD;
                        JOptionPane.showMessageDialog(null, "Value of GD set to " + checkGD);
                    }
                    else if(GD < maxLD){
                        JOptionPane.showMessageDialog(null, "New value of GD is lesser than maximum localdepth of a bucket. Enter value greater than r equal to " + maxLD);
                        jTextField_SetGD.setText(checkGD + "");
                    }
                    else{
                        checkGD = GD;
                        JOptionPane.showMessageDialog(null, "Value of GD set to " + checkGD + " and table updated succesfully.");
                        table = (DefaultTableModel) NewJFrame.jTable1.getModel();
                        table.setRowCount(0);
                        t = null;
                        t = new Table(checkGD);
                        maxLD = 0;
                        for(int i=0;i<length;i++){
                            t.addElement(allKeys[i]);
                            t.showTable();
                        }
                    }
                }
                } catch(HeadlessException | NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Enter valid integer for GD");
                }
            }
    }//GEN-LAST:event_jButton_EnterGdMouseClicked

    private void jButton_SetBFRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SetBFRMouseClicked
        String bfr = jTextField_SetBFR.getText();
            if(bfr.equals("")){
                JOptionPane.showMessageDialog(null, "Enter BFR");
            }
            else{
                try{
                int BFR = Integer.parseInt(bfr);
                if(BFR <= 0){
                    JOptionPane.showMessageDialog(null, "Value of BFR should be positive integer only");
                }
                else{
                    if(checkBFR == -999){
                        checkBFR = BFR;
                        JOptionPane.showMessageDialog(null, "Value of BFR set to " + checkBFR);
                    }
                    else{
                        checkBFR = BFR;
                        JOptionPane.showMessageDialog(null, "Value of BFR set to " + checkBFR + " and table updated succesfully.");
                        jTextField_SetBFR.setText(checkBFR + "");
                        table = (DefaultTableModel) NewJFrame.jTable1.getModel();
                        table.setRowCount(0);
                        t = null;
                        t = new Table(checkGD);
                        maxLD = 0;
                        for(int i=0;i<length;i++){
                            t.addElement(allKeys[i]);
                            t.showTable();
                        }
                    }
                }
                } catch(HeadlessException | NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Enter valid integer for BFR");
                }
            }
    }//GEN-LAST:event_jButton_SetBFRMouseClicked

    private void jButton_SearchKeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SearchKeyMouseClicked
        String search = jTextField_SearchKey.getText();
            if(search.equals("")){
                JOptionPane.showMessageDialog(null, "Enter search value");
            }
            else{
                try{
                int SRC = Integer.parseInt(search);
                if(SRC <= 0){
                    JOptionPane.showMessageDialog(null, "Search value should be positive integer only");
                }
                else{
                    if( t == null ){
                        JOptionPane.showMessageDialog(null, SRC + " not present in the database ");
                    }
                    else{
                        int x = t.searchTable(SRC);
                        if( x >= 0 ){
                            JOptionPane.showMessageDialog(null, SRC + " present at " + x + " in database ");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, SRC + " not present in the database ");
                        }
                    }
                }
                } catch(HeadlessException | NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Enter valid integer for BFR");
                }
            }
    }//GEN-LAST:event_jButton_SearchKeyMouseClicked

    private void jButton_ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ResetMouseClicked
        jTextField_EnterKey.setText("");
        jTextField_SearchKey.setText("");
        jTextField_SetBFR.setText("");
        jTextField_SetGD.setText("");
        checkBFR = -999;
        checkGD = -999;
        flag = 0;
        length = 0;
        maxLD = 0;
        table = (DefaultTableModel) NewJFrame.jTable1.getModel();
        table.setRowCount(0);
        t = null;
    }//GEN-LAST:event_jButton_ResetMouseClicked
                
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_EnterGd;
    private javax.swing.JButton jButton_EnterKey;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JButton jButton_SearchKey;
    private javax.swing.JButton jButton_SetBFR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_EnterKey;
    private javax.swing.JTextField jTextField_SearchKey;
    private javax.swing.JTextField jTextField_SetBFR;
    public static javax.swing.JTextField jTextField_SetGD;
    // End of variables declaration//GEN-END:variables
}
