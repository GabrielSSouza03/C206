public class Usuario {


    private String nome;
    private String email;
    RedeSocial[] redesSociais;



    public Usuario(String nome, String email,RedeSocial[] redesSociais)
    {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

}
