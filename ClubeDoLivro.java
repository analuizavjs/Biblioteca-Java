import java.util.Random;

public class ClubeDoLivro {
    private String[] dia = {"segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo"};
    private String[] horario = {"9h", "10h", "11h", "14h", "15h", "16h"};
    private Livro[][] gradeLivros = new Livro[7][6]; 

    int cont = 0;
    Cliente[] participantes = new Cliente[30];
    Bibliotecario bibliotecario1 = new Bibliotecario("Carlos Henrique da Silva", 42, "321.654.987-00");

    
    public ClubeDoLivro() {
        preencherGrade();
    }

    
    public Cliente getParticipantes(int i) {
        return participantes[i];
    }

   
    public String inscrever(Cliente cliente) {
        for(int i = 0; i < bibliotecario1.listaDeClientes.length; i++) {
            if(bibliotecario1.listaDeClientes[i] == cliente) {
                participantes[cont] = cliente;
                cont++;
                return "Inscrição confirmada";
            }
        }
        return "Cliente não cadastrado";
    }

    
    public void preencherGrade() {
        Random random = new Random();
        for (int i = 0; i < 7; i++) { 
            for (int j = 0; j < 6; j++) { 
                int indice = random.nextInt(bibliotecario1.listaDeLivros.length); 
                gradeLivros[i][j] = bibliotecario1.listaDeLivros[indice]; 
            }
        }
    }

    
    public String grade() {
        String resultado = "GRADE DE LEITURA:\n";
        for (int i = 0; i < 7; i++) {
            resultado += dia[i] + ":\n";
            for (int j = 0; j < 6; j++) {
                resultado += "  " + horario[j] + " - " + gradeLivros[i][j].getNome() + "\n";
            }
        }
        return resultado;
    }
}