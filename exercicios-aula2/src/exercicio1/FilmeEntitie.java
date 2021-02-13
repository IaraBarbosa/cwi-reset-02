public class FilmeEntitie {

    private String nome;
    private String descricao;
    private int duracao;
    private int anoLancamento;
    private int avaliacao;
    private Diretor diretor;

    public FilmeEntitie(String nome, String descricao, int duracao, int anoLancamento, int avaliacao, Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public String reproduzirFilme() {
        return "Nome: " + this.nome
                + "\nDescrição: " + this.descricao
                + "\nDuração: " + this.duracao + " min"
                + "\nDiretor: " + this.diretor.getNome();
    }
}