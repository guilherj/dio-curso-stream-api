package dio.curso.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
	
	public static void main(String[] args) {
		// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		/*
		 * distinct: Remove números duplicados
		 * sorted((a, b) -> b - a): Ordena em ordem decrescente
		 * skip(1): Ignora o primeiro número da lista, que nesse caso é o maior
		 * findFirst(): Encontra o primeiro número restante, nesse caso o segundo maior da lista
		 * get(): Pega o valor do Optional que será retornado.
		 */
        System.out.println(numeros.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().get());
	}

}
