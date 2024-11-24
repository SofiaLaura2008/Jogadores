package cadastroJogadores;

public abstract class Jogador{
    private String nome;
    private int idade;
    private String posicao;

    public Jogador(String nome, int idade, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public abstract void informacoes();
}