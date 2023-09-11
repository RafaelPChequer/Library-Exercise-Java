# TDD-Java-Biblioteca

## Biblioteca de Gerenciamento de Livros
Este é um programa Java que implementa uma simples biblioteca de gerenciamento de livros. A biblioteca permite o registro de livros, membros e a realização de empréstimos e devoluções de livros para os membros.

Classes
Classe Biblioteca
A classe Biblioteca é a principal do programa e possui os seguintes métodos:

public Biblioteca(): Construtor que inicializa as listas de livros e membros.
public void registrarLivro(Livro livro): Registra um livro na biblioteca.
public void registrarMembro(Membro membro): Registra um membro na biblioteca.
public List<Livro> getLivros(): Retorna a lista de livros disponíveis na biblioteca.
public boolean emprestarLivro(int livroId, int membroId): Realiza o empréstimo de um livro para um membro, com base nos IDs do livro e do membro.
public void retornarLivro(int livroId, int membroId): Realiza a devolução de um livro por um membro, com base nos IDs do livro e do membro.
Classe Livro
A classe Livro representa um livro e possui os seguintes métodos:

public Livro(int id, String titulo, String autor): Construtor que inicializa um livro com um ID, título e autor.
public int getId(): Retorna o ID do livro.
public String getTitulo(): Retorna o título do livro.
public String getAutor(): Retorna o autor do livro.
public boolean isEmprestado(): Verifica se o livro está emprestado.
public void emprestar(): Marca o livro como emprestado.
public void retornar(): Marca o livro como retornado.
Classe Membro
A classe Membro representa um membro da biblioteca e possui os seguintes métodos:

public Membro(int id, String nome): Construtor que inicializa um membro com um ID e um nome.
public int getId(): Retorna o ID do membro.
public String getNome(): Retorna o nome do membro.
public List<Livro> getLivrosEmprestados(): Retorna a lista de livros emprestados pelo membro.
public void emprestarLivro(Livro livro): Registra o empréstimo de um livro pelo membro.
public void retornarLivro(Livro livro): Registra a devolução de um livro pelo membro.
