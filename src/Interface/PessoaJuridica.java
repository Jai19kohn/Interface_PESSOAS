package Interface;

import java.util.Scanner;

public class PessoaJuridica implements Pessoa, Juridica {
    Scanner sc = new Scanner(System.in);

    private String nome;
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void contratarFuncionário() {

    }

    @Override
    public void pagarImposto() {

    }

    @Override
    public void digiteNome() {
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
    }
}
