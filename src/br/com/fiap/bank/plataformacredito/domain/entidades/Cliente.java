package br.com.fiap.bank.plataformacredito.domain.entidades;

import br.com.fiap.bank.plataformacredito.domain.valueobjects.Documento;
import br.com.fiap.bank.plataformacredito.domain.valueobjects.AvaliacaoRisco;

public abstract class Cliente extends BaseEntity {
    protected final Conta conta;
    protected final Documento documento;
    protected AvaliacaoRisco avaliacaoRisco;

    public Cliente(Documento documento, Conta conta) {
        super();
        this.conta = conta;
        this.documento = documento;
    }

    // Getters
    public Conta getConta() {
        return conta;
    }

    public AvaliacaoRisco getAvaliacaoRisco() {
        return avaliacaoRisco;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void atribuirAvaliacaoRisco(Integer scoreCredito, String nivelEndividamentoSCR,
            Boolean possuiHistoricoInadimplencia) {
        this.avaliacaoRisco = new AvaliacaoRisco(scoreCredito, nivelEndividamentoSCR, possuiHistoricoInadimplencia);
    }

}
