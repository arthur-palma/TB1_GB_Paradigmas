public class Aluno extends Usuario {

    private String curso;

    public Aluno(long id, String nome, String curso) {
        super(id, nome);
        this.curso = curso;
    }


    @Override
    public String exibirTipoUsuario() {
        return("Aluno");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
