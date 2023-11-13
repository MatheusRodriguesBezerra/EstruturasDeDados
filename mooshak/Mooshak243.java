// aceite

import java.util.Scanner;

public class Mooshak243 {
    static boolean find(int[] b, int[] a) {
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(b[j] == a[i]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        
        for(int i=0; i<N; i++){
            a[i] = scanner.nextInt();
        }

        int P = scanner.nextInt();
        int K;
        int sum = 0;
        for(int i=0; i<P; i++){
            K = scanner.nextInt();
            int[] b = new int[K];
            for(int j=0; j<K; j++){
                b[j] = scanner.nextInt();          
            }
            if(find(b,a) == false){
                sum = sum + 1;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
