public class Monstro extends Personagem {

    String tipo;
    int nivel;

    
    public Monstro() {
    }
    
    public Monstro(String tipo, int nivel) {
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public Monstro(String nome, int vida, String habilidadeEspecial, String tipo, int nivel) {
        super(nome, vida, habilidadeEspecial);
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nTipo: " + tipo + "\nNivel: " + nivel;
    }

    

}
