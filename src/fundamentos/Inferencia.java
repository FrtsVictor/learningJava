//var pega o valor que foi atribuido a ele e define o tipo,
//porém uma vez definito o tipo, n se pode mudar var a= 1  a tem q ser semrpre um numero

package exercicios.fundamentos;

public class Inferencia {
	
 public static void main(String[] args) {
	var a = "Hello";
	System.out.println(a);
	 
	a = "olá";
	System.out.println(a);
	
	var b = 5.5;
	System.out.println(b);

	b = 10;
	System.out.println(b);
 
	double c = 120.1; //Declarei e chamei variavel
	System.out.println(c); //imprimi
	
	double d; //Declarei variavel
	d = 12.5; //Inicializei variavel
	System.out.println(d); 
	
	var e = 123.123; //Declarar e inicializar é obrigatorio, para o java INFERIR o tipo de valor da variavel
	System.out.println(e);
	
 }
 
}
