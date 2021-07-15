/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpManagement;

import Student.Home_Buttons_Interface;
import static Student.USM_MAIN_INTERFACE.jDesktopPane2;

/**
 *
 * @author User
 */
public class EmpHome extends javax.swing.JInternalFrame {

    EmpJob job;
    EmpEmployee employee;
    EmpSalary salary;
    
    Home_Buttons_Interface hbi;

    /**
     * Creates new form EmpHome
     */
    public EmpHome() {
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
        jLabel1 = new javax.swing.JLabel();
        jobs = new javax.swing.JButton();
        employees = new javax.swing.JButton();
        sal = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 102, 102));
        setMinimumSize(new java.awt.Dimension(1354, 522));
        setPreferredSize(new java.awt.Dimension(1354, 522));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1354, 522));
        jPanel1.setPreferredSize(new java.awt.Dimension(1354, 522));

        jLabel1.setFont(new java.awt.Font("Teko SemiBold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE MANAGEMENT");

        jobs.setBackground(new java.awt.Color(0, 204, 204));
        jobs.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jobs.setText("JOBS");
        jobs.setMaximumSize(new java.awt.Dimension(153, 37));
        jobs.setMinimumSize(new java.awt.Dimension(153, 37));
        jobs.setPreferredSize(new java.awt.Dimension(153, 37));
        jobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsActionPerformed(evt);
            }
        });

        employees.setBackground(new java.awt.Color(0, 204, 204));
        employees.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        employees.setText("EMPLOYEES");
        employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesActionPerformed(evt);
            }
        });

        sal.setBackground(new java.awt.Color(0, 204, 204));
        sal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        sal.setText("SALARY");
        sal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout)
                .addGap(326, 326, 326)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 496, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sal, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employees, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobs, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(390, 390, 390))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jobs, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employees, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    EmpJob ej;
    private void jobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsActionPerformed
        // TODO add your handling code here:
//        if (ej == null) {
//            jDesktopPane2.removeAll();
//            EmpJob job1 = new EmpJob();
//            jDesktopPane2.add(job1).setVisible(true);
//        } else {
//            jDesktopPane2.removeAll();
//            jDesktopPane2.add(ej).setVisible(true);
//        }

        if (job == null) {
            jDesktopPane2.removeAll();
            EmpJob job_ = new EmpJob();
            jDesktopPane2.add(job_).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(job).setVisible(true);
        }
    }//GEN-LAST:event_jobsActionPerformed

//    EmpEmployee ep;
    private void employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesActionPerformed
        // TODO add your handling code here:
//        if (ep == null) {
//            jDesktopPane2.removeAll();
//            EmpEmployee e1 = new EmpEmployee();
//            jDesktopPane2.add(e1).setVisible(true);
//        } else {
//            jDesktopPane2.removeAll();
//            jDesktopPane2.add(ep).setVisible(true);
//        }

        if (employee == null) {
            jDesktopPane2.removeAll();
            EmpEmployee employee_ = new EmpEmployee();
            jDesktopPane2.add(employee_).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(employee).setVisible(true);
        }
    }//GEN-LAST:event_employeesActionPerformed

//    EmpSalary es;
    private void salActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salActionPerformed
        // TODO add your handling code here:
//        if (es == null) {
//            jDesktopPane2.removeAll();
//            EmpSalary salary = new EmpSalary();
//            jDesktopPane2.add(salary).setVisible(true);
//        } else {
//            jDesktopPane2.removeAll();
//            jDesktopPane2.add(es).setVisible(true);
//        }

        if (salary == null) {
            jDesktopPane2.removeAll();
            EmpSalary salary_ = new EmpSalary();
            jDesktopPane2.add(salary_).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(salary).setVisible(true);
        }
    }//GEN-LAST:event_salActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        if (hbi == null) {
            jDesktopPane2.removeAll();
            Home_Buttons_Interface h_ = new Home_Buttons_Interface();
            jDesktopPane2.add(h_).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(hbi).setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jobs;
    private javax.swing.JButton logout;
    private javax.swing.JButton sal;
    // End of variables declaration//GEN-END:variables
}