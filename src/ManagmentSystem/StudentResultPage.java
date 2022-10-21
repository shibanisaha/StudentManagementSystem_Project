/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagmentSystem;

import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author shibani
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
    public StudentResultPage() {
        initComponents();
    }
    public StudentResultPage(String rollNo) {
        initComponents();
        jTextField1.setText(rollNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel27 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/icons8-logout-50.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 560));
        setMinimumSize(new java.awt.Dimension(700, 560));
        setPreferredSize(new java.awt.Dimension(700, 560));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 90, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setText("Roll Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 80, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 80, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 90, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel4.setText("Father Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 20));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 80, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel5.setText("Course");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel6.setText("Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 90, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setText("Total Marks");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setText("Passing Marks");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel9.setText("Marks Obtained");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel10.setText("Physics");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel11.setText("Mathematics");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel12.setText("Chemistry");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel13.setText("Electrical");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel14.setText("Biology");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel15.setText("100");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel16.setText("100");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel17.setText("100");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel18.setText("100");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel19.setText("100");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel20.setText("30");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, 20));

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel21.setText("30");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel22.setText("30");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel23.setText("30");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel24.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel24.setText("30");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 90, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 90, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 90, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 90, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 90, -1));

        jLabel25.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel25.setText("Total");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, 10));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 100, -1));

        jLabel26.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel26.setText("Verdict");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, 20));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 100, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/icons8-logout-50.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/schoolPic2.png"))); // NOI18N
        jLabel28.setText("jLabel28");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollNo = jTextField1.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollNo='"+rollNo+"' and result.rollNo='"+rollNo+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "RollNo doesn't exist");
            }else {
                jTextField2.setText(rs.getString(1));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
                jTextField5.setText(rs.getString(5));
                jTextField6.setText(rs.getString(6));
                
                
                jTextField7.setText(rs.getString(8));
                jTextField8.setText(rs.getString(9));
                jTextField9.setText(rs.getString(10));
                jTextField10.setText(rs.getString(11));
                jTextField11.setText(rs.getString(12));
                
                jTextField12.setText(rs.getString(13));
                
                int m1 = Integer.parseInt(rs.getString(8));
                int m2 = Integer.parseInt(rs.getString(9));
                int m3 = Integer.parseInt(rs.getString(10));
                int m4 = Integer.parseInt(rs.getString(11));
                int m5 = Integer.parseInt(rs.getString(12));
                
                if(m1<30 || m2<30 || m3<30 || m4<30 || m5<30){
                    jTextField13.setText("Fail");
                }else{
                    jTextField13.setText("Pass");
                }
                
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jTextField3.setEditable(false);
                jTextField4.setEditable(false);
                jTextField5.setEditable(false);
                jTextField6.setEditable(false);
                jTextField7.setEditable(false);
                jTextField8.setEditable(false);
                jTextField9.setEditable(false);
                jTextField10.setEditable(false);
                jTextField11.setEditable(false);
                jTextField12.setEditable(false);
                jTextField13.setEditable(false);
               
            
                
                
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int flag = JOptionPane.showConfirmDialog(null, "Are you sure, you want to exit", "Submit", JOptionPane.YES_NO_OPTION);
        if (flag == 0) {
            setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
