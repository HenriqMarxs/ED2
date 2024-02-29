package pista;

public class Decolagem {

    private Aviao aviao;
    private int tempoDeChegada;
    private int tempoDeDecolagem;

    public Decolagem(Aviao aviao, int tempoDeDecolagem, int tempoDeChegada) {
        this.aviao = aviao;
        this.tempoDeDecolagem = tempoDeDecolagem;
        this.tempoDeChegada = tempoDeChegada;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public int getTempoDeChegada() {
        return tempoDeChegada;
    }

    public void setTempoDeChegada(int tempoDeChegada) {
        this.tempoDeChegada = tempoDeChegada;
    }

    public int getTempoDeDecolagem() {
        return tempoDeDecolagem;
    }

    public void setTempoDeDecolagem(int tempoDeDecolagem) {
        this.tempoDeDecolagem = tempoDeDecolagem;
    }
}
