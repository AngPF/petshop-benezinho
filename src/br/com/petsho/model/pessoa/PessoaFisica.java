package br.com.petsho.model.pessoa;


import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa{
    private String CPF;
    private Collection<PessoaFisica> filhos = new Vector<>();

    public PessoaFisica addFilho(PessoaFisica filho){
        this.getFilhos().add(filho);
        return this;
    }

    public PessoaFisica removeFilho(PessoaFisica filho){
        this.getFilhos().remove(filho);
        return this;
    }

    public Collection<PessoaFisica> getFilhos(){
        return Collections.unmodifiableCollection(this.filhos);
    }


    public PessoaFisica(){
    }

    public PessoaFisica(String CPF, Collection<PessoaFisica> filhos) {
        this.setCPF(CPF);
        this.setFilhos(filhos);
    }

    public PessoaFisica(Long id, String nome, String CPF, Collection<PessoaFisica> filhos) {
        super(id, nome);
        this.setCPF(CPF);
        this.setFilhos(filhos);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setFilhos(Collection<PessoaFisica> filhos) {
        this.filhos = filhos;
    }


    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + getCPF() + '\'' +
                ", filhos=" + getFilhos() +
                '}';
    }
}
