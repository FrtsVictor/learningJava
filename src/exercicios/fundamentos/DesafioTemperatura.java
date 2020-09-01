package exercicios.fundamentos;

public class DesafioTemperatura {
	public static void main(String[] args) {
		final double FATOR = 5.0/9.0;
		final double DIF = 32.0;
		double f = 64.0;
		double c = (f -DIF )* FATOR ;
		
		System.out.println(f + " ºF equivalem à "+ c+ " ºC");

		f = 32;
		c = (f -DIF)* FATOR;
		System.out.println(f + " ºF equivalem à "+ c+ " ºC");
		
}
}