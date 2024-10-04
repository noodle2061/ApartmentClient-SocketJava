/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import view.ChangePasswordFrm;
import view.DashboardFrm;
import view.DeleteAccountFrm;
import view.RoomSearchFrm;
import view.LoginFrm;
import view.RegisterFrm;
import view.FloorSearchFrm;
import view.ModifyRoomFrm;
import view.AddFloorFrm;
import view.ModifyFloorFrm;

/**
 *
 * @author admin
 */
public class Client {

    public static LoginFrm loginFrm;
    public static SocketHandle socketHandle;
    public static DatagramSocket socket;
    public static RegisterFrm registerFrm;
    public static DashboardFrm dashboardFrm;
    public static DeleteAccountFrm deleteAccountFrm;
    public static ChangePasswordFrm changePasswordFrm;
    public static FloorSearchFrm floorSearchFrm;
    public static RoomSearchFrm roomSearchFrm;
    public static ModifyRoomFrm modifyRoomFrm;
    public static AddFloorFrm addFloorFrm;
    public static ModifyFloorFrm modifyFloorFrm;

    public Client() {
        try {
            socket = new DatagramSocket();
            loginFrm = new LoginFrm();
            loginFrm.setVisible(true);
            socketHandle = new SocketHandle(socket);
            socketHandle.run();
        } catch (SocketException | UnknownHostException e) {
            System.out.println(e);
        }
    }

    public static void OpenView(View viewName) {
        switch (viewName) {
            case LOGIN:
                loginFrm = new LoginFrm();
                loginFrm.setVisible(true);
                break;
            case REGISTER:
                registerFrm = new RegisterFrm();
                registerFrm.setVisible(true);
                break;
            case ROOM_SEARCH:
                roomSearchFrm = new RoomSearchFrm();
                roomSearchFrm.setVisible(true);
                break;
            case FLOOR_SEARCH:
                floorSearchFrm = new FloorSearchFrm();
                floorSearchFrm.setVisible(true);
                break;
            case MODIFY_ROOM:
                modifyRoomFrm = new ModifyRoomFrm();
                modifyRoomFrm.setVisible(true);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void OpenView(View viewName, int x, int y) {
        switch (viewName) {
            case LOGIN:
                loginFrm = new LoginFrm();
                loginFrm.setLocation(x, y);
                loginFrm.setVisible(true);
                break;
            case REGISTER:
                registerFrm = new RegisterFrm();
                registerFrm.setLocation(x, y);
                registerFrm.setVisible(true);
                break;
            case ROOM_SEARCH:
                roomSearchFrm = new RoomSearchFrm();
                roomSearchFrm.setLocation(x, y);
                roomSearchFrm.setVisible(true);
                break;
            case FLOOR_SEARCH:
                floorSearchFrm = new FloorSearchFrm();
                floorSearchFrm.setLocation(x, y);
                floorSearchFrm.setVisible(true);
                break;
            case MODIFY_ROOM:
                modifyRoomFrm = new ModifyRoomFrm();
                modifyRoomFrm.setLocation(x, y);
                modifyRoomFrm.setVisible(true);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void OpenView(View viewName, String adminName) {
        switch (viewName) {
            case DASHBOARD:
                dashboardFrm = new DashboardFrm(adminName);
                dashboardFrm.setVisible(true);
                break;
            case DELETEACCOUNT:
                deleteAccountFrm = new DeleteAccountFrm(adminName);
                deleteAccountFrm.setVisible(true);
                break;
            case CHANGEPASSSWORD:
                changePasswordFrm = new ChangePasswordFrm(adminName);
                changePasswordFrm.setVisible(true);
                break;
            case ROOM_SEARCH:
                roomSearchFrm = new RoomSearchFrm(adminName);
                roomSearchFrm.setVisible(true);
                break;
            case FLOOR_SEARCH:
                floorSearchFrm = new FloorSearchFrm(adminName);
                floorSearchFrm.setVisible(true);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void OpenView(View viewName, String adminName, int x, int y) {
        switch (viewName) {
            case DASHBOARD:
                dashboardFrm = new DashboardFrm(adminName);
                dashboardFrm.setLocation(x, y);
                dashboardFrm.setVisible(true);
                break;
            case DELETEACCOUNT:
                deleteAccountFrm = new DeleteAccountFrm(adminName);
                deleteAccountFrm.setLocation(x, y);
                deleteAccountFrm.setVisible(true);
                break;
            case CHANGEPASSSWORD:
                changePasswordFrm = new ChangePasswordFrm(adminName);
                changePasswordFrm.setLocation(x, y);
                changePasswordFrm.setVisible(true);
                break;
            case ROOM_SEARCH:
                roomSearchFrm = new RoomSearchFrm(adminName);
                roomSearchFrm.setLocation(x, y);
                roomSearchFrm.setVisible(true);
                break;
            case FLOOR_SEARCH:
                floorSearchFrm = new FloorSearchFrm(adminName);
                floorSearchFrm.setLocation(x, y);
                floorSearchFrm.setVisible(true);
                break;
            case MODIFY_ROOM:

                break;
            default:
                throw new AssertionError();
        }
    }

    public static void OpenUpdateRoomView(String adminName, String roomName, String floorName, int x, int y) {
        System.out.println(adminName + " " + roomName + " " + x + " " + y);
        modifyRoomFrm = new ModifyRoomFrm(adminName, roomName, floorName);
        modifyRoomFrm.setLocation(x, y);
        modifyRoomFrm.setVisible(true);
    }

    public static void CloseView(View viewName) {
        switch (viewName) {
            case LOGIN:
                loginFrm.dispose();
                break;
            case DASHBOARD:
                dashboardFrm.dispose();
                break;
            case REGISTER:
                registerFrm.dispose();
                break;
            case DELETEACCOUNT:
                deleteAccountFrm.dispose();
                break;
            case CHANGEPASSSWORD:
                changePasswordFrm.dispose();
                break;
            case ROOM_SEARCH:
                roomSearchFrm.dispose();
                break;
            case FLOOR_SEARCH:
                floorSearchFrm.dispose();
                break;
            case MODIFY_ROOM:
                modifyRoomFrm.dispose();
                break;
            default:
                throw new AssertionError();
        }
    }

    public enum View {
        LOGIN,
        REGISTER,
        DASHBOARD,
        DELETEACCOUNT,
        CHANGEPASSSWORD,
        FLOOR_SEARCH,
        ROOM_SEARCH,
        MODIFY_ROOM
    }

    public static void main(String[] args) {
        new Client();
    }
}
