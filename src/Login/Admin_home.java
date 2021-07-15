/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Student.Home_Buttons_Interface;
import Student.USM_MAIN_INTERFACE;
import static Student.USM_MAIN_INTERFACE.jDesktopPane2;

/**
 *
 * @author Chaveen
 */
public class Admin_home extends javax.swing.JInternalFrame {
    
     EditUser editUser;
     RemoveUser removeUser;
     AddNewUser addnew;
     
     USM_MAIN_INTERFACE home;

    /**
     * Creates new form Admin_home
     */
    public Admin_home() {
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
        EditUser = new javax.swing.JButton();
        RemoveUser = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        EditUser1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1354, 522));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1354, 522));

        jLabel1.setFont(new java.awt.Font("Teko SemiBold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN");
        jLabel1.setMaximumSize(new java.awt.Dimension(230, 44));
        jLabel1.setMinimumSize(new java.awt.Dimension(230, 44));
        jLabel1.setPreferredSize(new java.awt.Dimension(230, 44));

        EditUser.setBackground(new java.awt.Color(0, 204, 204));
        EditUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EditUser.setText("EDIT A USER");
        EditUser.setActionCommand("");
        EditUser.setMaximumSize(new java.awt.Dimension(153, 37));
        EditUser.setMinimumSize(new java.awt.Dimension(153, 37));
        EditUser.setPreferredSize(new java.awt.Dimension(153, 37));
        EditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUserActionPerformed(evt);
            }
        });

        RemoveUser.setBackground(new java.awt.Color(0, 204, 204));
        RemoveUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RemoveUser.setText("REMOVE A USER");
        RemoveUser.setMaximumSize(new java.awt.Dimension(153, 37));
        RemoveUser.setMinimumSize(new java.awt.Dimension(153, 37));
        RemoveUser.setPreferredSize(new java.awt.Dimension(153, 37));
        RemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveUserActionPerformed(evt);
            }
        });

        EditUser1.setBackground(new java.awt.Color(0, 204, 204));
        EditUser1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EditUser1.setText("ADD NEW USER");
        EditUser1.setActionCommand("");
        EditUser1.setMaximumSize(new java.awt.Dimension(153, 37));
        EditUser1.setMinimumSize(new java.awt.Dimension(153, 37));
        EditUser1.setPreferredSize(new java.awt.Dimension(153, 37));
        EditUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUser1ActionPerformed(evt);
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
                .addGap(10, 10, 10)
                .addComponent(logout)
                .addGap(1217, 1217, 1217))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemoveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(388, 388, 388))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(431, 431, 431))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(EditUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(EditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemoveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUserActionPerformed
        // TODO add your handling code here:
        if (editUser == null) {

            jDesktopPane2.removeAll();
            EditUser eu = new EditUser();
            jDesktopPane2.add(eu).setVisible(true);

        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(editUser).setVisible(true);

        }
        
    }//GEN-LAST:event_EditUserActionPerformed

    Home_Buttons_Interface hmi;
    private void RemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveUserActionPerformed
        // TODO add your handling code here:
        if (removeUser == null) {

            jDesktopPane2.removeAll();
            RemoveUser ru = new RemoveUser();
            jDesktopPane2.add(ru).setVisible(true);

        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(removeUser).setVisible(true);

        }
    }//GEN-LAST:event_RemoveUserActionPerformed

    private void EditUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUser1ActionPerformed
          if (addnew == null) {

            jDesktopPane2.removeAll();
            AddNewUser ru = new AddNewUser();
            jDesktopPane2.add(ru).setVisible(true);

        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(addnew).setVisible(true);

        }
    }//GEN-LAST:event_EditUser1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        //        if (home == null) {
            //            jDesktopPane2.removeAll();
            //            USM_MAIN_INTERFACE home_ = new USM_MAIN_INTERFACE();
            //            jDesktopPane2.add(home_).setVisible(true);
            //        } else {
            //            jDesktopPane2.removeAll();
            //            jDesktopPane2.add(home).setVisible(true);
            //        }

        if (hmi == null) {
            jDesktopPane2.removeAll();
            Home_Buttons_Interface h2 = new Home_Buttons_Interface();
            jDesktopPane2.add(h2).setVisible(true);
        } else {
            jDesktopPane2.removeAll();
            jDesktopPane2.add(hmi).setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditUser;
    private javax.swing.JButton EditUser1;
    private javax.swing.JButton RemoveUser;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
