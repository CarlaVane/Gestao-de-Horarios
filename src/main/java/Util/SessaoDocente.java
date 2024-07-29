/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author Carla Morais
 */
public class SessaoAdmin {

    private static Long adminId;

    public static void setAdminId(Long id) {
        adminId = id;
    }

    public static Long getAdminId() {
        return adminId;
    }

    public static void clear() {
        adminId = null;
    }
}


