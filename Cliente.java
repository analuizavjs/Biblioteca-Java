public class Cliente {
    private String nome;
    private int idade;
    private String generoFavorito;
    private Livro reservas;

    public Cliente(String nome, int idade, String generoFavorito) {
        this.nome = nome;
        this.idade = idade;
        this.generoFavorito = generoFavorito;
        this.reservas = null;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGeneroFavorito() {
        return this.generoFavorito;
    }
    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    public Livro getReservas() {
        return this.reservas;
    }
    public void setReservas(Livro reservas) {
        this.reservas = reservas;
    }
}