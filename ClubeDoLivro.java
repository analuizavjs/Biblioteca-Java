// Declaração da classe ClubeDoLivro
public class ClubeDoLivro {

    // Vetor com os dias da semana
    private String[] dia = {"segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo"};
    
    // Vetor com os horários disponíveis
    private String[] horario = {"9h", "10h", "11h", "14h", "15h", "16h"};
    
    // Matriz de livros representando a grade semanal (7 dias x 6 horários)
    private Livro[][] gradeLivros = new Livro[7][6]; 

    // Contador para controlar o número de participantes inscritos
    int cont = 0;

    // Vetor para armazenar até 30 participantes
    Cliente[] participantes = new Cliente[30];

    // Instância fixa de um bibliotecário
    Bibliotecario bibliotecario1 = new Bibliotecario("Carlos Henrique da Silva", 42, "321.654.987-00");
    
    //Construtor
    public ClubeDoLivro() { 
        
    }
    
    // Método que retorna o nome do primeiro participante encontrado
    public String getParticipantes() {
        // Percorre o vetor de participantes
        for (int i = 0; i < participantes.length; i++) {
             // Verifica se a posição contém um participante
            if(participantes[i] != null) {
                // Retorna o nome do primeiro participante não nulo
                return participantes[i].getNome();
            }
        }
        // Retorna uma string vazia caso nenhum participante tenha sido encontrado
        return "";
    }

    // Método para inscrever um cliente no clube
    public String inscrever(Cliente cliente) {
        // Adiciona o cliente na posição indicada por 'cont'
        participantes[cont] = cliente;
        // Incrementa o contador de participantes
        cont++;                
        return "Inscrição confirmada";
    }
    
    // Método que imprime a grade de leitura semanal
    public void grade() {
        // Imprime a grade formatada com os títulos fixos
        System.out.println(
            "      | Segunda               | Terça                  | Quarta       | Quinta            |\n"+
            "| 9h  | O Poder do Hábito     | O Diário de Anne Frank | 1984         | Steve Jobs        |\n"+
            "| 10h | Steve Jobs            | O Pequeno Príncipe     | Duna         | Fahrenheit 451    |\n"+
            "| 11h | Duna                  | Romeu e Julieta        | Eragon       | Jogos Vorazes     |\n"+
            "| 14h | Orgulho e Preconceito | O Poder do Hábito      | Drácula      | Garota Exemplar   |\n"+
            "| 15h | Drácula               | A Culpa é das Estrelas | Frankenstein | A Ilha do Tesouro |\n"+
            "| 16h | Frankenstein          | Steve Jobs             | O Iluminado  | Romeu e Julieta   |\n"
            );
}
}