package Exercícios;

import java.util.Locale;
import java.util.Scanner;


/*
Faça um programa que leia um número inteiro e informe ao usuário se esse número é par ou ímpar.*/
public class Exercício7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro e descubra se ele é PAR ou ÍMPAR : ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O número " + num + " é PAR!");
        }
        else {
            System.out.println("O número " + num + " é ÍMPAR!");
        }

        sc.close();
    }
}
