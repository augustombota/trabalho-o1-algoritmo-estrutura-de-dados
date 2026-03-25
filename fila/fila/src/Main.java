import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner buscar = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();

        int opcao;

        do{

            System.out.println("======== MENU FILA =========");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Ver o elemento que está em frente");
            System.out.println("4. Ver se está vázia");
            System.out.println("Sair do programa");

            opcao = buscar.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Adiciona um número: ");
                    fila.add(buscar.nextInt());
                    break;
                case 2:
                    if(!fila.isEmpty())
                        System.out.println("eleminar elemento: " + fila.poll());
                    else
                        System.out.println("A fila está vazia");
                    break;
                case 3:
                    if(! fila.isEmpty())
                        System.out.println("visualizar o elemento frente: " + fila.peek());
                    else
                         System.out.println("A fila está vazia");
                    break;
                case 4:

                     if(fila.isEmpty())
                         System.out.println(" Sim, a fila está vazia");
                     else
                         System.out.println("A fila não está vazia ");
                     break;
            }
        }while (  opcao != 0);
    }
}