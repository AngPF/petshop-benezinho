package br.com.petsho.model.pessoa;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaJuridica extends Pessoa{

    private String CNPJ;

    private Collection<Pessoa> socios = new Vector<>();

    public PessoaJuridica addSocio(Pessoa socio){
        this.getSocios().add(socio);
        return this;
    }

    public PessoaJuridica removeSocio(Pessoa socio){
        this.getSocios().remove(socio);
        return this;
    }

    public Collection<Pessoa> getSocios() {
        return Collections.unmodifiableCollection(this.socios);
    }

    public PessoaJuridica(){
    }

    public PessoaJuridica(String CNPJ, Collection<Pessoa> socios) {
        this.setCNPJ(CNPJ);
        this.setSocios(socios);
    }

    public PessoaJuridica(Long id, String nome, String CNPJ, Collection<Pessoa> socios) {
        super(id, nome);
        this.setCNPJ(CNPJ);
        this.setSocios(socios);
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setSocios(Collection<Pessoa> socios) {
        this.socios = socios;
    }



    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + getCNPJ() + '\'' +
                ", socios=" + getSocios() +
                "} " + super.toString();
    }
}
