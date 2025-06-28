public class ClubeDoLivro {
    private String[] dia = {"segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo"};
    private String[] horario = {"9h", "10h", "11h", "14h", "15h", "16h"};
    private String livro;
    int cont = 0;
    private Cliente[] participantes = new Cliente[30];

    public String grade() {
        return "";
    }

    public String inscrever(Cliente cliente) {
        if()
        participantes[cont] = cliente;
        cont++;
        return "Inscrição confirmada";
    }
}