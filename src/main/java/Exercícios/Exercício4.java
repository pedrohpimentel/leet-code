package Exercícios;

import java.util.Locale;
import java.util.Scanner;


/*Comparador Simples

Crie um programa em Java que peça ao usuário para digitar dois números inteiros.
O algoritmo deve comparar os dois números e imprimir na tela qual deles é o maior.
Se os números forem iguais, deve imprimir uma mensagem informando isso.

Requisito de Lógica: Uso de estrutura condicional (if, else if, else).*/
public class Exercício4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros.");
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("Número 1 maior que o número 2.");
        }
        else if (num1 == num2) {
            System.out.println("Os dois números são iguais.");
        }
        else {
            System.out.println("Número 2 é maior que o número 1.");
        }

        sc.close();
    }
}
