/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.DangNhapController;
import controller.QuanLyNhaCungCapController;
import dao.PhanQuyenDAO;
import dao.PhanQuyenDAOImpl;
import model.Quyen;

/**
 *
 * @author Home
 */
public class NhaCungCapJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhaCungCapJPanel
     */
    public NhaCungCapJPanel() {
        initComponents();
        
        DangNhapController controllerDangNhap = new DangNhapController();
        
        PhanQuyenDAO phanQuyenDAO = new PhanQuyenDAOImpl();
        Quyen quyen = phanQuyenDAO.getQuyen(controllerDangNhap.taiKhoanLogin.getChucVu(), 
                "Quản lý nhà cung cấp");
        
        if (quyen.getCreate() == 0) {
            jBtnAdd.setVisible(false);
        }
        
        if (quyen.getUpdate()== 0) {
            jBtnUpdate.setVisible(false);
        }
        
        if (quyen.getDelete()== 0) {
            jBtnDelete.setVisible(false);
        }
        
        QuanLyNhaCungCapController controller = new QuanLyNhaCungCapController(
                jPnView, 
                jBtnAdd, 
                jBtnUpdate,
                jBtnDelete, 
                jBtnReset, 
                jBtnXuatExcel,
                jTfMaNcc, 
                jTfTen, 
                jTfSDT, 
                jTfDiaChi, 
                jTfSeach
        );
        controller.setDataToTable();
        controller.setEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLbTen = new javax.swing.JLabel();
        jTfTen = new javax.swing.JTextField();
        jLbDiaChi = new javax.swing.JLabel();
        jTfDiaChi = new javax.swing.JTextField();
        jLbSDT = new javax.swing.JLabel();
        jTfSDT = new javax.swing.JTextField();
        jBtnAdd = new javax.swing.JButton();
        jLbMaNcc = new javax.swing.JLabel();
        jTfMaNcc = new javax.swing.JTextField();
        jBtnUpdate = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jBtnXuatExcel = new javax.swing.JButton();
        jPnView = new javax.swing.JPanel();
        jLbSearch = new javax.swing.JLabel();
        jTfSeach = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÀ CUNG CẤP");
        jLabel1.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin nhà cung cấp"));

        jLbTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbTen.setText("Tên nhà cung cấp");

        jTfTen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLbDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbDiaChi.setText("Địa chỉ");

        jLbSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbSDT.setText("Số điện thoại");

        jBtnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnAdd.setText("Thêm");

        jLbMaNcc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbMaNcc.setText("Mã nhà cung cấp");

        jTfMaNcc.setEditable(false);
        jTfMaNcc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBtnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnUpdate.setText("Lưu");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jBtnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnDelete.setText("Xóa");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jBtnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jBtnXuatExcel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnXuatExcel.setText("Xuất Excel");
        jBtnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnXuatExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLbMaNcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(443, 443, 443))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLbTen)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTfMaNcc)
                                    .addComponent(jTfTen)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLbDiaChi)
                                    .addComponent(jLbSDT))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTfDiaChi)
                                    .addComponent(jTfSDT))))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jBtnAdd)
                        .addGap(29, 29, 29)
                        .addComponent(jBtnUpdate)
                        .addGap(34, 34, 34)
                        .addComponent(jBtnDelete)
                        .addGap(31, 31, 31)
                        .addComponent(jBtnReset)
                        .addGap(26, 26, 26)
                        .addComponent(jBtnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbMaNcc)
                    .addComponent(jTfMaNcc, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbTen)
                    .addComponent(jTfTen, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbDiaChi)
                    .addComponent(jTfDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbSDT)
                    .addComponent(jTfSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAdd)
                    .addComponent(jBtnUpdate)
                    .addComponent(jBtnDelete)
                    .addComponent(jBtnReset)
                    .addComponent(jBtnXuatExcel))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPnView.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPnViewLayout = new javax.swing.GroupLayout(jPnView);
        jPnView.setLayout(jPnViewLayout);
        jPnViewLayout.setHorizontalGroup(
            jPnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPnViewLayout.setVerticalGroup(
            jPnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        jLbSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbSearch.setText("Tìm kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLbSearch)
                .addGap(92, 92, 92)
                .addComponent(jTfSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbSearch))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnXuatExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnXuatExcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JButton jBtnXuatExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbDiaChi;
    private javax.swing.JLabel jLbMaNcc;
    private javax.swing.JLabel jLbSDT;
    private javax.swing.JLabel jLbSearch;
    private javax.swing.JLabel jLbTen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPnView;
    private javax.swing.JTextField jTfDiaChi;
    private javax.swing.JTextField jTfMaNcc;
    private javax.swing.JTextField jTfSDT;
    private javax.swing.JTextField jTfSeach;
    private javax.swing.JTextField jTfTen;
    // End of variables declaration//GEN-END:variables
}
