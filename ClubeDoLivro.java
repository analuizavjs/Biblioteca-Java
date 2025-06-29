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
        System.out.println(String.format(
            """
            | %3s | %8s | %8s | %8s | %8s | %8s | %8s | %8s |
            | %3s | %60s | %60s | %60s | %60s | %60s | %60s | %60s |
            | %3s | %60s | %60s | %60s | %60s | %60s | %60s | %60s |
            | %3s | %60s | %60s | %60s | %60s | %60s | %60s | %60s |
            | %3s | %60s | %60s | %60s | %60s | %60s | %60s | %60s |
            | %3s | %60s | %60s | %60s | %60s | %60s | %60s | %60s |
            | %3s | %60s | %60s | %60s | %60s | %60s | %60s | %60s |
            """,
            "   ", "segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo",
            "9h", "O Poder do Hábito", "Mindset: A Nova Psicologia do Sucesso", "Os 7 Hábitos das Pessoas Altamente Eficazes", "A Ilha do Tesouro", "Vinte Mil Léguas Submarinas", "O Senhor dos Anéis: A Sociedade do Anel", "Longa Caminhada até a Liberdade",
            "10h", "Steve Jobs", "O Diário de Anne Frank", "Harry Potter e a Pedra Filosofal", "As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "Eragon", "1984", "Fahrenheit 451",
            "11h", "Duna", "O Pequeno Príncipe", "Marcelo, Marmelo, Martelo", "Menina Bonita do Laço de Fita", "A Culpa é das Estrelas", "Percy Jackson e o Ladrão de Raios", "Jogos Vorazes",
            "14h", "Orgulho e Preconceito", "Romeu e Julieta", "O Morro dos Ventos Uivantes", "Garota Exemplar", "O Silêncio dos Inocentes", "A Garota no Trem", "O Iluminado",
            "15h", "Drácula", "Frankenstein", "O Poder do Hábito", "Mindset: A Nova Psicologia do Sucesso", "Os 7 Hábitos das Pessoas Altamente Eficazes", "A Ilha do Tesouro", "Vinte Mil Léguas Submarinas",
            "16h", "O Senhor dos Anéis: A Sociedade do Anel", "Longa Caminhada até a Liberdade", "Steve Jobs", "O Diário de Anne Frank", "Harry Potter e a Pedra Filosofal", "As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "Eragon"
        ));
}
}