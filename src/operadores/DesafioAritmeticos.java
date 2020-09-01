package exercicios.fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double a = Math.pow(6*(3+2), 2);
		double a2 = a/6;
		System.out.println(a2);
		
		double b = Math.pow((1-5)*(2-7)/2, 2);
		System.out.println(b);
		
		double r = Math.pow(a2 - b, 3);
		double r3 = Math.pow(10, 3);
		double r4 = r/r3; 
		
		
		System.out.println(r4);
	}
}
