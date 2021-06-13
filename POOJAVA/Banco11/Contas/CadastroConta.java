package Banco11.Contas;
import java.util.HashSet;
import java.util.Set;


public class CadastroConta {
    private final Set<Pessoa> pessoas;

    public CadastroPessoa() {
        pessoas = new HashSet<>();
    }

    public void registrar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public Set<Pessoa> getPessoas() {
        return pessoas;
    }
}
