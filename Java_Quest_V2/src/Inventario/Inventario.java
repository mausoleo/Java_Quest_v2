package Inventario;

import Inventario.Itens.PocaoCura;
import Inventario.Itens.PocaoDano;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<PocaoCura> pocoesDeCura = new ArrayList<>();
    List<PocaoDano> pocoesDeDano = new ArrayList<>();

    // Getters e Setters

    public List<PocaoCura> getPocoesDeCura() {
        return pocoesDeCura;
    }

    public List<PocaoDano> getPocoesDeDano() {
        return pocoesDeDano;
    }

    /////////////////////////////////

    public void adicionarPocaoDeCura(PocaoCura pocaoCura) {
        pocoesDeCura.add(pocaoCura);
    }

    public void adicionarPocaoDeDano(PocaoDano pocaoDano) {
        pocoesDeDano.add(pocaoDano);
    }
}
