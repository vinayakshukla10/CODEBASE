import java.util.Scanner;

public class Palindrome{
    static boolean checkPal(int n){
        int rev = 0;
        int temp = n;
        while(temp != 0){
            int lastDigit = temp%10;
            rev = rev*10 + lastDigit;
            temp = temp/10;
        }
        return (rev == n);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        s.close();
        System.out.println(checkPal(num));
    }
}