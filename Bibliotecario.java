public class Bibliotecario {
    private String nome;
    private int idade;
    private int cpf;

    public Bibliotecario(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getBibNome() {
        return this.nome;
    }

    public int getBibIdade() {
        return this.idade;
    }

    public int getBibCpf() {
        return this.cpf;
    }

    public void setBibNome(String nome) {
        this.nome = nome;
    }

    public void setBibIdade(int idade) {
        this.idade = idade;
    }

    public void setBibCpf(int cpf) {
        this.cpf = cpf;
    }
}