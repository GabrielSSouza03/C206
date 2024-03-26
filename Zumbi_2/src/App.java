import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" andares da pirâmide: ");
        int numeroAndares = scanner.nextInt();

        for (int i = 0; i < numeroAndares; i++) {

            for (int j = 0; j < numeroAndares - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
