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
}