public class ClubeDoLivro {
    private String dia;
    private int horario;
    private String livro;

    public ClubeDoLivro(String dia, int horario, String livro) {
        this.dia = dia;
        this.horario = horario;
        this.livro = livro;
    }

    public String getDia() {
        return dia;
    }

    public int getHorario() {
        return horario;
    }

    public String getLivro() {
        return livro;
    }

    public String grade() {
        return "";
    }

    public String inscrever(Cliente cliente) {
        return"";
    }
}