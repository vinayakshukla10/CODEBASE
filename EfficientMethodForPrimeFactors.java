import java.util.Scanner;

public class EfficientMethodForPrimeFactors {
    static void primeFactors(int n){
        if(n <= 1)
           return;
        for(int i = 2; i*i < n; i++){
            while(n%i == 0){
                System.out.println(i);
                n = n/i;
            }
        }
        if(n > 1)
           System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        primeFactors(x);
    }
}
