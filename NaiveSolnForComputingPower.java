import java.util.*;

public class NaiveSolnForComputingPower {
    public static void computePower(int m, int n){
        int res = 1;
        for(int i = 1; i<=n; i++){
            res = res*m;
        }
        System.out.println(m + "^" + n + " = "+ res);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int x = s.nextInt();
        System.out.print("Enter the power : ");
        int y = s.nextInt();
        s.close();
        computePower(x, y);
    }
}