package exercicio02;

public class Lampada {
    private String comodo;
    private boolean estaLigada = false;

    public Lampada(String comodo) {
        this.comodo = comodo;
    }

    public void ligar() {
        estaLigada = true;
    }

    public void desligar() {
        estaLigada = false;
    }

    public String observar() {
        return estaLigada ? comodo + " LIGADA" : comodo + " DESLIGADA";
    }
}
