import java.util.*;
public class EfficientMethodForComputingPower {
    public static int computePower(int x, int n){
        if(n==0) return 1;
        if(n==1) return x;
        int temp = (int)Math.pow(x,n/2);
        temp = temp*temp;
        if(n%2==0) return temp;
        else return temp*x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int y = sc.nextInt();
        System.out.print("Enter the power : ");
        int m = sc.nextInt();
        sc.close();
        System.out.print(y +"^"+ m +" = " );
        System.out.print(computePower(y,m));
    }
}