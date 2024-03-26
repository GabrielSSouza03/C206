
public class App {
    public static void main(String[] args) {


        Cantina cantina = new Cantina();
        cantina.nome= "Cantina do Inatel"; 
        
        Salgado s1= new Salgado();
        s1.nome="Coxinha";

        cantina.addSalgado(new Salgado()); 

    }
}
/* 
    public class Cantina {

        String nome;
        Salgado [] salgados = new Salgado[3];
    
        void addSalgado(Salgado novoSalgado){
    
            for (int i=0; i<salgados.lenght;i++){
                salgados [i] = novoSalgado;
            }
    
        }
    
        void mostraInfo(){
            for(Salgado salgado:salgados){
                System.out.println(salgado);
    
            }
            
        }
    }
*/