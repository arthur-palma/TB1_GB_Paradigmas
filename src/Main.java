//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Livro livro1 = new Livro("Introdução a POO", "Marcelo","?");
        Livro livro2 = new Livro("Introdução a Programação Dinamica", "Marcelo","?");

        Aluno aluno = new Aluno(1,"Arthur","Ciência da Computação");
        Professor professor = new Professor(2,"Marcelo", "Computação");

        Emprestimo emprestimo1 = livro1.emprestar(aluno);
        System.out.println("");
        Emprestimo emprestimo2 = livro2.emprestar(professor);
        System.out.println("");
        Emprestimo emprestimo3 = livro1.emprestar(professor);
        System.out.println("");
        livro1.devolver(emprestimo1);
        System.out.println("");
        livro1.emprestar(professor);

    }

}