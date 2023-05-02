import Inventario.Itens.PocaoCura;
import Inventario.Itens.PocaoDano;
import Perguntas.Perguntas;
import Personagens.Heroi;
import Personagens.Inimigos;

import java.util.ArrayList;
import java.util.Collections;
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

                // Criando o objeto 'perguntaFase1' com o construtor do molde da classe Perguntas.
                List<Perguntas> perguntaFase1 = new ArrayList();
                perguntaFase1.add(new Perguntas("Quais são as subcategorias que existem para o lixo eletrônico?\n", new String[]{"1) Linha verde, linha marrom, linha azul e linha branca", "2) Linha verde, linha marrom, linha azul e linha vermelha",
                                                "3) Linha verde, linha marrom, linha vermelha e linha preta", "4) Linha verde, linha amarela, linha roxa e linha azul "}, 1));
                perguntaFase1.add(new Perguntas("O que significa REEE?\n", new String[]{"1) Resíduos de Equipamentos Eletro-Eletrizantes", "2) Resíduos de Equipamentos Elétricos Especiais", "3) Resíduos de Equipamentos Eletrônicos",
                                                "4) Resíduos de Equipamentos Elétricos e Eletrônicos"}, 4));
                perguntaFase1.add(new Perguntas("Quais os perigos de não descartar o lixo eletrônico corretamente?\n", new String[]{"1) Ele causa doenças hepáticas, cardiovasculares e outras relacionadas ao sistema nervoso", "2) Contaminação do solo",
                                                "3) Risco de contaminar o lençol freático", "4) Risco de contaminar o lençol freático", "5) Todas as opções"}, 5));
                perguntaFase1.add(new Perguntas("Quais são os países com o maior número de lixo eletrônico no mundo?\n", new String[]{"1) EUA, Japão, China e Brasil", "2) China, EUA, Japão e Índia", "3) China e EUA", "4) Brasil, China, EUA, India e Japão"},
                                                4));

                // Criando o objeto 'perguntaFase2' com o construtor do molde da classe Perguntas.
                List<Perguntas> perguntaFase2 = new ArrayList();
                perguntaFase2.add(new Perguntas("Sabendo que cada tipo de lixo tem um destino específico, qual das associações abaixo está correta?\n", new String[]{"1) Lixo orgânico -> reciclagem.", "2) Lixo tóxico –> compostagem.",
                                                "3) Lixo eletrônico –> aterro controlado.", "4) Lixo hospitalar –> incineração.", "5) Lixo nuclear –> lixão"}, 4));
                perguntaFase2.add(new Perguntas("Qual é o principal agente poluente produzido em queima de combustível fóssil?\n", new String[]{"1) Óxidos de nitrogênio (NOx).", "2) Dióxido de carbono (CO2).",
                                                "3) Dióxido de enxofre (SO2).", "4) Partículas finas (PM2.5 e PM10).", "5) Hidrocarbonetos (HC)"}, 2));
                perguntaFase2.add(new Perguntas("Marque a opção que contenham as principais fontes de poluição da atmosfera.\n", new String[]{"1) Queima de combustíveis fósseis e emissões de gases por indústrias.",
                                                "2) Incêndios florestais e poeiras / folígens produzidas nas queimas.", "3) Poluição do solo e da água.", "4) Emissões de gases por veículos e queima de lixo.",
                                                "5) Lixo radioativo e poluição do solo"}, 3));
                perguntaFase2.add(new Perguntas("Quais das opções abaixo melhor indicam as ocorrências que se dariam com a continuação da poluição da atmosfera?\n", new String[]{"1) Aumento da biodiversidade e alcalinização dos oceanos.",
                                                "2) Redução da biodiversidade e acidificação dos oceanos.", "3) Aumento da biodiversidade e aumento da acidez dos oceanos.", "4) Redução da biodiversidade e diminuição da acidez dos oceanos.",
                                                "5) Alteração na biodiversidade (mutações) e aumento do pH dos oceanos"}, 2));

                // Criando o objeto 'perguntaFase3' com o construtor do molde da classe Perguntas.
                List<Perguntas> perguntaFase3 = new ArrayList();
                perguntaFase3.add(new Perguntas("Assinale a alternativa que NÃO indica uma consequência do aquecimento global:\n", new String[]{"1) Degelo das calotas polares.", "2) Aumento do nível dos oceanos.",
                                                "3) Intensificação dos ciclones e furacões.", "4) Compactação dos solos.", "5) Perda de fauna e flora em diversos ecossistemas."}, 4));
                perguntaFase3.add(new Perguntas("Qual conceito passou a ser amplamente debatido em relação ao meio ambiente no ano de 1990, que resultou na criação de políticas públicas e ações civis? \n\nO conceito em questão é:\n",
                                                new String[]{"1) Preservação ambiental.", "2) Desenvolvimento sustentável.", "3) Unidade de conservação.", "4) Ambientalismo.", "5) Ecologia Científica."}, 2));
                perguntaFase3.add(new Perguntas("Os conceitos abaixo estão relacionados ao meio ambiente. Apenas um está incorreto. Marque a alternativa que não relaciona o conceito correto:\n",
                                                new String[]{"1) Ecologia: ciência responsável pelo estudo das relações entre os seres vivos e o meio ambiente.",
                                                "2) Ecossistema: conjunto formado pelos seres vivos e elementos físicos com os quais interagem, compondo um sistema funcional.", "3) Habitat: ambiente em que uma espécie de organismo vivo se desenvolve, uma vez que esse local oferece as condições ideias para tal.",
                                                "4) Desenvolvimento sustentável: modelo de desenvolvimento socioeconômico a ser implantado nos países para garantir a conservação do meio ambiente junto do seu crescimento econômico e avanço nas pautas sociais.",
                                                "5) Sustentabilidade: garantia de preservação ambiental em locais protegidos por lei."}, 5));
                perguntaFase3.add(new Perguntas("Segundo a Organização das Nações Unidas (ONU), o ___________ é definido como o conjunto de elementos e processos biológicos, químicos e físicos que orientam e criam as condições necessárias para a manutenção da vida no planeta Terra. \n\nMarque a alternativa que completa corretamente a lacuna:\n",
                                                new String[]{"1) Ecossistema.", "2) Bioma.", "3) Meio ambiente.", "4) Domínio morfoclimático.", "5) Espaço geográfico"}, 3));

                // Criando o objeto 'perguntaFase4' com o construtor do molde da classe Perguntas.
                List<Perguntas> perguntaFase4 = new ArrayList();
                perguntaFase4.add(new Perguntas("Das opções abaixo, a que não representa um impacto ambiental é:\n", new String[]{"1) Chuva ácida.", "2) Assoreamento dos rios.",
                                                "3) Desertificação.", "4) Poluição sonora.", "5) Mobilidade urbana"}, 5));
                perguntaFase4.add(new Perguntas("O _________ é um dos principais problemas ambientais no Brasil que acontece desde a chegada dos portugueses em 1500. \n\nDas alternativas abaixo, a que preenche corretamente a lacuna é:\n",
                                                new String[]{"1) Assoreamento.", "2) Efeito estufa.", "3) Desmatamento.", "4) Empobrecimento do solo.", "5) Uso de agrotóxicos"}, 3));
                perguntaFase4.add(new Perguntas("Sobre as queimadas, é incorreto afirmar:\n", new String[]{"1) Uma das consequências das queimadas é a mudança da temperatura e umidade do solo.",
                                                "2) As queimadas somente acontecem de maneira intencional, ou seja, por pessoas que provocam os incêndios.", "3) As queimadas intensificam o efeito estufa e o aquecimento global.", "4) Diversas práticas agrícolas estão relacionadas com as causas das queimadas.",
                                                "5) As queimadas trazem alguns benefícios tais como a limpeza e a fertilização do solo"}, 2));
                perguntaFase4.add(new Perguntas("As ilhas de calor representam um dos problemas ambientais urbanos. Esse fenômeno climático acontece devido:\n", new String[]{"1) Ao aumento das queimadas nas zonas rurais.",
                                                "2) A diminuição da densidade demográfica dos centros urbanos.", "3) Ao aumento da inversão térmica nas cidades.", "4) A elevação das temperaturas em algumas zonas urbanas.",
                                                "5) Aos microclimas periféricos que afetam diretamente as cidades."}, 4));

                // Criando o objeto 'perguntaFase5' com o construtor do molde da classe Perguntas.
                List<Perguntas> perguntaFase5 = new ArrayList();
                perguntaFase5.add(new Perguntas("Associe as duas colunas, relacionando o objeto ao respectivo recurso natural que será preservado coma sua reciclagem. \n\n" +
                                                "A. Pneu Usado       ( ) Vegeração\nB. Caderno velho    ( ) Areia\nC. Vidro quebrado   ( ) Alumínio\nD. Lata de refrigerante ( ) Petróleo\n\nA sequência correta dessa associação de cima para baixo, é:\n",
                                                new String[]{"1) 1, 3, 4, 2.", "2) 2, 3, 4, 1.", "3) 2, 4, 3, 1.", "4) 4, 2, 1, 3."}, 2));
                perguntaFase5.add(new Perguntas("São considerados resíduos orgânicos:\n",
                                                new String[]{"1) Folhas, restos de alimentos e vidro.", "2) Galhos de árvores, restos de alimentos e cascas de frutas.", "3) Vidro, papel e alumínio.", "4) Restos de alimentos, galhos de árvores e alumínio."}, 2));
                perguntaFase5.add(new Perguntas("Utilizar potes de sorvete para guardar comida é um exemplo de:\n", new String[]{"1) Coleta seletiva do lixo.",
                                                "2) Incineração do lixo.", "3) Reciclagem do lixo.", "4) Reutilização do lixo."}, 4));
                perguntaFase5.add(new Perguntas("É considerado o material mais rentável no processo de reciclagem:\n", new String[]{"1) Ferro.",
                                                "2) Plástico.", "3) Alumínio.", "4) Papel branco."}, 3));
                perguntaFase5.add(new Perguntas("A poluição radioativa é considerada um dos piores tipos de poluição, pois:\n", new String[]{"1) Provoca o desmatamento da cobertura vegetal.", "2) Acelera o processo de desertificação do planeta.",
                                                "3) Utiliza elementos artificiais criados em laboratório.", "4) Libera gases e elementos tóxicos na atmosfera.", "5) Aquece os mares e os oceanos provocando a extinção de espécies"}, 4));

                // Embaralhamento da ordem das perguntas.
                Collections.shuffle(perguntaFase1);
                Collections.shuffle(perguntaFase2);
                Collections.shuffle(perguntaFase3);
                Collections.shuffle(perguntaFase4);
                Collections.shuffle(perguntaFase5);

                

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
