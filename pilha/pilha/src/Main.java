import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner buscar = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        int opcao ;

        do{

            System.out.println("========== MENU PILHA ===========");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Ver o elemento do topo");
            System.out.println("4. Ver se está vázia");
            System.out.println("Sair do programa");

            opcao = buscar.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(" escreva um número: ");
                    pilha.push(buscar.nextInt());

                    break;
                case 2:
                    if( !pilha.isEmpty())
                        System.out.println("Remover: " + pilha.pop());
                    else
                        System.out.println("A pilha está vazia");
                    break;
            }
        }while (opcao != 0);
    }
}