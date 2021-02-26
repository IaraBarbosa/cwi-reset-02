package exercicio2;

public enum Genero {

    FEMININO ("Feminino"),
    MASCULINO("Masculino"),
    NAO_BINARIO ("Não binário");

    private String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
