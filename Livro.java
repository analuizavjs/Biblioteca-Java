public class Livro {
    private String nome;
    private String genero ;
    private String autor;
    private int ano;
    private boolean status;

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