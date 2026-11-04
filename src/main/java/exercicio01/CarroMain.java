package exercicio01;

public class CarroMain {
    static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno");

        carro.acelerar();
        carro.acelerar();

        System.out.println(carro.exibirDados());
    }
}
