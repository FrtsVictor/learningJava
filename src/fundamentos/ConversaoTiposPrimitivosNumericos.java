package exercicios.fundamentos;

//Por padrao os literais inteiros são INT e os literais com , são Double
//então vale mais usar ambos por definição padrão

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a + " Conversão implicita, do menor pra maior, faz automatico");
	
		
//		float b = (TipoParaConversão) 1;
		float b = (float) 1.4154485454414;
		System.out.println(b + " Conversão explicita (CAST)");
		
		
			int c = 4;
//error		byte d = c; // Java não armazena valores, armazena tipos, por isso n coube, seria como por int em byte
		byte de = (byte) c; // explicita(CAST)
		System.out.println(de);
		
		double e = 1.99999;
		int g = (int) e;
		System.out.println(g);
	}

}
