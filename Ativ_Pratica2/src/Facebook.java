public class Facebook extends RedeSocial implements Compartilhamento,VideoConferencia{

    public Facebook(String senha, int numAmigos) {
        super(senha,numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Facebook");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Facebook");

    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez um streaming no Facebook");
    }
}
