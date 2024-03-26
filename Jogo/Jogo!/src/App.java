
public class App {
    public static void main(String[] args) {

        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem1.nome = "Guts";
        personagem2.nome = "Mary";

        personagem1.pontos = 100;
        personagem2.pontos = 100;

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.descricao = "Espada";
        arma2.descricao = "Lança";

        arma1.resistencia = 190;
        arma2.resistencia = 150;

        personagem1.arma = arma1;
        personagem2.arma = arma2;

        System.out.println("Vida de Guts:" + personagem1.pontos);
        System.out.println("Vida de Mary: " + personagem2.pontos);

        System.out.println("Começe a luta!");

        personagem2.usarArma();
        personagem1.tomarDano();
        personagem2.usarArma();
        personagem2.tomarDano();

        System.out.println("Info da Arma da Mary");
        personagem2.arma.mostraInfo();

        personagem1.arma.mostraInfo();

    }

    public static class Personagem {
        String nome;
        int pontos;
        Arma arma;

        public void usarArma() {
            System.out.println("Pow!!!");
            arma.resistencia -= 2;

        }

        public void tomarDano() {
            System.out.println("Ai minha canela");
            pontos -= 3;
        }
    }

    public static class Arma {
        String nome;
        int poder;
        int resistencia;
        String descricao;

        public void mostraInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Poder" + poder);
            System.out.println("Resistencia : " + resistencia);
            System.out.println("Descrição: " + descricao);
        }
    }

}
