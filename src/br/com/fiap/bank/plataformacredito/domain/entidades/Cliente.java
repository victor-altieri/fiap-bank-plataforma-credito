package br.com.fiap.bank.plataformacredito.domain.entidades;

import java.time.LocalDate;
import java.util.UUID;

import br.com.fiap.bank.plataformacredito.domain.valueobjects.AvaliacaoRisco;
import br.com.fiap.bank.plataformacredito.domain.valueobjects.CPF;

public class Cliente {
    private final UUID id;
    private final String nome;
    private final LocalDate dataNascimento;
    private final CPF cpf;

    private Conta conta;
    private AvaliacaoRisco avaliacaoRisco;

    public Cliente(String nome, LocalDate dataNascimento, CPF cpf) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public CPF getCpf() {
        return cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public AvaliacaoRisco getAvaliacaoRisco() {
        return avaliacaoRisco;
    }

    public void atribuirConta(Conta conta) {
        this.conta = conta;
    }

    public void atribuirAvaliacaoRisco(Integer scoreCredito, String nivelEndividamentoSCR,
            Boolean possuiHistoricoInadimplencia) {
        this.avaliacaoRisco = new AvaliacaoRisco(scoreCredito, nivelEndividamentoSCR, possuiHistoricoInadimplencia);
    }

}
