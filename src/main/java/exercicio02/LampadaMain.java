package exercicio02;

public class LampadaMain {
    static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.setComodo("Cozinha");

        System.out.println(lampada.observar());
        lampada.ligar();
        System.out.println(lampada.observar());
    }
}
