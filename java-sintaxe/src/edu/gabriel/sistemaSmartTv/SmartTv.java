package edu.gabriel.sistemaSmartTv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int canal){
        this.canal = canal;
        System.out.println("Canal mudado para: " + this.canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual: " + this.canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: " + this.canal);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }
}
