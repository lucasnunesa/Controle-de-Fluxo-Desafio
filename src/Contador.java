import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1, number2;

        System.out.println("Digite o primeiro numero: ");
        number1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        number2 = scanner.nextInt();

        try {
            contar(number1, number2);
        } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

    }

    static void contar (int number1, int number2) throws ParametrosInvalidosException {
        if (number1 > number2) {
            throw new ParametrosInvalidosException();
        } else {
        int contagem = number2 - number1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }

        }
    }
}

