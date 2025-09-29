package PrintText;// 7. Entrada de dados (ler do usuário)

import java.util.Scanner;
public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Olá, " + nome + ". Você tem " + idade + " anos.");
        sc.close();
    }
}


// import java.util.Scanner;      // precisa importar a classe Scanner
// Scanner sc = new Scanner(System.in);    // cria o objeto para ler dados
// String nome = sc.nextLine();        // lê uma linha de texto
// int idade = sc.nextInt();       // lê um número inteiro
// sc.close();        // fecha o scanner
