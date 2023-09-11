import java.util.ArrayList;
import java.util.List;


// Classe Biblioteca
public class Biblioteca {
    private List<Livro> livros;

    private List<Membro> membros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
    }

    public void registrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void registrarMembro(Membro membro) {
        membros.add(membro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public boolean emprestarLivro(int livroId, int membroId) {
        Livro livro = encontrarLivroPorId(livroId);
        if (livro != null && !livro.isEmprestado()) {
            Membro membro = encontrarMembroPorId(membroId);
            if (membro != null) {
                livro.emprestar();
                membro.emprestarLivro(livro);
                return true;
            }
        }
        return false;
    }

    public void retornarLivro(int livroId, int membroId) {
        Livro livro = encontrarLivroPorId(livroId);
        if (livro != null && livro.isEmprestado()) {
            Membro membro = encontrarMembroPorId(membroId);
            if (membro != null && membro.getLivrosEmprestados().contains(livro)) {
                livro.retornar();
                membro.retornarLivro(livro);
            }
        }
    }

    private Livro encontrarLivroPorId(int livroId) {
        for (Livro livro : livros) {
            if (livro.getId() == livroId) {
                return livro;
            }
        }
        return null;
    }

    private Membro encontrarMembroPorId(int membroId) {
        for (Membro membro : membros) {
            if (membro.getId() == membroId) {
                return membro;
            }
        }
        return null;
    }
}