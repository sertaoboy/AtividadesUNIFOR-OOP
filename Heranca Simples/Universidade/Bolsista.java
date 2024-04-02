package Universidade;

import java.util.Scanner;

public class Bolsista extends Estudante{
    private double valorBolsa;

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa=valorBolsa;
    }
    public double getValorBolsa(){
        return valorBolsa;
    }

    @Override
    public void calculaCopias() {
        double valorCopia = 0.07;
        do {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Ola bolsista! Quantas copias deseja comprar? Digite 0 para encerrar");
            int qtdCopias = leitura.nextInt();
            double divida = (valorCopia*qtdCopias);
            System.out.println("Valor total das copias: R$"+divida);
            if(qtdCopias == 0) {
                break;
            }
        }while(true);
    }

    public void qtdCopiasPorBolsa(){
        double valorCopia = 0.07;
        int copiasPorBolsa = (int) (valorBolsa/valorCopia);
        System.out.println("Com o valor da sua bolsa, pode comprar ate: "+copiasPorBolsa+" copias.");
    }

    

    
}
