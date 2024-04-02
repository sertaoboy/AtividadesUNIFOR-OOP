package Banco;

public class Email implements Seguranca {
    private String nomeUsuario;
    private String email;
    private String senha;

    public void setSenha(String senha) {
        this.senha=senha;
    }
    public String getSenha(){
        return senha;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public boolean verificaEmail(String emailInserido){
        return getEmail().equals(emailInserido);
    }

    @Override
    public boolean verificaSenha(String senhaInserida){
        return getSenha().equals(senhaInserida);
    }
    @Override
    public void mensagemFracasso(){
        System.out.println("Senha invalida...");
    }
    @Override
    public void mensagemSucesso(){
        System.out.println("Realizando login...");
    }

    public void login(String emailInserido, String senhaInserida){
        if(verificaEmail(emailInserido) && verificaSenha(senhaInserida)){
            mensagemSucesso();
        }else{
            mensagemFracasso();
        }
    }


}
