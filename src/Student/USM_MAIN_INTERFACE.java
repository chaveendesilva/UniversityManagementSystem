package Student;

import EmpManagement.EmpHome;
import finance.Finance_Home;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import Faculty.FacultyManagement;
import Login.UserLogin;

public class USM_MAIN_INTERFACE extends javax.swing.JFrame {

    /**
     * Creates new form USM_MAIN_INTERFACE
     */
    public USM_MAIN_INTERFACE() {
        initComponents();

        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);

        jDesktopPane2.removeAll();
        Home_Buttons_Interface hmi = new Home_Buttons_Interface();
        jDesktopPane2.add(hmi).setVisible(true);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1_student = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2_Faculty = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3_employee = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4_finance = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5_admin = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenu();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1368, 740));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/new logo.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UNIVERSITY OF YOUTUBE");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tel : 011- XXXXXXX");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E-Mail : UniversityOfYoutube@gmail.com");

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SRI  LANKA");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jDesktopPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1202, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/functionView.png"))); // NOI18N
        jMenu1.setText("View Function      ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.add(jSeparator2);

        jMenuItem1_student.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1_student.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jMenuItem1_student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/student_small.png"))); // NOI18N
        jMenuItem1_student.setText("Student");
        jMenuItem1_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_studentActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1_student);
        jMenu1.add(jSeparator3);

        jMenuItem2_Faculty.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2_Faculty.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jMenuItem2_Faculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/school.png"))); // NOI18N
        jMenuItem2_Faculty.setText("Faculty");
        jMenuItem2_Faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_FacultyActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2_Faculty);
        jMenu1.add(jSeparator4);

        jMenuItem3_employee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3_employee.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        jMenuItem3_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/employees.png"))); // NOI18N
        jMenuItem3_employee.setText("Employee");
        jMenuItem3_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_employeeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3_employee);
        jMenu1.add(jSeparator5);

        jMenuItem4_finance.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4_finance.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        jMenuItem4_finance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pay.png"))); // NOI18N
        jMenuItem4_finance.setText("Finance");
        jMenuItem4_finance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4_financeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4_finance);
        jMenu1.add(jSeparator6);

        jMenuItem5_admin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5_admin.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        jMenuItem5_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/customer-service_small.png"))); // NOI18N
        jMenuItem5_admin.setText("Admin");
        jMenuItem5_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5_adminActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5_admin);

        jMenuBar1.add(jMenu1);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loging_out.png"))); // NOI18N
        logout.setText("System LOGOUT      ");
        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setHideActionText(true);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        logout.add(jSeparator7);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shutdown_tow.png"))); // NOI18N
        jMenuItem1.setText("LOGout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        logout.add(jMenuItem1);

        jMenuBar1.add(logout);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/about-us.png"))); // NOI18N
        jMenu2.setText("About us");
        jMenu2.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jMenuItem2.setText("Click to view");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem1_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_studentActionPerformed
        if (l1 == null) {
            jDesktopPane2.removeAll();
            UserLogin S2 = new UserLogin();
            jDesktopPane2.add(S2).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(l1).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1_studentActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        close();
    }//GEN-LAST:event_logoutActionPerformed

    private void jMenuItem2_FacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_FacultyActionPerformed
        if (l1 == null) {
            jDesktopPane2.removeAll();
            UserLogin S2 = new UserLogin();
            jDesktopPane2.add(S2).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(l1).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2_FacultyActionPerformed

    private void jMenuItem3_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3_employeeActionPerformed
        if (l1 == null) {
            jDesktopPane2.removeAll();
            UserLogin S2 = new UserLogin();
            jDesktopPane2.add(S2).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(l1).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem3_employeeActionPerformed

    private void jMenuItem4_financeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4_financeActionPerformed
        if (l1 == null) {
            jDesktopPane2.removeAll();
            UserLogin S2 = new UserLogin();
            jDesktopPane2.add(S2).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(l1).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem4_financeActionPerformed

    private void jMenuItem5_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5_adminActionPerformed
        if (l1 == null) {
            jDesktopPane2.removeAll();
            UserLogin S2 = new UserLogin();
            jDesktopPane2.add(S2).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(l1).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5_adminActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        close();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          if (a == null) {
            jDesktopPane2.removeAll();
            About_us S2 = new About_us();
            jDesktopPane2.add(S2).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(a).setVisible(true);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(USM_MAIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(USM_MAIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(USM_MAIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(USM_MAIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USM_MAIN_INTERFACE().setVisible(true);
            }
        });
    }

    STUDENT_HOME2 s3;
    UserLogin l1;
    About_us a;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1_student;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem2_Faculty;
    private javax.swing.JMenuItem jMenuItem3_employee;
    private javax.swing.JMenuItem jMenuItem4_finance;
    private javax.swing.JMenuItem jMenuItem5_admin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JMenu logout;
    // End of variables declaration//GEN-END:variables

    public void close() { //Exit code

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
}
