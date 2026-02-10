import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Sua idade ");
            int idade = sc.nextInt();

        System.out.print("Você é emancipado? (true/false): ");
            boolean emancipado = sc.nextBoolean();


        System.out.print("Você é ja tem  carteira de habilitação? (true/false): ");
            boolean habilitado = sc.nextBoolean();

        if(idade>= 18 || (idade >= 16 && emancipado)|| habilitado){
            System.out.println("Voce tem permissao para dirigir ");

            System.out.println("Ha quantos meses voce tem habilitação");
                int TempoHabilitado = sc.nextInt();
                    if(TempoHabilitado < 12){
                        System.out.println("Cuidado Voce ainda esta na provisoria(qualquer multa perde sua habilitação)");
            }       else {
                        System.out.println("Voce ja tem a habilitação definitiva");
            }
        }
        else{
            System.out.println("Voce ainda nao tem permissao para dirigir");
        }

        }
    }
