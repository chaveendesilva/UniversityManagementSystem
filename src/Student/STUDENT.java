package Student;

import java.sql.ResultSet;
import DataBase.DBconnect;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static Student.USM_MAIN_INTERFACE.jDesktopPane2;

/**
 *
 * @author perer
 */
public class STUDENT extends javax.swing.JInternalFrame {

    /**
     * Creates new form STUDENT
     */
    public STUDENT() {
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
        jLabel11 = new javax.swing.JLabel();
        StudentId_txt = new javax.swing.JTextField();
        LastName_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FullName_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        Nic_txt = new javax.swing.JTextField();
        Course_txt = new javax.swing.JTextField();
        TellNum_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Update_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Add_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        FirstName_txt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Reset_btn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Date_txt = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(1354, 522));
        setPreferredSize(new java.awt.Dimension(1354, 522));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("STUDENT");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        StudentId_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StudentId_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentId_txtActionPerformed(evt);
            }
        });
        StudentId_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StudentId_txtKeyTyped(evt);
            }
        });

        LastName_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LastName_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName_txtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BIRTH DAY  :");

        FullName_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FullName_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullName_txtActionPerformed(evt);
            }
        });

        address_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_txtActionPerformed(evt);
            }
        });

        Nic_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nic_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nic_txtActionPerformed(evt);
            }
        });

        Course_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Course_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course_txtActionPerformed(evt);
            }
        });

        TellNum_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TellNum_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TellNum_txtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIC            :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FACULTY     : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COURSE      :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TEL-NO      :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_Back_131811.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FIRST NAME    :");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STHUDENT ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LAST NAME     : ");

        Update_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        Update_btn.setText("UPDATE");
        Update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FULL NAME     :");

        Add_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        Add_btn.setText("ADD");
        Add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_btnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADDRESS  : ");

        FirstName_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FirstName_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_txtActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        Reset_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        Reset_btn.setText("RESET");
        Reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_btnActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Faculty of Computing", "Faculty of Buissiness", "Faculty of Engeenering", "Faculty of VideoGraphy" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Date_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(StudentId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(FullName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(LastName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(FirstName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(address_txt)
                                    .addComponent(Nic_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TellNum_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(Date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Course_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(Add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(Reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(StudentId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(address_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(FirstName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(LastName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Nic_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Course_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(FullName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(TellNum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(85, 85, 85)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    STUDENT_HOME2 s3;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (s3 == null) {

            jDesktopPane2.removeAll();
            STUDENT_HOME2 S2 = new STUDENT_HOME2();
            jDesktopPane2.add(S2).setVisible(true);

        } else {

            jDesktopPane2.removeAll();
            jDesktopPane2.add(s3).setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed

        String sid = StudentId_txt.getText().trim();
        String fname = FirstName_txt.getText().trim();
        String lname = LastName_txt.getText().trim();
        String fullname = FullName_txt.getText().trim();
        String address = address_txt.getText().trim();
        String nic = Nic_txt.getText();
        String tell = TellNum_txt.getText().trim();
        String fac = jComboBox1.getSelectedItem().toString();
        String course = Course_txt.getText().trim();
        String bday = Date_txt.getText().trim();

//        SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy");
//        String addDate = dateFormate.format(jDateChooser1.getDate());

        if (sid.equals("") || fname.equals("") || lname.equals("") || fullname.equals("") || address.equals("") || nic.equals("") || tell.equals("") || fac.equals("") || course.equals("") || bday.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the FIELDS");
        } else if (!fname.matches("[a-z A-Z]+")) {
            JOptionPane.showMessageDialog(null, "Invalide Format(First Name)");
        } else if (!lname.matches("[a-z A-Z]+")) {
            JOptionPane.showMessageDialog(null, "Invalide Format(Last Name)");
        } else if (!fullname.matches("[a-z A-Z].+")) {
            JOptionPane.showMessageDialog(null, "Invalide Format(Full Name)");
        } else if (!tell.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Invalide Telephone Number");
        } else {

            try {

                DBconnect.connect().createStatement().executeUpdate("INSERT INTO student_details(student_Id, first_Name, last_Name, full_Name, address, NIC, tell_No, faculty, course, birthday) VALUE ('" + sid + "','" + fname + "','" + lname + "','" + fullname + "','" + address + "','" + nic + "','" + tell + "','" + fac + "','" + course + "','" + bday + "')");
                JOptionPane.showMessageDialog(null, "Successfully DONE");

                StudentId_txt.setText(null);
                FirstName_txt.setText(null);
                jComboBox1.setSelectedItem(null);
                LastName_txt.setText(null);

                FullName_txt.setText(null);
                address_txt.setText(null);
                Nic_txt.setText(null);
                TellNum_txt.setText(null);
                Course_txt.setText(null);
                Date_txt.setText(null);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "INSERT Error");
                JOptionPane.showMessageDialog(rootPane, e);

            }

        }


    }//GEN-LAST:event_Add_btnActionPerformed

    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed

        int p = JOptionPane.showConfirmDialog(null, "If you really want to UPDATE?");

        if (p == 0) {

            String sid = StudentId_txt.getText();
            String fname = FirstName_txt.getText();
            String lname = LastName_txt.getText();
            String fullname = FullName_txt.getText();
            String address = address_txt.getText();
            String nic = Nic_txt.getText();
            String tell = TellNum_txt.getText();
            String fac = jComboBox1.getSelectedItem().toString();
            String course = Course_txt.getText();
            String bday = Date_txt.getText();

            try {
                DBconnect.connect().createStatement().executeUpdate("UPDATE student_details SET  first_Name = '" + fname + "', last_Name = '" + lname + "', full_Name = '" + fullname + "', address = '" + address + "', NIC = '" + nic + "', tell_No = '" + tell + "', faculty = '" + fac + "', course = '" + course + "', birthday = '" + bday + "' WHERE student_Id = '" + sid + "' ");
                JOptionPane.showMessageDialog(null, "Update Successfully");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Update Unsuccessfully");
                JOptionPane.showMessageDialog(rootPane, e);
            }

            StudentId_txt.setText(null);
            FirstName_txt.setText(null);
            jComboBox1.setSelectedItem(null);
            LastName_txt.setText(null);
            FullName_txt.setText(null);
            address_txt.setText(null);
            Nic_txt.setText(null);
            TellNum_txt.setText(null);
            Course_txt.setText(null);
            Date_txt.setText(null);

        } else {
            JOptionPane.showMessageDialog(null, "Have a Good Day!");
        }


    }//GEN-LAST:event_Update_btnActionPerformed

    private void StudentId_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentId_txtActionPerformed
        Student_search();
        FirstName_txt.grabFocus();
    }//GEN-LAST:event_StudentId_txtActionPerformed

    private void StudentId_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentId_txtKeyTyped

        if (!(Character.isDigit(evt.getKeyChar()) || Character.isAlphabetic(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_StudentId_txtKeyTyped

    private void FirstName_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_txtActionPerformed
        LastName_txt.grabFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_txtActionPerformed

    private void LastName_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName_txtActionPerformed
        FullName_txt.grabFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_LastName_txtActionPerformed

    private void FullName_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullName_txtActionPerformed
        address_txt.grabFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_FullName_txtActionPerformed

    private void address_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_txtActionPerformed
        Nic_txt.grabFocus();           // TODO add your handling code here:
    }//GEN-LAST:event_address_txtActionPerformed

    private void Nic_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nic_txtActionPerformed
        TellNum_txt.grabFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_Nic_txtActionPerformed

    private void TellNum_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TellNum_txtActionPerformed
        jComboBox1.grabFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_TellNum_txtActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Course_txt.grabFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Course_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_txtActionPerformed
        Date_txt.grabFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_Course_txtActionPerformed

    private void Reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_btnActionPerformed

        StudentId_txt.setText(null);
        FirstName_txt.setText(null);
        jComboBox1.setSelectedItem(null);
        LastName_txt.setText(null);
        FullName_txt.setText(null);
        address_txt.setText(null);
        Nic_txt.setText(null);
        TellNum_txt.setText(null);
        Course_txt.setText(null);
        Date_txt.setText(null);

        StudentId_txt.grabFocus();   // TODO add your handling code here:.

    }//GEN-LAST:event_Reset_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_btn;
    private javax.swing.JTextField Course_txt;
    private javax.swing.JTextField Date_txt;
    private javax.swing.JTextField FirstName_txt;
    private javax.swing.JTextField FullName_txt;
    private javax.swing.JTextField LastName_txt;
    private javax.swing.JTextField Nic_txt;
    private javax.swing.JButton Reset_btn;
    private javax.swing.JTextField StudentId_txt;
    private javax.swing.JTextField TellNum_txt;
    private javax.swing.JButton Update_btn;
    private javax.swing.JTextField address_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

    private void Student_search() {

        try {
            ResultSet rs = DataBase.DBconnect.connect().createStatement().executeQuery("select * from student_details where student_Id ='" + StudentId_txt.getText() + "'");
            if (rs.next()) {
                FirstName_txt.setText(rs.getString("first_Name"));
                LastName_txt.setText(rs.getString("last_Name"));
                FullName_txt.setText(rs.getString("full_Name"));
                address_txt.setText(rs.getString("address"));
                Nic_txt.setText(rs.getString("NIC"));
                TellNum_txt.setText(rs.getString("tell_No"));
                
                jComboBox1.setSelectedItem(rs.getString("faculty"));
                Course_txt.setText(rs.getString("course"));
                Date_txt.setText(rs.getString("birthday"));

            } else {

                StudentId_txt.grabFocus();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}