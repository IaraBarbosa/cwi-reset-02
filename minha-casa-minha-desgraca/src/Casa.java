public class Casa extends Imovel{

    private String patio;

    public Casa(Endereco endereco, Double valor, String patio) {
        super(endereco, valor);
        this.patio = patio;
    }

    public String getPatio() {
        return patio;
    }

    @Override
    public String apresentacao() {
        return "--CASA--\n"
                +super.apresentacao()
                + "\nCasa " + this.patio
                + "\nValor: R$" + super.getValor();
    }
}