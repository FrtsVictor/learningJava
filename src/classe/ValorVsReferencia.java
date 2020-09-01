package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        
      //   double a = 2;
      //  double b = a;   //atribuição por valor (Tipo primitivo)
    
    //    a++;
    //    b--;

    }

    Data d1 = new Data(1, 6, 2020);
    Data d2 = d1; //atribuição por referencia;

    //Passado como referenia, etnao altera o valor do objeto
    static void voltaDataParaValorInicial(Data d){
        d.dia = 1; //atribui dia 1 a data
        d.mes = 1;
        d.ano= 1970;
    }

    static void alterarPrimitivo(int c){
        c++;    //nao altera o valor para fora 
}
    
}