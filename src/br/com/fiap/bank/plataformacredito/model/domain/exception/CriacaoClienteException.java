package br.com.fiap.bank.plataformacredito.model.domain.exception;

public class CriacaoClienteException extends RuntimeException {
    public CriacaoClienteException(String message) {
        super(message);
    }
}
