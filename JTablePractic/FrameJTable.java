
import java.util.*;
import javax.swing.table.DefaultTableModel;
import gui.SinhVien;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maihoa
 */
public class FrameJTable extends javax.swing.JFrame {

    /**
     * Creates new form FrameJTable
     */
    public FrameJTable() {
        initComponents();
        
    }
    /**
     * 
     */
        Vector<SinhVien> DSSV = new Vector<>();
        DefaultTableModel ds = new DefaultTableModel
        (  new Object[][]
            {
            }
            , 
            new String [] 
            {
                "MSSV", "Họ Tên", "Năm", "Lớp"
            }
        );
     /**
      *  Status = false; Edit ------ Status = true; Save
      */
            boolean Status = false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfile = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboClass = new javax.swing.JComboBox<>();
        butAdd = new javax.swing.JButton();
        butXoa = new javax.swing.JButton();
        butEditAndSave = new javax.swing.JButton();
        butSearch = new javax.swing.JButton();
        butAddClass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 220));

        tblProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ Tên", "Năm", "Lớp"
            }
        ));
        tblProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfileMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProfile);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thao tác"));

        jLabel1.setText("MSSV");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Năm");

        jLabel4.setText("Lớp");

        cboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "57TH1", "57TH2", "58TH1" }));

        butAdd.setText("Thêm");
        butAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddActionPerformed(evt);
            }
        });

        butXoa.setText("Xóa");
        butXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butXoaActionPerformed(evt);
            }
        });

        butEditAndSave.setText("Sửa/Lưu");
        butEditAndSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butEditAndSaveMouseClicked(evt);
            }
        });
        butEditAndSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEditAndSaveActionPerformed(evt);
            }
        });

        butSearch.setText("Tìm kiếm");
        butSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSearchActionPerformed(evt);
            }
        });

        butAddClass.setText("...");
        butAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddClassActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(cboClass, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butAddClass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butEditAndSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21)
                                .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butEditAndSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSearch)
                    .addComponent(butAddClass))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddActionPerformed
        
        
        // 
        SinhVien sv = new SinhVien();
        sv.setMSSV(txtMSSV.getText());
        sv.setName(txtName.getText());
        sv.setYear(txtYear.getText());
        sv.setCourse(cboClass.getSelectedItem().toString());
        DSSV.add(sv);
        
        /*DefaultTableModel ds = new DefaultTableModel(
            new Object[][]
            {
            }
        , 
            new String [] 
            {
                "MSSV", "Họ Tên", "Năm", "Lớp"
            }
        );*/
        //for (int i = 0; i < DSSV.size(); i++) {
            
            Vector<String> row = new Vector<>();
            row.add(sv.getMSSV());
            row.add(sv.getName());
            row.add(sv.getYear());
            row.add(sv.getCourse());
            ds.addRow(row);
        //}
        tblProfile.setModel(ds);
       
    }//GEN-LAST:event_butAddActionPerformed

    private void butXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butXoaActionPerformed
        int i = tblProfile.getSelectedRow();
        if(i > -1)
        {
           
           if(JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn", "Cảnh báo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0)
           {
                DSSV.removeElementAt(i);                   
                 /*for (int j = 0; j < DSSV.size(); j++) 
                 {
                     SinhVien sv = DSSV.get(i);
                     Vector<String> row = new Vector<>();
                     row.add(sv.getMSSV());
                     row.add(sv.getName());
                     row.add(sv.getYear());
                     row.add(sv.getCourse());
                     ds.addRow(row);
                 }*/
                 ds.removeRow(i);
                 tblProfile.setModel(ds);
           }

        }
    }//GEN-LAST:event_butXoaActionPerformed

    private void butEditAndSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditAndSaveActionPerformed
        if(!Status)
        {
            JOptionPane.showConfirmDialog(null, "Bạn đang sửa thông tin sinh viên","Thông báo",JOptionPane.CANCEL_OPTION);
            Status = true;
        }
        else
        {
            if(JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn lưu","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE) == 0)
            {
                int i = tblProfile.getSelectedRow();
                SinhVien sv = new SinhVien();
                sv.setMSSV(txtMSSV.getText());
                sv.setName(txtName.getText());
                sv.setYear(txtYear.getText());
                sv.setCourse(cboClass.getSelectedItem().toString());
                DSSV.setElementAt(sv, i);
                ds.setValueAt(sv.getMSSV(), i, 0);
                ds.setValueAt(sv.getName(), i, 1);
                ds.setValueAt(sv.getYear(), i, 2);
                ds.setValueAt(sv.getCourse(), i, 3);
                Status = false;
            }
            else
                Status = false;
        }
    }//GEN-LAST:event_butEditAndSaveActionPerformed

    private void butEditAndSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butEditAndSaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_butEditAndSaveMouseClicked

    private void tblProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfileMouseClicked
        int i = tblProfile.getSelectedRow();
        SinhVien sv = DSSV.get(i);
        txtMSSV.setText(sv.getMSSV());
        txtName.setText(sv.getName());
        txtYear.setText(sv.getYear());
    }//GEN-LAST:event_tblProfileMouseClicked

    private void butSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSearchActionPerformed
        DefaultTableModel tam = new DefaultTableModel( new Object[][]
            {
            }
        , 
            new String [] 
            {
                "MSSV", "Họ Tên", "Năm", "Lớp"
            });
        for (int i = 0; i < DSSV.size(); i++) {
            if(DSSV.get(i).getMSSV().equals(txtMSSV.getText()))
            {
                Vector<String> row = new Vector<>();
                row.add(DSSV.get(i).getMSSV());
                row.add(DSSV.get(i).getName());
                row.add(DSSV.get(i).getYear());
                row.add(DSSV.get(i).getCourse());
                tam.addRow(row);              
            }
        }
        tblProfile.setModel(tam);
    }//GEN-LAST:event_butSearchActionPerformed

    private void butAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddClassActionPerformed
        String input = JOptionPane.showInputDialog("Nhập tên môn thể thao: ");
        cboClass.addItem(input);
    }//GEN-LAST:event_butAddClassActionPerformed

 
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
            java.util.logging.Logger.getLogger(FrameJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameJTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAdd;
    private javax.swing.JButton butAddClass;
    private javax.swing.JButton butEditAndSave;
    private javax.swing.JButton butSearch;
    private javax.swing.JButton butXoa;
    private javax.swing.JComboBox<String> cboClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProfile;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
