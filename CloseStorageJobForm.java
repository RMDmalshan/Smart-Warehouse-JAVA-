/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DB.DBConnection;
import Table.CloseStorageJobTable;
import static UI.LoginForm.userType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ASUS TUF
 */
public class CloseStorageJobForm extends javax.swing.JFrame {

    /**
     * Creates new form newIdeaForm
     */
    public CloseStorageJobForm() {
          initComponents();
         this.setLocationRelativeTo(null);
         show_user();
        
         
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

    public ArrayList<CloseStorageJobTable> userList(){
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
    
     public void show_user(){
        ArrayList<CloseStorageJobTable> list = userList();
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
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
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
        jPanel6 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();

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

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("User ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(java.awt.Color.blue);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\project\\Smart_Warehouse_Project\\src\\main\\java\\image\\222.png")); // NOI18N

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        lblUser.setForeground(java.awt.Color.blue);
        lblUser.setText("Welcome To Manager");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Search");

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Product Name", "Space", "Duration", "Date", "Profile"
            }
        ));
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel12.setForeground(java.awt.Color.blue);
        jLabel12.setText("Close Storage Job");

        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(27, 27, 27))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnLogOut)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        
        CloseStorageJobForm close =  new CloseStorageJobForm();
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

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        
        
        
     
        
    }//GEN-LAST:event_tableMouseClicked

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
        
            
        TableModel model = (TableModel)table.getModel();
        TableRowSorter<TableModel> tablerow = new TableRowSorter<TableModel>(model);
        table.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
        
       
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
       
        
        try {
            // TODO add your handling code here:
            int row = table.getSelectedRow();
            String user_id = table.getValueAt(row, 0).toString();

           Connection connection =  DBConnection.getInstance().getConnection();
            PreparedStatement prepareStatement = connection.prepareStatement("UPDATE add_new_storage_job SET profile ='Close' where user_id = ?");
            
            prepareStatement.setString(1, user_id);
            prepareStatement.executeUpdate();
            
            
            
            
             int i = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO CLOSE THIS","Select",JOptionPane.YES_NO_OPTION);
             if(i ==0){
                 
                 CloseStorageJobForm close = new CloseStorageJobForm();
                 close.setVisible(true);
                 this.setVisible(false);
                 
             
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(CloseStorageJobForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
     
        
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(CloseStorageJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CloseStorageJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CloseStorageJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CloseStorageJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CloseStorageJobForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewStoreJob;
    private javax.swing.JButton btnCalculateBill;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCloseStorageJob;
    private javax.swing.JButton btnCreateOperatorAccount;
    private javax.swing.JButton btnDelectUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMonthlyReport;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserPanel;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

  
}
