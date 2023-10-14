package semana1;
// aceite

import java.util.Scanner;

public class Mooshak121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        System.out.println(N); // Imprimir o número N

        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
            boolean ehPalindromo = isPalindromo(linha);
            System.out.println(ehPalindromo ? "sim" : "nao");
        }

        scanner.close();
    }

    public static boolean isPalindromo(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
