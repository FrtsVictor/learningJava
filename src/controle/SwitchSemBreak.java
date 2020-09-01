package controle;


public class SwitchSemBreak {

	public static void main(String[] args) {

		// if bool
		// while bool
		// for bool
		// switch recebe direto o valor, se essa de verdadeiro ou falso
		
		// O Switch sem break, pega do valor q deu match pra baixo
		//por ex laranja q pega a amarela e a vermelha
		
		String faixa = "amarela";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
		System.out.println("Não sei nada");
		}
		
		System.out.println("Fim");
	
	
		int id = 3 ;
		
		switch (id) {
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("sabe andar");
		case 1:
			System.out.println("Sabe chorar");
		}
		
	
	
	
	}
	
	
}
