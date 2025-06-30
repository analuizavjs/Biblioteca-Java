//Declaraçao da classe Cliente
public class Cliente {

    //Atributos
    private String nome;
    private int idade;
    private String generoFavorito;
    private Livro livroReservado;

    //Construtor sobrecarregado
    public Cliente(String nome, int idade, String generoFavorito) {
        this.nome = nome;
        this.idade = idade;
        this.generoFavorito = generoFavorito;
    }
    
    //Construtor sobrecarregado
    public Cliente(String nome, int idade, String generoFavorito, Livro livroReservado) {
        this.nome = nome;
        this.idade = idade;
        this.generoFavorito = generoFavorito;
        this.livroReservado = livroReservado;
    }
    
    //Métodos getters e setters
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
    
    // Método personalizado que retorna apenas os dados principais do cliente (sem o livro)
    public String toStringNovo() {
        return String.format("Nome: %-30s | Idade: %-3d | Gênero Favorito: %-18s ", this.nome, this.idade, this.generoFavorito);
    }
    
    // Anotação que indica sobrescrita do método toString da classe Object
    @Override
    // Método toString completo, incluindo o nome do livro reservado
    public String toString() {
        // Retorna string com todas as informações do cliente
        return String.format("Nome: %-30s | Idade: %-3d | Gênero Favorito: %-18s | Livro Reservado: %-30s", this.nome, this.idade, this.generoFavorito, this.livroReservado.getNome());
    }
}