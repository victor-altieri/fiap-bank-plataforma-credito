package br.com.fiap.bank.plataformacredito.application;

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
        // Cliente cliente = new Cliente(nome, LocalDate.parse(dataNascimento), new
        // CPF(numeroCpf, digitoVerificador));

        // Proposta proposta = new Proposta(codigo, new BigDecimal(valorSolicitado),
        // Integer.valueOf(quantidadeParcelas),
        // cliente);
    }

}
