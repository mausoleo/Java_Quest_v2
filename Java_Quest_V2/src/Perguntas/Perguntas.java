package Perguntas;

public class Perguntas {
    protected String pergunta; // A pergunta que será apresentada.
    protected String[] respostas; // Array que irá armazenar as respostas a serem apresentadas.
    private int respostaCorreta; // Variável para ser usada como armazenamento da resposta correta.

    // Construtor costumizado para gerá-lo já com a pergunta, respostas e resposta correta.
    public Perguntas(String pergunta, String[] respostas, int respostaCorreta) {
        this.pergunta = pergunta;
        this.respostas = respostas;
        this.respostaCorreta = respostaCorreta;
    }

    // Método para apresentar a pergunta e suas respectivas respostas.
    public void mostrarPergunta() {
        System.out.println(pergunta);
        for (String resposta: respostas) {
            System.out.println(resposta);
        }
    }

    // Método para retornar um True ou False quanto a resposta dada e a correta. Será usada em uma condicional na aplicação.
    public boolean verificarResposta(int resposta) {
        return resposta == respostaCorreta;
    }
}
