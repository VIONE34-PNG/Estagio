/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estado;

/**
 *
 * @author vinic
 */
public class Estado {

    public static void main(String[] args) {
              double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        System.out.println("Percentual de representacao por estado:");
        System.out.println("SP: " + (sp / total * 100) + "%");
        System.out.println("RJ: " + (rj / total * 100) + "%");
        System.out.println("MG: " + (mg / total * 100) + "%");
        System.out.println("ES: " + (es / total * 100) + "%");
        System.out.println("Outros: " + (outros / total * 100) + "%");
    }
}
