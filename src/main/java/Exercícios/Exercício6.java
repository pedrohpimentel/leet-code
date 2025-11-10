package Exercícios;

import java.util.Locale;
import java.util.Scanner;


/*Crie um programa que peça ao usuário seu nome e dois números inteiros.
O programa deve imprimir uma saudação personalizada e,
em seguida, mostrar o resultado da soma dos dois números.*/
public class Exercício6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Por favor, digite seu nome e dois números inteiros: ");
        String nome = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int soma = num1 + num2;

        System.out.println(nome + ", a soma dos seus dois números é = " +  soma);

        sc.close();
    }
}
