/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author Carla Morais
 */
public enum Role {
    ADMIN(1, "Administrador"),
    DOCENTE(2, "Docente");

    private final int value;
    private final String description;

    Role(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public static Role fromValue(int value) {
        for (Role role : Role.values()) {
            if (role.getValue() == value) {
                return role;
            }
        }
        throw new IllegalArgumentException("Unknown role value: " + value);
    }

    @Override
    public String toString() {
        return description;
    }
    
     
}
