import java.time.Instant;
import java.util.Date;

public class Livro {

    private String titulo;

    private String autor;

    private String ISBN;

    private boolean disponivel;


    public Emprestimo emprestar(Usuario usuario) {

        if(!this.disponivel){
            System.out.println("Livro Indisponivel");
            return null;
        }

        this.setDisponivel(false);

        Emprestimo emprestimo = new Emprestimo(usuario,this, Date.from(Instant.now()));

        System.out.println("Livro emprestado com sucesso");

        emprestimo.exibirResumoEmprestimo();

        return emprestimo;
    }

    public Emprestimo devolver(Emprestimo emprestimo) {

        this.setDisponivel(true);

        emprestimo.setDataDevolucao(Date.from(Instant.now()));

        System.out.println("Livro devolvido com sucesso");

        emprestimo.exibirResumoEmprestimo();

        return emprestimo;


    }

    public void exibirInformacoes() {
        System.out.println("Informações do Livro");
        System.out.println("Titulo:" + this.titulo);
        System.out.println("Autor:" + this.autor);
        System.out.println("ISBN:" + this.ISBN);
        System.out.println("Disponivel:" + this.disponivel);

    }

    public Livro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
