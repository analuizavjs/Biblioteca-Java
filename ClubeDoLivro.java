public class ClubeDoLivro {
    private String dia;
    private int horario;
    private String livro;
    int cont = 0;
    private Cliente[] participantes = new Cliente[10];

    public ClubeDoLivro(String dia, int horario, String livro) {
        this.dia = dia;
        this.horario = horario;
        this.livro = livro;
    }

    public String getDia() {
        return this.dia;
    }

    public int getHorario() {
        return this.horario;
    }

    public String getLivro() {
        return this.livro;
    }

    public String grade() {
        return "";
    }

    public String inscrever(Cliente cliente) {
        participantes[cont] = cliente;
        cont++;
        return "";
    }
}