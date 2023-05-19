package model;

public class Servico {

    private Long ID;
    private String nome;
    private Double valor;
    private String descricao;
    private String Observacao;
    private Animal animal;

    public Servico() {
    }

    public Servico(Long ID, String nome, Double valor, String descricao, String observacao, Animal animal) {
        this.setID(ID);
        this.setNome(nome);
        this.setValor(valor);
        this.setDescricao(descricao);
        setObservacao(observacao);
        this.setAnimal(animal);
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

    public Double getValor(Double valor) {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "servico{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", Observacao='" + Observacao + '\'' +
                ", animal=" + animal +
                '}';
    }
}
