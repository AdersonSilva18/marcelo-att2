package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

//        Solicite ao usuário a quantidade de alunos a serem cadastrados.Para cada aluno, solicite o nome e 4 notas.
//        : O valor da nota deve estar entre 0 e 100. Caso contrário, solicite novamente até que a nota seja válida.
//                Após o cadastro, para cada aluno:
//        Calcule e exiba:
//        A maior nota.
//                A menor nota.
//        A média das notas.

        Scanner scanner = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        String nome;
        Aluno aluno;
        Integer nota = -1;

        System.out.println("Insira a quantidade de alunos a serem cadastradas");
        Integer quantPessoas = scanner.nextInt();

        for (int i = 0; i < quantPessoas; i++) {
            System.out.println("Insira a nome da pessoa " + (i + 1) + ":");
            nome = scanner.next();
            aluno = new Aluno(nome);

            for (int j = 0; j < 4; j++) {
                while (nota < 0 || nota > 100) {
                    System.out.println("Escreva o valor da nota: " + j + 1 + " do aluno: " + aluno.getNome());
                    nota = scanner.nextInt();
                }
                if (nota > aluno.getMaiorNota()) aluno.setMaiorNota(nota);
                if (nota < aluno.getMenorNota()) aluno.setMenorNota(nota);
                aluno.setMedia(aluno.getMedia() + nota);
                aluno.notas[j] = nota;
                nota = -1;
            }
            alunos.add(aluno);
        }

        for (Aluno alnuno : alunos) {

            System.out.println("Menor Nota " + alnuno.getMenorNota() + " do " + alnuno.getNome());
            System.out.println("Maior Nota " + alnuno.getMaiorNota() + " do " + alnuno.getNome());
            System.out.println("Media" + (alnuno.getMedia() / 4) + " do " + alnuno.getNome());
        }
        scanner.close();
    }
}
