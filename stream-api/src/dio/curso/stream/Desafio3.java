package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
	
	public static void main(String[] args) {
		
		// Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// allMatch verifica se todos os elementos da Stream atendem ao predicado especificado.
		System.out.println(numeros.stream().allMatch(n -> n > 0));
	}

}
