/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package view;

import controller.Client;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vankh
 */
public class RoomSearchFrm extends javax.swing.JFrame {

    /**
     * Creates new form RoomSearchFrm
     */
    private String adminName;
    private String tenPhong="", tang="", dienTich="", soNguoi="";

    public RoomSearchFrm() {
        initComponents();
    }

    public RoomSearchFrm(String adminName) {
        this.adminName = adminName;
        initComponents();
    }

    public void notify(String er) {
        JOptionPane.showMessageDialog(this, er, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void updateTable(String s) {
        DefaultTableModel model = (DefaultTableModel) roomTable.getModel();
        model.setRowCount(0);
        String[] lst = s.split("\\$");
        int size = lst.length;
        if (size == 1) {
            roomName.setText("Không có phòng nào hợp lệ.");
        }
        for (int i = 1; i < size; i += 4) {
            model.addRow(new Object[]{lst[i], lst[i + 1], lst[i + 2], lst[i + 3]});
        }

        // Lắng nghe sự kiện chọn hàng để lấy dữ liệu khi người dùng nhấp vào
        ListSelectionModel selectionModel = roomTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = roomTable.getSelectedRow();
                if (selectedRow != -1) {
                    // Lấy dữ liệu từ hàng đã chọn
                    tenPhong = (String) roomTable.getValueAt(selectedRow, 0);
                    tang = (String) roomTable.getValueAt(selectedRow, 1);
                    dienTich = (String) roomTable.getValueAt(selectedRow, 2);
                    soNguoi = (String) roomTable.getValueAt(selectedRow, 3);

                    // In ra dữ liệu của hàng được chọn
//                System.out.println("Hàng đã chọn: " + col1 + ", " + col2 + ", " + col3 + ", " + col4);
                    roomName.setText("Bạn đã chọn phòng: " + tenPhong);
                }
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        nameOfAdmin = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        minArea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        maxArea = new javax.swing.JTextField();
        nameOfRoom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maxCapacity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        minCapacity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        floorChoose = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        modifyRoomBtn = new javax.swing.JButton();
        roomName = new javax.swing.JLabel();
        deleteRoomBtn = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameOfAdmin.setText("admin: ");

        backBtn.setText("Quay lại");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Nhập phòng cần tìm:");

        jLabel2.setText("Khoảng diện tích từ:");

        jLabel3.setText("đến:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Tìm phòng");

        jLabel5.setText("đến:");

        jLabel6.setText("Số người ở từ:");

        jLabel7.setText("Tầng:");

        floorChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn tầng cần tìm", "Tầng 1", "Tầng 2", "Tầng 3", "Tầng 4", "Tầng 5", "Tầng 6", "Tầng 7" }));
        floorChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorChooseActionPerformed(evt);
            }
        });

        searchBtn.setText("Tìm kiếm");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên phòng", "Tầng", "Diện Tích", "Số người ở"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(roomTable);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Danh sách phòng:");

        modifyRoomBtn.setText("Sửa phòng");
        modifyRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyRoomBtnActionPerformed(evt);
            }
        });

        roomName.setText("Bạn chưa chọn phòng nào.");

        deleteRoomBtn.setText("Xóa phòng");
        deleteRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameOfAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(searchBtn))
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nameOfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(minArea, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(minCapacity))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(maxCapacity))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(maxArea, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel4)))
                        .addContainerGap(164, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(floorChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteRoomBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifyRoomBtn)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(roomName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameOfAdmin)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameOfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(minArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(maxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(minCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(maxCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(floorChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(roomName)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyRoomBtn)
                    .addComponent(deleteRoomBtn))
                .addGap(14, 14, 14))
        );

        nameOfAdmin.setText("admin: " + this.adminName);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        int x = getLocation().x;
        int y = getLocation().y;
        Client.CloseView(Client.View.ROOM_SEARCH);
        Client.OpenView(Client.View.DASHBOARD, adminName, x, y);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String name = nameOfRoom.getText();
        String areamin = minArea.getText();
        String areamax = maxArea.getText();
        String capacitymin = minCapacity.getText();
        String capacitymax = maxCapacity.getText();
        String floorName = (String) floorChoose.getSelectedItem();

        if (name.equals("")) {
            name = "none";
        }
        if (areamin.equals("")) {
            areamin = "none";
        }
        if (areamax.equals("")) {
            areamax = "none";
        }
        if (capacitymin.equals("")) {
            capacitymin = "none";
        }
        if (capacitymax.equals("")) {
            capacitymax = "none";
        }
        if (floorName.equals("")) {
            floorName = "none";
        }

        try {
            if (!areamin.equals("none")) {
                double a = Double.parseDouble(areamin);
            }
            if (!areamax.equals("none")) {
                double b = Double.parseDouble(areamax);
            }

        } catch (NumberFormatException e) {
            notify("Định dạng của diện tích không đúng! Nhập lại!");
        }

        try {
            if (!capacitymin.equals("none")) {
                int a = Integer.parseInt(capacitymin);
            }
            if (!capacitymax.equals("none")) {
                int b = Integer.parseInt(capacitymax);
            }
        } catch (NumberFormatException e) {
            notify("Định dạng của số người không đúng! Nhập lại");
        }
        
        if (floorName.equals("Chọn tầng cần tìm")) floorName = "none";

        Client.socketHandle.write("search-room-request$" + name + "$" + areamin + "$" + areamax + "$" + capacitymin + "$" + capacitymax + "$" + floorName);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void floorChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorChooseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floorChooseActionPerformed

    private void deleteRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomBtnActionPerformed
        // TODO add your handling code here:
        if (tenPhong.equals("")) {
            notify("Hãy chọn phòng để xóa!!");
            return;
        }
        Client.socketHandle.write("delete-room-request$" + tenPhong + "$" + tang);
    }//GEN-LAST:event_deleteRoomBtnActionPerformed

    private void modifyRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyRoomBtnActionPerformed
        // TODO add your handling code here:
        int x = this.getLocation().x;
        int y = this.getLocation().y;
        if (tenPhong == null) {
            notify("Hãy chọn một phòng!");
            return;
        }
        Client.OpenUpdateRoomView(adminName, tenPhong, tang, x, y);
    }//GEN-LAST:event_modifyRoomBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RoomSearchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomSearchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomSearchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomSearchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomSearchFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteRoomBtn;
    private javax.swing.JComboBox<String> floorChoose;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maxArea;
    private javax.swing.JTextField maxCapacity;
    private javax.swing.JTextField minArea;
    private javax.swing.JTextField minCapacity;
    private javax.swing.JButton modifyRoomBtn;
    private javax.swing.JLabel nameOfAdmin;
    private javax.swing.JTextField nameOfRoom;
    private javax.swing.JLabel roomName;
    private javax.swing.JTable roomTable;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables

}
