package exercicio04;

public class RetanguloMain {
    static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(5.0);
        retangulo.setBase(3.0);

        System.out.println(
                "Area: " + retangulo.calcularArea() + " | Perimetro: " + retangulo.calcularPerimetro()
        );
    }
}
