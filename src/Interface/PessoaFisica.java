package Interface;

import java.util.Scanner;

public class PessoaFisica implements Pessoa, Física{

    Scanner sc = new Scanner(System.in);
    private String cpf;
    private int idade;
    private int peso;
    private char sexo;
    private String nome;

    public PessoaFisica(Scanner sc, String cpf, int idade, int peso, char sexo, String nome) {
        this.sc = sc;
        this.cpf = cpf;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.nome = nome;
    }

    public PessoaFisica() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public void andar() {
        System.out.println(nome + "Ande até a geladeira");
    }

    @Override
    public void dormir() {
        System.out.println(nome + "Durma!");
    }

    @Override
    public void comer() {
        System.out.println(nome + "Abra a geladeira e coma algo!");
    }

    @Override
    public void respirar() {
        System.out.println(nome + "Não pare de respirar!");
    }

    @Override
    public void pagarImposto() {

    }

    @Override
    public void digiteNome() {
        System.out.println(nome + "Digite seu nome: ");
        nome = sc.nextLine();
    }

}
