package classe;

public class DataTest {
	
	public static void main(String[] args) {
		
	Data d1 = new Data();
	d1.dia = 17;
	d1.mes = 03;
	d1.ano = 1994;
	
	
	Data d2 = new Data ();
	d2.dia = 22;
	d2.mes = 04;
	d2.ano = 1997;

	Data d3 = new Data();
	d3.imprimirDataFormatada();


	System.out.print(d1.obterDataFormatada()+ "\n");
	d2.imprimirDataFormatada();
	
	}

}
