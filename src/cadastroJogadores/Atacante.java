package cadastroJogadores;

public class Atacante extends Jogador{
    private int numeroGols;

    public Atacante(String nome, int idade, String posicao, int numeroGols) {
        super(nome, idade, posicao);
        this.numeroGols = numeroGols;
    }

    public Atacante() {
        super("Desconhecido", 0, "Desconhecido");
        this.numeroGols = 0;
    }
    
    public int getNumeroGols() {
        return this.numeroGols;
    }

    public void setNumeroGols(int numeroGols) {
        this.numeroGols = numeroGols;
    }

    @Override
    public void informacoes(){
        System.out.println("Atacante: " + getNome() + ", Idade: " + getIdade() + ", Posição: " + getPosicao() + ", Numero de gols: " + getNumeroGols());
    }
}