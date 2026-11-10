package exercicio03;

public class ContaBancariaMain {
    static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);

        conta.setTitular("Carlos");

        conta.depositar(50.0);
        conta.sacar(30.0);

        System.out.println(conta.consultarSaldo());
    }
}
