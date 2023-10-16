package pratica2;
import java.util.Scanner;

public class Mooshak244 {
    static boolean isPrime(int n) {
        if(n%2 == 0 && n > 3){
            return false;
        }
        if(n%3 == 0 && n > 3){
            return false;
        }
	    for(int i = n-1; i>1;i--){
            if((n%i) == 0){
                return false;
            }
        }
        return true;
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                sum = sum + 1;
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}
