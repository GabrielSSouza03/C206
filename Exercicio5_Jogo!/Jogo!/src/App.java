public class App {
    
    public static void main(String[] args)  {
        
        Personagem personagem1= new Personagem();
        personagem1.nome="LudaCris";

        Arma arma1= new Arma(); 
        arma1.nome= "Ak trovao";

        personagem1.arma=arma1; 

       
    }

public class Personagem {
    String nome;
    int pontos;
    Arma arma; 


    void usarArmas(){
      
    }
    void tomarDano(){
     
    }

}
public class Arma {
    String nome; 
    int poder; 
    int resistencia; 
    String descricao;

    void mostraInfoArmas(){

    }
}
}