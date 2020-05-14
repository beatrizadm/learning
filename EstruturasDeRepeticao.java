package teorica5_estruturasderepeticao;

import java.util.Scanner;

public class EstruturasDeRepeticao {
	public static void main(String[] args) {
		System.out.println("REPETIÇÃO COM TESTE NO INICIO");
		int contador = 0;
		while (contador < 5) {
			System.out.println("esse loop rodou " + contador + " vez(es)");
			contador ++;
		}

		
		System.out.println();
		System.out.println("MODIFICADORES DO FLUXO DO LAÇO");

		// se o laço passar por um continue, ele ignora o comando de baixo e retorna pro loop (JOGA PRA CIMA DO LAÇO)
		// o break para todo o laço (JOGA PRA BAIXO DO LAÇO)
		
		int cont = 0;
		while (cont < 10) {
			cont ++;
			if (cont == 2 || cont == 5 || cont == 9) {
				continue;
			}
			if (cont == 7) {
				break;
			}
			System.out.println("esse é o loop " + cont);
		}

		System.out.println();
		System.out.println("REPETICAO COM TESTE NO FINAL");
		
		cont = 0; // como ja tinha dito que cont era um inteiro, so precisou atualizar seu valor
		do {
			System.out.println("loop numero " + cont);
			cont++;
		} while (cont < 5);

		 
		System.out.println();
		System.out.println("REPETICAO COM VARIAVEL DE CONTROLE");
		// ja faz o loop e o incremento/decremento automaticamente
		// a variavel de controle nao pode ser usada fora do loop
		
		for (int contar = 0; contar <= 5; contar++) {
			System.out.println("loop " + contar);
		}
		
		/*     mesmo codigo, só que usando while:
		 
		int contar = 0;
		while (contar <= 5) {
		 	System.out.println("loop" + contar);
		 	contar ++;
		}
		
		 */
		System.out.println();
		System.out.println("LOOP PARA CADA ELEMENTO"); // usa a estrutura de vetores (estudada no arquivo: "t6_vetores")
		int num[] = {1,2,3,4,5};
		for (int valor: num) {
			System.out.println(valor);
		}
		
		System.out.println();
		System.out.println("------------ pulando intervalos -----------");
		
		System.out.println("==== regresivo ====");
		
		for (int conte = 15; conte >= 0; conte -= 2) {
			System.out.println(conte);
		}
		
		System.out.println();
		System.out.println("==== progressivo ====");
		
		for (int pulo = 0; pulo <= 20; pulo += 5) {
			System.out.println(pulo);
		}
		
		System.out.println();
		System.out.println("LAÇOS ANINHADOS");
		for (int j = 0; j <= 2; j++) {
			for (int i = 0; i <= 1; i++) {
				System.out.println("primeiro laço: " + j + " | segundo laço:" + i);
			}
		}
		
		
	}
}
