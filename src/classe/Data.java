package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada(){
		//return  (dia + "/" + mes + "/" + ano );
		return  String.format("%d/%d/%d", dia, mes, ano); //USAR //retornar valor em string imprime em td
		
	}
	
	void imprimirDataFormatada(){
		System.out.println(obterDataFormatada());// <-- nao funciona desktop, web, mobile, s� funciona aplica��o no terminal syso
		
	
				
	}

	public Data(){
		// dia=1;
		// mes=1;
		// ano=1970;
		this(1,1,1970); //chamando o construtor de baixo
	}

	public Data(int dia, int mes, int ano) {
		//this(); //faz loop de constutores
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	
}
