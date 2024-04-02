package Empresa;
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setSalario(1200.45);
        funcionario1.calculaBonus();
        System.out.println();
        System.out.println();
        Presidente presidente1 = new Presidente();
        presidente1.setSalario(4500);
        presidente1.calculaBonus();
        System.out.println();
    }
}
