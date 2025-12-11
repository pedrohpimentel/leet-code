package Semana1;

import java.util.Locale;
import java.util.Scanner;

/*
Cálculo Simples
Crie um programa que:

Declare duas variáveis, numero1 e numero2, e atribua valores inteiros a elas (ex: 15 e 7).

Calcule e armazene em uma nova variável a soma desses dois números.

Imprima o resultado da soma.
*/
public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    int numero1 = 15;
    int numero2 = 7;

    int soma = numero1 + numero2;
        System.out.println("Soma de " + numero1 + " + " + numero2 + " é = " + soma);

        sc.close();
    }
}
