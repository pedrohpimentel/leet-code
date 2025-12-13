package Semana1;

import java.util.Locale;
import java.util.Scanner;

/*
Contagem Progressiva
Crie um programa que use um loop for para imprimir todos os números inteiros de 1 a 10.*/
public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Números de 1 a até 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
