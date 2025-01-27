package br.com.petsho.model.pessoa;

public class Pessoa {

    private Long id;
    private String nome;

    public Pessoa(){
    }

    public Pessoa(Long id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                '}';
    }
}
