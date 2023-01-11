public class EfficientPrimeCheckMethod {
    static boolean isPrime(int n){
        if(n == 1)
           return false;
        if(n == 2 || n == 3)
           return true;
        while(n > 3){
            for(int i = 2; i*i < n; i++){
                if(n%i == 0)
                   return true;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int x = 737;
        System.out.println(isPrime(x));
    }
}