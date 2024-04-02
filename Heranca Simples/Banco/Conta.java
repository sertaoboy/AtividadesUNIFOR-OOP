package Banco;

public class Conta implements Seguranca {
    private String cpf;
    private String senha;
    private double saldo;

    public void setSenha(String senha){
        this.senha=senha;
    }
    public String getSenha(){
        return senha;
    }

    @Override
    public boolean verificaSenha(String senhaInformada) {
        return getSenha().equals(senhaInformada);
    }
    @Override
    public void mensagemFracasso(){
        System.out.println("Senha invalida.");
    }
    @Override
    public void mensagemSucesso(){
        System.out.println("Realizando o saque...");
    }

    public void saque(double valor, String senhaInformada){
        if(verificaSenha(senhaInformada)) {
            mensagemSucesso();
        }else{
            mensagemFracasso();
        }
    }
}
