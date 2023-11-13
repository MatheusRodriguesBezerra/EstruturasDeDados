// aceite

import java.util.Scanner;

public class Mooshak183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        values[0] = scanner.nextInt();
        int max = values[0];
        int min = values[0];
        int sum = values[0];

        for(int i = 1; i<n; i++){
            values[i] = scanner.nextInt();
            if(values[i] > max){
                max = values[i];
            }
            if(values[i] < min){
                min = values[i];
            }
            sum = sum + values[i];
        }
        float media = (float)sum / (float)n;
        System.out.printf("%.2f%n", media);
        System.out.printf("%d%n", max-min);

        scanner.close();
    }
}
