package Semana1;

import java.util.Locale;
import java.util.Scanner;

/*
Par ou Ímpar
Crie um programa que:
Declare uma variável valor com um número inteiro.
Utilize uma estrutura condicional (if/else) para verificar se o número é par ou ímpar.
Imprima a mensagem apropriada (ex: "O número 10 é Par." ou "O número 7 é Ímpar.").
*/
public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O número " + num + " é Par.");
        }
        else {
            System.out.println("O número " + num + " é Ímpar.");
        }

        sc.close();
    }
}
