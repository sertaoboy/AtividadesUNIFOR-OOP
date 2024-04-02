package Geometria;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Quantas formas voce deseja criar?");
        int qtdFormas = leitura.nextInt();

        List<Figura> listaFormas = new ArrayList<>();

        for(int i = 0; i < qtdFormas; i++) {
            System.out.println("Qual figura deseja criar? (1 - Retangulo, 2 - Circulo)");
            int opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Insira a base e a altura do retangulo: ");
                    double base = leitura.nextDouble();
                    double altura = leitura.nextDouble();
                    listaFormas.add(new Retangulos(base,altura));
                    break;
                case 2:
                    System.out.println("Insira o raio do circulo: ");
                    double raio = leitura.nextDouble();
                    listaFormas.add(new Circulo(raio));
                    break;

            
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

        for (Figura figura : listaFormas) {
            System.out.println(figura);
            System.out.println("---------------------");
            figura.perimetro();
            figura.area();
            System.out.println("---------------------");
        }
    }
}
