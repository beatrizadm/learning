package pratica4_geniodalampada;

import java.util.Scanner;

public class GenioDaLampada {
	public static void main(String[] args) {
		System.out.println("GENIO DA LAMPADA");
		System.out.println("vou adivinhar o numero que voce digitar, de um a dez");
			
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("digite o numero que sera adivinhado: ");
		String numero = teclado.nextLine();
		float num = Float.parseFloat(numero);        //digitado
	
		double n = 1 + Math.random() * (11-1);
		float valor = (int) n;                      //adivinhado
	
		String resposta;
		resposta =  (num == valor) ? "ACERTEI!!!":"ERREI :(";
		System.out.printf(resposta + " o numero digitado foi %.0f e o numero adivinhado foi %.0f \n",num,valor);

	}
}
