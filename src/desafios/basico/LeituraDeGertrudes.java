/*
Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela,
de acordo com o número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. 
Como você está aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.

Entrada:
A entrada será o número de páginas de um determinado livro

Saída:
A saída deverá ser quanto tempo ela vai levar para ler esse livro
 */

package desafios.basico;

import java.util.Scanner;

public class LeituraDeGertrudes {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int paginas = leitor.nextInt();
		int paginasLidas = 3;

		int nDias = (paginas * 1) / paginasLidas;

		System.out.println(nDias + " dias");

		leitor.close();
	}
}
