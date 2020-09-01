package oo_composicao;

public class Carro {
    
    Motor motor = new Motor(); //deixando estatico vira um atributo de classe, deixado new, vira atributo de instancia

    void acelerar(){
        if(motor.fatorInjecao < 2.5){
            motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if(motor.fatorInjecao > 0.5){
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar (){
        motor.ligado = false;
    }

    boolean estaligado(){
        return motor.ligado;
    }

}