package exercicio01;

public class Carro {
    private String marca;
    private String modelo;
    private Double velocidade = 0.0;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        velocidade+=10.0;
    }

    public String exibirDados() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Velocidade: " + velocidade;
    }
}
