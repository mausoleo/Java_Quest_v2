import Inventario.Itens.PocaoCura;
import Inventario.Itens.PocaoDano;
import Personagens.Heroi;
import Personagens.Inimigos;

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

            /*Condicional que irá encaminhas o jogo, se for 1 o jogo irá iniciar, se for 2 irá para o sobre
            * e 3 fará com que o jogo se encerre*/
            if (decisao == 1) {
                // Convocação das classes necessárias
                Heroi heroi = new Heroi();
                List<Inimigos> inimigos = new ArrayList();

                PocaoCura pocaoCura = new PocaoCura();
                PocaoDano pocaoDano = new PocaoDano();
                List<PocaoCura> pocoesCura = new ArrayList();
                List<PocaoDano> pocoesDano = new ArrayList();

                for (int i=0; i<4; i++) {
                    Inimigos inimigo = new Inimigos();
                    inimigos.add(inimigo);
                }

                // Menu para a escolha de dificuldade do game.
                System.out.println("Qual dificuldade você quer escolher?");
                System.out.println("[1] Fácil");
                System.out.println("[2] Médio");
                System.out.println("[3] Difícil");
                System.out.print("Decisão: ");
                int decisaoDificuldade = sc.nextInt();
                System.out.println(/*ESPAÇO*/);

                // Método de repetição para verificar se é uma resposta existente.
                while (decisaoDificuldade != 1 && decisaoDificuldade != 2 && decisaoDificuldade != 3) {
                    escreverColorido("vermelho", "Escolha uma opção existente!");
                    System.out.print("Decisão: "); decisaoDificuldade = sc.nextInt();
                    System.out.println(/*ESPAÇO*/);
                }

                if (decisaoDificuldade == 1) { // Atributos e itens que irá ter caso o jogador queira jogar no fácil.
                    heroi.setVida(15);
                    heroi.setPoderDeAtaque(4);
                    heroi.setXpNecessarioParaUpar(4);

                    for (Inimigos enemies: inimigos) {
                        enemies.setPoderDeAtaque(2);
                        enemies.setVida(8);
                        enemies.setXpDropavel(4);
                    }

                    for (int i=0; i<3; i++) {
                        pocoesCura.add(pocaoCura);
                    }
                    pocoesDano.add(pocaoDano);

                } else if (decisaoDificuldade == 2) { // Atributos e itens que irá ter caso o jogador queira jogar no médio.
                    heroi.setVida(12);
                    heroi.setPoderDeAtaque(3);
                    heroi.setXpNecessarioParaUpar(5);

                    for (Inimigos enemies: inimigos) {
                        enemies.setPoderDeAtaque(3);
                        enemies.setVida(8);
                        enemies.setXpDropavel(3);
                    }

                    for (int i=0; i<2; i++) {
                        pocoesCura.add(pocaoCura);
                    }
                } else { // Atributos e itens que irá ter caso o jogador queira jogar no difícil.
                    heroi.setVida(10);
                    heroi.setPoderDeAtaque(2);
                    heroi.setXpNecessarioParaUpar(6);

                    for (Inimigos enemies: inimigos) {
                        enemies.setPoderDeAtaque(4);
                        enemies.setVida(8);
                        enemies.setXpDropavel(2);
                    }
                    pocoesCura.add(pocaoCura);
                }
                















            // O usuário só irá aqui para baixo a partir do Menu principal, escolhendo "Sobre" ou "Sair".
            } else if (decisao == 2){
                int decisaoVoltarMenu;
                escreverColorido("azul", "JavaQuest é um jogo RPG que simula os clássicos como Dunnet e Zork.");
                escreverColorido("azul", "Nele, você interpreta o herói que vive em São Paulo, uma cidade que");
                escreverColorido("azul", "corre perigo pelos seres poluentes que querem a destruição da mesma.");
                escreverColorido("azul", "Dessa forma, você deve enfrentá-los acertando as perguntas que são");
                escreverColorido("azul", "coerentes a uma boa conduta ambiental, caso erre alguma delas, você");
                escreverColorido("azul", "irá levar dano do inimigo, caso acerte, você que irá dar o dano. Boa sorte!");
                System.out.println(/*ESPAÇO*/);
                System.out.println("Voltar [0]");
                System.out.print("Decisão: ");
                decisaoVoltarMenu = sc.nextInt();
                System.out.println(/*ESPAÇO*/);

                while (decisaoVoltarMenu != 0) {
                    escreverColorido("vermelho", "Escolha uma opção existente!");
                    System.out.print("Decisão: ");
                    decisaoVoltarMenu = sc.nextInt();
                    System.out.println(/*ESPAÇO*/);
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
