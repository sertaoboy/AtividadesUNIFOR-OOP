package Universidade;

import java.util.Scanner;

public class Estudante {
    private String matricula;
    private int anoIngresso;
    private String curso;

    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso=anoIngresso;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }

    public void calculaCopias(){
        double valorCopia = 0.10;
        do{
            Scanner leitura = new Scanner(System.in);
            System.out.println("Quantas copias deseja comprar? ");
            System.out.println("Pressione 0 para sair");
            int qtd = leitura.nextInt();
            double divida = (valorCopia * qtd);
            System.out.println("Divida das copias: ");
            System.out.println("R$"+ divida);
            System.out.println("=========================");
            if(qtd == 0) {
                break;
            }
        }while(true);
    }
}
