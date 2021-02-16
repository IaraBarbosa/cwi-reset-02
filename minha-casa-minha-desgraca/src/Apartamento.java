public class Apartamento extends Imovel{

    private int andar;

    public Apartamento(Endereco endereco, Double valor, int andar) {
        super(endereco, valor);
        this.andar = andar;
    }

    public int getAndar() {
        return andar;
    }

    @Override
    public String apresentacao() {
        return "--APARTAMENTO--\n"
                + super.apresentacao()
                + "\nApartamento no " + this.andar + "° andar"
                + "\nValor: R$" + super.getValor();
    }
}