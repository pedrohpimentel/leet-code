package Semana1;

import java.util.Locale;
import java.util.Scanner;

/*Soma Cumulativa
Crie um programa que use um loop while para calcular
a soma de todos os números inteiros de 1 a 100.(Ou seja: 1 + 2 + 3 + ... + 100).*/
public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Soma de todos o números até 100: ");

        int soma = 0;
        int contador = 1;

        while (contador <= 100){
            soma += contador;
            contador++;
        }

        System.out.println(soma);

        sc.close();
    }
}
