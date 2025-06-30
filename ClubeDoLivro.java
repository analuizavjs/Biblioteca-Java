public class ClubeDoLivro {
    private String[] dia = {"segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo"};
    private String[] horario = {"9h", "10h", "11h", "14h", "15h", "16h"};
    private Livro[][] gradeLivros = new Livro[7][6]; 

    int cont = 0;
    Cliente[] participantes = new Cliente[30];
    Bibliotecario bibliotecario1 = new Bibliotecario("Carlos Henrique da Silva", 42, "321.654.987-00");
    
    public ClubeDoLivro() {
        
    }
  
    public Cliente[] getParticipantes() {
        return participantes;
    }

    public String inscrever(Cliente cliente) {
        participantes[cont] = cliente;
        cont++;                
        return "Inscrição confirmada";
    }
    
    public void grade() {
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