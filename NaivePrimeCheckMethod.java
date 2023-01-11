public class NaivePrimeCheckMethod {
    static boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2 && n == 3) return true;
        while(n > 3){
            for(int i = 2; i < n; i++){
                if(n%i == 0)
                    return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int x = 1423;
        System.out.println(isPrime(x));
    }
}
