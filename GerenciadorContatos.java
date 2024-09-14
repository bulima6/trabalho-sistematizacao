import java.util.Scanner;

public class GerenciadorContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaContatos listaContatos = new ListaContatos();

        while (true) {
            System.out.println("\n--- Gerenciador de Contatos ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Listar Todos os Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número de telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                    listaContatos.adicionarContato(new Contato(nome, telefone, email));
                    break;
                case 2:
                    System.out.print("Digite o nome ou telefone para buscar: ");
                    String chaveBusca = scanner.nextLine();
                    listaContatos.buscarContato(chaveBusca);
                    break;
                case 3:
                    System.out.print("Digite o nome ou telefone para remover: ");
                    String chaveRemover = scanner.nextLine();
                    listaContatos.removerContato(chaveRemover);
                    break;
                case 4:
                    listaContatos.listarContatos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
