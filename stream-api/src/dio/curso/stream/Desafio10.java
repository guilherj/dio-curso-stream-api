package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {

	public static void main(String[] args) {
		
		// Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream()
                .filter(n -> n % 2 != 0) // Verifica se o número é ímpar
                .filter(n -> n % 3 == 0 || n % 5 == 0)   // Verifica se é múltiplo de 3 ou de 5
                .toList() // Coleta os números que atendem às condições
                .forEach(System.out::println);; 
	}

}
