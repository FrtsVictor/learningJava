package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	
//	n�o precisei chamar o par�metro com os atributos pois o mesmo ja es� no Produto!
//	a vantagem de chamar um metodo () de algo que et� nele pr�prio � justamente nao precisar chamar 
//	um atributo pois o no caso o m�todo Produto o possui.
	
	Produto (){}
	
	Produto (String nomeP, double precoP){
		nome = nomeP;
		preco = precoP;
	}
	
	
	double precoComDesconto () {
		return  preco * (1 - desconto);
	}
	

	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));		
				
	}
	
//	Dois metodos com o mesmo nome, porem os parametros sao diferentes  	

}


//METODO () () () ()
//atributo . . . 