import java.util.Scanner;

public class EfficientSolutionForFindingAllDivisorsOfAnumber {
    public static void allDivisors(int n){
        for(int i = 1; i*i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
                if(i != n/i){
                    System.out.println(n/i);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        sc.close();
        allDivisors(x);
    }
}
