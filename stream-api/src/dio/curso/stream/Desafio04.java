package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio04 {
	
	public static void main(String[] args) {
		// Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console
		
		// Plus: ordenei em ordem crescente e removi os números duplicados.
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream().filter(n -> n % 2 == 0).sorted().distinct().forEach(System.out::println);
	}

}
