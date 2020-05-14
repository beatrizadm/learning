package pratica6_diasdomes;

import java.util.Scanner;

public class DiasDoMes {
	public static void main(String[] args) {
		String mes[] = {"janeiro","fevereiro","março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o ano que deseja verificar: ");
		int ano = teclado.nextInt();
		
		/*
		
		vendo se é bissexto:            1 caso     2 caso     3 caso
		  - divisivel por 4              sim        sim    	    sim		    (ano % 4 == 0)
		  - divisivel por 100            sim        sim  		nao	        (ano % 100 == 0)
		  - divisivel por 400            sim        nao   		nao         (ano % 400 == 0)
									   bissexto    normal    bissexto
		 
		 */
		
		boolean bissexto;
		bissexto = false;
		if ((ano % 4 == 0) && (ano % 100 != 0)){  // true and true (terceiro caso)
			bissexto = true;
			System.out.println("caso 1");
		}
		if ((ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0)) { // true and true and true (primeiro caso)
			bissexto = true;
			System.out.println("caso 2");
		}
	    // o segundo caso nao precisa ser feito ja que a variavel bissexto tem por norma ser false 
		
		System.out.println();
		if (bissexto == true) {
			System.out.println("Este ano é bissexto!!!  :)");
		} else {
			System.out.println("Este ano nao é bissexto :/");
		}
		System.out.println("Para o ano " + ano +" a quantidade de dias dos seus respectivos meses são:");
		for (int i = 0; i < mes.length; i++) {
			if (bissexto == true) {
				dias[1] = 29;                // o indice de fevereiro é 1
			}
			System.out.println("O mes de "+ mes[i]+ " tem " + dias[i] + " dias.");
		}
	}
	
}
