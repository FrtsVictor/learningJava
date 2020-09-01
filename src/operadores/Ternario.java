package exercicios.fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 6.6;
	//	String recuperacao = media >=5 ? "em recuperacao" : "reprovado" ;
	//	String resultado = media>= 7.0? "Aprovado" : recuperacao;
		
		
		String resultado = media>= 7.0? "Aprovado" : media >=5 ? "em recuperacao" : "reprovado" ;

		
		System.out.println("O aluno está : " + resultado);
	}
	
}
