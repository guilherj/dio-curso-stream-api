package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio09 {

	public static void main(String[] args) {
		// Com a Stream API, verifique se todos os números da lista são distintos (não
		// se repetem) e exiba o resultado no console.

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		/*
		 * Para verificar se todos os números de uma lista são distintos usando a Stream
		 * API, eu compar o tamanho da lista original com o tamanho da lista
		 * após remover os duplicados (usando distinct). Se forem diferentes, significa
		 * que há números repetidos.
		 * 
		 */

		System.out.println(numeros.stream().distinct().count() == numeros.size() ? "Existem números repetidos."
				: "Não existem números repetidos.");

	}

}
