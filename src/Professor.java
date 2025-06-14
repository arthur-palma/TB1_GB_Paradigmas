public class Professor extends Usuario {

    private String departamento;

    public Professor(long id, String nome, String departamento) {
        super(id, nome);
        this.departamento = departamento;
    }

    @Override
    public String exibirTipoUsuario() {
        return("Professor");
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
