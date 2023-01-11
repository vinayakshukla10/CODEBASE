import java.util.Scanner;

public class StarHalfPyramid {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = s.nextInt();
        s.close();

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}