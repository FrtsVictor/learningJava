package exercicios.fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhor");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		
		String x = "leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
			.replace ("x", "Gui")
			.toUpperCase()
			.concat("!!");
		System.out.println(y);
		
		// Tipos primitivos n�o possuem operador
		int a = 3;
		System.out.println(a);
		
	}
	
}
