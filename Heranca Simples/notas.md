# Anotacoes atividade Heranca Simples UNIFOR

***Dicas: ao utilizar double para evidenciar um valor monetario***
> Utilizar System.out.printf("%8.2f", <variavel/valor/etc>), evita o retorno de dizimas periodicas, reduzindo para duas casas decimais
```java
    public void calculaBonus(){
        double bonus = (getSalario()*0.05);
        System.out.println("Bonus: ");
        System.out.printf("R$%8.2f", bonus);
    }
```
Respectivo a classe Funcionario.java, pacote Empresa.

## Referente ao uso de Interfaces
Observacoes:
* Estrutura
    *   ```java
             public interface Seguranca {
                public boolean verificaSenha(String senhaInformada);
                public void mensagemSucesso();
                public void mensagemFracasso();
            }```
    * Como uma classe implementa uma interface?
        ```java
            public class Conta implements Seguranca {
                private String cpf;
                private String senha;
                private double saldo;
                ...
            }```
    * Dessa forma, garantimos que a classe Conta, tenha todos os metodos e atributos da interface Seguranca. Ela "assina um contrato" .

