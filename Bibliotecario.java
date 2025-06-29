public class Bibliotecario {
    private String nome;
    private int idade;
    private String cpf;

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
}