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

    public Livro(String genero, String nome, String autor, int ano, boolean status) {
        
    }

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

    public String reserva(int g, int n) {
        switch (g) {
            case 1:
                if(n == 1) {
                    return "Reserva de 'O Poder do Hábito' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'Mindset: A Nova Psicologia do Sucesso' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'Os 7 Hábitos das Pessoas Altamente Eficazes' bem sucedida";
                }
            case 2:
                if(n == 1) {
                    return "Reserva de 'A Ilha do Tesouro' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'Vinte Mil Léguas Submarinas' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'O Senhor dos Anéis: A Sociedade do Anel' bem sucedida";
                }
            case 3:
                if(n == 1) {
                    return "Reserva de 'Longa Caminhada até a Liberdade' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'Steve Jobs' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'O Diário de Anne Frank' bem sucedida";
                }
            case 4:
                if(n == 1) {
                    return "Reserva de 'Harry Potter e a Pedra Filosofal' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'Eragon' bem sucedida";
                }
            case 5:
                if(n == 1) {
                    return "Reserva de '1984' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'Fahrenheit 451' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'Duna' bem sucedida";
                }
            case 6:
                if(n == 1) {
                    return "Reserva de 'O Pequeno Príncipe' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'Marcelo, Marmelo, Martelo' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'Menina Bonita do Laço de Fita' bem sucedida";
                }
            case 7:
                if(n == 1) {
                    return "Reserva de 'A Culpa é das Estrelas' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'Percy Jackson e o Ladrão de Raios' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'Jogos Vorazes' bem sucedida";
                }
            case 8:
                if(n == 1) {
                    return "Reserva de 'Orgulho e Preconceito' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'Romeu e Julieta' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'O Morro dos Ventos Uivantes' bem sucedida";
                }
            case 9:
                if(n == 1) {
                    return "Reserva de 'Garota Exemplar' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'O Silêncio dos Inocentes' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'A Garota no Trem' bem sucedida";
                }
            case 10:
                if(n == 1) {
                    return "Reserva de 'O Iluminado' bem sucedida";
                }
                if(n == 2) {
                    return "Reserva de 'Drácula' bem sucedida";
                }
                if(n == 3) {
                    return "Reserva de 'Frankenstein' bem sucedida";
                }
        }
        return "Reserva mal-sucedida";
    }

    public String lista() {
        return String.format("%18s | %60s | %60s | %60\n", "Autoajuda", "O Poder do Hábito", "Mindset: A Nova Psicologia do Sucesso", "Os 7 Hábitos das Pessoas Altamente Eficazes"+
                             "%18s | %60s | %60s | %60\n", "Aventura", "A Ilha do Tesouro", "Vinte Mil Léguas Submarinas", "O Senhor dos Anéis: A Sociedade do Anel"+
                             "%18s | %60s | %60s | %60\n", "Biografia", "Longa Caminhada até a Liberdade", "Steve Jobs", "O Diário de Anne Frank"+
                             "%18s | %60s | %60s | %60\n", "Fantasia", "Harry Potter e a Pedra Filosofal", "As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "Eragon"+
                             "%18s | %60s | %60s | %60\n", "Ficção Científica", "1984", "Fahrenheit 451", "Duna"+
                             "%18s | %60s | %60s | %60\n", "Infantil", "O Pequeno Príncipe", "Marcelo, Marmelo, Martelo", "Menina Bonita do Laço de Fita"+
                             "%18s | %60s | %60s | %60\n", "Juvenil", "A Culpa é das Estrelas", "Percy Jackson e o Ladrão de Raios", "Jogos Vorazes"+
                             "%18s | %60s | %60s | %60\n", "Romance", "Orgulho e Preconceito", "Romeu e Julieta", "O Morro dos Ventos Uivantes"+
                             "%18s | %60s | %60s | %60\n", "Suspense", "Garota Exemplar", "O Silêncio dos Inocentes", "A Garota no Trem"+
                             "%18s | %60s | %60s | %60\n", "Terror", "O Iluminado", "Drácula", "Frankenstein");
    }
}