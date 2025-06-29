public class ClubeDoLivro {
    private String[] dia = {"segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo"};
    private String[] horario = {"9h", "10h", "11h", "14h", "15h", "16h"};
    private String livro;
    int cont = 0;
    Cliente[] participantes = new Cliente[30];

    public Cliente getParticipantes(int i) {
        return participantes[i];
    }

    public String grade() {
        return "";
    }

    public String inscrever(Cliente cliente) {
        for(int i = 0; i<listaDeClientes.length; i++) {
            if(listaDeClientes[i] == cliente) {
                participantes[cont] = cliente;
                cont++;
                return "Inscrição confirmada";
            }
        }
        return "Cliente não cadastrado";
    }
}