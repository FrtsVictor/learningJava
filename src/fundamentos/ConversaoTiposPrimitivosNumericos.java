package exercicios.fundamentos;

//Por padrao os literais inteiros s�o INT e os literais com , s�o Double
//ent�o vale mais usar ambos por defini��o padr�o

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a + " Convers�o implicita, do menor pra maior, faz automatico");
	
		
//		float b = (TipoParaConvers�o) 1;
		float b = (float) 1.4154485454414;
		System.out.println(b + " Convers�o explicita (CAST)");
		
		
			int c = 4;
//error		byte d = c; // Java n�o armazena valores, armazena tipos, por isso n coube, seria como por int em byte
		byte de = (byte) c; // explicita(CAST)
		System.out.println(de);
		
		double e = 1.99999;
		int g = (int) e;
		System.out.println(g);
	}

}
