import org.junit.Test;

import static org.junit.Assert.*;

public class LivroTest {
    @Test
    public void testCriarLivro() {
        Livro livro = new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien");
        assertEquals(1, livro.getId());
        assertEquals("O Senhor dos Anéis", livro.getTitulo());
        assertEquals("J.R.R. Tolkien", livro.getAutor());
        assertFalse(livro.isEmprestado());
    }

    @Test
    public void testEmprestarLivro() {
        Livro livro = new Livro(1, "Dom Quixote", "Miguel de Cervantes");
        livro.emprestar();
        assertTrue(livro.isEmprestado());
    }

    @Test
    public void testRetornarLivro() {
        Livro livro = new Livro(1, "Romeu e Julieta", "William Shakespeare");
        livro.emprestar();
        livro.retornar();
        assertFalse(livro.isEmprestado());
    }
}