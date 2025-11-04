package Exercícios;


/*Lógica Sequencial e Condicional
Objetivo: Praticar entrada/saída de dados e comandos condicionais.

Problema: Crie um programa em Java que leia a nota de um aluno (valor decimal) e
verifique se ele foi aprovado ou reprovado.
Considere que a média para aprovação é 7.0. Se a nota for maior ou igual a 7.0, imprima "Aluno Aprovado".
Caso contrário, imprima "Aluno Reprovado".*/

import java.util.Locale;
import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        double notaAluno = sc.nextDouble();

        if (notaAluno >= 7.0){
            System.out.println("Aluno Aprovado.");
        }

        else {
            System.out.println("Aluno Reprovado.");
        }

        sc.close();
    }
}
