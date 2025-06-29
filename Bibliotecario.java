public class Bibliotecario {
    private String nome;
    private int idade;
    private int cpf;
    private Livro[] listaDeLivros = {livro1, livro2, livro3, livro4, livro5, livro6, livro7, livro8, livro9, livro10, livro11, livro12, livro13, livro14, livro15, livro16, livro17, livro18, livro19, livro20, livro21, livro22, livro23, livro24, livro25, livro26, livro27, livro28, livro29, livro30};
    private Cliente[] listaDeClientes = new Cliente[30];

    public Bibliotecario(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getBibNome() {
        return this.nome;
    }
    public void setBibNome(String nome) {
        this.nome = nome;
    }

    public int getBibIdade() {
        return this.idade;
    }
    public void setBibIdade(int idade) {
        this.idade = idade;
    }

    public int getBibCpf() {
        return this.cpf;
    }
    public void setBibCpf(int cpf) {
        this.cpf = cpf;
    }

    public Livro listaDeLivros() {
        for(int i = 0; i<listaDeLivros.length; i++) {
            listaDeLivros[i].toString();
        }
    }

    public Cliente listaDeClientes() {

    }
}