package exercicios.fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {

		Integer num1 = 100000;
		System.out.println(num1.toString().length());
		
		Double num2 = (double) 20505;
		System.out.println(num2);
		System.out.println(num2.toString().length());
		
		int num3 = 10000;
		System.out.println(Integer.toString(num3).length());
		
		double num4 = 12345;
		System.out.println(Double.toString(num4).length());
		
		System.out.println(("" + num2).length());
		System.out.println(("" + num1).length());
	
	}

}
