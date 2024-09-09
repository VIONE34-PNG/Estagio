/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.indice;

/**
 *
 * @author vinic
 */
public class Indice {

    public static void main(String[] args) {
        int indice = 13;
        int resultado = calcularSoma(indice);
        System.out.println("O valor da soma e: " + resultado);
    }

    // Método para calcular a soma dos números de 1 até o índice
    public static int calcularSoma(int limite) {
        int soma = 0;
        for (int k = 1; k <= limite; k++) {
            soma += k;
        }
        return soma;
    }
}

