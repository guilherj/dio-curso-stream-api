package dio.curso.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Desafio17 {

	public static void main(String[] args) {

		// Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream().filter(n -> n > 1 && IntStream.range(2, (int) Math.sqrt(n) + 1).noneMatch(i -> n % i == 0))
		.forEach(System.out::println);

	}

}
