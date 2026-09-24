package devdojocurso.logicadeprogramacao.variaveis;

public class Calculadora {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 15;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        int restoDivisao = numero1 % numero2;

        System.out.println("A soma entre " + numero1 + " + " + numero2 + " é: " + soma);
        System.out.println("A subtração entre " + numero1 +" - " + numero2 + " é: " + subtracao);
        System.out.println("A multiplicação entre " + numero1 + " * " + numero2 + " é: " + multiplicacao);
        System.out.println("A divisão entre " + numero1 + " / " + numero2 + " é: " + divisao);
        System.out.println("O resto da divisão entre " + numero1 + " % " + numero2 + " é: " + restoDivisao);
    }
}
