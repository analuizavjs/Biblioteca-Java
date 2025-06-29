public class Livro {
    private String genero;
    private String nome;
    private String autor;
    private int ano;
    private boolean status;
    Bibliotecario bibliotecario2 = new Bibliotecario("Maria Oliveira", 35, "123.456.789-00");

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
                    cliente.setLivroReservado(bibliotecario2.livro1);
                    return "Reserva de 'O Poder do Hábito' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro2);
                    return "Reserva de 'Mindset: A Nova Psicologia do Sucesso' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro3);
                    return "Reserva de 'Os 7 Hábitos das Pessoas Altamente Eficazes' bem sucedida";
                }
            case 2:
                if(n == 1) {
                    cliente.setLivroReservado(bibliotecario2.livro4);
                    return "Reserva de 'A Ilha do Tesouro' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro5);
                    return "Reserva de 'Vinte Mil Léguas Submarinas' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro6);
                    return "Reserva de 'O Senhor dos Anéis: A Sociedade do Anel' bem sucedida";
                }
            case 3:
                if(n == 1) {
                    cliente.setLivroReservado(bibliotecario2.livro7);
                    return "Reserva de 'Longa Caminhada até a Liberdade' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro8);
                    return "Reserva de 'Steve Jobs' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro9);
                    return "Reserva de 'O Diário de Anne Frank' bem sucedida";
                }
            case 4:
                if(n == 1) {
                    cliente.setLivroReservado(bibliotecario2.livro10);
                    return "Reserva de 'Harry Potter e a Pedra Filosofal' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro11);
                    return "Reserva de 'As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro12);
                    return "Reserva de 'Eragon' bem sucedida";
                }
            case 5:
                if(n == 1) {
                    cliente.setLivroReservado(bibliotecario2.livro13);
                    return "Reserva de '1984' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro14);
                    return "Reserva de 'Fahrenheit 451' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro15);
                    return "Reserva de 'Duna' bem sucedida";
                }
            case 6:
                if(n == 1) {
                    cliente.setLivroReservado(bibliotecario2.livro16);
                    return "Reserva de 'O Pequeno Príncipe' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro17);
                    return "Reserva de 'Marcelo, Marmelo, Martelo' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro18);
                    return "Reserva de 'Menina Bonita do Laço de Fita' bem sucedida";
                }
            case 7:
                if(n == 1) {
                    cliente.setLivroReservado(bibliotecario2.livro19);
                    return "Reserva de 'A Culpa é das Estrelas' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro20);
                    return "Reserva de 'Percy Jackson e o Ladrão de Raios' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro21);
                    return "Reserva de 'Jogos Vorazes' bem sucedida";
                }
            case 8:
                if(n == 1) {
                    cliente.setLivroReservado(bibliotecario2.livro22);
                    return "Reserva de 'Orgulho e Preconceito' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro23);
                    return "Reserva de 'Romeu e Julieta' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro24);
                    return "Reserva de 'O Morro dos Ventos Uivantes' bem sucedida";
                }
            case 9:
                if(n == 1) {
                    cliente.setLivroReservado(bibliotecario2.livro25);
                    return "Reserva de 'Garota Exemplar' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro26);
                    return "Reserva de 'O Silêncio dos Inocentes' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro27);
                    return "Reserva de 'A Garota no Trem' bem sucedida";
                }
            case 10:
                if(n == 1) {
                    cliente.setLivroReservado(bibliotecario2.livro28);
                    return "Reserva de 'O Iluminado' bem sucedida";
                }
                if(n == 2) {
                    cliente.setLivroReservado(bibliotecario2.livro29);
                    return "Reserva de 'Drácula' bem sucedida";
                }
                if(n == 3) {
                    cliente.setLivroReservado(bibliotecario2.livro30);
                    return "Reserva de 'Frankenstein' bem sucedida";
                }
        }
        return "Reserva mal-sucedida";
    }

    public String toString() {
        return String.format("Gênero: %18s | Nome: %60s | Autor: %30s | Ano de Publicação: %5d", this.genero, this.nome, this.autor, this.ano);
    }
}