import java.util.*;

public class NaiveSolutionForAllDivisorsOfaNumber {
    public static void printAllDivisors(int n){
        for(int i = 1; i<=n ; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number for which we have to find all divisors : ");
        int x = s.nextInt();
        s.close();
        printAllDivisors(x);
    }
}