package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import classe.desafio.Pessoa;

public class Lanbdas {
	
	public static void main(String[] args) {
		
		
		Runnable r = new Runnable() {
		     public void run() {
		          System.out.println("Thread com classer interna!");
		     }
		};
		new Thread(r).start();
		
	
		Runnable a = () -> System.out.println("Thread com função lambda!");
		new Thread(r).start();
	
		new Thread(
			    () -> System.out.println("hello world")
			).start();
	
	
	
		System.out.println("Imprime todos os elementos da lista!");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for(Integer n: list) {
		    System.out.println(n);
		}
	
	
		
		System.out.println("Imprime todos os elementos da lista!");
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		lista.forEach(n -> System.out.println(n));
	
	
		System.out.println("Imprime todos os elementos pares da lista!");
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list3.forEach(n -> {
		       if (n % 2 == 0) {
		             System.out.println(n);
		       }
		});
	
	
	
		System.out.println("Imprime o quadrado de todos os elementos da lista!");
		List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list4.forEach(n -> System.out.println(n * n));
	
	
		List<Pessoa> list2Pessoas = Arrays.asList(new Pessoa("Eduardo", 29),
				new Pessoa("Luiz", 32), new Pessoa("Bruna", 26));
		
				   System.out.println("Ordenando pessoas pelo nome:");		   
				   Collections.sort(list2Pessoas, (Pessoa pessoa1, Pessoa pessoa2)
				   -> pessoa1.getNome().compareTo(pessoa2.getNome()));
				   list2Pessoas.forEach(p -> System.out.println(p.getNome()));
				   
				   System.out.println("Ordenando pessoas pela idade:");
//				   Collections.sort(list2Pessoas, (Pessoa pessoa1, Pessoa pessoa2)
//				   -> pessoa1.getIdade().compareTo(pessoa2.getIdade()));
//				   list2Pessoas.forEach(p -> System.out.println(p.getNome()));
//	
	
				   System.out.println("Pessoas com mais de 30 anos:");
				   List<Pessoa> maioresTrinta = list2Pessoas.stream().filter(p
				   -> p.getIdade() > 30).collect(Collectors.toList());
				   maioresTrinta.forEach(p -> System.out.println(p.getNome()));

				   System.out.println("Pessoas que o nome iniciam com E:");
				   List<Pessoa> nomesIniciadosE = list2Pessoas.stream().filter(p
				   -> p.getNome().startsWith("E")).collect(Collectors.toList());
				   nomesIniciadosE.forEach(p -> System.out.println(p.getNome()));
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
}
