package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
	
	public static void main(String[] args) {
		// Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);		
		
		/*
		 * filter: Faz um filtro pegando apenas os números pares.
		 * reduce: Soma todos os números da Stream e vai colocando o valor na variável auxiliar que começou com valor 0, 
		 * e retorna o objeto do mesmo tipo.
		 * 
		 */
		System.out.println(numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum));
	}

}
