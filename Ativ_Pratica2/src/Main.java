public class Main {
    public static void main(String[] args) {

        RedeSocial googleplus = new GooglePlus("1234", 10);
        RedeSocial instagram = new Instagram("4321", 20);
        RedeSocial facebook = new Facebook("558556", 14);
        RedeSocial twitter = new Twitter("8597231", 70);


        System.out.println();
        System.out.println("As redes sociais são extremamente importantes hoje em dia !");
        System.out.println( );
        System.out.println("Veja o que alguns usuários estão fazendo em suas redes sociais :");
        System.out.println( );



        RedeSocial[] redesSociais2 = new RedeSocial[2];
        redesSociais2[0] = facebook;
        redesSociais2[1] = twitter;
        Usuario pessoa2 = new Usuario("Carlos Augusto", "gutao097323@gmail.com", redesSociais2);
        System.out.println();
        System.out.println("Usuário: " + pessoa2.getNome());
        System.out.println("Email do usuário: " + pessoa2.getEmail());
        pessoa2.redesSociais[1].postarFoto();
        pessoa2.redesSociais[1].postarVideo();
        pessoa2.redesSociais[0].postarComentario();
        pessoa2.redesSociais[0].curtirPublicacao();



        if(twitter instanceof Twitter)
        {
            Twitter tt = (Twitter) twitter;
            tt.compartilhar();
        }
        if(facebook instanceof Facebook)
        {
            Facebook ff = (Facebook) facebook;
            ff.fazStreaming();
        }
    }
}