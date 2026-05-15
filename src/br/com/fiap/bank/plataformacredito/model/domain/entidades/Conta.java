package br.com.fiap.bank.plataformacredito.model.domain.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.model.domain.exception.ContaInvalidaException;

public class Conta extends BaseEntity {

    private final String agencia;
    private final String numero;
    private final String digito;
    private final LocalDate dataAbertura;
    private final TipoContaEnum tipoConta;

    private BigDecimal saldo;

    public Conta(String agencia, String numero, String digito, LocalDate dataAbertura, TipoContaEnum tipoConta) {
        super();

        if (agencia == null) {
            throw new ContaInvalidaException("Agência não pode ser nula");
        }

        if (numero == null) {
            throw new ContaInvalidaException("Número não pode ser nulo");
        }

        if (digito == null) {
            throw new ContaInvalidaException("Dígito não pode ser nulo");
        }

        if (dataAbertura == null) {
            throw new ContaInvalidaException("Data de abertura não pode ser nula");
        }

        if (tipoConta == null) {
            throw new ContaInvalidaException("Tipo de conta não pode ser nulo");
        }

        this.agencia = agencia;
        this.numero = numero;
        this.digito = digito;
        this.dataAbertura = dataAbertura;
        this.tipoConta = tipoConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public String getDigito() {
        return digito;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public TipoContaEnum getTipoConta() {
        return tipoConta;
    }
}
