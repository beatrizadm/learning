package pratica5_mediacomrepeticao;

import java.util.Scanner;

public class MediaComRepeticao {
	public static void main(String[] args) {
		int numero, soma = 0, media, cont = 0;
		String resp; 
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite um numero: ");
			numero = teclado.nextInt();
			cont ++;
			soma += numero; // soma = soma + numero
			System.out.print("Deseja continuar? [S / N] ");
			resp = teclado.next();
		} while (resp.equals("S"));
		
		media = soma / cont;
		System.out.println("Voc� digitou " + cont + " numero(s)");
		System.out.println("A soma de todos eles �: " + soma);
		System.out.println("J� a m�dia �: " + media);
	}
}
