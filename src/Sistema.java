public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nRPG - MENU");
        System.out.println("1) Menu - Cadastros");
        System.out.println("2) Menu - Listagens");
        System.out.println("3) Buscar Personagem ");
        System.out.println("4) Menu - Editar ");
        System.out.println("5) Menu - Exclusão");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção:");

    }

    private static void menus(int op){

        switch (op) {
            case 1:
                menuCad();
            break;
            case 2:
                listCad();
            break;
            case 3:
                Buscar();
            break;
            case 4:
                editarCad();
            break;    
           case 5:
                excCad();
                break;
            case 0:
                break;
           

        }
 
        }
 
    private static void menuCad(){ 
                
        System.out.println("\nMENU - CADASTROS");
        System.out.println("1) Cadastrar Mago");
        System.out.println("2) Cadastrar Guerreiro");
        System.out.println("3) Cadastrar Monstro");

        int Cad = Console.lerInt();
        Cadastros(Cad);

    }

    private static void Cadastros(int Cad){

        String nome;
        int vida;
        String HabilidadeEspecial;
        switch (Cad) {

            case 1:
                System.out.println("CADASTRO DE MAGO");
                System.out.println("Nome: ");
                nome = Console.lerString();
                System.out.println("Vida: ");
                vida = Console.lerInt();
                System.out.println("Habilidade Especial: ");
                HabilidadeEspecial = Console.lerString();
                System.out.println("Mana: ");
                int mana = Console.lerInt();
                System.out.println("Elemento: ");
                String elemento = Console.lerString();

                Mago m1 = new Mago(nome, vida, HabilidadeEspecial, mana, elemento);

                CriarPersonagem.criaçao(m1);

                System.out.println("CADASTRO DE MAGO EFETUADO");

                break;

            case 2:
                System.out.println("CADASTRO DE GUERREIRO");
                System.out.println("Nome: ");
                nome = Console.lerString();
                System.out.println("Vida: ");
                vida = Console.lerInt();
                System.out.println("Habilidade Especial: ");
                HabilidadeEspecial = Console.lerString();
                System.out.println("Força: ");
                int força = Console.lerInt();
                System.out.println("Nasçao: ");
                String nasçao = Console.lerString();


                Guerreiro g1 = new Guerreiro(nome, vida, HabilidadeEspecial, força, nasçao);

                CriarPersonagem.criaçao(g1);

                System.out.println("CADASTRO DE GUERREIRO EFETUADO");

                break;
            case 3:
                System.out.println("CADASTRO DE MONSTRO");
                System.out.println("Nome: ");
                nome = Console.lerString();
                System.out.println("Vida: ");
                vida = Console.lerInt();
                System.out.println("Habilidade Especial: ");
                HabilidadeEspecial = Console.lerString();
                System.out.println("Tipo: ");
                String tipo = Console.lerString();
                System.out.println("Nivel: ");
                int nivel = Console.lerInt();


                Monstro mo1 = new Monstro(nome, vida, HabilidadeEspecial, tipo, nivel);

                CriarPersonagem.criaçao(mo1);

                System.out.println("CADASTRO DE MONSTRO EFETUADO");

                break;
        
        
            default:
                System.out.println("Opção invalida");
                break;
        }



    }

    private static void listCad(){

                     
        System.out.println("\nMENU - LISTAS");
        System.out.println("1) Listar Magos");
        System.out.println("2) Listar Guerreiros");
        System.out.println("3) Listar Monstros");
        System.out.println("4) Listar Personagens");

        int List = Console.lerInt();
        Listas(List);

       
        }

    private static void Listas(int List){

            
        switch (List) {
          
             case 1:
             if (CriarPersonagem.getMago().size() == 0) {
                System.out.println("Não há Magos cadastrados...");
                break;
            }
             System.out.println("\nMAGOS CADASTRADOS");

             for (Personagem tempPer : CriarPersonagem.getMago()) {
                System.out.println(tempPer);
            }
                break;

            case 2:
            if (CriarPersonagem.getGuer().size() == 0) {
                System.out.println("Não há Guerreiros cadastrados...");
                break;
            }
            System.out.println("\nGUERRIROS CADASTRADOS");

            for (Personagem tempPer : CriarPersonagem.getGuer()) {
               System.out.println(tempPer);
           }
               break;

            case 3:
            if (CriarPersonagem.getMostr().size() == 0) {
                System.out.println("Não há Monstros cadastrados...");
                break;
            }
            System.out.println("\nMONSTRO CADASTRADOS");

            for (Personagem tempPer : CriarPersonagem.getMostr()) {
               System.out.println(tempPer);
           }
                break;
            case 4:

            if (CriarPersonagem.getlistaPersonagem().size() == 0) {
                System.out.println("Não há Personagens cadastrados...");
                break;
            }
        

            System.out.println("PERSONAGENS CADASTRADOS");
            for (Personagem tempPer : CriarPersonagem.getlistaPersonagem()) {
                System.out.println(tempPer);
            }
                break;

            default:
            System.out.println("erro");
                break;



        }

    }

    private static void excCad(){
               
        System.out.println("\nMENU - EXCLUIR");
        System.out.println("1) Excluir Personagem");
        System.out.println("2) Excluir Todos Personagens");
        

        int List = Console.lerInt();
        excluir(List);
    }

    private static void excluir(int List){


        switch (List) {
            case 1:

                System.out.println("\nEXCLUIR PERSONAGEM");
                System.out.println("Insira o nome do personagem");

                String nome = Console.lerString(); 

                if (CriarPersonagem.excluir(nome)) {
                    System.out.println("Personagem removido com sucesso !");   
                } else {
                    System.out.println("O Personagem " + nome + " não foi encontrado");
                }
                break; 
            case 2:
                System.out.println("\nEXCLUIR TODOS OS PERSONAGENS ? [s ou n]");

                String SouN = Console.lerString(); 


                if (SouN.equals("s")) {

                   CriarPersonagem.excluirT();
                }
    
                 else {
                    break; 
                   
                }
                break; 

            default:
            System.out.println("Erro");
                break;
        }
    }
  
    private static void Buscar(){


        System.out.print("Digite o nome do personagem: ");
        String nome = Console.lerString();

        
        boolean encontrado = CriarPersonagem.buscarPersonagem(nome);
        if (encontrado == false) {
            System.out.println("O personagem não foi encontrado.");
        }
    }

    private static void editarCad(){

        System.out.println("\nMENU - CADASTROS");
        System.out.println("1) Editar Mago");
        System.out.println("2) Editar Guerreiro");
        System.out.println("3) Editar Monstro");


        int edit = Console.lerInt();
        Editar(edit);

    }

    private static void Editar(int edit){
    
        int vida;
        String HabilidadeEspecial;
        System.out.print("Digite o nome do personagem: ");
        String nome = Console.lerString();
        boolean encontrado = CriarPersonagem.EditarPersonagem(nome);
           
        switch (edit) {
           
            case 1:
           

                if (encontrado) { 

                CriarPersonagem.excluir(nome);
                                
                System.out.println("EDITAR MAGO");
                System.out.println("Novo Nome: ");
                nome = Console.lerString();
                System.out.println("Nova Vida: ");
                vida = Console.lerInt();
                System.out.println("Nova Habilidade Especial: ");
                HabilidadeEspecial = Console.lerString();
                System.out.println("Nova Mana: ");
                int mana = Console.lerInt();
                System.out.println("Nova Elemento: ");
                String elemento = Console.lerString();

                Mago m1 = new Mago(nome, vida, HabilidadeEspecial, mana, elemento);
                CriarPersonagem.criaçao(m1);
                break;
   
            }
            case 2:

          
                if (encontrado) { 

                CriarPersonagem.excluir(nome);
                                
                System.out.println("EDITAR GUERREIRO");
                System.out.println("Novo Nome: ");
                nome = Console.lerString();
                System.out.println("Nova Vida: ");
                vida = Console.lerInt();
                System.out.println("Nova Habilidade Especial: ");
                HabilidadeEspecial = Console.lerString();
                System.out.println("Nova Força: ");
                int força = Console.lerInt();
                System.out.println("Nova Nasçao: ");
                String nasçao = Console.lerString();


                Guerreiro g1 = new Guerreiro(nome, vida, HabilidadeEspecial, força, nasçao);

                CriarPersonagem.criaçao(g1);
                }
                break;


            case 3 : 
            if (encontrado) { 

                CriarPersonagem.excluir(nome);
                                
                System.out.println("EDITAR MONSTRO");
                System.out.println("Novo Nome: ");
                nome = Console.lerString();
                System.out.println("Nova Vida: ");
                vida = Console.lerInt();
                System.out.println("Nova Habilidade Especial: ");
                HabilidadeEspecial = Console.lerString();
                System.out.println("Novo Tipo: ");
                String tipo = Console.lerString();
                System.out.println("Novo Nivel: ");
                int nivel = Console.lerInt();


                Monstro mo1 = new Monstro(nome, vida, HabilidadeEspecial, tipo, nivel);

                CriarPersonagem.criaçao(mo1);

            }
                
                break;
            default:
            System.out.println("Erro");
                break;
        }


        if (encontrado == false) {
            System.out.println("O personagem não foi encontrado.");
     
        }


    }

    public static void executar() {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            menus(op);

        } while (op != 0);

    }

    



}
