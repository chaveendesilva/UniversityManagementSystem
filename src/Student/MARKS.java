/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import DataBase.DBconnect;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import javax.swing.JFileChooser;
import net.proteanit.sql.DbUtils;
import static Student.USM_MAIN_INTERFACE.jDesktopPane2;


/**
 *
 * @author perer
 */
public class MARKS extends javax.swing.JInternalFrame {

    /**
     * Creates new form MARKS
     */
    public MARKS() {
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
        Back_btn3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Search_txt_and_StudentID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Marks_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        subjectName_txt = new javax.swing.JTextField();
        GradePoint_txt = new javax.swing.JTextField();
        FacultyYear_txt = new javax.swing.JTextField();
        subjectId_txt = new javax.swing.JTextField();
        Print_btn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        Print_Selectedone_btn1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(1354, 522));
        setPreferredSize(new java.awt.Dimension(1354, 522));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Back_btn3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Back_btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_Back_131811.png"))); // NOI18N
        Back_btn3.setText("BACK");
        Back_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btn3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MARKS");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search by ID :");

        Search_txt_and_StudentID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Search_txt_and_StudentID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        Search_txt_and_StudentID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Search_txt_and_StudentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_txt_and_StudentIDKeyReleased(evt);
            }
        });

        Marks_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Marks_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Subject ID", "Subject Name", "Faculty Year", "Grade Point"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Marks_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Marks_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Marks_table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SUBJECT ID :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FACULTY YEAR    :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SUBJECT NAME :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GRADE POINT   :");

        subjectName_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subjectName_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));

        GradePoint_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GradePoint_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));

        FacultyYear_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FacultyYear_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));

        subjectId_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subjectId_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));

        Print_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Print_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Adobe_PDF_file_icon_32x32.png"))); // NOI18N
        Print_btn.setText("PRINT TABLE");
        Print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_btnActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        Print_Selectedone_btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Print_Selectedone_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Create pdf.png"))); // NOI18N
        Print_Selectedone_btn1.setText("PRINT SELECTED ONE");
        Print_Selectedone_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_Selectedone_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(91, 91, 91)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(subjectId_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                            .addComponent(FacultyYear_txt))
                                        .addGap(270, 270, 270)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Search_txt_and_StudentID))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Back_btn3)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(973, 973, 973)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(GradePoint_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                    .addComponent(subjectName_txt, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(387, 387, 387)
                                .addComponent(Print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180)
                                .addComponent(Print_Selectedone_btn1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back_btn3)
                    .addComponent(jLabel11))
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_txt_and_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subjectName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GradePoint_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(subjectId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FacultyYear_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Print_Selectedone_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
    private void Back_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btn3ActionPerformed
        if (s3 == null) {

            jDesktopPane2.removeAll();
            STUDENT_HOME2 S2 = new STUDENT_HOME2();
            jDesktopPane2.add(S2).setVisible(true);

        } else {

            jDesktopPane2.removeAll();
            jDesktopPane2.add(s3).setVisible(true);
        }
    }//GEN-LAST:event_Back_btn3ActionPerformed

    private void Search_txt_and_StudentIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_txt_and_StudentIDKeyReleased

        String Search = Search_txt_and_StudentID.getText();

        if (Search.matches("[a-z A-Z][0-9]+")) {
            JOptionPane.showMessageDialog(null, "Enter Valide StudentID Number");
        } else {
            try {
                ResultSet rs = DBconnect.connect().createStatement().executeQuery("SELECT * FROM fill_marks WHERE student_Id LIKE '%" + Search + "%'");

                Marks_table.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_Search_txt_and_StudentIDKeyReleased

    private void Print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_btnActionPerformed

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Student_FullMarks_Sheet.pdf"));
        int dialogResult = dialog.showSaveDialog(null);

        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

            try {

                ResultSet rs = DBconnect.connect().createStatement().executeQuery("SELECT * FROM fill_marks");

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(6);
                myDocument.open();

                float[] columnWidths = new float[]{5, 5, 9, 9, 5};
                table.setWidths(columnWidths);

                table.setWidthPercentage(100); //set table width to 100%

                myDocument.add(new Paragraph("Student Marks Sheet", FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, 30, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph(new Paragraph("Tell : 011-2700800", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.ITALIC))));
                myDocument.add(new Paragraph("\n"));
                myDocument.add(new Paragraph(new Paragraph("Univercity OF Youtbe", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.CENTER_BASELINE))));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("\n"));
                table.addCell(new PdfPCell(new Paragraph("No", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Student ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Subject ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Subject Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Faculty Year", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Grade Point", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));

                while (rs.next()) {

                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));

                }

                myDocument.add(table);
                myDocument.add(new Paragraph("\n"));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("\n"));
                myDocument.add(new Paragraph(new Paragraph("                                                                              ***  Thank You  ***", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));

                myDocument.close();
                JOptionPane.showMessageDialog(null, "Print Report was successfully generated");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            } finally {

                try {

                } catch (Exception e) {
                }
            }

            subjectId_txt.setText("");
            FacultyYear_txt.setText("");
            subjectName_txt.setText("");
            GradePoint_txt.setText("");

        }
    }//GEN-LAST:event_Print_btnActionPerformed

    private void Marks_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Marks_tableMouseClicked
        int raw = Marks_table.getSelectedRow();

        String subject_ID = Marks_table.getValueAt(raw, 2).toString();
        String subject_Name = Marks_table.getValueAt(raw, 3).toString();
        String Faculty_Year = Marks_table.getValueAt(raw, 4).toString();
        String Grade_Point = Marks_table.getValueAt(raw, 5).toString();

        subjectId_txt.setText(subject_ID);
        FacultyYear_txt.setText(Faculty_Year);
        subjectName_txt.setText(subject_Name);
        GradePoint_txt.setText(Grade_Point);
    }//GEN-LAST:event_Marks_tableMouseClicked

    private void Print_Selectedone_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_Selectedone_btn1ActionPerformed

        String Value0 = Search_txt_and_StudentID.getText();
        String Value1 = subjectId_txt.getText();
        String Value2 = subjectName_txt.getText();
        String Value3 = FacultyYear_txt.getText();
        String Value4 = GradePoint_txt.getText();

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(Value0 + "." + Value1 + "-SubjectDetails" + ".pdf"));
        int dialogResult = dialog.showSaveDialog(null);

        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

            try {

                Document myDocument = new Document();

                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(5);
                myDocument.open();

                float[] columnWidths = new float[]{3, 9, 9, 5, 5};
                table.setWidths(columnWidths);

                table.setWidthPercentage(100);

                myDocument.add(new Paragraph("Selected Subject Marks Table", FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, 30, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph(new Paragraph("Tell : 011-2******", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.ITALIC))));
                myDocument.add(new Paragraph("\n"));
                myDocument.add(new Paragraph(new Paragraph("E-mail : UniversityOfYoutube@gmail.com", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.CENTER_BASELINE))));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("\n"));

                table.addCell(new PdfPCell(new Paragraph("STUDENT ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("SUBJECT ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("SUBJECT NAME", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("FACULTY YEAR", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("GRADE POINT ", FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.BOLD))));

                table.addCell(new PdfPCell(new Paragraph(Value0, FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(Value1, FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(Value2, FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(Value3, FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(Value4, FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));

                myDocument.add(table);
                myDocument.add(new Paragraph("\n"));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("\n"));
                myDocument.add(new Paragraph(new Paragraph("                                                                              ***  Thank You  ***", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));

                myDocument.close();
                JOptionPane.showMessageDialog(null, "Report was successfully generated");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else {
        }

    }//GEN-LAST:event_Print_Selectedone_btn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn3;
    private javax.swing.JTextField FacultyYear_txt;
    private javax.swing.JTextField GradePoint_txt;
    private javax.swing.JTable Marks_table;
    private javax.swing.JButton Print_Selectedone_btn1;
    private javax.swing.JButton Print_btn;
    private javax.swing.JTextField Search_txt_and_StudentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField subjectId_txt;
    private javax.swing.JTextField subjectName_txt;
    // End of variables declaration//GEN-END:variables
}
