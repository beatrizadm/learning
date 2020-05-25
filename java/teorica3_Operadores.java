/*
 
OPERADOR TERNARIO
  o objetivo da condicao é atribuir um valor ou outro a uma mesma variavel
 
  maior = n1>n2 ? x:y
  
  componentes:
  - expressao 
  - ?
  - primeiro valor(x): caso a expressao seja true    -> tambem aceita expressoes neste componente
  - segundo valor(y): caso a expressao seja false    -> tambem aceita expressoes neste componente
 
 
OPERADORES RELACIONAIS
  maior que             >
  menor que             <
  maior ou igual        >=
  menor ou igual        <=
  igual a               ==
  diferente de          !=
  

OPERADORES LOGICOS
  e      &&
  ou     ||
  xou    ^
  nao    !

EXPRESSOES LOGICAS COMPOSTAS
idade opcional para votar: 
(idade >= 16 && idade < 18) || (idade > 70)
 
 */


package teorica3_operadoresaritmeticos_p2;

public class Operadores {
	public static void main(String[] args) {
		
		System.out.println("OPERADORES TERNARIOS");
		int n1, n2, r;
		n1 = 8;
		n2 = 14;
		r = n1>n2 ? n1:n2;
		System.out.println(r);
		
		r = (n1>n2) ? n1+n2 : n1-n2;
		System.out.println(r);
		
		
		System.out.println();
		System.out.println("OPERADORES RELACIONAIS");
		String nome1 = "Bibs";
		String nome2 = new String("Bibs");
		String resultado;
		resultado = (nome1 == nome2) ? "igual" : "diferente";
		System.out.println(resultado);  // -> nao possuem a mesma estrutura, apenas o conteudo é igual
		
		resultado = (nome1.equals(nome2)) ? "igual" : "diferente";
		System.out.println(resultado);  // -> pra objetos, sempre tem que usar equals. 
		
		
		System.out.println();
		System.out.println("OPERADORES LOGICOS");
		int x, y, z;
		x = 1;
		y = 2;
		z = 3;
		boolean result;
		result = (x < y && z > x) ? true:false;     //true e true = true
		System.out.println(result);
		
		result = (x == y || z > y) ? true:false;    //false ou true = true
		System.out.println(result);
		
		result = (x != y ^ y == z) ? true:false ;   //true xou false = true
		System.out.println(result);
		
		result = !(y < z) ? true:false ;            //nao true = false
		System.out.println(result);
		
			
	}		
}
