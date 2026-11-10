package exercicio01;

public class CarroMain {
    static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Fiat");
        carro.setModelo("Uno");

        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.exibirDados());
    }
}
