public class Livro {
    private String[] genero = {"Autoajuda", "Aventura", "Biografia", "Fantasia", "Ficção Científica", "Infantil", "Juvenil", "Romance", "Suspense", "Terror"};

    private String[] nome = {"O Poder do Hábito", "Mindset: A Nova Psicologia do Sucesso", "Os 7 Hábitos das Pessoas Altamente Eficazes", 
                             "A Ilha do Tesouro", "Vinte Mil Léguas Submarinas", "O Senhor dos Anéis: A Sociedade do Anel",
                             "Longa Caminhada até a Liberdade", "Steve Jobs", "O Diário de Anne Frank",
                             "Harry Potter e a Pedra Filosofal", "As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "Eragon",
                             "1984", "Fahrenheit 451", "Duna",
                             "O Pequeno Príncipe", "Marcelo, Marmelo, Martelo", "Menina Bonita do Laço de Fita",
                             "A Culpa é das Estrelas", "Percy Jackson e o Ladrão de Raios", "Jogos Vorazes",
                             "Orgulho e Preconceito", "Romeu e Julieta", "O Morro dos Ventos Uivantes",
                             "Garota Exemplar", "O Silêncio dos Inocentes", "A Garota no Trem",
                             "O Iluminado", "Drácula", "Frankenstein"};

    private String[] autor = {"Charles Duhigg", "Carol S. Dweck", "Stephen R. Covey", 
                              "Robert Louis Stevenson", "Júlio Verne", "J.R.R. Tolkien",
                              "Nelson Mandela", "Walter Isaacson", "Anne Frank",
                              "J.K. Rowling", "C.S. Lewis", "Christopher Paolini",
                              "George Orwell", "Ray Bradbury", "Frank Herbert",
                              "Antoine de Saint-Exupéry", "Ruth Rocha", "Ana Maria Machado",
                              "John Green", "Rick Riordan", "Suzanne Collins",
                              "Jane Austen", "William Shakespeare", "Emily Brontë",
                              "Gillian Flynn", "Thomas Harris", "Paula Hawkins",
                              "Stephen King", "Bram Stoker", "Mary Shelley"};

    private int[] ano = {2012, 2006, 1989, 
                         1883, 1870, 1954,
                         1994, 2011, 1947,
                         1997, 1950, 2002,
                         1949, 1953, 1965,
                         1943, 1976, 1986,
                         2012, 2005, 2008,
                         1813, 1597, 1847,
                         2012, 1988, 2015,
                         1977, 1897, 1818};

    private boolean status = true;

    public String getNome(int i) {
        return this.nome[i];
    }

    public String getGenero(int i) {
        return this.genero[i];
    }

    public String getAutor(int i) {
        return this.autor[i];
    }

    public int getAno(int i) {
        return this.ano[i];
    }

    public boolean getStatus() {
        return this.status;
    }

    public String reserva(String nome) {
        for(int i = 0; i<nome.length(); i++) {
        if (this.status == true && this.nome[i] == nome) {
            return "Reserva bem-sucedida";
        }
        }
        return "Reserva mal-sucedida";
    }

    public String lista() {
        return "";
    }
}