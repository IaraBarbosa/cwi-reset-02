public class PropostaFinanciamento {

    private Beneficiario beneficiario;
    private Imovel imovelEscolhido;
    private int mesesParaPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovelEscolhido, int mesesParaPagamento) {
        this.beneficiario = beneficiario;
        this.imovelEscolhido = imovelEscolhido;
        this.mesesParaPagamento = mesesParaPagamento;
    }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {
        double valor = beneficiario.getSalario() * mesesParaPagamento;
        UnidadeFederativa estado = imovelEscolhido.getEndereco().getEstado();

        if (estado == UnidadeFederativa.RJ) {
            if (valor >= imovelEscolhido.getValor() * 0.6) {
                System.out.println(imprimirPropostaAprovada());
            } else {
                System.out.println(imprimirPropostaNegada());
            }
        } else if (estado == UnidadeFederativa.SP) {
            if (valor >= imovelEscolhido.getValor() * 0.65) {
                System.out.println(imprimirPropostaAprovada());
            } else{
                System.out.println(imprimirPropostaNegada());
            }
        } else {
            if (valor >= imovelEscolhido.getValor() * 0.5) {
                System.out.println(imprimirPropostaAprovada());
            } else {
                System.out.println(imprimirPropostaNegada());
            }
        }
    }

    private String imprimirPropostaAprovada(){
        return "Beneficiário: " + this.beneficiario.getNome()
                + "\n" + this.imovelEscolhido.apresentacao()
                + "\nPrazo: " + this.mesesParaPagamento + " meses"
                +"\n\nParabéns! Sua proposta foi aceita!";
    }

    private String imprimirPropostaNegada(){
        return "Beneficiário: " + this.beneficiario.getNome()
                + "\n" + this.imovelEscolhido.apresentacao()
                + "\nPrazo: " + this.mesesParaPagamento + " meses"
                +"\n\nTem que trabalhar mais!";
    }
}
