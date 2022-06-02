/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DB.DBConnection;
import Table.CloseStorageJobTable;
import Table.CustomerTable;
import static UI.LoginForm.userType;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS TUF
 */
public class MonthlyReportForm extends javax.swing.JFrame {

    /**
     * Creates new form newIdeaForm
     */
    public MonthlyReportForm() {
        initComponents();
         this.setLocationRelativeTo(null);
         
         
         
         
           String name = LoginForm.userType;
          
           if(LoginForm.userType.equals("Manager")){
           
           lblUser.setText("Welcome To " + userType);
           lblUserPanel.setText(userType + " Panel");
           
           btnDelectUser.setVisible(true);
           btnMonthlyReport.setVisible(true);
           btnCreateOperatorAccount.setVisible(true);
           
           }else if(LoginForm.userType.equals("Operator")){
           
           lblUser.setText("Welcome To " + userType);
           lblUserPanel.setText(userType + " Panel");
           
           btnDelectUser.setVisible(false);
           btnMonthlyReport.setVisible(false);
           btnCreateOperatorAccount.setVisible(false);
           
           }

     
    }
    
    
    
         public ArrayList<CustomerTable> userList(){
        ArrayList<CustomerTable> usersList = new ArrayList<>();
        
        try {
            
            Connection connection = DBConnection.getInstance().getConnection();
            Statement createStatement = connection.createStatement();
            ResultSet rs = createStatement.executeQuery("SELECT * FROM register_user");
            
            CustomerTable custortable;
            
            while(rs.next()){
                
            custortable = new CustomerTable(rs.getString("username"),(rs.getString("user_ID")),(rs.getString("email")),(rs.getString("phone_number")));
            usersList.add(custortable);
            
            
            }
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DelectUserForm.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null,"Data Base Error"+ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
               return usersList;
        
       
        
    }
    
     public void registerUser(){
        ArrayList<CustomerTable> list = userList();
        DefaultTableModel model = (DefaultTableModel)tblUser.getModel();
        Object[] row = new Object[4];
        

           for(int i = 0; i< list.size(); i++){
               row[0] = list.get(i).getUsername();
               row[1] = list.get(i).getUser_ID();
               row[2] = list.get(i).getEmail();
               row[3] = list.get(i).getPhone_number();
               
               model.addRow(row);
               
           
           }
       
    }
     
         public ArrayList<CloseStorageJobTable> userList1(){
         ArrayList<CloseStorageJobTable> usersList = new ArrayList<>();
        
        try {
            
            Connection connection = DBConnection.getInstance().getConnection();
            Statement createStatement = connection.createStatement();
            ResultSet rs = createStatement.executeQuery("SELECT * FROM add_new_storage_job");
            
            CloseStorageJobTable closejob;
            
            while(rs.next()){
                
            closejob = new CloseStorageJobTable(rs.getString("user_id"),(rs.getString("product_name")),(rs.getString("space")),(rs.getString("duration")),(rs.getString("date")),(rs.getString("profile")));
            usersList.add(closejob);
            
            
            }
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DelectUserForm.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null,"Data Base Error"+ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
               return usersList;
        
       
        
    }
    
     public void storageDetails(){
        ArrayList<CloseStorageJobTable> list = userList1();
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        Object[] row = new Object[6];
        

           for(int i = 0; i< list.size(); i++){
               row[0] = list.get(i).getUser_id();
               row[1] = list.get(i).getProduct_name();
               row[2] = list.get(i).getSpace();
               row[3] = list.get(i).getDuration();
               row[4] = list.get(i).getDate();
               row[5] = list.get(i).getProfile();
               
               model.addRow(row);
               
           
           }
           
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
        lblUser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblUserPanel = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnStorageJob = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnShowRegisterUser = new javax.swing.JButton();
        btnPrint1 = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();

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

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        lblUser.setForeground(java.awt.Color.blue);
        lblUser.setText("Welcome To Manager");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\project\\Smart_Warehouse_Project\\src\\main\\java\\image\\222.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUser)
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUserPanel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblUserPanel.setForeground(java.awt.Color.blue);
        lblUserPanel.setText("    Manager Panel");
        lblUserPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                                .addGap(14, 14, 14)
                                .addComponent(lblUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel3)))
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
                .addComponent(lblUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
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

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Product Name", "Space", "Duration", "Date", "Profile"
            }
        ));
        jScrollPane1.setViewportView(table);

        tblUser.setBackground(new java.awt.Color(255, 255, 255));
        tblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblUser.setForeground(new java.awt.Color(0, 0, 0));
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "UserID", "Email", "Phone Number"
            }
        ));
        jScrollPane2.setViewportView(tblUser);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Storage Details");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registered User Details");

        btnStorageJob.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        btnStorageJob.setText("Show");
        btnStorageJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStorageJobActionPerformed(evt);
            }
        });

        btnShowRegisterUser.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        btnShowRegisterUser.setText("Show");
        btnShowRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowRegisterUserActionPerformed(evt);
            }
        });

        btnPrint1.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        btnPrint1.setForeground(new java.awt.Color(0, 0, 0));
        btnPrint1.setText("Print");
        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint1ActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 0, 0));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClear1.setBackground(new java.awt.Color(255, 255, 255));
        btnClear1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        btnClear1.setForeground(new java.awt.Color(0, 0, 0));
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLogOut)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator2))
                                .addGap(48, 48, 48)
                                .addComponent(btnShowRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(60, 60, 60)
                                .addComponent(btnStorageJob, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnPrint)
                        .addGap(117, 117, 117)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrint1)
                        .addGap(114, 114, 114)
                        .addComponent(btnClear1)
                        .addGap(83, 83, 83))))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnStorageJob, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnShowRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnLogOut)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnDelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelectUserActionPerformed
        // TODO add your handling code here:
        
        DelectUserForm dltUser = new DelectUserForm();
        dltUser.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnDelectUserActionPerformed

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

    private void btnCreateOperatorAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOperatorAccountActionPerformed
        // TODO add your handling code here:
        
        CreateOperatorAccountForm opAccount = new CreateOperatorAccountForm();
        opAccount.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCreateOperatorAccountActionPerformed

    private void btnMonthlyReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlyReportActionPerformed
        // TODO add your handling code here:
        MonthlyReportForm month = new MonthlyReportForm();
        month.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMonthlyReportActionPerformed

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

    private void btnShowRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowRegisterUserActionPerformed
        // TODO add your handling code here:
        
        registerUser();
       
    }//GEN-LAST:event_btnShowRegisterUserActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            // TODO add your handling code here:

            tblUser.print();
        } catch (PrinterException ex) {
            Logger.getLogger(MonthlyReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnStorageJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStorageJobActionPerformed
        // TODO add your handling code here:
        
        storageDetails();
    }//GEN-LAST:event_btnStorageJobActionPerformed

    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed
        try {
            // TODO add your handling code here:

            table.print();
        } catch (PrinterException ex) {
            Logger.getLogger(MonthlyReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnPrint1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
     
        
        tblUser.setModel(new DefaultTableModel(null,new String[]{"username","UserID","Email","Phone Number"}));
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
        
          table.setModel(new DefaultTableModel(null,new String[]{"User ID","Product Name","Space","Duration", "Date","Profile"}));
    }//GEN-LAST:event_btnClear1ActionPerformed

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
            java.util.logging.Logger.getLogger(MonthlyReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonthlyReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonthlyReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonthlyReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlyReportForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewStoreJob;
    private javax.swing.JButton btnCalculateBill;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnCloseStorageJob;
    private javax.swing.JButton btnCreateOperatorAccount;
    private javax.swing.JButton btnDelectUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMonthlyReport;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPrint1;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JButton btnShowRegisterUser;
    private javax.swing.JButton btnStorageJob;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserPanel;
    private javax.swing.JTable table;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables
}
