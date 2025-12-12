package Semana1;

import java.util.Locale;
import java.util.Scanner;

/*
Conversor de Temperatura
Crie um programa que:
Declare uma variável celsius e atribua a ela uma temperatura em graus Celsius (ex: 25).
Converta essa temperatura para Fahrenheit usando a fórmula: F = C * (9/5) + 32.
(Atenção com a divisão de inteiros em Java!) Imprima o resultado em Fahrenheit.
*/
public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int celsius = 25;
        double farenheit = (double) celsius * (9.0/5.0) + 32;

        System.out.println("Farenheit de " + celsius + " é = " + farenheit );

        sc.close();
    }
}
