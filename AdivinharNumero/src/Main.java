import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int nSecreto = rand.nextInt(50) + 1;
        int nTentativa = 0;
        int nDigitado;

        System.out.println("Um numero aleatorio sera gerado e voce tera que adivinhar , voce tera 5 nTentativas");
        System.out.println("Aperte enter para prosseguir ");
        sc.nextLine();

        while (nTentativa < 5) {
            System.out.print("Digite seu palpite: ");
            nDigitado = sc.nextInt();
            nTentativa++;
            {

                if (nDigitado < 1 || nDigitado > 50) {
                    System.out.println("O Numero tem que estar entre 1 e 50");
                    nTentativa = nTentativa - 1;
                    continue;
                }
            }

            if (nDigitado == nSecreto) {
                System.out.println("Voce acertou");
            }
            else if (nDigitado < nSecreto){
                System.out.println("O N° é maior ");
            }
            else {
                System.out.println("O N° é menor ");
            }

            System.out.println("Tentativas restantes: " + (5 - nTentativa));
            }
        if(nTentativa == 5){
            System.out.println("Voce perdeu , o N° era " + nSecreto);
        }

    }

}

