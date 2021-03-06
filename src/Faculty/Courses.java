/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static Student.USM_MAIN_INTERFACE.jDesktopPane2;

/**
 *
 * @author KAVINDI
 */
public class Courses extends javax.swing.JInternalFrame {

    FacultyManagement cou;
    Connection con = null;
    PreparedStatement pst = null;
    FacultyManagement sub;

    /**
     * Creates new form Courses
     */
    public Courses() {
        initComponents();
        //connect to DB
        con = DBconnect.connect();
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
        jButton1 = new javax.swing.JButton();
        courseID = new javax.swing.JLabel();
        courseName = new javax.swing.JLabel();
        faculTy = new javax.swing.JLabel();
        courseFee = new javax.swing.JLabel();
        coursefee_txt = new javax.swing.JTextField();
        faculty_combo = new javax.swing.JComboBox<>();
        coursename_txt = new javax.swing.JTextField();
        courseid_txt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        Reset_btn = new javax.swing.JButton();
        Add_btn = new javax.swing.JButton();
        Update_btn = new javax.swing.JButton();
        Delete_btn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(1354, 522));
        setNormalBounds(new java.awt.Rectangle(0, 0, 116, 0));
        setPreferredSize(new java.awt.Dimension(1354, 522));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_Back_131811.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        courseID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courseID.setForeground(new java.awt.Color(255, 255, 255));
        courseID.setText("COURSE ID             :");

        courseName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courseName.setForeground(new java.awt.Color(255, 255, 255));
        courseName.setText("COURSE NAME    :");

        faculTy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        faculTy.setForeground(new java.awt.Color(255, 255, 255));
        faculTy.setText("FACULTY   :");

        courseFee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courseFee.setForeground(new java.awt.Color(255, 255, 255));
        courseFee.setText("COURSE FEE :");

        coursefee_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        faculty_combo.setEditable(true);
        faculty_combo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        faculty_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select a faculty --", "COMPUTING", "HR", "BS" }));

        coursename_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        courseid_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("COURSES");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COURSE ID", "COURSE NAME", "FACULTY", "COURSE FEE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        Reset_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        Reset_btn.setText("RESET");

        Add_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        Add_btn.setText("ADD");
        Add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_btnActionPerformed(evt);
            }
        });

        Update_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        Update_btn.setText("UPDATE");
        Update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(courseID, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(courseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(courseFee, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(faculTy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(courseid_txt)
                    .addComponent(coursename_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coursefee_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faculty_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 421, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(Update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(Reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(courseid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(coursename_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(faculTy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(faculty_combo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseFee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coursefee_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_btn)
                    .addComponent(Add_btn)
                    .addComponent(Update_btn)
                    .addComponent(Reset_btn))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed
        // TODO add your handling code here:

        String courseID = courseid_txt.getText();
        String courseName = coursename_txt.getText();
        String faculTy = faculty_combo.getSelectedItem().toString();
        String courseFee = coursefee_txt.getText();

        try {
////            System.out.println(subjectID+ subjectName+lecturerincharge+gradePoint);
////            System.out.println(subjectName);
//            String q = "INSERT INTO subject (subject_id,subject_name,lecturer_incharge,grade_point) values ('"+ subjectID +"','"+ subjectName +"','"+ lecturerincharge +"','"+ gradePoint +"')";
//            //String q = "insert into subject values(1,null,null,null)";
////           String q = "INSERT INTO `subject` (`subject_id`, `subject_name`, `lecturer_incharge`, `grade_point`) VALUES (NULL, 'subjectName', 'lecturerincharge', 'gradePoint')";
////            pst = con.prepareStatement(q);
////            pst.execute();

            DBconnect.connect().createStatement().executeUpdate("INSERT INTO course (course_id,course_name, faculty, course_fee) VALUES ('" + courseID + "', '" + courseName + "',  '" + faculTy + "', '" + courseFee + "')");
            JOptionPane.showMessageDialog(null, "Successfully DONE");
            
            
            
            courseid_txt.setText("");
            coursefee_txt.setText("");
            coursename_txt.setText("");
            faculty_combo.setSelectedItem("");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_Add_btnActionPerformed

    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Update_btnActionPerformed
    FacultyManagement f1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (f1 == null) {

            jDesktopPane2.removeAll();
            FacultyManagement f1 = new FacultyManagement();
            jDesktopPane2.add(f1).setVisible(true);

        } else {

            jDesktopPane2.removeAll();
            jDesktopPane2.add(f1).setVisible(true);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
        // TODO add your handling code here:
        String courseID = courseid_txt.getText();
        String courseName = coursename_txt.getText();
        String faculTy = faculty_combo.getSelectedItem().toString();
        String courseFee = coursefee_txt.getText();

        try {
            DBconnect.connect().createStatement().executeUpdate(" DELETE FROM `course` WHERE `course`.`course_id` = '" + courseID + "' ");

        } catch (Exception e) {
             e.printStackTrace();

        }
    }//GEN-LAST:event_Delete_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_btn;
    private javax.swing.JButton Delete_btn;
    private javax.swing.JButton Reset_btn;
    private javax.swing.JButton Update_btn;
    private javax.swing.JLabel courseFee;
    private javax.swing.JLabel courseID;
    private javax.swing.JLabel courseName;
    private javax.swing.JTextField coursefee_txt;
    private javax.swing.JTextField courseid_txt;
    private javax.swing.JTextField coursename_txt;
    private javax.swing.JLabel faculTy;
    private javax.swing.JComboBox<String> faculty_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
