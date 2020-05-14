/* 
 OPERADORES ARITMETICOS
  adicao +
  subtracao -
  multiplicacao *
  divisao /
  resto %
  
  
 OPERADORES UNARIOS
  incremento ++             a++  ->  a = a + 1
  decremento --             a--  ->  a = a - 1
  a posicao importa!!!
  pre ou pos
   
   
 OPERADORES DE ATRIBUICAO
  somar e atribuir          a += b  ->  a = a + b
  subtrair e atribuir       a -= b  ->  a = a - b
  multiplicar e atribuir    a *= b  ->  a = a * b
  
  
 CLASSE MATH
  Math.PI = pi
  Math.pow(5,2) = 25        -> exponenciacao, 5 elevado a 2
  Math.sqrt(25) = 5         -> raiz quadrada de 25
  Math.cbrt(27) = 3         -> raiz cubica de 27
  
 ARREDONDAMENTOS
  Math.abs(-10) = 10        -> valor absoluto
  Math.floor(3.9) = 3       -> arredoda pra baixo
  Math.ceil(4.2) = 5        -> arredonda pra cima
  Math.round(5.6) = 6       -> arredondamento aritmetico
  
 GERADOR DE NUMEROS
  Math.random()             -> vai gerar um numero entre 0.0 e 1.0, pra gerar numeros maiores use a matematica 
  
 */


package teorica2_operadoresaritmeticos_p1;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		float media = (n1 + n2) / 2;
		System.out.println("A media é igual a: " + media);
		System.out.println();
		
		
		System.out.println("OPERADORES ARITMETICOS");
		int n3 = 3;
		System.out.println("o numero é: " + n3);
		n3 ++;
		System.out.println("aumentou um: " + n3);
		n3 --;
		System.out.println("diminuiu um: " + n3);
		
		
		System.out.println();
		System.out.println("OPERADORES UNARIOS");
				
		int n4 = 4;
		int valor = 5 + ++n4;   
		System.out.println("resultado: " + valor);
		System.out.println("pre incremento: " + n4);
		
		int n5 = 5;
		int valor1 = 5 + n5++;   
		System.out.println("resultado: " + valor1);
		System.out.println("pos incremento: " + n5);
		
		
		System.out.println();
		System.out.println("OPERADORES DE ATRIBUICAO");
		int x = 1;
		x += 2;
		System.out.println(x);
		x -= 3;
		System.out.println(x);
		
		System.out.println();
		System.out.println("GERADOR DE NUMEROS");
		// quero gerar um numero inteiro entre 10 e 100
		
		double aleatorio = Math.random();
		int n = (int) (10 + aleatorio * (100-10));
		System.out.println(n);
		
		
	}
}
