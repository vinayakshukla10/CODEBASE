import java.util.Scanner;

public class IterativePower {
    public static int computePower(int x, int n){
        int res = 1;
        while(n>0){
            if(n%2 != 0){
                res = res*x;
            }
            x = x*x;
            n = n/2;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int y = s.nextInt();
        System.out.print("Enter the power number : ");
        int m = s.nextInt();
        s.close();
        System.out.print(y + "^" + m + " = ");
        System.out.print(computePower(y,m));
    }
}
