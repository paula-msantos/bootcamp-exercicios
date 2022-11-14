package br.com.dh.teste03.exception;

import br.com.dh.teste03.model.Conta;

public class ContaInexistenteException extends Exception{
    public ContaInexistenteException(String message){
        super(message);
    }

}
