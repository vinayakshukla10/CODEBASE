import java.util.Scanner;

public class MoreEfficientSolutionForFindingAllDivisorsOfANumber {
    public static void allDivisors(int n){
        int i;
        for(i = 1; i*i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        for( ;i>=1;i--){
            if(n%i == 0){
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = s.nextInt();
        s.close();
        allDivisors(x);
    }
}