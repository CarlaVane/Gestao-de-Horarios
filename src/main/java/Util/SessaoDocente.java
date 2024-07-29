/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author Carla Morais
 */
public class SessaoDocente {

    private static Long docenteID;

    public static void setdocenteId(Long id) {
        docenteID = id;
    }

    public static Long getdocenteId() {
        return docenteID;
    }

    public static void clear() {
        docenteID = null;
    }
}


