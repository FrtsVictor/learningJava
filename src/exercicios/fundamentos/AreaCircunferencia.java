package exercicios.fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		/**Usando "final" define a variavel como constante, imutavel.
		   Sempre usar letras maiúsculas para definir Constantes
		*/		
		double raio = 3.4;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 5;
		area = PI * raio * raio;
		System.out.println("Area = " + area + " m2");
	}
}
