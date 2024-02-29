package pista;

public class Aterrisagem {

    private Aviao aviao;
    private int tempoDeChegada;
    private int tempoDeAterrisagem;
    public void Aterrisagem(Aviao aviao, int tempoDeChegada, int tempoDeAterrisagem){
        this.aviao = aviao;
        this.tempoDeChegada = tempoDeChegada;
        this.tempoDeAterrisagem = tempoDeAterrisagem;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public int getTempoDeAterrisagem() {
        return tempoDeAterrisagem;
    }

    public void setTempoDeAterrisagem(int tempoDeAterrisagem) {
        this.tempoDeAterrisagem = tempoDeAterrisagem;
    }

    public int getTempoDeChegada() {
        return tempoDeChegada;
    }

    public void setTempoDeChegada(int tempoDeChegada) {
        this.tempoDeChegada = tempoDeChegada;
    }
}
