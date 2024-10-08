/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author admin
 */
public class SocketHandle implements Runnable {

    private final DatagramSocket socket;
    private final InetAddress serverAddress;

    public SocketHandle(DatagramSocket socket) throws UnknownHostException {
        this.socket = socket;
        this.serverAddress = InetAddress.getByName("localhost");
    }

    public void write(String message) {
        try {
            byte[] sendData = message.getBytes("UTF-8");
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9999);
            socket.send(sendPacket);
            System.out.println("Client: " + message);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
                String[] msg = receivedMessage.trim().split(" ");
                String res = msg[0];

                // dang nhap thanh cong, tra ve thong tin admin
                if (res.equals("login-success")) {
                    String adminName = msg[1];
                    System.out.println(adminName);
                    int x = Client.loginFrm.getLocation().x;
                    int y = Client.loginFrm.getLocation().y;
                    Client.CloseView(Client.View.LOGIN);
                    Client.OpenView(Client.View.DASHBOARD, adminName, x, y);
                } // dang nhap that bai, yeu cau nhap lai
                else if (res.equals("login-fail")) {
                    Client.loginFrm.notify("Nhập sai tên hoặc mật khẩu");
                } //dang ky thanh cong
                else if (res.equals("register-success")) {
                    int x = Client.registerFrm.getLocation().x;
                    int y = Client.registerFrm.getLocation().y;
                    Client.CloseView(Client.View.REGISTER);
                    Client.OpenView(Client.View.LOGIN, x, y);
                    Client.loginFrm.notify("Bạn vừa đăng Ký thành công!!!");
                } // dang ky that bai
                else if (res.equals("register-fail")) {
                    Client.registerFrm.notify("Tài khoản đã tồn tại, vui lòng nhập lại!");
                } // xu ly xóa tài khoản
                else if (res.equals("delete-account-success")) {
                    int x = Client.deleteAccountFrm.getLocation().x;
                    int y = Client.deleteAccountFrm.getLocation().y;
                    Client.CloseView(Client.View.DELETEACCOUNT);
                    Client.OpenView(Client.View.LOGIN, x, y);
                    Client.loginFrm.notify("Bạn vừa xóa tài khoản thành công!!!");
                } else if (res.equals("delete-account-fail")) {
                    Client.deleteAccountFrm.notify("Nhập sai mật khẩu.");
                } // đổi password thành công
                else if (res.equals("change-password-success")) {
                    String name = msg[1];
                    int x = Client.changePasswordFrm.getLocation().x;
                    int y = Client.changePasswordFrm.getLocation().y;
                    Client.CloseView(Client.View.CHANGEPASSSWORD);
                    Client.OpenView(Client.View.DASHBOARD, name, x, y);
                } else if (res.equals("change-password-fail")) {
                    Client.changePasswordFrm.notify("Nhập sai mật khẩu!!");
                } else if (receivedMessage.startsWith("open-search-room-frm-success")) {
                    Client.roomSearchFrm.updateTable(receivedMessage);
                } else if (receivedMessage.startsWith("return-room-search")) {
                    Client.roomSearchFrm.updateTable(receivedMessage);
                } else if (res.equals("delete-room-response-fail")) {
                    Client.roomSearchFrm.notify("Xóa không thành công!");
                } else if (receivedMessage.startsWith("delete-room-response-success")) {
                    Client.roomSearchFrm.notify("Xóa thành công!");
                    Client.roomSearchFrm.updateTable(receivedMessage);
                } else if (receivedMessage.startsWith("modify-room-response-success")) {
                    Client.CloseView(Client.View.MODIFY_ROOM);
                    Client.roomSearchFrm.notify("Thay đổi thành công!");
                    Client.roomSearchFrm.updateTable(receivedMessage);
                } else if (receivedMessage.startsWith("get-all-floor-success")) {
                    Client.floorSearchFrm.updateTable(receivedMessage);
                } else if (receivedMessage.startsWith("find-floor-success")) {
                    Client.floorSearchFrm.updateTable(receivedMessage);
                } else if (receivedMessage.startsWith("delete-floor-request-success")) {
                    Client.floorSearchFrm.notify("Xóa thành công!!");
                    Client.floorSearchFrm.updateTable(receivedMessage);
                } else if (receivedMessage.startsWith("delete-floor-request-fail")) {
                    Client.floorSearchFrm.notify("Mật khẩu nhập sai!");
                } else if (receivedMessage.startsWith("get-floor-close-success")) {
                    Client.addFloorFrm.updateTable(receivedMessage);
                } else if (receivedMessage.startsWith("add-floor-success")) {
                    Client.addFloorFrm.dispose();
                    Client.floorSearchFrm.notify("Đã thêm phòng thành công!!");
                    Client.floorSearchFrm.updateTable(receivedMessage);
                } else if (receivedMessage.startsWith("add-room-fail")) {
                    Client.modifyFloorFrm.notify("Thêm phòng thất bại, đã có phòng cùng tên!");
                } else if (receivedMessage.startsWith("add-room-success")) {
                    Client.modifyFloorFrm.notify("Thêm phòng thành công");
                }
                else if (receivedMessage.startsWith("change-floor-describe-success")) {
                    Client.modifyFloorFrm.notify("Đổi mô tả thành công");
                    Client.modifyFloorFrm.dispose();
                    Client.floorSearchFrm.updateTable(receivedMessage);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
