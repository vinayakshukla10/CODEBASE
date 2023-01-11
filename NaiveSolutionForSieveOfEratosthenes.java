import java.util.Scanner;

public class NaiveSolutionForSieveOfEratosthenes {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i = 5; i*i<=n; i+=6){    //this loop runs sqrt n times
            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void printAllPrimesTill(int m){
        int temp = 0;
        for(int i = 2; i <= m; i++){       //this loop runs n times
            if(isPrime(i)){
                temp++;
                System.out.println(i);
            }
        }
        System.out.println("total number of primes upto x are = " + temp);
    }
    public static void main(String[] args){     //Time complexity of this code is O(n * sqrt n)
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print all prime numbers : ");
        int x = s.nextInt();
        s.close();
        printAllPrimesTill(x);
    }
}
