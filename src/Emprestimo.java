import java.util.Date;

public class Emprestimo {

    private Usuario usuario;

    private Livro livro;

    private Date dataDeEmprestimo;

    private Date dataDevolucao;

    public void exibirResumoEmprestimo() {
        System.out.println("Resumo do emprestimo");
        System.out.println("Livro: " + this.livro.getTitulo());
        System.out.println("Usuario: " + this.usuario.getNome() + " ( " + this.usuario.exibirTipoUsuario() + " ) ");
        System.out.println("Data de Emprestimo: " + this.dataDeEmprestimo.toString());
        System.out.println("Data de Devolucao: " + (this.dataDevolucao != null ?  this.dataDevolucao.toString() : "Não devolvido"));
    }

    public Emprestimo(Usuario usuario, Livro livro, Date dataDeEmprestimo) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataDevolucao = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public Date getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setDataDeEmprestimo(Date dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
