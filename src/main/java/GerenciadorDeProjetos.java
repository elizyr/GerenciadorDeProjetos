import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeProjetos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = 0;

        System.out.println("=== DEV TASK MANAGER 1.0 ===");

        while (opcao != 3) {
            System.out.println("\n1. Adicionar Nova Task");
            System.out.println("2. Listar Minhas Tasks");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String task = sc.nextLine();
                    tarefas.add(task);
                    System.out.println("✔️ Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("\n--- LISTA DE TRABALHO ---");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa pendente.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.printf("[%d] %s%n", i + 1, tarefas.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando... Bom trabalho hoje!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}