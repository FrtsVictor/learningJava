package classe;

public class ValorNulo {
    
    public static void main(String[] args) {
        
        String s1 = "";

        System.out.println(s1.concat("!!!!!"));


        //da erro pois a variavel n foi inicializada
        // String s2; 
        // System.out.println(s2.concat("!!!!!"));


        //Da erro pois o objeto está null, n tem como alterar o valor. pointer exeption
        //Nao posso acessar nem atributo nem metodo de algo nulo
        //Null nao aponta para endereço de memoria entao n podemos alterar

        // Data d1 = null;
        // d1.mes = 3;

        Data d1 = Math.random() > 0.5 ? new Data() : null;

        if(d1 != null){
            d1.mes = 3;
            System.out.println(d1.mes);
        }

        String s2 = Math.random()> 0.5? "OPaa":null;
       
        if(s2 != null){
            System.out.println(s2.concat("???"));
        }


    }

}