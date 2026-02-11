import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o n° que voce quer começar a contagem ");
        int n1 = sc.nextInt();
        System.out.println("agora digite em que numero vc quer terminar ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }


        System.out.println("================MENU===============");
        System.out.println("1 - se quiser fazer uma contagem do menor para o maior");
        System.out.println("2 - se quiser fazer uma contagem do maior para o menor");
        System.out.println("3 - se quiser fazer uma contagem do menor para o maior somente com numeros pares ");
        System.out.println("4 - se quiser fazer uma contagem do menor para o maior somente com numeros impares");
        System.out.println("5 - se quiser fazer uma contagem do maior para o menor somente com numeros pares");
        System.out.println("6 - se quiser fazer uma contagem do maior para o menor somente com numeros impares");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                for (int i = n1; i <= n2; i++) {
                    System.out.println("i = " + i);
                }
                break;
            case 2:
                for (int i = n2; i >= n1; i--) {
                    System.out.println("i = " + i);
                }
                break;

            case 3:
                for (int i = n1; i <= n2; i++) {
                    if (i % 2 == 0) {
                        System.out.println("i = " + i);
                    }
                }
                break;
            case 4:
                for (int i = n1; i <= n2; i++) {
                    if (i % 2 != 0) {
                        System.out.println("i = " + i);
                    }
                }
                break;
            case 5:
                for (int i = n2; i >= n1; i--) {
                    if (i % 2 == 0) {
                        System.out.println("i = " + i);
                    }
                }
                break;
            case 6:
                for (int i = n2; i >= n1; i--) {
                    if (i % 2 != 0) {
                        System.out.println("i = " + i);
                    }
                }
                break;

            default:
                System.out.println("opcao invalida");
        }
    }
}