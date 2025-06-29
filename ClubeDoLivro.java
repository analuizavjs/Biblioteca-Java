public class ClubeDoLivro {
    private String[] dia = {"segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo"};
    private String[] horario = {"9h", "10h", "11h", "14h", "15h", "16h"};
    private String livro;
    int cont = 0;
    Cliente[] participantes = new Cliente[30];
    Bibliotecario bibliotecario1 = new Bibliotecario("Carlos Henrique da Silva", 42, "321.654.987-00");

    public Cliente getParticipantes(int i) {
        return participantes[i];
    }

    public String grade() {
        return "";
    }

    public String inscrever(Cliente cliente) {
        for(int i = 0; i<bibliotecario1.listaDeClientes.length; i++) {
            if(bibliotecario1.listaDeClientes[i] == cliente) {
                participantes[cont] = cliente;
                cont++;
                return "Inscrição confirmada";
            }
        }
        return "Cliente não cadastrado";
    }
}