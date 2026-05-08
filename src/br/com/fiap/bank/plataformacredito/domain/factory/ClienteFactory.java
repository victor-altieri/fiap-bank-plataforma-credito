package br.com.fiap.bank.plataformacredito.domain.factory;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.domain.entidades.Cliente;
import br.com.fiap.bank.plataformacredito.domain.entidades.ClientePessoaFisica;
import br.com.fiap.bank.plataformacredito.domain.entidades.ClientePessoaJuridica;
import br.com.fiap.bank.plataformacredito.domain.entidades.Conta;
import br.com.fiap.bank.plataformacredito.domain.valueobjects.CNPJ;
import br.com.fiap.bank.plataformacredito.domain.valueobjects.CPF;

public class ClienteFactory {

    public static Cliente criarClientePessoaFisica(String nome, String dataNascimento, String cpf, Conta conta) {
        String[] splittedCpf = cpf.split("-");
        String numeroCpf = splittedCpf[0];
        Integer digitoVerificador = Integer.valueOf(splittedCpf[1]);
        return new ClientePessoaFisica(nome, LocalDate.parse(dataNascimento), new CPF(numeroCpf, digitoVerificador),
                conta);
    }

    public static Cliente criarClientePessoaJuridica(String nomeFantasia, String razaoSocial, String dataConstituicao,
            String cnpj,
            Conta conta) {
        String[] splittedCnpj = cnpj.split("-");
        String numeroCnpj = splittedCnpj[0];
        Integer digitoVerificador = Integer.valueOf(splittedCnpj[1]);
        CNPJ cnpjVO = new CNPJ(numeroCnpj, digitoVerificador);

        ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica(
                nomeFantasia, razaoSocial, LocalDate.parse(dataConstituicao), cnpjVO, conta);

        return clientePessoaJuridica;
    }

}
