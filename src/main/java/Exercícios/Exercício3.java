package Exercícios;

import java.util.Locale;
import java.util.Scanner;


/*
Lógica Condicional Aninhada e Repetição
Objetivo: Combinar estruturas de controle com maior complexidade.

Problema: Uma loja tem 10 produtos.
Crie um programa que use um laço de repetição (por exemplo, for) para processar cada um dos 10 produtos.
Para cada produto, o programa deve ler o valor do produto e aplicar um desconto seguindo estas regras:

Se o valor for menor ou igual a R$ 50,00, o desconto é de 5%.

Se o valor for maior que R$ 50,00 e menor ou igual a R$ 100,00, o desconto é de 10%.

Se o valor for maior que R$ 100,00, o desconto é de 15%.

O programa deve imprimir o valor original,
o valor do desconto e o valor final para cada um dos 10 produtos.*/
public class Exercício3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int NUMERO_DE_PRODUTOS = 10;

        System.out.println("--- Sistema de Cálculo de Descontos para " + NUMERO_DE_PRODUTOS + " Produtos ---");

        for (int i = 1; i <= NUMERO_DE_PRODUTOS; i++) {
            System.out.println("\n*** Processando Produto " + i + " ***");
            System.out.print("Digite o valor original do produto (Ex: 55.75): R$ ");

            double valorOriginal = sc.nextDouble();
            double percentualDesconto = 0.0;

            if (valorOriginal <= 50.00) {
                percentualDesconto = 0.05;

            } else if (valorOriginal <= 100.00) {
                percentualDesconto = 0.10;

            } else {
                percentualDesconto = 0.15;
            }

            double valorDesconto = valorOriginal * percentualDesconto;
            double valorFinal = valorOriginal - valorDesconto;

            System.out.printf("  Valor Original: R$ %.2f\n", valorOriginal);
            System.out.printf("  Percentual de Desconto Aplicado: %.0f%%\n", (percentualDesconto * 100));
            System.out.printf("  Valor do Desconto: R$ %.2f\n", valorDesconto);
            System.out.printf("  Valor Final a Pagar: R$ **%.2f**\n", valorFinal);
        }

        System.out.println("\n--- Fim do Processamento ---");

        sc.close();
    }
}
