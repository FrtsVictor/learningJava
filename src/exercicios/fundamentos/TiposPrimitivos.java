package exercicios.fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipos numéricos inteiros
		
		byte anosDeCasa = 25;
		short numeroDeVoos = 560;
		int id = 56320;
		long pontosAcumulados = 3_134_545_220L;
		
		// Tipos numéricos reais 
		float salario = 11_445.44F; //usa-se o F para indicar q é float, ou por padrão assume double
		double vendasAcumuladas = 2_299_103_01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere aceita somente um character 
		char status = 'A'; //ativo 
		
		
		System.out.println("Dias trabalhados = " + anosDeCasa * 365);
		System.out.println("Numero de Voos = " + numeroDeVoos/2);
		System.out.println("Pontos acumulados = " + pontosAcumulados / vendasAcumuladas);
		System.out.println("Funcionario de id:" + id + " Recebe= " + salario + "R$");
		System.out.println("Está de Férias? " + estaDeFerias);
		System.out.println("Funcionario está : "+ status);
	}
	
}
