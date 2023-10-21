import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o parametro 1: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Digite o parametro 2: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (IllegalArgumentException e) {
            System.err.println("Exceção: " + e.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            throw new IllegalArgumentException("parametro 1 não pode ser maior que parametro 2 ");
        } 
        
        else {
            for (int i = 1; i <= parametroUm; i++) {
                System.out.println("Número: " + i);
            }
        }
    }
}


