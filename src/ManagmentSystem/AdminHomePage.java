/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagmentSystem;

import javax.swing.JOptionPane;

/**
 *
 * @author shibani
 */
public class AdminHomePage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage() {
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

        AddStudent = new javax.swing.JButton();
        AddResult = new javax.swing.JButton();
        ListStudent = new javax.swing.JButton();
        UpdateStudent = new javax.swing.JButton();
        ListStudentResult = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 560));
        setMinimumSize(new java.awt.Dimension(700, 560));
        setPreferredSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddStudent.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        AddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/icons8-student.png"))); // NOI18N
        AddStudent.setText("Add Student");
        AddStudent.setPreferredSize(new java.awt.Dimension(182, 70));
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(AddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 210, 60));

        AddResult.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        AddResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/icons8-grade-24.png"))); // NOI18N
        AddResult.setText("Add Result");
        AddResult.setPreferredSize(new java.awt.Dimension(182, 70));
        AddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddResultActionPerformed(evt);
            }
        });
        getContentPane().add(AddResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 210, 50));

        ListStudent.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        ListStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/icons8-checklist-30.png"))); // NOI18N
        ListStudent.setText("List Students");
        ListStudent.setPreferredSize(new java.awt.Dimension(182, 70));
        ListStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 210, 50));

        UpdateStudent.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        UpdateStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/icons8-edit student.png"))); // NOI18N
        UpdateStudent.setText("Update Students");
        UpdateStudent.setPreferredSize(new java.awt.Dimension(182, 70));
        UpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 210, 50));

        ListStudentResult.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        ListStudentResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/icons8-checklist-30.png"))); // NOI18N
        ListStudentResult.setText("List Students Results");
        ListStudentResult.setPreferredSize(new java.awt.Dimension(182, 70));
        ListStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentResultActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudentResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 210, 40));

        Logout.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/icons8-submit-document-32.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setMaximumSize(new java.awt.Dimension(182, 70));
        Logout.setMinimumSize(new java.awt.Dimension(182, 70));
        Logout.setPreferredSize(new java.awt.Dimension(182, 70));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagmentSystem/schoolPic2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure, you want to exit", "Submit", JOptionPane.YES_NO_OPTION);
        if (flag == 0) {
            setVisible(false);
            Home frame = new Home();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        // TODO add your handling code here:
         AddStudent frame = new AddStudent();
         frame.setVisible(true);
         frame.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_AddStudentActionPerformed

    private void AddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddResultActionPerformed
        // TODO add your handling code here:
          AddResults frame = new AddResults();
         frame.setVisible(true);
         frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_AddResultActionPerformed

    private void ListStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentActionPerformed
        // TODO add your handling code here:
         ListStudents frame = new ListStudents();
         frame.setVisible(true);
         frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListStudentActionPerformed

    private void UpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudentActionPerformed
        // TODO add your handling code here:
        UpdateStudent frame = new UpdateStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_UpdateStudentActionPerformed

    private void ListStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentResultActionPerformed
        // TODO add your handling code here:
        ListStudentResults frame = new ListStudentResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_ListStudentResultActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddResult;
    private javax.swing.JButton AddStudent;
    private javax.swing.JButton ListStudent;
    private javax.swing.JButton ListStudentResult;
    private javax.swing.JButton Logout;
    private javax.swing.JButton UpdateStudent;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
