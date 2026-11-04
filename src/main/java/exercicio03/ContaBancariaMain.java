package exercicio03;

public class ContaBancariaMain {
    static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Carlos", 100);

        conta.depositar(50.0);
        conta.sacar(30.0);

        System.out.println(conta.consultarSaldo());
    }
}
