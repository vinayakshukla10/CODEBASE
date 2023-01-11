public class IterFact {
    static int fact(int n){
        int factorial = 1;
        if(n == 0 || n == 1){
            return 1;
        }

        for(int i = 2; i <= n; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args){
        int num = 8;
        System.out.println(fact(num));
    }
}
