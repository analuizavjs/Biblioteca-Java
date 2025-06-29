public class Bibliotecario {
    private String nome;
    private int idade;
    private int cpf;
    private Livro[] listaDeLivros = new Livro[30];
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
        
    }

    public Cliente listaDeClientes() {

    }
}