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
        Livro livro18 = new Livro("Infantil", "Menina Bonita do Laço de Fit", "Ana Maria Machado", 1986);
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
                                 
        Cliente cliente1 = new Cliente("Aline Moreira", 28, "Romance", livro21);
        Cliente cliente2 = new Cliente("Ana Beatriz Rocha", 21, "Juvenil", livro24);
        Cliente cliente3 = new Cliente("André Almeida", 29, "Suspense", livro27);
        Cliente cliente4 = new Cliente("Bruna Queiroz", 27, "Infantil", livro18);
        Cliente cliente5 = new Cliente("Bruno Menezes", 37, "Autoajuda", livro3);
        Cliente cliente6 = new Cliente("Camila Ferreira", 31, "Aventura", livro4);
        Cliente cliente7 = new Cliente("Carlos Henrique Souza", 34, "Terror", livro29);
        Cliente cliente8 = new Cliente("Daniel Barbosa", 33, "Fantasia", livro10);
        Cliente cliente9 = new Cliente("Diego Farias", 36, "Ficção Científica", livro15);
        Cliente cliente10 = new Cliente("Eduardo Cunha", 32, "Romance", livro23);
        Cliente cliente11 = new Cliente("Felipe Antunes", 38, "Ficção Científica", livro13);
        Cliente cliente12 = new Cliente("Fernanda Martins", 25, "Juvenil", livro19);
        Cliente cliente13 = new Cliente("Gabriel Costa", 22, "Autoajuda", livro2);
        Cliente cliente14 = new Cliente("Guilherme Rocha", 25, "Biografia", livro9);
        Cliente cliente15 = new Cliente("Heloísa Barreto", 24, "Infantil", livro16);
        Cliente cliente16 = new Cliente("Isabela Ramos", 26, "Suspense", livro25);
        Cliente cliente17 = new Cliente("João Pedro Lima", 18, "Autoajuda", livro1);
        Cliente cliente18 = new Cliente("Júlia Andrade", 29, "Aventura", livro6);
        Cliente cliente19 = new Cliente("Larissa Dias", 19, "Fantasia", livro11);
        Cliente cliente20 = new Cliente("Letícia Vasconcelos", 22, "Romance", livro22);
        Cliente cliente21 = new Cliente("Lucas Oliveira", 23, "Ficção Científica", livro14);
        Cliente cliente22 = new Cliente("Luana Pires", 20, "Suspense", livro26);
        Cliente cliente23 = new Cliente("Mariana Alves", 27, "Terror", livro30);
        Cliente cliente24 = new Cliente("Matheus Ribeiro", 19, "Biografia", livro8);
        Cliente cliente25 = new Cliente("Patrícia Neves", 30, "Infantil", livro17);
        Cliente cliente26 = new Cliente("Rafael Gomes", 40, "Aventura", livro5);
        Cliente cliente27 = new Cliente("Sofia Cardoso", 17, "Juvenil", livro20);
        Cliente cliente28 = new Cliente("Tiago Nascimento", 35, "Terror", livro28);
        Cliente cliente29 = new Cliente("Vinícius Silva", 24, "Biografia", livro7);
        Cliente cliente30 = new Cliente("Vitória Monteiro", 21, "Fantasia", livro12);
        
        Cliente[] listaDeClientes = new Cliente[40];
        Cliente[] cadastrados = {cliente1, cliente2, cliente3, cliente4, cliente5, cliente6, cliente7, cliente8, cliente9, cliente10, 
                                cliente11, cliente12, cliente13, cliente14, cliente15, cliente16, cliente17, cliente18, cliente19, cliente20, 
                                cliente21, cliente22, cliente23, cliente24, cliente25, cliente26, cliente27, cliente28, cliente29, cliente30};
                                
        for(int i = 0; i<cadastrados.length; i++) {
            listaDeClientes[i] = cadastrados[i];
        }
            
            
            
        int n1, n2, n3, idade, novaIdade, novoGenero;
        String nome, generoFavorito, novoNome;
        Scanner sc = new Scanner(System.in);
        Bibliotecario bibliotecario3 = new Bibliotecario("João Pereira", 42, "987.654.321-11");
        Cliente cliente;
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Seja bem-vindo(a) a Biblioteca");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("1 - Cadastro de Cliente\n2 - Entrar como Cliente\n3 - Cadastro de Bibliotecário\n4 - Entrar como Bibliotecário");
        System.out.println("Digite o número da opção desejada: ");
        n1 = sc.nextInt();
        switch(n1) {
            case 1:
                System.out.println("Digite seu nome: ");
                nome = sc.next();
                
                System.out.println("Digite sua idade: ");
                idade = sc.nextInt();
                
                System.out.println("Digite seu gênero favorito: ");
                generoFavorito = sc.next();
                
                Cliente cliente31 = new Cliente(nome, idade, generoFavorito);
                listaDeClientes[31] = cliente31;
                
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Seja bem-vindo(a) Cliente");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                
                System.out.println("1 - Mostrar dados\n2 - Setar dados\n3 - Reservar livro\n4 - Inscrever-se para o Clube do Livro\n5 - Mostrar grade de horários do clube do livro\n6 - Mostrar participantes do clube do livro\n7 - Mostrar lista de livros");
                System.out.println("Qual funcionalidade você deseja acessar?");
                n2 = sc.nextInt();
                
                switch(n2) {
                    case 1:
                        System.out.println("1 - Seu nome\n2 - Sua idade\n3 - Seu gênero favorito\n4 - Todos os seus dados\n");
                        System.out.println("Quais dados você deseja mostrar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println(cliente31.getNome());
                                break;
                                
                            case 2:
                                System.out.println(cliente31.getIdade());
                                break;
                            
                            case 3:
                                System.out.println(cliente31.getGeneroFavorito());
                                break;
                                
                            case 4:
                                System.out.println(cliente31.toStringNovo());
                                break;
                            
                            default:
                                break;
                        }
                        break;
                        
                    case 2:
                        System.out.println("1 - Seu nome\n2 - Sua idade\n3 - Seu gênero favorito\n");
                        System.out.println("Quais dados você deseja mudar? ");
                        n3 = sc.nextInt();
                        
                        switch(n3) {
                            case 1:
                                System.out.println("Qual é o seu novo nome? ");
                                novoNome = sc.next();
                                cliente31.setNome(novoNome);
                                break;

                            case 2:
                                System.out.println("Qual é a sua nova idade? ");
                                novaIdade = sc.nextInt();
                                cliente31.setIdade(novaIdade);
                                break;
                            
                            case 3:    
                                System.out.println("Qual é o seu novo gênero favorito? ");
                                novoGenero = sc.next();
                                cliente31.setGeneroFavorito(novoGenero);
                                break;
                        }
                        
                    case 3:
                        System.out.println("1 - Autoajuda\n2 - Aventura\n3 - Biografia\n4 - Fantasia\n5 - Ficção Científica\n6 -- Infantil\n7 - Juvenil\n8 - Romamnce\n9 - ")
                        System.out.println("Qual gênero você deseja? ")
                }
        }
    }
