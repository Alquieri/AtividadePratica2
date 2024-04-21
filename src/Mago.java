public class Mago extends Personagem{

    int mana;
    String elemento;


    public Mago() {
    }

    public Mago(int mana, String elemento) {
        this.mana = mana;
        this.elemento = elemento;
    }


    public Mago(String nome, int vida, String habilidadeEspecial, int mana, String elemento) {
        super(nome, vida, habilidadeEspecial);
        this.mana = mana;
        this.elemento = elemento;
    }


    public int getMana() {
        return mana;
    }


    public void setMana(int mana) {
        this.mana = mana;
    }


    public String getElemento() {
        return elemento;
    }


    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

   


    


    @Override
    public String toString() {
        
        return super.toString() +
        "\nQuantidade de mana: " + mana +"\nElemento: " + elemento;
    }

    


    

}
