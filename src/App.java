import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Ativa mapeamento genérico de inputs
        System.out.println("Digite o primeiro número:");
        final int menor = sc.nextInt(); // Registra o número
        System.out.println("Digite o segundo número:");
        final int maior = sc.nextInt(); // Registra o número

        if (menor > maior) {
            System.out.println("Primeiro dígito deve ser maior!");
        } else if (menor < 1) {
            System.out.println("Primeiro dígito não pode ser menor que 1!");
        } else {
            for (int i = menor; i <= maior; i++) {
                String line = "";
                for (int j = 1; j <= i; j++) {
                    line += i;
                }
                System.out.println(line);
            }
        }
    }
}
