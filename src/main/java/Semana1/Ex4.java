package Semana1;

import java.util.Locale;
import java.util.Scanner;

/*
Maior de Três
Crie um programa que:

Declare três variáveis inteiras: a, b, e c.

Determine e imprima qual dos três números é o maior usando condicionais aninhadas (if dentro de if)
ou múltiplas condições (&&).
*/
public class Ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digte 3 números inteiros!");
        System.out.print("Número 1 : " );
        int num1 = sc.nextInt();

        System.out.print("Número 2 : " );
        int num2 = sc.nextInt();

        System.out.print("Número 3 : " );
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("O número " + num1 + " é maior.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O número " + num2 + " é maior.");
        } else {
            System.out.println("O número " + num3 + " é maior.");
        }

        if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("Houve em empate entre pelo menos dois números!");
        }

        sc.close();
    }
}
