package classe.desafio;

public class Pessoa {
    
    private double peso;
    private String nome;
    private int idade;

    
    
    

    public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public void comer(Comida comida) {
        if(comida !=null )
        this.peso += comida.getPeso();
    }

    public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String apresentar(Pessoa p){
        return "Olaaaa " + p.getNome() + " voce tem " + p.getPeso() + " Kgs";
    }

    String apresent(){
        return "Olaaaa " + this.getNome() + " voce tem " + this.getPeso() + " Kgs";
    }


    public Pessoa(double peso, String nome) {
        this.peso = peso;
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}