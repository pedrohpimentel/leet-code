package Exercícios;

import java.util.Locale;
import java.util.Scanner;

/*Crie um programa que receba a nota de 5 alunos e armazene-as em um Array de tipo double.
 Calcule e imprima a média das notas e a quantidade de alunos que ficaram acima da média.
*/
public class Exercício11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int NUMERO_DE_ALUNOS = 5;
        double[] notas = new double[NUMERO_DE_ALUNOS];
        double somaDasNotas = 0.0;

        System.out.println("Por favor, digite a nota de 5 alunos:");
        for (int i = 0; i < NUMERO_DE_ALUNOS; i++) {
            System.out.print("Nota do Aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            somaDasNotas += notas[i];
        }

        double media = somaDasNotas / NUMERO_DE_ALUNOS;

        int alunosAcimaDaMedia = 0;

        for (int i = 0; i < NUMERO_DE_ALUNOS; i++) {
            if (notas[i] > media) {
                alunosAcimaDaMedia++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.printf("Média da turma: %.2f\n", media);
        System.out.println("Número de alunos acima da média: " + alunosAcimaDaMedia);

        sc.close();
    }
}
