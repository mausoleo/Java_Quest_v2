import Inventario.Inventario;
import Inventario.Itens.PocaoCura;
import Inventario.Itens.PocaoDano;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        PocaoCura pocaoCura = new PocaoCura();
        PocaoDano pocaoDano = new PocaoDano();

        inventario.adicionarPocaoDeDano(pocaoDano);
    }
}
