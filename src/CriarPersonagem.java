import java.util.ArrayList;
import java.util.List;

public class CriarPersonagem {


    private static List<Personagem> listaPersonagem = new ArrayList<>();

    public static void criaçao(Personagem p1){
        listaPersonagem.add(p1);
    }

    public static List<Personagem> getlistaPersonagem(){
        return listaPersonagem;
    }

    public static List<Personagem> getMago() {
        List<Personagem> tempList = new ArrayList<>();

        for(Personagem tempPers: listaPersonagem) {
            if (tempPers instanceof Mago) {
                tempList.add(tempPers);
            }
        }

        return tempList;
    }

    public static List<Personagem> getGuer() {
        List<Personagem> tempList = new ArrayList<>();

        for(Personagem tempPers: listaPersonagem) {
            if (tempPers instanceof Guerreiro) {
                tempList.add(tempPers);
            }
        }

        return tempList;
    }

    public static List<Personagem> getMostr() {
        List<Personagem> tempList = new ArrayList<>();

        for(Personagem tempPers: listaPersonagem) {
            if (tempPers instanceof Monstro) {
                tempList.add(tempPers);
            }
        }

        return tempList;


    }

    public static boolean buscarPersonagem(String nome) {

        for (Personagem tempPers : listaPersonagem) {

            if (tempPers.getNome().equals(nome)) {
                System.out.println("Personagem encontrado !");
                System.out.println(tempPers);
                return true;

            }
        }
        System.out.println("Personagem não encontrado");
        return false;
    }

    public static boolean EditarPersonagem(String nome) {

        for (Personagem tempPers : listaPersonagem) {

            if (tempPers.getNome().equals(nome)) {                        
                System.out.println(tempPers);
                return true;


            }
        }
        System.out.println("Personagem não encontrado");
        return false;
    }

    public static boolean excluir(String nome) {

        for (Personagem tempPers : listaPersonagem){
            if (tempPers.getNome().equals(nome)) {
                listaPersonagem.remove(tempPers);
                return true;
            }
        }

        return false;

    }

    public static void excluirT() {

        System.out.println("\nEXCLUIR TODOS OS PERSONAGENS");
        
        listaPersonagem.clear();
        System.out.println("Todos os personagens foram removidos com sucesso !");

    }
    

}
