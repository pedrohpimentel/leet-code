package Exercícios;


import java.util.Locale;
import java.util.Scanner;

/*Análise de Temperaturas

Crie um programa que:

Declare um vetor (Array) de tamanho 7 para armazenar as temperaturas médias registradas ao longo de uma semana.

Permita que o usuário insira as 7 temperaturas (elas podem ser números decimais, ou seja, double).

Calcule a média geral dessas 7 temperaturas.

Conte e imprima quantos dias tiveram a temperatura acima da média geral.

Requisito de Lógica:

Você precisará de dois laços de repetição (dois fors): um para preencher o Array e somar as temperaturas,
e outro para comparar cada temperatura individualmente com a média calculada.

Você usará a estrutura condicional (if) dentro do segundo laço para fazer a contagem.*/
public class Exercício5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] temperatura = new double[7];
        double soma = 0;

        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("Digite a " + (i +1) + "º temperatura: ");
            temperatura[i] = sc.nextDouble();
        }

        for (double temperaturas : temperatura){
            soma += temperaturas;
        }

        double media = soma / temperatura.length;

        sc.close();
    }
}
