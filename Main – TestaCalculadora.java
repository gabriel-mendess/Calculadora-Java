import java.util.Scanner;

public class TestaCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operador;

        System.out.println("Bem-vindo à calculadora minha Calculadora, feita pelo Gabriel! Digite '.' para sair.");

        while (true) {
            System.out.print("Digite o operador (+, -, *, /) ou '.' para sair: ");
            operador = scanner.next();

            if (operador.equals(".")) {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            Calculadora calculadora = new Calculadora(num1, num2);

            switch (operador) {
                case "+":
                    System.out.println("Resultado: " + calculadora.some());
                    break;
                case "-":
                    System.out.println("Resultado: " + calculadora.subtraia());
                    break;
                case "*":
                    System.out.println("Resultado: " + calculadora.multiplique());
                    break;
                case "/":
                    try {
                        System.out.println("Resultado: " + calculadora.divida());
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Operador inválido");
            }
        }
        scanner.close();
    }
}
