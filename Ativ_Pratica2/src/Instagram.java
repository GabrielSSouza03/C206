public class Instagram extends RedeSocial{

    public Instagram(String senha, int numAmigos) {
        super(senha,numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Instagram");

    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Instagram");

    }

    @Override
    public void postarComentario() {

        System.out.println("Postou comentários no Instagram");
    }
}
