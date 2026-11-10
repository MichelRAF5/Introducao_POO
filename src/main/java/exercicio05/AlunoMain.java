package exercicio05;

import java.util.Scanner;

public class AlunoMain {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno");
        aluno.setNome(sc.nextLine());
        System.out.println("Digite a primeira nota: ");
        aluno.setNota1(sc.nextDouble());
        System.out.println("Digite a segunda nota: ");
        aluno.setNota2(sc.nextDouble());

        System.out.println(aluno.verificarSituacao());
    }
}
