package exercicio05;

import java.util.Scanner;

public class AlunoMain {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nome = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2);

        System.out.println(aluno.verificarSituacao());
    }
}
