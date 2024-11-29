package interFace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalGeral {
    private String nomeAtleta;
    private int idade;
    private String modalidadeEsportiva;
    private int nivelCondicionamento; // De 1 a 5
  

    // Construtor vazio para permitir a entrada de dados manualmente
    public PrincipalGeral() {
    	
    }

    

    public void exibirDados() {
        System.out.println("\n*** Avaliação Física do Atleta ***");
        System.out.println("Nome: " + nomeAtleta);
        System.out.println("Idade: " + idade);
        System.out.println("Modalidade: " + modalidadeEsportiva);
        System.out.println("Nível de Condicionamento: " + nivelCondicionamento);
        System.out.println("\nResultado obtido: (nº)KgF");
   
        }
    

    public void capturarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do atleta:");
        nomeAtleta = scanner.nextLine();

        System.out.println("Digite a idade do atleta:");
        idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite a modalidade esportiva do atleta:");
        modalidadeEsportiva = scanner.nextLine();

        System.out.println("Digite o nível de condicionamento físico (1 a 5):");
        nivelCondicionamento = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
    }

    public static void main(String[] args) {
        PrincipalGeral avaliacao = new PrincipalGeral();
        avaliacao.capturarDados(); // Capturar as informações do usuário

        Scanner jc = new Scanner(System.in);

        // Adicionar testes
        boolean adicionarMaisTestes = true;

        while (adicionarMaisTestes) {
            System.out.println("\nEscolha o tipo de teste:");
            System.out.println("1. Força");
            System.out.println("2. Velocidade");
            System.out.println("3. Flexibilidade");
            System.out.println("4. Resistência");
            int opcao = jc.nextInt();
            jc.nextLine(); // Consumir a quebra de linha

            System.out.println("Digite o nome da máquina utilizada:");
            String nomeMaquina = jc.nextLine();

            System.out.println("Digite o peso do atleta:");
            double peso = jc.nextDouble();

            System.out.println("Digite a altura do atleta em centímetros:");
            double altura = jc.nextDouble();
            jc.nextLine(); // Consumir a quebra de linha



            System.out.println("Deseja adicionar outro teste? (s/n)");
            String resposta = jc.nextLine();
            adicionarMaisTestes = resposta.equalsIgnoreCase("s");
        }

        // Exibir os dados coletados
        avaliacao.exibirDados();
    }
}