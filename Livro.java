public class Livro {
    private final String genero;
    private final String nome;
    private final String autor;
    private final int ano;
    private final boolean status;

    Livro livro1 = new Livro("Autoajuda", "O Poder do Hábito", "Charles Duhigg", 2012);
    Livro livro2 = new Livro("Autoajuda", "Mindset: A Nova Psicologia do Sucesso", "Carol S. Dweck", 2006);
    Livro livro3 = new Livro("Autoajuda", "Os 7 Hábitos das Pessoas Altamente Eficazes", "Stephen R. Covey", 1989);
    Livro livro4 = new Livro("Aventura", "A Ilha do Tesouro", "Robert Louis Stevenson", 1883);
    Livro livro5 = new Livro("Aventura", "Vinte Mil Léguas Submarinas", "Júlio Verne", 1870);
    Livro livro6 = new Livro("Aventura", "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);
    Livro livro7 = new Livro("Biografia", "Longa Caminhada até a Liberdade", "Nelson Mandela", 1994);
    Livro livro8 = new Livro("Biografia", "Steve Jobs", "Walter Isaacson", 2011);
    Livro livro9 = new Livro("Biografia", "O Diário de Anne Frank", "Anne Frank", 1947);
    Livro livro10 = new Livro("Fantasia", "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
    Livro livro11 = new Livro("Fantasia", "As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "C.S. Lewis", 1950);
    Livro livro12 = new Livro("Fantasia", "Eragon", "Christopher Paolini", 2002);
    Livro livro13 = new Livro("Ficção Científica", "1984", "George Orwell", 1949);
    Livro livro14 = new Livro("Ficção Científica", "Fahrenheit 451", "Ray Bradbury", 1953);
    Livro livro15 = new Livro("Ficção Científica", "Duna", "Frank Herbert", 1965);
    Livro livro16 = new Livro("Infantil", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
    Livro livro17 = new Livro("Infantil", "Marcelo, Marmelo, Martelo", "Ruth Rocha", 1976);
    Livro livro18 = new Livro("Infantil", "Menina Bonita do Laço de Fita", "Ana Maria Machado", 1986);
    Livro livro19 = new Livro("Juvenil", "A Culpa é das Estrelas", "John Green", 2012);
    Livro livro20 = new Livro("Juvenil", "Percy Jackson e o Ladrão de Raios", "Rick Riordan", 2005);
    Livro livro21 = new Livro("Juvenil", "Jogos Vorazes", "Suzanne Collins", 2008);
    Livro livro22 = new Livro("Romance", "Orgulho e Preconceito", "Jane Austen", 1813);
    Livro livro23 = new Livro("Romance", "Romeu e Julieta", "William Shakespeare", 1597);
    Livro livro24 = new Livro("Romance", "O Morro dos Ventos Uivantes", "Emily Brontë", 1847);
    Livro livro25 = new Livro("Suspense", "Garota Exemplar", "Gillian Flynn", 2012);
    Livro livro26 = new Livro("Suspense", "O Silêncio dos Inocentes", "Thomas Harris", 1988);
    Livro livro27 = new Livro("Suspense", "A Garota no Trem", "Paula Hawkins", 2015);
    Livro livro28 = new Livro("Terror", "O Iluminado", "Stephen King", 1977);
    Livro livro29 = new Livro("Terror", "Drácula", "Bram Stoker", 1897);
    Livro livro30 = new Livro("Terror", "Frankenstein", "Mary Shelley", 1818);

    Livro[] listaDeLivros = {livro1, livro2, livro3, livro4, livro5, livro6, livro7, livro8, livro9, livro10, 
                             livro11, livro12, livro13, livro14, livro15, livro16, livro17, livro18, livro19, livro20, 
                             livro21, livro22, livro23, livro24, livro25, livro26, livro27, livro28, livro29, livro30};
                             
    public Livro(String genero, String nome, String autor, int ano) {
        this.genero = genero;
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.status = true;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAno() {
        return this.ano;
    }

    public boolean getStatus() {
        return this.status;
    }

    public String reserva(Cliente cliente, int g, int n) {
        switch (g) {
            case 1:
                if(n == 1) {
                    cliente.setLivroReservado(livro1);
                    return "Reserva de 'O Poder do Hábito' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro2);
                    return "Reserva de 'Mindset: A Nova Psicologia do Sucesso' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro3);
                    return "Reserva de 'Os 7 Hábitos das Pessoas Altamente Eficazes' bem sucedida";
                }
            case 2:
                if(n == 1) {
                    cliente.setLivroReservado(livro4);
                    return "Reserva de 'A Ilha do Tesouro' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro5);
                    return "Reserva de 'Vinte Mil Léguas Submarinas' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro6);
                    return "Reserva de 'O Senhor dos Anéis: A Sociedade do Anel' bem sucedida";
                }
            case 3:
                if(n == 1) {
                    cliente.setLivroReservado(livro7);
                    return "Reserva de 'Longa Caminhada até a Liberdade' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro8);
                    return "Reserva de 'Steve Jobs' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro9);
                    return "Reserva de 'O Diário de Anne Frank' bem sucedida";
                }
            case 4:
                if(n == 1) {
                    cliente.setLivroReservado(livro10);
                    return "Reserva de 'Harry Potter e a Pedra Filosofal' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro11);
                    return "Reserva de 'As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro12);
                    return "Reserva de 'Eragon' bem sucedida";
                }
            case 5:
                if(n == 1) {
                    cliente.setLivroReservado(livro13);
                    return "Reserva de '1984' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro14);
                    return "Reserva de 'Fahrenheit 451' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro15);
                    return "Reserva de 'Duna' bem sucedida";
                }
            case 6:
                if(n == 1) {
                    cliente.setLivroReservado(livro16);
                    return "Reserva de 'O Pequeno Príncipe' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro17);
                    return "Reserva de 'Marcelo, Marmelo, Martelo' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro18);
                    return "Reserva de 'Menina Bonita do Laço de Fita' bem sucedida";
                }
            case 7:
                if(n == 1) {
                    cliente.setLivroReservado(livro19);
                    return "Reserva de 'A Culpa é das Estrelas' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro20);
                    return "Reserva de 'Percy Jackson e o Ladrão de Raios' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro21);
                    return "Reserva de 'Jogos Vorazes' bem sucedida";
                }
            case 8:
                if(n == 1) {
                    cliente.setLivroReservado(livro22);
                    return "Reserva de 'Orgulho e Preconceito' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro23);
                    return "Reserva de 'Romeu e Julieta' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro24);
                    return "Reserva de 'O Morro dos Ventos Uivantes' bem sucedida";
                }
            case 9:
                if(n == 1) {
                    cliente.setLivroReservado(livro25);
                    return "Reserva de 'Garota Exemplar' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro26);
                    return "Reserva de 'O Silêncio dos Inocentes' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro27);
                    return "Reserva de 'A Garota no Trem' bem sucedida";
                }
            case 10:
                if(n == 1) {
                    cliente.setLivroReservado(livro28);
                    return "Reserva de 'O Iluminado' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(livro29);
                    return "Reserva de 'Drácula' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(livro30);
                    return "Reserva de 'Frankenstein' bem sucedida";
                }
        }
        return "Reserva mal-sucedida";
    }

    @Override
    public String toString() {
        return String.format("Gênero: %18s | Nome: %60s | Autor: %30s | Ano de Publicação: %5d", this.genero, this.nome, this.autor, this.ano);
    }
}