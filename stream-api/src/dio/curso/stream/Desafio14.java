package dio.curso.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Desafio14 {

	public static void main(String[] args) {

		// Com a Stream API, encontre o maior número primo da lista e exiba o resultado
		// no console.

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		numeros.stream().filter(n -> n > 1 && IntStream.range(2, (int) Math.sqrt(n) + 1).noneMatch(i -> n % i == 0))
				.max(Integer::compareTo).ifPresent(primo -> System.out.println("O maior número primo é: " + primo));

		/*
		 * n -> n > 1: Garante que estamos lidando apenas com números maiores que 1,
		 * pois números menores ou iguais a 1 não são primos. 
		 * 
		 * Math.sqrt(n): Calcula a raiz quadrada de n. Por que a raiz quadrada? Porque se um número é divisível
		 * por outro número, pelo menos um dos divisores deve ser menor ou igual à raiz
		 * quadrada dele. Isso faz com que a verificação seja mais eficiente.
		 * 
		 * IntStream.range(2, (int) Math.sqrt(n) + 1): Gera uma lista de números de 2
		 * até a raiz quadrada de n. Estamos verificando se algum desses números
		 * consegue dividir n sem deixar resto. Exemplo: Para o número 9, a raiz
		 * quadrada é 3, então o código verifica se o número 9 é divisível por 2 ou 3.
		 * Se ele for divisível por qualquer número dentro desse intervalo, ele não é
		 * primo. 
		 * 
		 * noneMatch(i -> n % i == 0): Verifica se nenhum dos números no
		 * intervalo pode dividir n sem deixar resto (ou seja, se o número n não é
		 * divisível por nenhum número além de 1 e ele mesmo). 
		 * 
		 * n % i == 0 verifica se a divisão de n por i deixa um resto 0, o que significa que n é divisível por i.
		 * 
		 * max(Integer::compareTo): Depois de filtrar os números primos, usamos o método
		 * max() para encontrar o maior número primo.
		 * 
		 * Integer::compareTo compara os números para encontrar o maior. 
		 * 
		 * ifPresent(): Como a operação de max() pode não encontrar nenhum número primo, usamos o
		 * ifPresent() para garantir que, caso o número primo seja encontrado, ele será
		 * impresso no console. 
		 * 
		 */

	}

}
