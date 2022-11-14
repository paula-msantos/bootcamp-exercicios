package br.com.dh.teste03.model;

import br.com.dh.teste03.exception.InvalidNumberException;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if(saldoInsuficiente(valor)) {
            return false;
        }
        return super.sacar(valor);
    }

    private boolean saldoInsuficiente(double valor) {
        return getSaldo() < valor;
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
}
