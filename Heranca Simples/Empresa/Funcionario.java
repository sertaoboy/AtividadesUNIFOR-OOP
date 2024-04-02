package Empresa;
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public double getSalario(){
        return salario;
    }

    public void calculaBonus(){
        double bonus = (getSalario()*0.05);
        System.out.println("Bonus: ");
        System.out.printf("R$%8.2f", bonus);
    }
}