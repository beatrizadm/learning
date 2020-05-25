package teorica7_metodos;

public class Metodos {
	
	static void soma1(int a, int b) {   // metodo sem retorno
		int s = a + b;
		System.out.println("A soma 1 é " + s);
	}
	
	static int soma2(int a, int b) {    // funcao: metodo com retorno
		int s = a + b;
		return s;
	}
	
	public static void main(String[] args) {
		 soma1(5,2);
		 int sm = soma2(7,3);
		 System.out.println("A soma 2 é " + sm);
	}
}
