package exercicios.fundamentos.operadores;

public class Unarios {
public static void main(String[] args) {
	
	int a = 1;
	int b = 2;
	
	a++; // a = a + 1  Pela ordem de Precedencia, a soma vem DEPOIS do ==
	a--; // a = a - 1
	
	++b; // b = b + 1  Pela ordem de Precedencia a soma vem ANTES do ==
	--b; // b = b - 1
	
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("Mini desafio....");
	System.out.println((++a == b--) + "  Primeiro (a=a+1)  2 == 2--; Pela Ordem de Precedencia, --ta depois de B, primeiro compara depois decrementa");  
	System.out.println("Valor somado antes da comparação  a = " + a);
	System.out.println("Valor decrementado após comparação  b = " + b);  
	
	
	System.out.println(++b == a++);
	

	System.out.println(--a == b);
	
}
}
