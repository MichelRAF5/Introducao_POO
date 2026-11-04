package exercicio04;

public class RetanguloMain {
    static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);

        System.out.println(
                "Area: " + retangulo.calcularArea() + " | Perimetro: " + retangulo.calcularPerimetro()
        );
    }
}
