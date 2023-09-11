import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MembroTest {
    @Test
    public void testCriarMembro() {
        Membro membro = new Membro(1, "João");
        assertEquals(1, membro.getId());
        assertEquals("João", membro.getNome());
        assertEquals(0, membro.getLivrosEmprestados().size());
    }

    @Test
    public void testMembroPegaEmprestado() {
        Membro membro = new Membro(1, "Maria");
        Livro livro = new Livro(1, "O Hobbit", "J.R.R. Tolkien");
        membro.emprestarLivro(livro);
        assertEquals(1, membro.getLivrosEmprestados().size());
        assertTrue(membro.getLivrosEmprestados().contains(livro));
    }

    @Test
    public void testMembroRetornaLivro() {
        Membro membro = new Membro(1, "Pedro");
        Livro livro = new Livro(1, "Hamlet", "William Shakespeare");
        membro.emprestarLivro(livro);
        membro.retornarLivro(livro);
        assertEquals(0, membro.getLivrosEmprestados().size());
    }
}