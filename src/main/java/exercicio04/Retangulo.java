package exercicio04;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return base* altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
