package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio01 {
	
	public static void main(String[] args) {
		// Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);		
		
		/* sorted: Ordena a lista em ordem natural, nesse caso, crescente.
		 * distinct: remove elementos duplicados
		 * forEach(System.out::println) : Executa uma ação para cada elemento da Stream. Nesse caso usei um Method Reference da classe System 
		 */ 
		numeros.stream().sorted().distinct().forEach(System.out::println); 	
	}

}
