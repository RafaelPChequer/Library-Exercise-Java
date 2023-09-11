import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaTest {
    @Test
    public void testRegistrarLivro() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro(1, "1984", "George Orwell");
        biblioteca.registrarLivro(livro);
        assertEquals(1, biblioteca.getLivros().size());
        assertTrue(biblioteca.getLivros().contains(livro));
    }

    @Test
    public void testEmprestarLivroParaMembro() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro(1, "A Revolução dos Bichos", "George Orwell");
        Membro membro = new Membro(1, "Ana");
        biblioteca.registrarLivro(livro);
        biblioteca.registrarMembro(membro);
        biblioteca.emprestarLivro(1, 1);
        assertTrue(livro.isEmprestado());
        assertEquals(1, membro.getLivrosEmprestados().size());
    }

    @Test
    public void testRetornarLivroDeMembro() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro(1, "Cem Anos de Solidão", "Gabriel García Márquez");
        Membro membro = new Membro(1, "Carlos");
        biblioteca.registrarLivro(livro);
        biblioteca.emprestarLivro(1, 1);
        biblioteca.retornarLivro(1, 1);
        assertFalse(livro.isEmprestado());
        assertEquals(0, membro.getLivrosEmprestados().size());
    }

    @Test
    public void testEmprestarLivroNaoDisponivel() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro(1, "A Metamorfose", "Franz Kafka");
        Membro membro1 = new Membro(1, "Daniel");
        Membro membro2 = new Membro(2, "Eduardo");
        biblioteca.registrarLivro(livro);
        biblioteca.emprestarLivro(1, 1);
        assertFalse(biblioteca.emprestarLivro(1, 2));
    }
}