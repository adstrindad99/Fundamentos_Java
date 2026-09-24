package devdojocurso.logicadeprogramacao.variaveis;

public class SaldoBancario {
    public static void main(String[] args) {
        double saldo = 1000.00;
        System.out.println("Seu saldo é: R$" + saldo);
        System.out.println("__________________________________");
        System.out.println("Depósito de R$500,00 realizado com sucesso.");
        saldo += 500.00;
        System.out.println("Seu saldo é: R$" + saldo);
        System.out.println("__________________________________");
        System.out.println("Pagamento de R$320,00 realizado com sucesso.");
        saldo -= 320.00;
        System.out.println("Seu saldo é: R$" + saldo);
        System.out.println("__________________________________");
        System.out.println("Seu saldo final é: R$" + saldo);
    }
}