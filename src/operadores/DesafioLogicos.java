package exercicios.fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		//Trab ter�a (V ou F)
		//Trab quinta (V ou F)
		//Se trabalhou na quinta e ter� = 50polegadas no fds
		//Se apenas um 32polegadas
		//ou comprando 32 ou 50 rola sorvete
		//se n deu trabalho n rola sorvete
		
		boolean trab1 = true;
		boolean trab2 = true;
		
		boolean tv50 = trab1 && trab2;
		boolean tv32 = trab1 ^ trab2;
		boolean sorvete = tv32 ||tv50 ;
		boolean nSorvete = !sorvete;
		boolean nTrabalho = !trab1 && !trab2;
				
		System.out.println("Trabalhando Ter�a e Quinta a tv de 50 � = " + tv50);
		System.out.println("N�o trabalhando a TV � = " + nTrabalho);
		System.out.println("Trabalhando Segunda ou Ter�a a tv32  � = " + tv32);
		System.out.println("Indo comprar a TV o sorvete � = " + sorvete);
		System.out.println("N�o indo comprar a tv o sorvete � = " + nSorvete);
		
		
		boolean t1 = true;
		boolean t2 = false;
		
		boolean t50 = t1 && !t2;
		boolean t32 = t1 ^  t2;
		boolean sorv = t32 ||t50;
		boolean nSorv = !sorv;
		
		
		System.out.println("\n\nTrabalhando Ter�a e Quinta a tv de 50 � = " + t50);
		System.out.println("Trabalhando Segunda ou Ter�a a tv32  � = " + t32);
		System.out.println("Indo comprar a TV o sorvete � = " + sorv);
		System.out.println("N�o indo comprar a tv o sorvete � = " + nSorv);
		
		
		boolean tt1 = false;
		boolean tt2 = false;
		
		boolean ty50 = tt1 && tt2 == false;
		boolean ty32 = tt1 || tt2 == true;
		boolean sv = ty32 ==!false;
		boolean ntra = tt1 && tt2 == false;
		boolean nSv = ntra == true;
	
		System.out.println("\n\nTrabalhando Ter�a e Quinta a tv de 50 � = " + !ty50);
		System.out.println("Trabalhando Segunda ou Ter�a a tv32  � = " + !ty32);
		System.out.println("Indo comprar a TV o sorvete � = " + !sv);
		System.out.println("N�o indo comprar a tv o sorvete � = " + nSv);
		
		
		
		
	}

}
