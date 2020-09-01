package exercicios.fundamentos;

public class PirmitivoVsObjeto {
	public static void main(String[] args) {

		
			String b = new String("BEBEPLAN");
			b = b.toLowerCase();
			System.out.println(b);
			
			String s = "babaplan";
			s = s.toUpperCase();
			System.out.println(s);
	
			//Wrappers são a versão objeto dos tipos primitivos
			//libera todos atributos q podemos usar na classe como .toUpperCase();
			int a = 456;
			System.out.println(a);
	
	}

}
