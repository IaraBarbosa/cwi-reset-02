public class Imovel {

    private Endereco endereco;
    private Double valor;

    public Imovel(Endereco endereco, Double valor){
        this.endereco = endereco;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Double getValor() {
        return valor;
    }

    public String apresentacao(){
        return "Imóvel localizado no endereço: " + this.endereco.getLogradouro()
                + ", " + this.endereco.getNumero() + ". " + this.endereco.getComplemento()
                + ". " + this.endereco.getBairro() + ", " + this.endereco.getCidade()
                + " - " + this.endereco.getEstado().getEstado()
                + "\nValor: R$" + valor;
    }

}
