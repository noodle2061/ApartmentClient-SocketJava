/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package view;

import controller.Client;
import javax.swing.JOptionPane;

/**
 *
 * @author vankh
 */
public class ModifyFloorFrm extends javax.swing.JFrame {

    /**
     * Creates new form ModifyFloorFrm
     */
    private String floorName;
    
    public ModifyFloorFrm() {
        initComponents();
    }

    public ModifyFloorFrm(String floorName) {
        this.floorName = floorName;
        initComponents();
        jLabel2.setText("Chỉnh sửa tầng: " + floorName);
    }
    
    
    public void notify(String er) {
        JOptionPane.showMessageDialog(this, er, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addRoomBtn = new javax.swing.JButton();
        doiMoTaBtn = new javax.swing.JButton();
        describeTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newRoomNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newRoomAreaTxt = new javax.swing.JTextField();
        newRoomCapacityTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        turnBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addRoomBtn.setText("Thêm phòng");
        addRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomBtnActionPerformed(evt);
            }
        });

        doiMoTaBtn.setText("Đổi mô tả");
        doiMoTaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doiMoTaBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("2. Đổi mô tả tầng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Chỉnh sửa tầng");

        jLabel3.setText("Tên phòng mới:");

        newRoomNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRoomNameTxtActionPerformed(evt);
            }
        });

        jLabel4.setText("Diện tích:");

        jLabel5.setText("Số người ở:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("1. Thêm phòng");

        turnBackBtn.setText("Quay lại");
        turnBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 140, Short.MAX_VALUE))
                                    .addComponent(newRoomNameTxt)
                                    .addComponent(newRoomAreaTxt)
                                    .addComponent(newRoomCapacityTxt)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(describeTxt)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addRoomBtn)
                            .addComponent(doiMoTaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(turnBackBtn)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(turnBackBtn)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newRoomNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(newRoomAreaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(newRoomCapacityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(addRoomBtn)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doiMoTaBtn)
                    .addComponent(describeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newRoomNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRoomNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newRoomNameTxtActionPerformed

    private void addRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomBtnActionPerformed
        // TODO add your handling code here:
        String name = newRoomNameTxt.getText();
        String area = newRoomAreaTxt.getText();
        String capacity = newRoomCapacityTxt.getText();
        if (name.equals("") || area.equals("") || capacity.equals("")) {
            notify("Hãy nhập đầy đủ các thông tin của phòng");
        } else {
            try {
                Double a = Double.parseDouble(area);
                int b = Integer.parseInt(capacity);
                Client.socketHandle.write("add-room-request$" + floorName + "$" + name + "$" + area + "$" + capacity);
            } catch (NumberFormatException e) {
                notify("Hãy nhập đúng định dạng số!");
            }
        }
    }//GEN-LAST:event_addRoomBtnActionPerformed

    private void turnBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnBackBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_turnBackBtnActionPerformed

    private void doiMoTaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doiMoTaBtnActionPerformed
        // TODO add your handling code here:
        String mota = describeTxt.getText();
        if (mota.equals("")) {
            notify("Hãy nhập mô tả mới!");
            return;
        }
        Client.socketHandle.write("change-floor-describe-request$" + floorName + "$" + mota);
    }//GEN-LAST:event_doiMoTaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyFloorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyFloorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyFloorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyFloorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyFloorFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoomBtn;
    private javax.swing.JTextField describeTxt;
    private javax.swing.JButton doiMoTaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField newRoomAreaTxt;
    private javax.swing.JTextField newRoomCapacityTxt;
    private javax.swing.JTextField newRoomNameTxt;
    private javax.swing.JButton turnBackBtn;
    // End of variables declaration//GEN-END:variables

}
