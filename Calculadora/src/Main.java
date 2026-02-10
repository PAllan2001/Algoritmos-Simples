import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Insira um numero ");
                double num1 = sc.nextDouble();

                System.out.println("Insira Outro Numero");
                double num2 = sc.nextDouble();

                System.out.println("====Escolha uma opção:====");
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("0 - Sair");

                int opcao = sc.nextInt();
                switch (opcao) {

                    case 1:
                        System.out.println("O resultado da soma é  " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("o resultado da subtração é " + (num1 - num2));
                        break;
                    case 3:
                        if (num1 == 0 || num2 == 0) {
                            System.out.println("qualquer multiplicação por 0, resultado sera 0");
                        } else {
                            System.out.println("o resultado da multiplicação é " + (num1 * num2));
                        }
                        break;
                    case 4:
                        System.out.println("o resultado da divisão é " + (num1 / num2));
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;

                    case 0:
                        System.out.println("Sair do programa ...");

                    default:
                        System.out.println("opção invalida");
                }
            }
        }

