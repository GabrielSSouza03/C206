import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero da primeira hora: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o numero da segunda hora: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o numero da terceira hora: ");
        int lanche3 = entrada.nextInt();

        int soma = lanche1 + lanche2 + lanche3;
        float media = soma / 3.0f;

        System.out.println("total de lanches foi = " + soma);
        System.out.println("a media de lanches foi " + media);

        entrada.close();
    }
}
