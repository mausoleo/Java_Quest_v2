package Personagens;

public class Inimigos extends Personagens{
    protected int vida;
    protected int poderDeAtaque;
    protected int xpDropavel;
    protected boolean status;

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    @Override
    public void setPoderDeAtaque(int poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }

    public int getXpDropavel() {
        return xpDropavel;
    }

    public void setXpDropavel(int xpDropavel) {
        this.xpDropavel = xpDropavel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
