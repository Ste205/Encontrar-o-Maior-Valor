import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        
        if (x > y) {
            System.out.println("O maior valor é: " + x);
        } else if (y > x) {
            System.out.println("O maior valor é: " + y);
        } else {
            System.out.println("Os valores são iguais.");
        }
    }
}

