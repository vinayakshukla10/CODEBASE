public class EuclideanGCD {
    static int gcd(int a, int b){
        while(a != b){
            if(a > b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }
    public static void main(String[] args){
        int x = 44, y = 56;
        System.out.println(gcd(x,y));
    }
}
