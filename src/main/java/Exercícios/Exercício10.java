package Exercícios;

import java.util.Locale;
import java.util.Scanner;


/*
Crie um vetor (Array) de 10 números inteiros fixos (ou lidos do usuário).
Peça ao usuário que digite um número a ser buscado.
O programa deve indicar se o número foi encontrado no vetor e em qual posição (índice) ele se encontra.*/
public class Exercício10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       int[] num = new int[]{15,91,18,2,22,56,78,69,31,44};

        System.out.print("Digite um número a ser buscado: ");
       int numBuscado = sc.nextInt();

       boolean encontrado = false;
       int indiceEncontrado = -1;

        for (int i = 0; i < num.length; i++) {
            if (numBuscado ==  num[i]){
                encontrado = true;
                indiceEncontrado = i;
                break;
            }
        }

        if (encontrado){
            System.out.println("O número " + numBuscado + " foi encontrado no vetor.");
            System.out.println("Está na posição (índice) : " + indiceEncontrado);
        }
        else {
            System.out.println("O número " + numBuscado + " digitado não existe no vetor.");
        }

        sc.close();
    }
}
