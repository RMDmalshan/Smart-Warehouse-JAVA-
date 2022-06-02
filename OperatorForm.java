/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF
 */
public class OperatorForm extends javax.swing.JFrame {

    /**
     * Creates new form newIdeaForm
     */
    public OperatorForm() {
        initComponents();
         this.setLocationRelativeTo(null);
         btnDelectUser.setVisible(false);
         btnMonthlyReport.setVisible(false);
         btnCreateOperatorAccount.setVisible(false);
     
       
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
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAddNewStoreJob = new javax.swing.JButton();
        btnCloseStorageJob = new javax.swing.JButton();
        btnDelectUser = new javax.swing.JButton();
        btnRegisterUser = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCreateOperatorAccount = new javax.swing.JButton();
        btnMonthlyReport = new javax.swing.JButton();
        btnCalculateBill = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(java.awt.Color.blue);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\project\\Smart_Warehouse_Project\\src\\main\\java\\image\\222.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setText("Welcome To Operator");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("    Operator Panel");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAddNewStoreJob.setBackground(new java.awt.Color(204, 204, 204));
        btnAddNewStoreJob.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAddNewStoreJob.setForeground(new java.awt.Color(0, 0, 0));
        btnAddNewStoreJob.setText("Add New Store Job");
        btnAddNewStoreJob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btnAddNewStoreJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNewStoreJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewStoreJobActionPerformed(evt);
            }
        });

        btnCloseStorageJob.setBackground(new java.awt.Color(204, 204, 204));
        btnCloseStorageJob.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCloseStorageJob.setForeground(new java.awt.Color(0, 0, 0));
        btnCloseStorageJob.setText("Close  storage job");
        btnCloseStorageJob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btnCloseStorageJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseStorageJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseStorageJobActionPerformed(evt);
            }
        });

        btnDelectUser.setBackground(new java.awt.Color(204, 204, 204));
        btnDelectUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDelectUser.setForeground(new java.awt.Color(0, 0, 0));
        btnDelectUser.setText("Delect User");
        btnDelectUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btnDelectUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelectUserActionPerformed(evt);
            }
        });

        btnRegisterUser.setBackground(new java.awt.Color(204, 204, 204));
        btnRegisterUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegisterUser.setForeground(new java.awt.Color(0, 0, 0));
        btnRegisterUser.setText("Register User");
        btnRegisterUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btnRegisterUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUserActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ravindu Malshan");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Developer ");

        btnCreateOperatorAccount.setBackground(new java.awt.Color(204, 204, 204));
        btnCreateOperatorAccount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCreateOperatorAccount.setForeground(new java.awt.Color(0, 0, 0));
        btnCreateOperatorAccount.setText("Create Operator Account");
        btnCreateOperatorAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btnCreateOperatorAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateOperatorAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOperatorAccountActionPerformed(evt);
            }
        });

        btnMonthlyReport.setBackground(new java.awt.Color(204, 204, 204));
        btnMonthlyReport.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMonthlyReport.setForeground(new java.awt.Color(0, 0, 0));
        btnMonthlyReport.setText(" Monthly Reports");
        btnMonthlyReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btnMonthlyReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMonthlyReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlyReportActionPerformed(evt);
            }
        });

        btnCalculateBill.setBackground(new java.awt.Color(204, 204, 204));
        btnCalculateBill.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCalculateBill.setForeground(new java.awt.Color(0, 0, 0));
        btnCalculateBill.setText("Calculate Bill");
        btnCalculateBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btnCalculateBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCreateOperatorAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelectUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegisterUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCloseStorageJob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddNewStoreJob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCalculateBill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMonthlyReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnRegisterUser)
                .addGap(29, 29, 29)
                .addComponent(btnAddNewStoreJob)
                .addGap(29, 29, 29)
                .addComponent(btnCloseStorageJob)
                .addGap(26, 26, 26)
                .addComponent(btnCalculateBill)
                .addGap(27, 27, 27)
                .addComponent(btnDelectUser)
                .addGap(18, 18, 18)
                .addComponent(btnCreateOperatorAccount)
                .addGap(26, 26, 26)
                .addComponent(btnMonthlyReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
        );

        btnLogOut.setBackground(new java.awt.Color(255, 255, 255));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(0, 0, 0));
        btnLogOut.setText("LOG OUT");
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(18, 18, 18))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogOut)
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUserActionPerformed
        // TODO add your handling code here:
        
       RegisterUserForm regUser = new RegisterUserForm();
       regUser.setVisible(true);
       this.setVisible(false);

       

    }//GEN-LAST:event_btnRegisterUserActionPerformed

    private void btnCloseStorageJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseStorageJobActionPerformed
        // TODO add your handling code here:
        
        CloseStorageJobForm close = new CloseStorageJobForm();
        close.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnCloseStorageJobActionPerformed

    private void btnAddNewStoreJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewStoreJobActionPerformed
        // TODO add your handling code here:
        
        AddNewStoreJobForm addJob = new AddNewStoreJobForm();
        addJob.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAddNewStoreJobActionPerformed

    private void btnCalculateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateBillActionPerformed
        // TODO add your handling code here:
        
        CalculateBillForm cal = new CalculateBillForm();
        cal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCalculateBillActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
  
        
     int a = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO LOGOUT","Select" ,JOptionPane.YES_NO_OPTION);
     if(a == 0){
         
         LoginForm loginform = new LoginForm();
         loginform.setVisible(true);
         this.setVisible(false);
     
     }

        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnDelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelectUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelectUserActionPerformed

    private void btnCreateOperatorAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOperatorAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateOperatorAccountActionPerformed

    private void btnMonthlyReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlyReportActionPerformed
        // TODO add your handling code here:
        
        MonthlyReportForm month = new MonthlyReportForm();
        month.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMonthlyReportActionPerformed

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
            java.util.logging.Logger.getLogger(OperatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewStoreJob;
    private javax.swing.JButton btnCalculateBill;
    private javax.swing.JButton btnCloseStorageJob;
    private javax.swing.JButton btnCreateOperatorAccount;
    private javax.swing.JButton btnDelectUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMonthlyReport;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
