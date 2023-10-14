package aula1;

public class Primes {
    // Verifica se o número n é primo (apenas divisível por 1 e por si próprio)
    // [função ainda por completar]
    static boolean isPrime(int n) {
	    for(int i = n-1; i>1;i--){
            if((n%i) == 0){
                return false;
            }
        }
        return true;
    };
    
    public static void main(String[] args) {
	
        int n=1000; // Limite dos números
        
        for (int i=2; i<=n; i++){
            if (isPrime(i)){
                System.out.println(i);
            };
        };
    };
}
