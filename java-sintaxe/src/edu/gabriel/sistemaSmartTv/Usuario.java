package edu.gabriel.sistemaSmartTv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(30);
    }
}
