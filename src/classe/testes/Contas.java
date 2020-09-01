package classe.testes;

public class Contas {
    
    double salario;
    String nome;
    
    public double reajuste(double reaj){
        return this.salario = salario + reaj;
    }

    public Contas(double salario, String nome){
        this.salario = salario;
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public static void main(String[] args) {
    
    Contas c1 = new Contas(100, "Victor");
    Contas c2 = new Contas(100, "Freitas");
    
    c1.reajuste(50);
    c2.reajuste(10);

    Total total = new Total();
    

    total.totalSalario(c1);
    total.totalSalario(c2);

    System.out.println(total.getTotalMax());


    }
    
}