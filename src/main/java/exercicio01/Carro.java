package exercicio01;

public class Carro {
    private String marca;
    private String modelo;
    private Double velocidade = 0.0;

    public Carro() {

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        velocidade+=10.0;
    }

    public String exibirDados() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Velocidade: " + velocidade;
    }
}
