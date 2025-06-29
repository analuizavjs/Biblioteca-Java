public class Bibliotecario {
    private String nome;
    private int idade;
    private String cpf;

    Cliente[] listaDeClientes = new Cliente[30];
    
    Livro[] listaDeLivros = new Livro[50]; // Adiciona o array de livros


    public Bibliotecario(String nome, int idade, String cpf) {
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

    public String getBibCpf() {
        return this.cpf;
    }
    public void setBibCpf(String cpf) {
        this.cpf = cpf;
    }

    public void listaDeLivros() {
        for (Livro livro : listaDeLivros) {
            System.out.println(livro.toString());
        }
    }

    public void listaDeClientes() {
        for (Cliente listaDeCliente : listaDeClientes) {
            System.out.println(listaDeCliente.toString());
        }
    }

    public Livro[] getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(Livro[] listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }
}
