import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Autoajuda", "O Poder do Hábito", "Charles Duhigg", 2012);
        Livro livro2 = new Livro("Autoajuda", "Mindset: A Nova Psicologia do Sucesso", "Carol S. Dweck", 2006);
        Livro livro3 = new Livro("Autoajuda", "Os 7 Hábitos das Pessoas Altamente Eficazes", "Stephen R. Covey", 1989);
        Livro livro4 = new Livro("Aventura", "A Ilha do Tesouro", "Robert Louis Stevenson", 1883);
        Livro livro5 = new Livro("Aventura", "Vinte Mil Léguas Submarinas", "Júlio Verne", 1870);
        Livro livro6 = new Livro("Aventura", "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);
        Livro livro7 = new Livro("Biografia", "Longa Caminhada até a Liberdade", "Nelson Mandela", 1994);
        Livro livro8 = new Livro("Biografia", "Steve Jobs", "Walter Isaacson", 2011);
        Livro livro9 = new Livro("Biografia", "O Diário de Anne Frank", "Anne Frank", 1947);
        Livro livro10 = new Livro("Fantasia", "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        Livro livro11 = new Livro("Fantasia", "As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "C.S. Lewis", 1950);
        Livro livro12 = new Livro("Fantasia", "Eragon", "Christopher Paolini", 2002);
        Livro livro13 = new Livro("Ficção Científica", "1984", "George Orwell", 1949);
        Livro livro14 = new Livro("Ficção Científica", "Fahrenheit 451", "Ray Bradbury", 1953);
        Livro livro15 = new Livro("Ficção Científica", "Duna", "Frank Herbert", 1965);
        Livro livro16 = new Livro("Infantil", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        Livro livro17 = new Livro("Infantil", "Marcelo, Marmelo, Martelo", "Ruth Rocha", 1976);
        Livro livro18 = new Livro("Infantil", "Menina Bonita do Laço de Fita", "Ana Maria Machado", 1986);
        Livro livro19 = new Livro("Juvenil", "A Culpa é das Estrelas", "John Green", 2012);
        Livro livro20 = new Livro("Juvenil", "Percy Jackson e o Ladrão de Raios", "Rick Riordan", 2005);
        Livro livro21 = new Livro("Juvenil", "Jogos Vorazes", "Suzanne Collins", 2008);
        Livro livro22 = new Livro("Romance", "Orgulho e Preconceito", "Jane Austen", 1813);
        Livro livro23 = new Livro("Romance", "Romeu e Julieta", "William Shakespeare", 1597);
        Livro livro24 = new Livro("Romance", "O Morro dos Ventos Uivantes", "Emily Brontë", 1847);
        Livro livro25 = new Livro("Suspense", "Garota Exemplar", "Gillian Flynn", 2012);
        Livro livro26 = new Livro("Suspense", "O Silêncio dos Inocentes", "Thomas Harris", 1988);
        Livro livro27 = new Livro("Suspense", "A Garota no Trem", "Paula Hawkins", 2015);
        Livro livro28 = new Livro("Terror", "O Iluminado", "Stephen King", 1977);
        Livro livro29 = new Livro("Terror", "Drácula", "Bram Stoker", 1897);
        Livro livro30 = new Livro("Terror", "Frankenstein", "Mary Shelley", 1818);
        
        Livro[] listaDeLivros = new Livro[40];
        Livro[] guardados = {livro1, livro2, livro3, livro4, livro5, livro6, livro7, livro8, livro9, livro10, 
                               livro11, livro12, livro13, livro14, livro15, livro16, livro17, livro18, livro19, livro20, 
                               livro21, livro22, livro23, livro24, livro25, livro26, livro27, livro28, livro29, livro30};
        for(int i = 0; i<guardados.length; i++) {
            listaDeLivros[i] = guardados[i];
        }
                                 
        Cliente cliente1 = new Cliente("Pedro", 28, "Romance", livro21);
        Cliente cliente2 = new Cliente("Ana", 21, "Juvenil", livro24);
        Cliente cliente3 = new Cliente("Almeida", 29, "Suspense", livro27);
        Cliente cliente4 = new Cliente("Bruna", 27, "Infantil", livro18);
        Cliente cliente5 = new Cliente("Bruno", 37, "Autoajuda", livro3);
        
        Cliente[] listaDeClientes = new Cliente[40];
        Cliente[] cadastrados = {cliente1, cliente2, cliente3, cliente4, cliente5};
                                
        for(int i = 0; i<cadastrados.length; i++) {
            listaDeClientes[i] = cadastrados[i];
        }
            
        Bibliotecario bibliotecario1 = new Bibliotecario("Pedro", 25, "12345678900");
        Bibliotecario bibliotecario2 = new Bibliotecario("Carlos", 30, "09876543211");
        Bibliotecario bibliotecario3 = new Bibliotecario("Fernanda", 28, "11223344556");
        Bibliotecario bibliotecario4 = new Bibliotecario("Gustavo", 35, "66778899001");
        Bibliotecario []listaDeBibliotecarios = new Bibliotecario[10];

        Bibliotecario[] Bibcadastrados = {bibliotecario1, bibliotecario2, bibliotecario3, bibliotecario4};

        for(int i = 0; i < listaDeBibliotecarios.length; i++) {
            if (i < 4) {
                listaDeBibliotecarios[i] = Bibcadastrados[i];
            } else {
                listaDeBibliotecarios[i] = null;
            }
        }
            
        int n1 = 1, n2 = 1, n3, n4, idade, novaIdade, idadeBibliotecario;
        String nome, generoFavorito, novoNome, novoGenero, username, nomeBibliotecario, cpf;
        Scanner sc = new Scanner(System.in);
        Cliente cliente;
        ClubeDoLivro clube = new ClubeDoLivro();
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Seja bem-vindo(a) a Biblioteca");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
       
        while(n1 != 5){
        System.out.println("\n1 - Cadastro de Cliente\n2 - Entrar como Cliente\n3 - Cadastro de Bibliotecário\n4 - Entrar como Bibliotecário\n5 - Sair");
        System.out.println("Digite o número da opção desejada: ");
        n1 = sc.nextInt();

        while(n1 < 1 || n1 > 5) {
            System.out.println("Opção inválida! Digite novamente: ");
            n1 = sc.nextInt();
        }

        switch(n1) {
            case 1:
                System.out.println("Digite seu nome: ");
                nome = sc.next();
                
                System.out.println("Digite sua idade: ");
                idade = sc.nextInt();
                
                System.out.println("Digite seu gênero favorito: ");
                generoFavorito = sc.next();
                
                Cliente cliente6 = new Cliente(nome, idade, generoFavorito);
                listaDeClientes[6] = cliente6;
                
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Seja bem-vindo(a) Cliente");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                while(n2!=8)  {

                System.out.println("\n1 - Mostrar dados\n2 - Setar dados\n3 - Reservar livro\n4 - Inscrever-se para o Clube do Livro\n5 - Mostrar grade de horários do clube do livro\n6 - Mostrar participantes do clube do livro\n7 - Mostrar lista de livros\n8 - Voltar ao menu\n9 - Sair");
                System.out.println("Qual funcionalidade você deseja acessar?");
                n2 = sc.nextInt();
                
                switch(n2) {
                    case 1:
                        System.out.println("\n1 - Seu nome\n2 - Sua idade\n3 - Seu gênero favorito\n4 - Todos os seus dados\n");
                        System.out.println("Quais dados você deseja mostrar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println(cliente6.getNome());
                                break;
                                
                            case 2:
                                System.out.println(cliente6.getIdade());
                                break;
                            
                            case 3:
                                System.out.println(cliente6.getGeneroFavorito());
                                break;
                                
                            case 4:
                                System.out.println(cliente6.toStringNovo());
                                break;
                            
                            default:
                                break;
                        }
                        break;
                        
                    case 2:
                        System.out.println("\n1 - Seu nome\n2 - Sua idade\n3 - Seu gênero favorito\n");
                        System.out.println("Quais dados você deseja mudar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println("Qual é o seu novo nome? ");
                                novoNome = sc.next();
                                cliente6.setNome(novoNome);
                                break;

                            case 2:
                                System.out.println("Qual é a sua nova idade? ");
                                novaIdade = sc.nextInt();
                                cliente6.setIdade(novaIdade);
                                break;
                            
                            case 3:    
                                System.out.println("Qual é o seu novo gênero favorito? ");
                                novoGenero = sc.next();
                                cliente6.setGeneroFavorito(novoGenero);
                                break;
                        }
                        break;
                        
                    case 3:
                        System.out.println("\n1 - Autoajuda\n2 - Aventura\n3 - Biografia\n4 - Fantasia\n5 - Ficção Científica\n6 - Infantil\n7 - Juvenil\n8 - Romamnce\n9 - Suspense\n10 - Terror\n");
                        System.out.println("Qual gênero você deseja? ");
                        n3 = sc.nextInt();

                        switch(n3) {
                            case 1:
                                System.out.println("\n1 - O Poder do Hábito\n2 - Mindset: A Nova Psicologia do Sucesso\n3 - Os 7 Hábitos das Pessoas Altamente Eficazes\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;
                            
                            case 2:
                                System.out.println("\n1 - A Ilha do Tesouro\n2 - Vinte Mil Léguas Submarinas\n3 - O Senhor dos Anéis: A Sociedade do Anel\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;
                            
                            case 3:
                                System.out.println("\n1 - Longa Caminhada até a Liberdade\n2 - Steve Jobs\n3 - O Diário de Anne Frank\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;
                            
                            case 4:
                                System.out.println("\n1 - Harry Potter e a Pedra Filosofal\n2 - As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa\n3 - Eragon\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;
                            
                            case 5:
                                System.out.println("\n1 - 1984\n2 - Fahrenheit 451\n3 - Duna\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;
                            
                            case 6:
                                System.out.println("\n1 - O Pequeno Príncipe\n2 - Marcelo, Marmelo, Martelo\n3 - Menina Bonita do Laço de Fita\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;
                            
                            case 7:
                                System.out.println("\n1 - A Culpa é das Estrelas\n2 - Percy Jackson e o Ladrão de Raios\n3 - Jogos Vorazes\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;
                            
                            case 8:
                                System.out.println("\n1 - Orgulho e Preconceito\n2 - Romeu e Julieta\n3 - O Morro dos Ventos Uivantes\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;
                            
                            case 9:
                                System.out.println("\n1 - Garota Exemplar\n2 - O Silêncio dos Inocentes\n3 - A Garota no Trem\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;

                            case 10:
                                System.out.println("\n1 - O Iluminado\n2 - Drácula\n3 - Frankenstein\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente6, n3, n4));
                                break;
                        }
                        break;

                    case 4:
                        clube.inscrever(cliente6);
                        break;
                    
                    case 5:
                    clube.grade();
                    break;
                    
                    case 6:
                        System.out.println(clube.getParticipantes());
                        break;
                    
                    case 7:
                        for (int i = 0; i < listaDeLivros.length; i++) {
                            if (listaDeLivros[i] != null) {
                                System.out.println(listaDeLivros[i].toString());
                            }
                        }
                        break;
                    
                    case 8:
                        System.out.println("De volta ao menu!");
                        break;

                    case 9:
                        System.out.println("Obrigado por utilizar nosso sistema!");
                        return;
                }
                }
                break;
            case 2:

            cliente = null;

            while (cliente == null) {
            System.out.println("Digite seu usuário de cliente já cadastrado: ");
            username = sc.next();

            for (int i = 0; i < listaDeClientes.length; i++) {
                if (listaDeClientes[i] != null && listaDeClientes[i].getNome().equals(username)) {
                    cliente = listaDeClientes[i];
                    break;
                }
            }

                if (cliente == null) {
                    System.out.println("Cliente não encontrado!");     
                }
            }
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Seja bem-vindo(a) Cliente");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                n2 = 1;
                while(n2!=8) {
                System.out.println("\n1 - Mostrar dados\n2 - Setar dados\n3 - Reservar livro\n4 - Inscrever-se para o Clube do Livro\n5 - Mostrar grade de horários do clube do livro\n6 - Mostrar participantes do clube do livro\n7 - Mostrar lista de livros\n8 - Voltar ao menu\n9 - Sair");
                System.out.println("Qual funcionalidade você deseja acessar?");
                n2 = sc.nextInt();
                
                switch(n2) {
                    case 1:
                        System.out.println("\n1 - Seu nome\n2 - Sua idade\n3 - Seu gênero favorito\n4 - Todos os seus dados\n");
                        System.out.println("Quais dados você deseja mostrar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println(cliente.getNome());
                                break;
                                
                            case 2:
                                System.out.println(cliente.getIdade());
                                break;
                            
                            case 3:
                                System.out.println(cliente.getGeneroFavorito());
                                break;
                                
                            case 4:
                                System.out.println(cliente.toStringNovo());
                                break;
                            
                            default:
                                break;
                        }
                        break;
                        
                    case 2:
                        System.out.println("\n1 - Seu nome\n2 - Sua idade\n3 - Seu gênero favorito\n");
                        System.out.println("Quais dados você deseja mudar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println("Qual é o seu novo nome? ");
                                novoNome = sc.next();
                                cliente.setNome(novoNome);
                                break;

                            case 2:
                                System.out.println("Qual é a sua nova idade? ");
                                novaIdade = sc.nextInt();
                                cliente.setIdade(novaIdade);
                                break;
                            
                            case 3:    
                                System.out.println("Qual é o seu novo gênero favorito? ");
                                novoGenero = sc.next();
                                cliente.setGeneroFavorito(novoGenero);
                                break;
                        }
                        break;
                        
                    case 3:
                        System.out.println("\n1 - Autoajuda\n2 - Aventura\n3 - Biografia\n4 - Fantasia\n5 - Ficção Científica\n6 - Infantil\n7 - Juvenil\n8 - Romamnce\n9 - Suspense\n10 - Terror\n");
                        System.out.println("Qual gênero você deseja? ");
                        n3 = sc.nextInt();

                        switch(n3) {
                            case 1:
                                System.out.println("\n1 - O Poder do Hábito\n2 - Mindset: A Nova Psicologia do Sucesso\n3 - Os 7 Hábitos das Pessoas Altamente Eficazes\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;
                            
                            case 2:
                                System.out.println("\n1 - A Ilha do Tesouro\n2 - Vinte Mil Léguas Submarinas\n3 - O Senhor dos Anéis: A Sociedade do Anel\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;
                            
                            case 3:
                                System.out.println("\n1 - Longa Caminhada até a Liberdade\n2 - Steve Jobs\n3 - O Diário de Anne Frank\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;
                            
                            case 4:
                                System.out.println("\n1 - Harry Potter e a Pedra Filosofal\n2 - As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa\n3 - Eragon\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;
                            
                            case 5:
                                System.out.println("\n1 - 1984\n2 - Fahrenheit 451\n3 - Duna\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;
                            
                            case 6:
                                System.out.println("\n1 - O Pequeno Príncipe\n2 - Marcelo, Marmelo, Martelo\n3 - Menina Bonita do Laço de Fita\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;
                            
                            case 7:
                                System.out.println("1 - A Culpa é das Estrelas\n2 - Percy Jackson e o Ladrão de Raios\n3 - Jogos Vorazes\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;
                            
                            case 8:
                                System.out.println("\n1 - Orgulho e Preconceito\n2 - Romeu e Julieta\n3 - O Morro dos Ventos Uivantes\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;
                            
                            case 9:
                                System.out.println("\n1 - Garota Exemplar\n2 - O Silêncio dos Inocentes\n3 - A Garota no Trem\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;

                            case 10:
                                System.out.println("\n1 - O Iluminado\n2 - Drácula\n3 - Frankenstein\n");
                                System.out.println("Qual livro você deseja?");
                                n4 = sc.nextInt();
                                System.out.println(livro1.reserva(cliente, n3, n4));
                                break;
                        }
                        break;

                    case 4:
                        clube.inscrever(cliente);
                        break;
                    
                    case 5:
                        clube.grade();
                        break;
                    
                    case 6:
                        System.out.println(clube.getParticipantes());
                        break;
                    
                    case 7:
                        for (int i = 0; i < listaDeLivros.length; i++) {
                            if (listaDeLivros[i] != null) {
                                System.out.println(listaDeLivros[i].toString());
                            }
                        }
                        break;

                    case 8:
                        System.out.println("De volta ao menu!");
                        break;
                    
                    case 9:
                        System.out.println("Obrigado por utilizar nosso sistema!");
                        return;
                }
                }
                break;
            
            case 3:
                System.out.println("Digite seu nome: ");
                nomeBibliotecario = sc.next();
                System.out.println("Digite sua idade: ");
                idadeBibliotecario = sc.nextInt();
                System.out.println("Digite seu CPF: ");
                cpf = sc.next();
                Bibliotecario bibliotecario5 = new Bibliotecario(nomeBibliotecario, idadeBibliotecario, cpf);
                listaDeBibliotecarios[listaDeBibliotecarios.length - 1] = bibliotecario5;

                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Seja bem-vindo(a) Bibliotecário");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                n2 = 1;
                while(n2!=6) {
                System.out.println("\n1 - Mostrar dados\n2 - Setar dados\n3 - Mostrar grade de horários do clube do livro\n4 - Mostrar participantes do clube do livro\n5 - Mostrar lista de livros\n6 - Voltar ao menu\n7 - Sair");
                System.out.println("Qual funcionalidade você deseja acessar?");
                n2 = sc.nextInt();

                switch(n2) {
                    case 1:
                        System.out.println("\n1 - Seu nome\n2 - Sua idade\n3 - Seu CPF\n4 - Todos os seus dados\n");
                        System.out.println("Quais dados você deseja mostrar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println(bibliotecario5.getBibNome());
                                break;
                                
                            case 2:
                                System.out.println(bibliotecario5.getBibIdade());
                                break;
                            
                            case 3:
                                System.out.println(bibliotecario5.getBibCpf());
                                break;
                                
                            case 4:
                                System.out.println(bibliotecario5.toBibString());
                                break;
                            
                            default:
                                break;
                        }
                        break;
                        
                    case 2:
                        System.out.println("\n1 - Seu nome\n2 - Sua idade\n3 - Seu CPF\n");
                        System.out.println("Quais dados você deseja mudar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println("Qual é o seu novo nome? ");
                                novoNome = sc.next();
                                bibliotecario5.setBibNome(novoNome);
                                break;

                            case 2:
                                System.out.println("Qual é a sua nova idade? ");
                                novaIdade = sc.nextInt();
                                bibliotecario5.setBibIdade(novaIdade);
                                break;
                            
                            case 3:    
                                System.out.println("Qual é o seu novo CPF? ");
                                cpf = sc.next();
                                bibliotecario5.setBibCpf(cpf);
                                break;
                        }
                        break;
                    
                    case 3:
                        clube.grade();
                        break;
                    
                    case 4:
                        System.out.println(clube.getParticipantes());
                        break;
                    
                    case 5:
                        for (int i = 0; i < listaDeLivros.length; i++) {
                            if (listaDeLivros[i] != null) {
                                System.out.println(listaDeLivros[i].toString());
                            }
                        }
                        break;

                    case 6:
                        System.out.println("De volta ao menu!");
                        break;
                    
                    case 7:
                        System.out.println("Obrigado por utilizar nosso sistema!");
                        return;
                }
            }   
                break;
            
            case 4: 
                Bibliotecario bibliotecario = null;

                do{
                System.out.println("Digite seu usuário de bibliotecário já cadastrado: ");
                username = sc.next();
                  
                for (int i = 0; i < listaDeBibliotecarios.length; i++) {
                    if (listaDeBibliotecarios[i] != null && listaDeBibliotecarios[i].getBibNome().equals(username)) {
                        bibliotecario = listaDeBibliotecarios[i];
                        break;
                    }
                }
                    if (bibliotecario == null) {
                        System.out.println("Bibliotecário não encontrado!");     
                    }
                } while (bibliotecario == null);

                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Seja bem-vindo(a) Bibliotecário");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                n2 = 1;
                while(n2!=6) {
                System.out.println("\n1 - Mostrar dados\n2 - Setar dados\n3 - Mostrar grade de horários do clube do livro\n4 - Mostrar participantes do clube do livro\n5 - Mostrar lista de livros\n6 - Voltar ao menu\n7 - Sair");
                System.out.println("Qual funcionalidade você deseja acessar?");
                n2 = sc.nextInt();

                switch(n2) {
                    case 1:
                        System.out.println("\n1 - Seu nome\n2 - Sua idade\n3 - Seu CPF\n4 - Todos os seus dados\n");
                        System.out.println("Quais dados você deseja mostrar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println(bibliotecario.getBibNome());
                                break;
                                
                            case 2:
                                System.out.println(bibliotecario.getBibIdade());
                                break;
                            
                            case 3:
                                System.out.println(bibliotecario.getBibCpf());
                                break;
                                
                            case 4:
                                System.out.println(bibliotecario.toBibString());
                                break;
                            
                            default:
                                break;
                        }
                        break;
                        
                    case 2:
                        System.out.println("\n1 - Seu nome\n2 - Sua idade\n3 - Seu CPF\n");
                        System.out.println("Quais dados você deseja mudar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println("Qual é o seu novo nome? ");
                                novoNome = sc.next();
                                bibliotecario.setBibNome(novoNome);
                                break;

                            case 2:
                                System.out.println("Qual é a sua nova idade? ");
                                novaIdade = sc.nextInt();
                                bibliotecario.setBibIdade(novaIdade);
                                break;

                            case 3:    
                                System.out.println("Qual é o seu novo CPF? ");
                                cpf = sc.next();
                                bibliotecario.setBibCpf(cpf);
                                break;    
                        }

                        break;

                    case 3:
                        clube.grade();
                        break;

                    case 4:
                        System.out.println(clube.getParticipantes());
                        break;
                    
                    case 5:
                        for (int i = 0; i < guardados.length; i++) {
                            if (listaDeLivros[i] != null) {
                                System.out.println(listaDeLivros[i].toString());
                            }
                        }
                        break;

                    case 6:
                        System.out.println("De volta ao menu!");
                        break;
                    
                    case 7:
                        System.out.println("Obrigado por utilizar nosso sistema!");
                        return;
                        
                    }
                }
            break;

            case 5:
                System.out.println("Obrigado por utilizar nosso sistema!");
                sc.close();
                return;

            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        } 
      }
      sc.close();
    }
}  