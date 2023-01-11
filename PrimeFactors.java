public class PrimeFactors {
    static boolean isPrime(int m){
        if(m == 1)
           return false;
        if(m == 2 || m == 3)
           return true;
        if(m%2 == 0 || m%3 == 0)
           return false;
        for(int i = 5; i*i<m; i+=6){
            if(m%i == 0 || m%(i+2) == 0)
               return false;
        }
        return true;
    }
    static void primeFactors(int n){
        for(int i = 2; i < n; i++){
            if(isPrime(i)){
                int x = i;
                while(n%x == 0){
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }
    public static void main(String[] args){
        int a = 156;
        primeFactors(a);
    }
}