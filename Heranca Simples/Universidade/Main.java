package Universidade;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.calculaCopias();

        Bolsista bolsista1 = new Bolsista();
        bolsista1.setValorBolsa(1);
        bolsista1.calculaCopias();
        bolsista1.qtdCopiasPorBolsa();
    }
}
