public class Factorial {
    static int fac(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
    }
    public static void main(String[] args){
        int num = 12;
        System.out.println(fac(num));
    }
}