import Inventario.Inventario;
import Inventario.Itens.PocaoCura;
import Inventario.Itens.PocaoDano;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Boolean responsável pelo status do jogo, se ele irá rodar.
        boolean condicaoJogo = true;



        // Looping do jogo.
        do {

            escreverColorido("verde", "Seja bem vindo ao Java Quest!");
            System.out.println("[1] Iniciar");
            System.out.println("[2] Sobre");
            System.out.println("[3] Sair");
            System.out.print("Decisão: ");
            int decisao = sc.nextInt();
            System.out.println(/*ESPAÇO*/);


            // Método de repetição para verificar se é uma resposta existente.
            while (decisao != 1 && decisao !=2 && decisao != 3) {
                escreverColorido("vermelho", "Escolha uma opção existente!");
                System.out.print("Decisão: ");
                decisao = sc.nextInt();
                System.out.println(/*ESPAÇO*/);
            }

            if (decisao == 1) { // Se for 1, irá começar o jogo

            } else if (decisao == 2){
                int decisaoVoltarMenu;
                System.out.println("com certeza esse é um jogo");
                System.out.println("Voltar [1]");
                System.out.print("Decisão: ");
                decisaoVoltarMenu = sc.nextInt();

                while (decisaoVoltarMenu != 1) {
                    System.out.println(/*ESPAÇO*/);
                    escreverColorido("vermelho", "Escolha uma opção existente!");
                    System.out.print("Decisão: ");
                    decisaoVoltarMenu = sc.nextInt();
                }
            } else {
                condicaoJogo = false;
                escreverColorido("vermelho", "Você saiu do jogo!");
            }


        } while (condicaoJogo); // Se a condicaoJogo for falsa, o looping irá parar e sair do laço.



        sc.close();
    }




















    // Função para escrever colorido.

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
