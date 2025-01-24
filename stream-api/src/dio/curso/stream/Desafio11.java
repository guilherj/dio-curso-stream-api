package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {

	public static void main(String[] args) {

		// Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		/*
		 * mapToInt: Aplica uma transformação na stream para calcular o quadrado de cada número e depois convertê-lo no tipo primitivo int
		 * sum: Soma todos os elementos do tipo int que mapToInt transformou.
		 */
		System.out.println(numeros.stream().mapToInt(n -> n * n).sum());
		
		
	
	}

}
