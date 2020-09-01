package exercicios.fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a =97;
		int b = 'a';
		
		//Relacionais \/
		
		System.out.println(a==b);
		System.out.println('\u0061');
		System.out.println(3>4);
		System.out.println(3<4);
		System.out.println(3>=4);
		System.out.println(3<=4);
		System.out.println((30!=4) + "\n\n");
		
		
		//Lógicos  \/ 
		
		double nota = 7.8;
		boolean bomComp = true;
		boolean passouPorMedia = nota>= 7;
		boolean desconto = passouPorMedia && bomComp;
		
		System.out.println("Tem disconto? " + desconto );
		
	}
	
}
