import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int numGerado,numAdvinhado;

        numGerado = rand.nextInt(10)+1;

        do {
            System.out.println("Qual numero estou pensando?");
            numAdvinhado =entrada.nextInt();

            if(numAdvinhado!=numGerado){
                System.out.println("Errado!");
            }
        }while(numGerado!=numAdvinhado);

        System.out.println("Acertou!");



    }
}
