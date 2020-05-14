package pratica2_printnatelasuaconta;

public class PrintNaTelaSuaConta {

	int numero;
	String cliente;
	double saldo;
	
	public static void main(String[] args) {
		PrintNaTelaSuaConta conta = new PrintNaTelaSuaConta();
		conta.numero = 12345;
		conta.cliente = "Bibs";
		conta.saldo = 1000;
	
		System.out.println(conta.numero);
		System.out.println(conta.cliente);
		System.out.println(conta.saldo);
	}
	
}
