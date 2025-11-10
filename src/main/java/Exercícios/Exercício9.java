package Exercícios;

import java.util.Locale;
import java.util.Scanner;


/*
Implemente um método (função) chamado calcularFatorial(int n) que receba um número inteiro n
e retorne seu fatorial ($n!$). Exemplo: $5! = 5 \times 4 \times 3 \times 2 \times 1 = 120$.*/

public class Exercício9 {

    public static long calcularFatorial (int n){

        if (n == 0 || n == 1){
            return 1;
        }

        long resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para calcular o fatorial : ");

        if (sc.hasNextInt()){
            int numero = sc.nextInt();

            if (numero < 0){
                System.out.println("Não é possível calcular o fatorial de números negativos.");
            } else {
                long fatorial = calcularFatorial(numero);
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
        sc.close();
    }
}
