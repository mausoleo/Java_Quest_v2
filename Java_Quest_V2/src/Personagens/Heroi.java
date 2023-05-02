package Personagens;

public class Heroi extends Personagens{
    private int vida;
    private int poderDeAtaque;
    private int nivel = 1;
    private int xp;
    private int xpNecessarioParaUpar;
    private int bolsaDeMoedas;
    private boolean status = true;

    // Getters e Setters

    // Sobrescrita para retornar o valor da vida do heroi;
    @Override
    public int getVida() {
        return vida;
    }

    // Sobrescrita para definir a vida do heroi;
    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    // Socrescrita para retornar o valor do poder de ataque do herói;
    @Override
    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    // Sobrescrita para definir o poder de ataque;
    @Override
    public void setPoderDeAtaque(int poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getXpNecessarioParaUpar() {
        return xpNecessarioParaUpar;
    }

    public void setXpNecessarioParaUpar(int xpNecessarioParaUpar) {
        this.xpNecessarioParaUpar = xpNecessarioParaUpar;
    }

    public int getBolsaDeMoedas() {
        return bolsaDeMoedas;
    }

    public void setBolsaDeMoedas(int bolsaDeMoedas) {
        this.bolsaDeMoedas = bolsaDeMoedas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //////////////////////////////////////////////////


    // Método para calular o dano e o texto que o herói irá receber;
    @Override
    public void levarDano(int danoRecebido) {
        escreverColorido("vermelho", "Você recebeu " + danoRecebido + " de dano!");
        escreverColorido("verde", "Vida anterior: " + getVida());
        this.vida -= danoRecebido;
        escreverColorido("verde", "Vida atual: " + getVida());
        System.out.println(/*ESPAÇO*/);
    }

    // Método para retornar o valor do poder de ataque;
    @Override
    public int atacar() {
        return poderDeAtaque;
    }

    /* Métodos para subir de nível. Ele irá verificar se no final da batalha você tem o XP necessário,
    caso não tenha, você não irá subir de nível; */
    public void subirDeNivel() {
        if (getXp() >= getXpNecessarioParaUpar()) {
            setXp(getXp() - getXpNecessarioParaUpar()); // Fará com que o XP não resete quando você subir de nível;

            escreverColorido("azul", "Você subiu de nível!\n" +
                    "Nivel anterior: " + getNivel());
            this.nivel++;
            escreverColorido("azul", "Nível atual: " + getNivel());

            this.xpNecessarioParaUpar += 3;
        }
        System.out.println(/*ESPAÇO*/);
    }

    // Método para receber moedas;
    public void receberMoedas(int moedasGanhas) {
        escreverColorido("amarelo", "Você recebeu " + moedasGanhas + " moedas!");
        escreverColorido("amarelo", "Bolsa de moedas antes: " + getBolsaDeMoedas());
        this.bolsaDeMoedas += moedasGanhas;
        escreverColorido("amarelo", "Bolsa de moedas agora: " + getBolsaDeMoedas());

        System.out.println(/*ESPAÇO*/);
    }

    // Método para perder moedas;
    public void perderMoedas(int moedas) {
        this.bolsaDeMoedas -= moedas;
    }

    // Método para quando se usa a poção de vida;
    public void curar(int pocaoDeVida) {
        System.out.println(/*ESPAÇO*/);
        escreverColorido("azul", "Você usou uma poção de vída!");
        System.out.print(getVida());
        this.vida += pocaoDeVida;
        escreverColorido("verde", " -> " + getVida());

        System.out.println(/*ESPAÇO*/);
    }

    // Método para quando se usa a poção de força;
    public void fortificar(int pocaoDeForca) {
        System.out.println(/*ESPAÇO*/);
        escreverColorido("azul", "Você usou uma poção de força permanente!");
        System.out.print(getPoderDeAtaque());
        this.poderDeAtaque += pocaoDeForca;
        escreverColorido("verde", " -> " + getPoderDeAtaque());

        System.out.println(/*ESPAÇO*/);
    }

    // Método que será aplicado dentro de uma condição para caso o herói morra;
    public void morrer() {
        escreverColorido("vermelho", "Você morreu!");
        setStatus(false);
    }
}
