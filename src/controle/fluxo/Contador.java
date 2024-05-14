package controle.fluxo;

import controle.fluxo.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            exception.printStackTrace();
        } finally {
            terminal.close();
        }
    }

    private static void contar(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}