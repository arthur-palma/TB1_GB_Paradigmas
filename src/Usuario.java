public abstract class Usuario {

    private long id;

    private String nome;


    public abstract String exibirTipoUsuario();

    public Usuario(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
