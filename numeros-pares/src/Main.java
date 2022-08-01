import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, pares;

        System.out.print("Quantos numeros voce vai digitar: ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        pares = 0;

        System.out.println();
        System.out.println("NUMEROS PARES:");

        for (int i=0; i<n; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + "  ");
                pares++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + pares);

        sc.close();
    }
}
