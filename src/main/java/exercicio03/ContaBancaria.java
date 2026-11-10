package exercicio03;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo+=valor;
    }

    public void sacar(double valor) {
        saldo-=valor;
    }

    public String consultarSaldo() {
        String saldoFormatado = String.format("%.2f", saldo);

        return "Titular: " + titular +
                "\nSaldo: " + saldoFormatado;
    }
}
