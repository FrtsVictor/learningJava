package exercicios.fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {

		boolean cond1 = true;
		boolean cond2 = 3>7;

		System.out.println(cond1 && !cond2); // e
		System.out.println(cond1 ^ cond2); // ou exclusivo
		System.out.println(cond1 || cond2); //ou
		System.out.println(!!cond1); //negação 
		System.out.println(!cond2); //negação 
		
		System.out.println("Tabela Verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
	//	System.out.println(false&& true);
	//	System.out.println(false && false);
		
		System.out.println("\nTabela Verdade OU (OR)");
	//	System.out.println(true || true);
	//	System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade OU Exclusivo (XOR) ");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("\nTabela Verdade NOT (NÃO)");
		System.out.println(!true);
		System.out.println(!false);

		
	}

}
