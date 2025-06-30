// Declaração da classe Bibliotecario
public class Bibliotecario {
    //Atributos
    private String nome;
    private int idade;
    private String cpf;

    //Construtor 
    public Bibliotecario(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    //Métodos getters e setters 
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

    // Método que retorna uma representação em texto formatado do bibliotecário
    public String toBibString() {
        // Retorna uma string com os dados do bibliotecário formatados
        return String.format("Nome: %-30s | Idade: %-3d | CPF: %-11s", this.nome, this.idade, this.cpf);
    }
}