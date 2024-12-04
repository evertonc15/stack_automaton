import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean proceed = true;

        while (proceed) {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1 - Testar entradas predefinidas");
            System.out.println("2 - Testar uma entrada manual");
            System.out.println("0 - Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    StackAutomaton.predefinedTests();
                    break;
                case 2:
                    StackAutomaton.testWithScanner();
                    break;
                case 0:
                    proceed = false;
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente.");
            }
        }

        scanner.close();
    }
}

