/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;

public class Media {
    public static void main(String[] args) {
        double[] faturamento = {
            22174.1664, 24537.6698, 26139.6134, 0, 0, 0, 26742.6612,
            0, 0, 42889.2258, 46251.174, 11191.4722, 0, 0, 0, 0,
            0, 26874.6632, 0, 0, 0, 7899.6685, 0, 0, 0, 0,
            0, 42889.2258, 11191.4722, 0, 0
        };

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaMedia = 0;

        for (double valor : faturamento) {
            if (valor > media) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menor);
        System.out.println("Maior valor de faturamento: " + maior);
        System.out.println("Dias com faturamento acima da media: " + diasAcimaMedia);
    }
}
