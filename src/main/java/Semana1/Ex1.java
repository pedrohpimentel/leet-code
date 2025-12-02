package Semana1;


import java.util.Locale;
import java.util.Scanner;

/*
 Algoritmo Sequencial e Condicional (Cálculo Simples) Problema:
 Crie um programa em Java que peça ao usuário para inserir a base e a altura de um retângulo.
 O programa deve calcular e imprimir a área do retângulo. Além disso, se a área for maior que $100$,
 imprima a mensagem "Retângulo Grande".
 */
public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da base e da altura de um retângulo!");
        System.out.print("Valor base: ");
        double valorBase = sc.nextInt();

        System.out.print("Valor altura: ");
        double valorAltura = sc.nextInt();

        double areaRetangulo = valorBase * valorAltura;

        System.out.println("O valor do retângulo é : " + areaRetangulo);
        if (areaRetangulo > 100){
            System.out.println("Retângulo grande.");
        }

        sc.close();
    }
}
