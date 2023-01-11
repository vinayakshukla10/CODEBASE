public class TrailingZeroes {
    static int Zeroes(int n){
        int res = 0;
        for(int i = 5; i <= n; i = i*5){
            res = res + n/i;
        }
        return res;
    }
    public static void main(String[] args){
        int num = 251;
        System.out.println(Zeroes(num));
    }
}
