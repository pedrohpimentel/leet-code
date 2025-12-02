package Semana1;


import java.util.Locale;
import java.util.Scanner;

/*
 Algoritmo de Iteração (Soma Acumulada)Problema:
 Escreva um programa que solicite ao usuário um número inteiro positivo N.
 Em seguida, use um laço de repetição (for ou while) para calcular
 e imprimir a soma de todos os números inteiros de 1 até $N$.
 */
public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero ; i++) {
            soma += i;
        }
        System.out.println("Soma destes número até " + numero + " = " + soma);


        sc.close();
    }
}
