package br.com.fiap.bank.plataformacredito.domain.entidades;

import br.com.fiap.bank.plataformacredito.domain.valueobjects.AvaliacaoRisco;

public abstract class Cliente extends BaseEntity {
    private final Conta conta;
    private AvaliacaoRisco avaliacaoRisco;

    public Cliente(Conta conta) {
        super();
        this.conta = conta;
    }

    // Getters
    public Conta getConta() {
        return conta;
    }

    public AvaliacaoRisco getAvaliacaoRisco() {
        return avaliacaoRisco;
    }

    public void atribuirAvaliacaoRisco(Integer scoreCredito, String nivelEndividamentoSCR,
            Boolean possuiHistoricoInadimplencia) {
        this.avaliacaoRisco = new AvaliacaoRisco(scoreCredito, nivelEndividamentoSCR, possuiHistoricoInadimplencia);
    }

}
