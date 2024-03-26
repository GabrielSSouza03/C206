import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
         
        int alunosMatriculados; 

        System.out.println("Insira o numero de alunos matriculados: ");
        alunosMatriculados = entrada.nextInt();
        
        
        switch (alunosMatriculados) {
            case 10:
            case 20:
                System.out.println("A aula será ministrada na sala I-16");
            break;
            case 30:
                System.out.println("A aula será ministrada na sala I-22");
            break;
            default:
                System.out.println("Número incorreto de alunos matriculados");
                break;
        }

   
    }
}
