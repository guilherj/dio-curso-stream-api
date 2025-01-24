package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio05 {
	
	public static void main(String[] args) {
		// Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.println(numeros.stream().filter(n -> n > 5).reduce(0, Integer::sum) / numeros.size());
	}

}
