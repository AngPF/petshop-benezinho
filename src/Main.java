import br.com.petsho.model.pessoa.Pessoa;
import br.com.petsho.model.pessoa.PessoaFisica;
import br.com.petsho.model.pessoa.PessoaJuridica;
import model.Animal;
import model.Documento;
import model.Servico;

public class Main {

    public static PessoaFisica novaPessoa(Long id, String nome, String CPF ){
        PessoaFisica ang = new PessoaFisica();
        ang.setId(id);
        ang.setNome(nome);
        ang.setCPF(CPF);
        return ang;
    }

    public static PessoaJuridica novaPessoaJuridica(Long id, String nome, String CNPJ){
        PessoaJuridica holding = new PessoaJuridica();
        holding.setId(id);
        holding.setNome(nome);
        holding.setCNPJ(CNPJ);
        return holding;
    }

    public static Animal novoAnimal(Long id, String nome, String raca, String descricao, String observacao, Pessoa dono){
        Animal marcelo = new Animal();
        marcelo.setID(id);
        marcelo.getNome(nome);
        marcelo.getRaca(raca);
        marcelo.getDescricao(descricao);
        marcelo.getObservacao(observacao);
        marcelo.getDono(dono);
        return marcelo;
    }

    public static Servico novoServico(Long id, String nome, Double valor, String descricao, String observacao, Animal animal){
        Servico banho = new Servico();
        banho.setID(id);
        banho.getNome(nome);
        banho.getValor(valor);
        banho.getDescricao(descricao);
        banho.getObservacao(observacao);
        return banho;
    }

    public static Documento novoDocumento(int id, String numero){
        Documento rg = new Documento();
        rg.getId(id);
        rg.getNumero(numero);
        return rg;
    }

    public static void main(String[] args) {
        PessoaFisica angelo = novaPessoa(Long.valueOf("9888"), "Angelo", "123432567-98");
        PessoaJuridica holding = novaPessoaJuridica(Long.valueOf("765488"), "Holding", "43245678/0001-54");
        Animal marcelo = novoAnimal(5432L, "Marcelo Augusto", "Vira-lata", "Porte medio, cor preta", "nao gosta de tomar banho", angelo);
        Servico banho = novoServico(12345L, "Banho e Tosa", 40.0, "Damos banho e tosa no seu pet", "Melhor banho da regiao", marcelo);
        Documento rg = novoDocumento(Integer.parseInt("432345656-65"), "54");
    }

    System.out.println(servico.toString());

}