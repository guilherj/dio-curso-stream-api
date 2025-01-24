package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio08 {

	public static void main(String[] args) {
		/*
		 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
		 */

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		/*
		 * flatMapToInt: Junta todos os dígitos de todos os números da lista em uma única stream de inteiros
		 * chars: Converte a String em uma stream de caracteres
		 * map: Converte cada caractere de volta para número
		 * sum: Soma todos os dígitos que foram processados
		 */
		int soma = numeros.stream().flatMapToInt(
				n -> String.valueOf(n).chars().map(Character::getNumericValue)).sum();
		
		System.out.println(soma);

	}

}
