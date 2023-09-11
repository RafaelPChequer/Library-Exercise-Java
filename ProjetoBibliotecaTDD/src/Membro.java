import java.util.ArrayList;
import java.util.List;

// Classe Membro
public class Membro {
    private int id;
    private String nome;
    private List<Livro> livrosEmprestados;

    public Membro(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void retornarLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}