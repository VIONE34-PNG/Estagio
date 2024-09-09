/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.string;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        java.lang.String original = scanner.nextLine(); 
        java.lang.String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}
