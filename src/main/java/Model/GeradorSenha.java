/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.security.SecureRandom;

/**
 *
 * @author Carla Morais
 */
public class GeradorSenha {

    private static final String Caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()_+-=[]?";
    private static final int Senha_Length = 12;

    public static String generateRandomSenha() {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(Senha_Length);

        for (int i = 0; i < Senha_Length; i++) {
            int index = random.nextInt(Caracteres.length());
            senha.append(Caracteres.charAt(index));

        }

        return senha.toString();
    }

}
