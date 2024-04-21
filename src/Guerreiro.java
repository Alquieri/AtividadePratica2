public class Guerreiro extends Personagem {

    int força;
    String naçao;

    public Guerreiro() {
    }

    public Guerreiro(int força, String naçao) {
        this.força = força;
        this.naçao = naçao;
    }

    public Guerreiro(String nome, int vida, String habilidadeEspecial, int força, String naçao) {
        super(nome, vida, habilidadeEspecial);
        this.força = força;
        this.naçao = naçao;
    }
    

    

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public String getNaçao() {
        return naçao;
    }

    public void setNaçao(String naçao) {
        this.naçao = naçao;
    }

    @Override
    public String toString() {
       
        return super.toString() + "\nQuantidade de Força: " + força + "\nNação pertencente: " + naçao;
    }

 
    

}
