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


    ///////////////////////////////////////////

    // Método para calcular o dano recebido do inimigo;
    @Override
    public void levarDano(int danoRecebido) {
        escreverColorido("azul", "O inimigo levou " + danoRecebido + " de dano!");
        escreverColorido("vermelho", "Vida anterior do inimigo: " + getVida());
        this.vida -= danoRecebido;
        escreverColorido("vermelho", "Vida atual do inimigo: " + getVida());
        System.out.println(/*ESPAÇO*/);
    }

    // Método para retornar o valor do dano do inimigo;
    @Override
    public int atacar() {
        return poderDeAtaque;
    }
}
