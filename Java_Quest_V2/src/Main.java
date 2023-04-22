import Personagens.*;

public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        Inimigos inimigos = new Inimigos();
        inimigos.setPoderDeAtaque(5);

        heroi.setXp(10);
        heroi.setXpNecessarioParaUpar(5);
        heroi.subirDeNivel();



        heroi.levarDano(inimigos.getPoderDeAtaque());

        heroi.receberMoedas(10);

        heroi.curar(5);

        heroi.fortificar(5);

        heroi.morrer();
    }

}