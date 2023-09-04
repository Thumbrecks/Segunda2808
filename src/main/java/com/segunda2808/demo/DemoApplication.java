package com.segunda2808.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    scanner.nextLine(); // Limpar o buffer
                    String nome = scanner.nextLine();
                    System.out.print("Digite o seu CPF: ");
                    int cpf = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o seu endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Digite a sua Data de Nascimento: ");
                    int dataDeNascimento = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
					System.out.print("Digite o curso Desejado: ");
                    String curso = scanner.nextLine();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o UF do estado: ");
                    String unidadeFederal = scanner.nextLine();
                    
                    // Cadastrar o aluno
                    aluno.cadastrarAluno(new Aluno(nome, cpf, endereco, dataDeNascimento, curso, unidadeFederal));
                    System.out.println("\nAluno cadastrado com sucesso!\n");
                    break;
                case 2:
                    System.out.println("Lista de Alunos:");
                    aluno.listarAlunos();
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
    }
}
