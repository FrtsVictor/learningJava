package exercicios.fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		
		
		Byte b = 10;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		System.out.println(b.getClass());
		System.out.println(s.toString() + "STRING ".toLowerCase()); // Short para String
		System.out.println(i*5);
		System.out.println(l/l);
		
		
		Float f = 256.2F;
		System.out.println(f);
		
		Double d = 12332.56;
		System.out.println(d);
		
		Boolean bo = true;
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //booleano para string
	
		Boolean boo = Boolean.parseBoolean("false"); //String para booleano
		System.out.println(boo);
		
		Character c = '#';
		System.out.println(c.getClass());
		
	}
}
