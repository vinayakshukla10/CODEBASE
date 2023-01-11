import java.util.Scanner;

public class OptimizedEuclideanGCD {
    static int gcd(int a, int b){
        while(b > 0){
            return gcd(b , a%b);
        }
        return a;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter first number : ");
        int x = s.nextInt();
        System.out.print("enter second number : ");
        int y = s.nextInt();
        s.close();
        System.out.println(gcd(x,y));
    }
}