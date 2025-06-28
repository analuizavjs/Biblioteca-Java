public class Livro {
    private String[] nome = {"O Poder do Hábito", "Mindset: A Nova Psicologia do Sucesso", "Os 7 Hábitos das Pessoas Altamente Eficazes", 
                             "A Ilha do Tesouro", "Vinte Mil Léguas Submarinas", };
    private String[] genero = {"Autoajuda", "Aventura", "Biografia", "Fantasia", "Ficção Científica", "Infantil", "Juvenil", "Romance", "Suspense", "Terror"};
    private String[] autor = {"Charles Duhigg", "Carol S. Dweck", "Stephen R. Covey", "Robert Louis Stevenson", "Júlio Verne"};
    private int[] ano = {2012, 2006, 1989, 1883, 1870, };
    private boolean status = true;

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

    public String reserva(String nome) {
        if (this.status == true && this.nome == nome) {
            return "Reserva bem-sucedida";
        } else {
            return "Reserva mal-sucedida";
        }
    }

    public String lista() {
        return "";
    }
}