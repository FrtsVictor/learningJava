package classe.testes;

public class Total {
    private double totalMax;


    public double totalSalario(Contas ctotal){
        return this.totalMax += ctotal.getSalario();
    }

    public double getTotalMax() {
        return totalMax;
    }



}