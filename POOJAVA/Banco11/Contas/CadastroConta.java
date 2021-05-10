package Contas;

import java.util.HashSet;
import java.util.Set;

public class CadastroConta{

    private final Set<Conta> contas;

    public CadastroConta() {
        contas = new HashSet<>();
    }

    public void registrar(Conta conta) {
        contas.add(conta);
    }


    public Set<Conta> getContas() {
        return contas;
    }
}
