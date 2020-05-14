package teorica4_estruturascondicionais;

import java.util.Scanner;

public class EstruturasCondicionais {
	public static void main(String[] args){		
		System.out.println("CONDICIONAL SIMPLES");
		Scanner teclado = new Scanner(System.in);
		System.out.print("digite sua primeira nota: ");
		float n1 = teclado.nextFloat();
		System.out.print("digite sua segunda nota: ");
		float n2 = teclado.nextFloat();
		float m = (n1 + n2) / 2;
		System.out.println("sua media foi " + m);
		if (m >= 9) {
			System.out.println("parabens :)");
		}
		
		
		System.out.println();
		System.out.println("CONDICIONAL COMPOSTA");
		System.out.print("digite seu ano de nascimento: ");
		int n3 = teclado.nextInt();
		int dif = 2020 - n3;
		if (dif >= 18) {
			System.out.println("voce é maior de idade :O");
		} else {
			System.out.println("voce é menor de idade :/");
		}
		
		
		System.out.println();
		System.out.println("CONDICIONAL COMPOSTA ENCADEADA");
		System.out.print("digite seu ano de nascimento: ");
		int n4 = teclado.nextInt();
		int idade = 2020 - n4;
		if (idade < 16) {
			System.out.println("voce nao vota :/");
		} else {
			if (idade >= 16 && idade < 18 || idade > 70) {
				System.out.println("seu voto é opcional :D");
			} else {
				System.out.println("seu voto é obrigatorio :)");
			}
		}

		
/*
 
 sobre o switch:
   - nao funciona por intervalos tem que testar numero por numero
   - nao funciona pra numeros reais, so inteiros
 
 */
		
		System.out.println();
		System.out.println("CONDICIONAL DE MULTIPLA ESCOLHA"); //quando se quer testar uma unica expresao e varios valores dela
		System.out.print("digite a quatidade de pernas do ser: ");
		int pernas = teclado.nextInt();
		String tipo;
		switch(pernas) {
			case 1:
				tipo = "saci";
				break;
			case 2:
				tipo = "bipede";
				break;
			case 4:
				tipo = "quadrupede";
				break;
			case 8:
				tipo = "aranha";
				break;
			default:
				tipo = "ET";
				break; // -> desnecessario/opcional
		}
		System.out.println("é um(a) " + tipo);
	}
}