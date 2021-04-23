package Exercicio10;

public class ContaPoupanca {

    private double saldo;

    public ContaPoupanca() {
        this.saldo = 0;
    }

    public void depositar(double dinheiro) throws DepositoNegativoException {
        if (dinheiro <= 0) {
            throw new DepositoNegativoException("Você não pode depositar valores negativos!");
        }
        this.saldo += dinheiro;
    }

    public void sacar(double dinheiro) throws SaldoInsuficienteException, SaqueNegativoException {
        if (dinheiro < 0) {
            throw new SaqueNegativoException();
        }

        if (dinheiro > this.saldo) {
            throw new SaldoInsuficienteException("Você não tem saldo suficiente");
        }

        this.saldo -= dinheiro;
    }

    public double getSaldo() {
        return this.saldo;
    }

}