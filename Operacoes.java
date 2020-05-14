package pratica7_multiplasclasses;

public class Operacoes {
	public static String contador(int inicio, int fim) {
		String resultado = "";
		for (int c = inicio; c <= fim; c++) {
			resultado += c + " ";
		}
		return resultado;
	}
}
