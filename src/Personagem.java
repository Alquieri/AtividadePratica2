public class Personagem {


    String nome;
    int vida;
    String HabilidadeEspecial;

    

    public Personagem() {
    }
    public Personagem(String nome, int vida, String habilidadeEspecial) {
        this.nome = nome;
        this.vida = vida;
        HabilidadeEspecial = habilidadeEspecial;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getHabilidadeEspecial() {
        return HabilidadeEspecial;
    }
    public void setHabilidadeEspecial(String habilidadeEspecial) {
        HabilidadeEspecial = habilidadeEspecial;
    }

 



    @Override
    public String toString() {
        
        return "\nNome: " + nome + "\nVida: " + vida + "\nHabilidade Especial: " + HabilidadeEspecial ;
    }


    

}
