package model;

import br.com.petsho.model.pessoa.Pessoa;

public class Animal {
    private Long ID;
    private String nome;
    private String raca;
    private String descricao;
    private String Observacao;
    private Pessoa dono;

    public Animal() {
    }

    public Animal(Long ID, String nome, String raca, String descricao, String observacao, Pessoa dono) {
        this.ID = ID;
        this.nome = nome;
        this.raca = raca;
        this.descricao = descricao;
        Observacao = observacao;
        this.dono = dono;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca(String raca) {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDescricao(String descricao) {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao(String observacao) {
        return Observacao;
    }

    public void setObservacao(String observacao) {
        Observacao = observacao;
    }

    public Pessoa getDono(Pessoa dono) {
        return this.dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", descricao='" + descricao + '\'' +
                ", Observacao='" + Observacao + '\'' +
                ", dono=" + dono +
                '}';
    }
}
