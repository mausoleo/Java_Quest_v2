package Personagens;

public class Personagens {
    protected int vida;
    protected int poderDeAtaque;

    // Getters e Setters//

    // Retornar o valor da vida;
    public int getVida() {
        return vida;
    }

    // Definir a vida;
    public void setVida(int vida) {
        this.vida = vida;
    }

    // Retornar o valor do poder de ataque;
    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    // Definir o poder de ataque;
    public void setPoderDeAtaque(int poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }

    ////////////////////////////////////////////

    // Métodos

    // Método que faz a lógica de um personagem levar dano;
    public void levarDano(int danoRecebido) {
        this.vida -= danoRecebido;
    }

    // Método que se refere ao ataque, voltando o valor do seu dano;
    public int atacar() {
        return poderDeAtaque;
    }















    // Função para escrever colorido

    public static void escreverColorido(String cor, String seuTextoAqui) {
        String CSI = "\u001B[";

        if (cor.equalsIgnoreCase("vermelho")) {
            System.out.print (CSI + "31" + "m");
            System.out.println(seuTextoAqui);
            System.out.print (CSI + "m");
        } else if (cor.equalsIgnoreCase("azul")) {
            System.out.print (CSI + "34" + "m");
            System.out.println(seuTextoAqui);
            System.out.print (CSI + "m");
        } else if (cor.equalsIgnoreCase("verde")) {
            System.out.print (CSI + "32" + "m");
            System.out.println(seuTextoAqui);
            System.out.print (CSI + "m");
        } else if (cor.equalsIgnoreCase("amarelo")) {
            System.out.print (CSI + "33" + "m");
            System.out.println(seuTextoAqui);
            System.out.print (CSI + "m");
        }
    }
}
