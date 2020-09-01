package classe.desafio;

public class Jantar {
  
    public static void main(String[] args) {

        Comida c1 = new Comida(0.200, "Arroz");
        Comida c2 = new Comida(0.500, "Fejao");

        Pessoa p1 = new Pessoa(1.00, "Victor");

        p1.comer(c1);
        p1.comer(c2);
        System.out.println(p1.getPeso());

        System.out.println(p1.apresent()); 

    }

}