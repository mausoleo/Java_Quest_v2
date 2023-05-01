package Inventario.Itens;

public class PocaoDano {
    private String nome = "Poção de dano";
    private int poderDeDano = 3;

    // Getters e Setters

    public int getPoderDeDano() {
        return poderDeDano;
    }

    public void setPoderDeDano(int poderDeDano) {
        this.poderDeDano = poderDeDano;
    }

    ////////////////////////////////////

    @Override
    public String toString() {
        return nome + " | " + "Poder de dano = " + poderDeDano + "\n";
    }
}
