public class Cliente {
    private String nome;
    private int idade;
    private String generoFavorito;
    private Livro livroReservado;

    public Cliente(String nome, int idade, String generoFavorito, Livro livroReservado) {
        this.nome = nome;
        this.idade = idade;
        this.generoFavorito = generoFavorito;
        this.livroReservado = livroReservado;
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

    public Livro getLivroReservado() {
        return this.livroReservado;
    }
    public void setLivroReservado(Livro livroReservado) {
        this.livroReservado = livroReservado;
    }

    @Override
    public String toString() {
        return String.format("Nome: %30s | Idade: %3d | Gênero Favorito: %18s | Livro Reservado: %30s", this.nome, this.idade, this.generoFavorito, this.livroReservado.getNome());
    }
}