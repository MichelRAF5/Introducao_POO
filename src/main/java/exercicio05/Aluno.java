package exercicio05;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarSituacao() {
        return calcularMedia() > 7.0 ? "O aluno " + nome + " está APROVADO" : "O aluno " + nome + " está REPROVADO";
    }
}
