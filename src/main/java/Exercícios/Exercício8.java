package Exercícios;

import java.util.Locale;
import java.util.Scanner;


/*
Peça ao usuário um número inteiro e use uma estrutura de repetição (for ou while)
para gerar e imprimir a tabuada desse número, de 1 a 10.*/
public class Exercício8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro e descubra a sua tabuada até o 10: ");
        int num = sc.nextInt();

        System.out.println("Tabuada do número " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + num + " = " + num * i);
        }

        sc.close();
    }
}
