package Geometria;

public class Retangulos extends Quadrilateros {
    public Retangulos(double tamBase, double tamAltura) {
        super(tamAltura,tamBase);
    }

    @Override
    public void perimetro(){
        double valorPerimetro = 2*(lado1+lado2);
        System.out.println("O perimetro do retangulo e igual a: "+valorPerimetro);
    }
    @Override
    public void area(){
        double valorArea = lado1*lado2;
        System.out.println("O valor da area do retangulo e igual a: "+valorArea);
    }

    @Override
    public String toString() {
        return "Retangulo com base " +lado1+ " e altura "+lado2;
    }
}
