package exercicios.fundamentos;

public class TipoString {
	public static void main(String[] args) {

		String s = "Bora trilhar?";
		System.out.println(s.concat(" Vamoo!!!"));
		System.out.println(s.startsWith("Bora"));
		System.out.println(s.toLowerCase());
		
		String a = "Não vamos trilhar";
		System.out.println(a);
		System.out.println(a.contains("mos"));
		System.out.println(a.equalsIgnoreCase("não VAmos trilhar"));
		System.out.println(a.length());
		System.out.println(a.indexOf(a));
		
		var nome = "Victor";
		var sobrenome = "Freitas";
		var idade = 26;
		var salario = 3200.50;

		
		String ab = "\nA senhora "+ nome + " " + sobrenome + " de " + idade + " anos de idade, recebe R$" + salario;
		 
		
		System.out.println("O senhor "+ nome + " " + sobrenome + " de " + idade + " anos de idade, recebe R$" + salario );
		
		System.out.printf("O senhor %s %s de %d anos de idade, recebe R$%.2f"
				, nome, sobrenome, idade, salario);
		
		System.out.println(ab);
		
	}
}


//	%s – formats strings
//	%d – formats decimal integers
//	%f – formats the floating-point numbers
//	%t– formats date/time values