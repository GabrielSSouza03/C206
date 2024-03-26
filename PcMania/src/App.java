import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Computador[] computadores = new Computador[100];

        Scanner scan = new Scanner(System.in);
        Cliente client = new Cliente("Adrian", 1234567);

        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen Drive", 16);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen Drive", 32);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo", 1000);

        Computador comp1 = new Computador("Positivo", 1300, "Linux", 32, "Pentium Core i3 1200Mhz", 4, memoriaUSB1);
        Computador comp2 = new Computador("Acer", 1800, "Windows", 64, "Pentium Core i5 2260Mhz", 8, memoriaUSB2);
        Computador comp3 = new Computador("Vaio", 2800, "Windows", 64, "Pentium Core i7 3500Mhz", 16, memoriaUSB3);

        comp1.mostraPCConfigs();
        comp2.mostraPCConfigs();
        comp3.mostraPCConfigs();

        comp1 = computadores[0];
        comp2 = computadores[1];
        comp3 = computadores[2];

        boolean opcao = true;

        while (opcap) {
            System.out.println("-------------------------------------------");
            System.out.println("Bem-vindo ao menu de compras!");
            System.out.println("1 - Produto 1");
            System.out.println("2 - Produto 2");
            System.out.println("3 - Produto 3");
            System.out.println("0 - Sair do menu ");

            int op = scan.nextInt();
            switch (op) {

                case 1:
                    client.pc1++;
                    break;
                case 2:
                    client.pc2++;
                    break;
                case 3:
                    client.pc3++;
                    break;
                case 0:
                    opcao = false;
                    System.out.println("Voce saiu do menu!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;

            }

        }

        System.out.println("Nome do cliente: " + client.nome);
        System.out.println("cpf do cliente: " + client.cpf);
        if (client.pc1 > 0) {
            System.out.println(client.nome + " comprou " + client.pc1 + " do PC 1");
        }
        if (client.pc2 > 0) {
            System.out.println(client.nome + " comprou " + client.pc2 + " do PC 1");
        }
        if (client.pc2 > 0) {
            System.out.println(client.nome + " comprou " + client.pc2 + " do PC 1");
        }

        float valor = client.calculaTotalCompra();
        System.out.println("Total da pagar de R$ " + valor);

    }

    public class Cliente {
        public String nome;
        public long cpf;

        Computador[] computadores = new Computador[100];

        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen Drive", 16);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen Drive", 32);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo", 1000);

        Computador comp1 = new Computador("Positivo", 3300, "Linux Ubuntu", 32, "Pentium Core i3 1200Mhz",  8, memoriaUSB1);
        Computador comp2 = new Computador("Acer", 8800, "Windows", 64, "Pentium Core i5 3700Mhz", 16, memoriaUSB2);
        Computador comp3 = new Computador("Vaio", 4800, "Windows", 64, "Pentium Core i7 4500Mhz", 32, memoriaUSB3);

        int pc1 = 0;
        int pc2 = 0;
        int pc3 = 0;

        public Cliente(String nome, long cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        public float calculaTotalCompra() {
            float soma=0;

            soma = pc1 * comp1.preco + pc2 * comp2.preco + pc3 * comp3.preco;

            return soma;
        }

    }

    public class Computador {
        public String marca;
        public float preco;
        MemoriaUSB memousb;
        SistemaOperacional so;
        HardwareBasico hb;

        public Computador(String marca, float preco, String nomesop, int tiposop, String nomehard, float capahard,
                MemoriaUSB memousb) {
            this.marca = marca;
            this.preco = preco;
            this.memousb = memousb;

            so = new SistemaOperacional(nomesop, tiposop);
            hb = new HardwareBasico(nomehard, capahard);
        }

        void mostraPCConfigs() {

            System.out.println("Marca do PC: " + this.marca);
            System.out.println("Preco do PC: " + this.preco);
            System.out.println("Sistema Operacional: " + this.so.nome);
            System.out.println("Tipo do Sistema Operacional: " + this.so.tipo);
            System.out.println("Hardware Basico: " + this.hb.nome);
            System.out.println("Capacidade do Hardware Basico: " + this.hb.capacidade);
            addMemoriaUSB(this.memousb);

            System.out.println("------------------------------");
        }

        void addMemoriaUSB(MemoriaUSB memoriaUSB) {
            System.out
                    .println("O PC acompanha um " + memoriaUSB.nome + " de capacidade " + memoriaUSB.capacidade + "Gb");
        }
    }

    public class HardwareBasico {
        public String nome;
        public float capacidade;

        public HardwareBasico(String nome, float capacidade) {
            this.nome = nome;
            this.capacidade = capacidade;

        }
    }

    public class MemoriaUSB {
        public String nome;
        public int capacidade;

        public MemoriaUSB(String nome, int capacidade) {
            this.nome = nome;
            this.capacidade = capacidade;

        }

    }

    public class SistemaOperacional {
        public String nome;
        public int tipo;

        public SistemaOperacional(String nome, int tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
}
