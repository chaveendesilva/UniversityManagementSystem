/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpManagement;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static Student.USM_MAIN_INTERFACE.jDesktopPane2;

/**
 *
 * @author User
 */
public class EmpEmployee extends javax.swing.JInternalFrame {

    EmpHome home;

    /**
     * Creates new form EmpEmployee
     */
    List<Employee> empList;

    public EmpEmployee() {
        initComponents();
        empList = new ArrayList<>();
    }

    void refreshTable(List elist) {
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, elist, jTable2);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fullName}"));
        columnBinding.setColumnName("Full Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jobID}"));
        columnBinding.setColumnName("Job ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telNo}"));
        columnBinding.setColumnName("Tel No");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTable2);
    }

    void resetTable() {
        eid.setText("");
        name.setText("");
        birthday.setText("");
        tel.setText("");
        mail.setText("");
        address.setText("");
        imageLbl.setIcon(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jFileChooser1 = new javax.swing.JFileChooser();
        entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("university_management_system?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        employeeQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager0.createQuery("SELECT e FROM Employee e");
        employeeList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeeQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        job = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        imageLbl = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        birthday = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        back = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(1354, 522));
        setPreferredSize(new java.awt.Dimension(1354, 522));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1354, 522));
        jPanel1.setPreferredSize(new java.awt.Dimension(1354, 522));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TEL NO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IMAGE:");

        job.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        job.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select one --", "Admin", "HR manager", "Cleaner", "Driver", "Lecturer", "Instructor", "Branch manager" }));

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        update.setText("UPDATE");
        update.setPreferredSize(new java.awt.Dimension(1354, 522));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, jTable2, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.fullName}"), name, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-MAIL:");

        eid.setBackground(new java.awt.Color(204, 204, 204));
        eid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eid.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        eid.setEnabled(false);
        eid.setFocusable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, jTable2, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.eid}"), eid, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Delete.png"))); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        imageLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, jTable2, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.img}"), imageLbl, org.jdesktop.beansbinding.BeanProperty.create("icon"));
        bindingGroup.addBinding(binding);

        mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mail.setName(""); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, jTable2, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.email}"), mail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        birthday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        birthday.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, jTable2, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dob}"), birthday, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BIRTHDAY:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADDRESS:");

        tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, jTable2, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telNo}"), tel, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, jTable2, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.address}"), address, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYEE ID:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JOB:");

        browse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/folder.png"))); // NOI18N
        browse.setText("BROWSE");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FULL NAME:");

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EMPLOYEE");

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, employeeList1, jTable2);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${eid}"));
        columnBinding.setColumnName("Eid");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fullName}"));
        columnBinding.setColumnName("Full Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTable2);

        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_Back_131811.png"))); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(408, 408, 408)
                        .addComponent(jLabel10)
                        .addContainerGap(636, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addComponent(jSeparator2)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(birthday)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(40, 40, 40))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browse))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(job, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(back))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        if (home == null) {
            jDesktopPane2.removeAll();
            EmpHome home_ = new EmpHome();
            jDesktopPane2.add(home_).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(home).setVisible(true);
        }
    }//GEN-LAST:event_backActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Employee e = entityManager0.find(Employee.class, Integer.parseInt(eid.getText()));
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to update this?", "Confirmation", 1);

        if (x == JOptionPane.OK_OPTION) {
            e.setFullName(name.getText());
            e.setDob(birthday.getText());
            e.setTelNo(Integer.parseInt(tel.getText()));
            e.setEmail(mail.getText());
            e.setAddress(address.getText());
//        e.setJobID((Job) job.getSelectedItem());

            entityManager0.getTransaction().begin();
            entityManager0.merge(e);
            entityManager0.getTransaction().commit();

            JOptionPane.showMessageDialog(rootPane, "Successfully Updated");

            employeeList1.clear();
            employeeList1 = employeeQuery1.getResultList();
            refreshTable(employeeList1);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        int x =  jFileChooser1.showDialog(this, "OPEN");
        if (x == JFileChooser.APPROVE_OPTION) {
            Toolkit tk = Toolkit.getDefaultToolkit();
            Image img = tk.getImage(jFileChooser1.getSelectedFile().getAbsolutePath());
            Image imgScale = img.getScaledInstance(imageLbl.getWidth(), imageLbl.getHeight(), Image.SCALE_DEFAULT);
            imageLbl.setIcon(new ImageIcon(imgScale));
        } else {
            imageLbl.setIcon(new ImageIcon());
        }
    }//GEN-LAST:event_browseActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        Employee e = new Employee();

        e.setFullName(name.getText());
        e.setDob(birthday.getText());
        e.setTelNo(Integer.parseInt(tel.getText()));
        e.setEmail(mail.getText());
        e.setAddress(address.getText());
//        e.setJobID((Integer) job.getSelectedItem());

        entityManager0.getTransaction().begin();
        entityManager0.persist(e);
        entityManager0.getTransaction().commit();

        JOptionPane.showMessageDialog(rootPane, "Successfully Added");

        entityManager0.clear();
        employeeList1 = employeeQuery1.getResultList();
        refreshTable(employeeList1);
        resetTable();
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        Employee e = entityManager0.find(Employee.class, Integer.parseInt(eid.getText()));
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete this?", "Confirmation", 1);

        if (x == JOptionPane.OK_OPTION) {
            entityManager0.getTransaction().begin();
            entityManager0.remove(e);
            entityManager0.getTransaction().commit();

            JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");

            employeeList1.clear();
            employeeList1 = employeeQuery1.getResultList();
            refreshTable(employeeList1);
            resetTable();
        }
        resetTable();
    }//GEN-LAST:event_deleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JTextField birthday;
    private javax.swing.JButton browse;
    private javax.swing.JButton delete;
    private javax.swing.JTextField eid;
    private java.util.List<EmpManagement.Employee> employeeList1;
    private javax.persistence.Query employeeQuery1;
    private javax.persistence.EntityManager entityManager0;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> job;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField tel;
    private javax.swing.JButton update;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}