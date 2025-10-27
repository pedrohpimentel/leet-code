package Exercícios;

import java.util.HashMap;
import java.util.Map;


/*
Exercício 1: Two Sum (Duas Soma)
Problema: Dada um array de inteiros nums e um inteiro target,
retorne os índices dos dois números de modo que a soma deles seja igual a target.
Exemplo: nums = [2, 7, 11, 15], target = 9 -> Saída: [0, 1]
 */
class Ex1 {

    public int[] twoSum(int[] nums, int target) {
        // Inicializa um HashMap para armazenar (valor : índice)
        // Isso permite uma busca rápida (O(1)) do complemento.
        Map<Integer, Integer> numMap = new HashMap<>();

        //  Percorre o array 'nums' uma única vez (Single Pass)
        for (int i = 0; i < nums.length; i++) {
            int numeroAtual = nums[i];

            // Calcula qual número precisamos para atingir o target
            int complemento = target - numeroAtual;

            // Verifica se o 'complemento' já está no mapa
            if (numMap.containsKey(complemento)) {
                // Se o complemento existe, encontramos a solução.
                // O primeiro índice é o índice armazenado do complemento.
                // O segundo índice é o índice atual (i).
                return new int[] {numMap.get(complemento), i };
            }

            // Se o complemento não foi encontrado, adiciona o número atual ao mapa
            // para que ele possa ser o complemento de um número futuro.
            numMap.put(numeroAtual, i);
        }

        // Se o loop terminar sem encontrar uma solução (o que não deve acontecer
        // segundo as premissas do problema, mas é bom para um código robusto)
        throw new IllegalArgumentException("Nenhuma solução Two Sum encontrada.");
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Solution solver = new Solution();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;

//         int[] resultado = solver.twoSum(nums, target);

//         // Saída: [0, 1]
//         System.out.println("Índices encontrados: [" + resultado[0] + ", " + resultado[1] + "]");
//     }
// }