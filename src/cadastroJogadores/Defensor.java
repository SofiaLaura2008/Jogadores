package cadastroJogadores;

public class Defensor extends Jogador{
    private int numeroCartoes;


    public Defensor(String nome, int idade, String posicao, int numeroCartoes) {
        super(nome, idade, posicao);
        this.numeroCartoes = numeroCartoes;
    }

    public Defensor() {
        super("Desconhecido", 0, "Desconhecido");
        this.numeroCartoes = 0;
    }

    public int getNumeroCartoes() {
        return this.numeroCartoes;
    }

    public void setNumeroCartoes(int numeroCartoes) {
        this.numeroCartoes = numeroCartoes;
    }

    @Override
    public void informacoes(){
        System.out.println("Defensor: " + getNome() + ", Idade: " + getIdade() + ", Posição: " + getPosicao() + ", Numero de Cartões: " + getNumeroCartoes());
    }
}