/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance;


import static Student.USM_MAIN_INTERFACE.jDesktopPane2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yelani
 */
public class Finance_Fee extends javax.swing.JInternalFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form Finance_Fee
     */
    public Finance_Fee() {
        initComponents();
        
        con = DBconnect.connect();
    }
    
    public void tableload(){
        
        try {
            String sql = "SELECT FeeID,StudentName,Month,TermFee,LiabraryFee,RepeatExamFee,ExamFee,TotalFee FROM fee";
            pst = con.prepareStatement(sql);
            rs =  pst.executeQuery();
            
            fee_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
           
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
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_fid = new javax.swing.JTextField();
        txt_termf = new javax.swing.JTextField();
        txt_liabraryf = new javax.swing.JTextField();
        txt_repeatf = new javax.swing.JTextField();
        txt_examf = new javax.swing.JTextField();
        txt_totfee = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Update_btn = new javax.swing.JButton();
        Add_btn = new javax.swing.JButton();
        Reset_btn = new javax.swing.JButton();
        Delete_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fee_table = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        c_m2 = new com.toedter.calendar.JMonthChooser();
        Reset_btn1 = new javax.swing.JButton();
        txt_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(1354, 522));
        setPreferredSize(new java.awt.Dimension(1354, 522));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1352, 494));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("FEE PROCESSING");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_Back_131811.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FEE ID                              :");

        txt_fid.setEditable(false);
        txt_fid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_termf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_termf.setToolTipText("");
        txt_termf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_termfActionPerformed(evt);
            }
        });

        txt_liabraryf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_repeatf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_examf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_totfee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_totfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totfeeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EXAM FEE                         :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL MONTHLY FEE       :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("REPEAT EXAM FEE            :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MONTHLY LIABRARY FEE  :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TERM FEE                         :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MONTH                             :");

        Update_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        Update_btn.setText("UPDATE");
        Update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btnActionPerformed(evt);
            }
        });

        Add_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        Add_btn.setText("ADD");
        Add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_btnActionPerformed(evt);
            }
        });

        Reset_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        Reset_btn.setText("RESET");
        Reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_btnActionPerformed(evt);
            }
        });

        Delete_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Delete.png"))); // NOI18N
        Delete_btn.setText("DELETE");
        Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btnActionPerformed(evt);
            }
        });

        fee_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fee_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Fee ID", "Month", "Term Fee", "Libary Fee", "Repeat Exam Fee", "Exam Fee", "Total Monthly Fee"
            }
        ));
        fee_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fee_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(fee_table);
        if (fee_table.getColumnModel().getColumnCount() > 0) {
            fee_table.getColumnModel().getColumn(1).setResizable(false);
            fee_table.getColumnModel().getColumn(2).setResizable(false);
            fee_table.getColumnModel().getColumn(3).setResizable(false);
            fee_table.getColumnModel().getColumn(4).setResizable(false);
            fee_table.getColumnModel().getColumn(5).setResizable(false);
            fee_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        Reset_btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/calculate.png"))); // NOI18N
        Reset_btn1.setText("CALCULATE");
        Reset_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_btn1ActionPerformed(evt);
            }
        });

        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("STUDENT NAME                :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_termf)
                            .addComponent(txt_fid)
                            .addComponent(txt_liabraryf)
                            .addComponent(txt_repeatf)
                            .addComponent(txt_examf)
                            .addComponent(txt_totfee)
                            .addComponent(c_m2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Reset_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(Add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(Update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(Reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jButton1))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_m2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_termf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_liabraryf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_repeatf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_examf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_totfee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset_btn)
                    .addComponent(Delete_btn)
                    .addComponent(Update_btn)
                    .addComponent(Add_btn)
                    .addComponent(Reset_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Add Button
    private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed
       
        String name = txt_name.getText();
        int month2 = c_m2.getMonth();
        String termfee = txt_termf.getText();
        String liabraryfee = txt_liabraryf.getText();
        String repeatfee = txt_repeatf.getText();
        String examfee = txt_examf.getText();
        String totalfee = txt_totfee.getText();
        
        try {
            
            String q2 = "INSERT INTO fee (StudentName,Month,TermFee,LiabraryFee,RepeatExamFee,ExamFee,TotalFee) values ('"+ name +"', '"+ month2 +"', '"+ termfee +"', '"+ liabraryfee +"', '"+ repeatfee +"', '"+ examfee +"', '"+ totalfee +"')";
            pst = con.prepareStatement(q2);
            pst.execute();
            
            tableload();
            
            JOptionPane.showMessageDialog(null, "Monthly Fee Inserted!");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Add_btnActionPerformed

    //Delete Button
    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
        
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to the DELETE");
        
        if (p == 0){
            
             String id = txt_fid.getText();
             
             try{
                 
                 String q = "DELETE FROM fee WHERE FeeID = '" + id + "'";
                 pst = con.prepareStatement(q);
                 pst.execute();
                 
                 tableload();
                 
                 JOptionPane.showMessageDialog(null, "DELETED Successfull!");
                 
             }catch(Exception e){
                 e.printStackTrace();
             }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Cancel The Request");
        }
        
        
    }//GEN-LAST:event_Delete_btnActionPerformed

    //Update Button
    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed
        
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to UPDATE?");
        
        if(p == 0){
         
        String name = txt_name.getText();
        String id = txt_fid.getText();
        int month2 = c_m2.getMonth();
        String termfee = txt_termf.getText();
        String liabraryfee = txt_liabraryf.getText();
        String repeatfee = txt_repeatf.getText();
        String examfee = txt_examf.getText();
        String totalfee = txt_totfee.getText();
        
            
        try {
            DBconnect.connect().createStatement().executeUpdate("UPDATE fee SET  StudentName = '" + name + "', TermFee = '" + termfee + "', LiabraryFee = '" + liabraryfee + "', RepeatExamFee = '" + repeatfee + "', ExamFee = '" + examfee + "', TotalFee = '" + totalfee + "' WHERE FeeID = '" + id + "' ");
            tableload();
            JOptionPane.showMessageDialog(null, "Update Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Unsuccessfully");
            JOptionPane.showMessageDialog(rootPane, e);
        }
            
        }     
    }//GEN-LAST:event_Update_btnActionPerformed

    private void txt_totfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totfeeActionPerformed

    //Reset Button
    private void Reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_btnActionPerformed
        
        txt_fid.setText(null);
        txt_name.setText(null);
        txt_termf.setText(null);
        txt_liabraryf.setText(null);
        txt_repeatf.setText(null);
        txt_examf.setText(null);
        txt_totfee.setText(null);
        
    }//GEN-LAST:event_Reset_btnActionPerformed

    //Moving back into home
    Finance_Home fin_home;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if (fin_home == null) {

            jDesktopPane2.removeAll();
            Finance_Home home = new Finance_Home();
            jDesktopPane2.add(home).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(fin_home).setVisible(true);

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    //Calculate Button
    private void Reset_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_btn1ActionPerformed

       int totalFee = Integer.parseInt(txt_termf.getText())+Integer.parseInt(txt_liabraryf.getText())+Integer.parseInt(txt_repeatf.getText())+Integer.parseInt(txt_examf.getText());
       txt_totfee.setText(String.valueOf(totalFee));
    }//GEN-LAST:event_Reset_btn1ActionPerformed

    private void txt_termfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_termfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_termfActionPerformed

    private void fee_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fee_tableMouseClicked
        
        int r = fee_table.getSelectedRow();
        
        String id = fee_table.getValueAt(r, 0).toString();
        String name = fee_table.getValueAt(r, 1).toString();
        String month = fee_table.getValueAt(r, 2).toString();
        String term = fee_table.getValueAt(r, 3).toString();
        String liabrary = fee_table.getValueAt(r, 4).toString();
        String repeat = fee_table.getValueAt(r, 5).toString();
        String exam = fee_table.getValueAt(r, 6).toString();
        String total = fee_table.getValueAt(r, 7).toString();
        
        
        txt_fid.setText(id);
        txt_name.setText(name);
        c_m2.setMonth(Integer.parseInt(month));
        txt_termf.setText(term);
        txt_liabraryf.setText(liabrary);
        txt_repeatf.setText(repeat);
        txt_examf.setText(exam);
        txt_totfee.setText(total);
        
    }//GEN-LAST:event_fee_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_btn;
    private javax.swing.JButton Delete_btn;
    private javax.swing.JButton Reset_btn;
    private javax.swing.JButton Reset_btn1;
    private javax.swing.JButton Update_btn;
    private com.toedter.calendar.JMonthChooser c_m2;
    private javax.swing.JTable fee_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txt_examf;
    private javax.swing.JTextField txt_fid;
    private javax.swing.JTextField txt_liabraryf;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_repeatf;
    private javax.swing.JTextField txt_termf;
    private javax.swing.JTextField txt_totfee;
    // End of variables declaration//GEN-END:variables
}
