package br.com.fiap.bank.plataformacredito.application;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.domain.entidades.Cliente;
import br.com.fiap.bank.plataformacredito.domain.entidades.Proposta;
import br.com.fiap.bank.plataformacredito.domain.valueobjects.CPF;
import br.com.fiap.bank.plataformacredito.util.ClienteFactory;

public class PlataformaCreditoApplication {

    private static PlataformaCreditoApplication instancia;

    private PlataformaCreditoApplication() {
    }

    public static PlataformaCreditoApplication novaInstancia() {
        if (instancia == null) {
            instancia = new PlataformaCreditoApplication();
        }
        return instancia;
    }

    public void criarProposta(String codigo, String nome, String dataNascimento, String cpf, String valorSolicitado,
            String quantidadeParcelas) {
        System.out.println("Criando proposta...");

        String[] splittedCpf = cpf.split("-");
        String numeroCpf = splittedCpf[0];
        Integer digitoVerificador = Integer.valueOf(splittedCpf[1]);
        Cliente clientePessoaFisica = ClienteFactory.criarClientePessoaFisica(nome, dataNascimento, numeroCpf, null);
        Cliente clientePessoaJuridica = ClienteFactory.criarClientePessoaJuridica(nome, dataNascimento, numeroCpf,
                null);
    }

}
