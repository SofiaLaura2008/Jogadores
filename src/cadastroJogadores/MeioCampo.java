package cadastroJogadores;

public class MeioCampo extends Jogador{
    private int numeroAssistencias;

    public MeioCampo(String nome, int idade, String posicao, int numeroAssistencias) {
        super(nome, idade, posicao);
        this.numeroAssistencias = numeroAssistencias;
    }

    public MeioCampo() {
        super("Desconhecido", 0, "Desconhecido");
        this.numeroAssistencias = 0;
    }

    public int getNumeroAssistencias() {
        return this.numeroAssistencias;
    }

    public void setNumeroAssistencias(int numeroAssistencias) {
        this.numeroAssistencias = numeroAssistencias;
    }

    @Override
    public void informacoes(){
        System.out.println("Meio Campo: " + getNome() + ", Idade: " + getIdade() + ", Posição: " + getPosicao() + ", Numero de Assitências: " + getNumeroAssistencias());
    }
    
}