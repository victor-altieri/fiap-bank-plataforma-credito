package br.com.fiap.bank.plataformacredito.model.domain.entidades;

import br.com.fiap.bank.plataformacredito.model.domain.exception.CriacaoClienteException;
import br.com.fiap.bank.plataformacredito.model.domain.valueobjects.Documento;

public abstract class Cliente extends BaseEntity {
    protected final Conta conta;
    protected final Documento documento;
    protected AvaliacaoRisco avaliacaoRisco;

    public Cliente(Documento documento, Conta conta) {
        super();
        if (documento == null || conta == null) {
            throw new CriacaoClienteException("Cliente não pode ser criado com documento ou conta nula");
        }

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
