/*O AP usará uma pilha para rastrear o número de 0s.
Para cada 0, empilha um símbolo (por exemplo, Z).
Para cada 1, desempilha um símbolo.
A cadeia é aceita se, ao final da leitura, a pilha estiver vazia e a entrada
tiver sido totalmente consumida.*/

import java.util.Scanner;
import java.util.Stack;

public class StackAutomaton {
    public static boolean acceptLanguage(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '0') {
                stack.push('Z');
            } else if (c == '1') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void predefinedTests() {
        String[] entries = {"", "01", "0011", "000111", "000", "011", "101", "0110", "0101"};

        System.out.println("Testando entradas predefinidas:");
        for (String entrie : entries) {
            boolean accepted = acceptLanguage(entrie);
            System.out.println("Entrada: \"" + entrie + "\" - " + (accepted ? "Aceita" : "Rejeitada"));
        }
    }

    //Metodo para realizar teste com entrada do usuario
    public static void testWithScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma cadeia para testar (apenas 0 e 1):");
        String entrie = scanner.nextLine();

        boolean accepted = acceptLanguage(entrie);
        System.out.println("Entrada: \"" + entrie + "\" - " + (accepted ? "Aceita" : "Rejeitada"));
    }

}