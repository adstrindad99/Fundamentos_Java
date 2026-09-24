package devdojocurso.logicadeprogramacao.variaveis;

public class StatusPontuacaoDeJogo {
    public static void main(String[] args) {
        String status = "Em jogo";
        int pontos = 0;
        int nivel = 1;

        System.out.println("---Fase 1---");
        System.out.println("Status: " + status + " | Pontos: " + pontos + " | Nível: " + nivel);
        System.out.println("_______________________________________________");
        System.out.println("---Fase 2---");
        System.out.println("Você derrotou o adversário!");
        pontos += 1500;
        nivel += 2;
        System.out.println("Status: " + status + " | Pontos: " + pontos + " | Nível: " + nivel);
        System.out.println("_______________________________________________");
        System.out.println("Você recebeu dano do adversário!");
        pontos = pontos /2;
        status = "Game Over";
        System.out.println("Status: " + status + " | Pontos: " + pontos + " | Nível: " + nivel);
    }
}