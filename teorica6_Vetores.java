package teorica6_vetores;

import java.util.Arrays;

public class Vetores {
	public static void main(String[] args) {
		int n1[] = new int[4];
		n1[0] = 12;
		n1[1] = 34;
		n1[2] = 56;
		n1[3] = 78;
		System.out.println("Total de casas: " + n1.length); // unico atributo dos vetores
		for (int cont = 0; cont <= 3; cont++) { // ou for (int cont = 0; cont <= n1.length - 1; cont++) ou for (int cont = 0; cont < n1.length; cont++)
			System.out.println("na posicao "+ cont + " tem o numero: " + n1[cont]);
		}
		// tem que printar de um por um, se nao:
		System.out.println(n1);
		
		System.out.println();
		System.out.println("ORDENAÇÃO");
		double n2[] = {100000, 3.467, -56, 7};
		Arrays.sort(n2);
		for (double valor: n2) {
			System.out.print(valor + " ");
		}
		
		
		
		System.out.println("\n");
		System.out.println("BUSCA");
		int n3[] = {3, 7, 9, 2, 5, 1};
		for (int valor:n3) {
			System.out.print(valor + " ");
		}
		int p = Arrays.binarySearch(n3, 7);
		System.out.println("\n"+"O numero esta na posicao " + p);
		
		System.out.println();
		System.out.println("PREENCHIMENTO");
		int n4[] = new int[20];
		Arrays.fill(n4, 0);
		for (int valor : n4) {
			System.out.print(valor + " ");
		}
	}
}
