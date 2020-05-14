/* SIMPLES
 * 			int idade = 3;
 * 			float sal = 1825.54f;
 * 			char letra = 'G';
 * 			boolean casado = false
 * 
 * TYPECAST
 * 			int idade = (int) 3;
 * 			float sal = (float) 1825.54;
 * 			char letra = (char) 'G';
 * 			boolean casado = (boolean) false;
 * 
 * WRAPPER CLASS
 * 			Integer idade = new Integer(3);
 * 			Float sal = new Float(sal);
 * 			Character letra = new Character('G');
 * 			Boolean casado = new Boolean(False);
 * 
 */

package teorica1_tiposprimitivos;

import java.util.Scanner; // linha pra receber entrada

public class TiposPrimitivos {
	public static void main(String[] args) {
		// SAIDA DE DADOS
		
		float nota = 9.5f;
		String nome = "Bibs";
		
		System.out.println("sua nota é: " + nota);
		System.out.printf("sua nota é: %.2f \n", nota);
		System.out.printf("a nota de %s é %.1f \n", nome, nota);
		System.out.format("sua nota é %.1f \n", nota);
		System.out.println(); 
		
		
		// ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("digite o nome do cliente: ");
		String cliente = teclado.nextLine();
		
		System.out.print("digite o valor do seu respectivo saldo: ");
		float saldo = teclado.nextFloat();
		
		System.out.printf("o saldo de %s é %.2f \n", cliente, saldo);
		System.out.println();
		
		
		// incompatibilidade entre numeros e strings
		// nao da pra fazer a transfomacao pelo metodo simples nem pelo typecast, so pelo wrapper class
		
		int idade = 30;
		String valor = Integer.toString(idade);
		System.out.println(valor);
		
		String value = "30";
		int age = Integer.parseInt(value);
		System.out.println(age);
		
		String altura = "1.62";
		float height = Float.parseFloat(altura);
		System.out.printf("%.3f \n", height);
	}
}
