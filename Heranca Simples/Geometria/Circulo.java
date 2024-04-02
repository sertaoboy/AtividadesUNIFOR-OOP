package Geometria;

public class Circulo implements Figura {
    public double tamRaio;
    public void setTamRaio(double tamRaio){
        this.tamRaio=tamRaio;
    }
    public double getTamRaio(){
        return tamRaio;
    }

    public Circulo(double tamRaio){
        this.tamRaio=tamRaio;
    }

    @Override
    public void area(){
        double pi = 3.14;
        double valorArea = pi * (tamRaio * tamRaio);
        System.out.println("O valor da area do circulo e: "+valorArea);
    }
    @Override
    public void perimetro(){
        double pi = 3.14;
        double valorPerimetro = 2 *pi*tamRaio;
        System.out.println("O perimetro do circulo e: "+valorPerimetro);
    }

    @Override
    public String toString() {
        return "Circulo com raio: " + getTamRaio();
    }



    
}
