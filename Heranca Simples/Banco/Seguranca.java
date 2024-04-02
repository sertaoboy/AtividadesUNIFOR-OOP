package Banco;

public interface Seguranca {
    public boolean verificaSenha(String senhaInformada);
    public void mensagemSucesso();
    public void mensagemFracasso();
}
