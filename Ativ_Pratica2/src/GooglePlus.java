public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos) {
        super(senha,numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou fotos no Google Plus");

    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Google Plus");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Google Plus");

    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Google Plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez um streaming no Google Plus");

    }
}
