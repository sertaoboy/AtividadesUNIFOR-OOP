package Empresa;
public class Presidente extends Funcionario {
    private int qtdAcoes;

    public void setQtdAcoes(int qtdAcoes) {
        this.qtdAcoes=qtdAcoes;
    }

    public int getQtdAcoes(){
        return qtdAcoes;
    }

    @Override
    public void calculaBonus() {
        double bonus = (getSalario()*0.10);
        System.out.println("Valor da bonificacao(Presidente):");
        System.out.printf("R$%8.2f", bonus);
    }
}
