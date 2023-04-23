package Inventario.Itens;

public class PocaoCura {
    private String nome = "Poção de cura";
    private int poderDeCura;

    // Getters e Setters

    public int getPoderDeCura() {
        return poderDeCura;
    }

    public void setPoderDeCura(int poderDeCura) {
        this.poderDeCura = poderDeCura;
    }

    ///////////////////////////////

    @Override
    public String toString() {
        return nome + " | " + "Poder de cura = " + poderDeCura + "\n";
    }
}
