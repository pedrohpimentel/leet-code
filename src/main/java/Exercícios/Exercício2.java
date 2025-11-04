package Exercícios;

import java.util.Scanner;

/*Algoritmo de Repetição e Array
Objetivo: Utilizar laços de repetição (for ou while) e a Estrutura de Dados mais básica, o Array.

Problema: Crie um programa que leia 5 números inteiros do usuário e os armazene em um Array.
Em seguida, percorra esse Array usando um laço de repetição
e calcule a soma e a média dos números. Por fim, exiba a soma e a média.*/
public class Exercício2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros){
            soma += numero;
        }

        double media = (double) soma / numeros.length;

        System.out.println("A soma dos 5 números é: " + soma);
        System.out.printf("A média dos 5 números é: %.2f" , media);

        sc.close();
    }
}
