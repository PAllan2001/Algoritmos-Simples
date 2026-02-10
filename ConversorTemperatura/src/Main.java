
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Digite a temperatura: ");
                double temperatura = sc.nextDouble();

                System.out.println("Informe a unidade de origem:");
                System.out.println("C - Celsius");
                System.out.println("F - Fahrenheit");
                System.out.println("K - Kelvin");
                System.out.print("Escolha: ");
                char unidade = sc.next().toUpperCase().charAt(0);

                double celsius = 0;

                switch (unidade) {
                    case 'C':
                        celsius = temperatura;
                        break;

                    case 'F':
                        celsius = (temperatura - 32) * 1.8;
                        break;

                    case 'K':
                        celsius = temperatura - 273.15;
                        break;

                    default:
                        System.out.println("Unidade inválida!");
                        sc.close();
                        return;
                }

                double fahrenheit = (celsius * 1.8) + 32;
                double kelvin = celsius + 273.15;

                System.out.println("\n=== RESULTADOS ===");
                System.out.println("Celsius: " + celsius + " °C");
                System.out.println("Fahrenheit: " + fahrenheit + " °F");
                System.out.println("Kelvin: " + kelvin + " K");

                sc.close();



            }
        }
