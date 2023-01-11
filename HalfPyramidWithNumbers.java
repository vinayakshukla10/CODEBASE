import java.util.*;
public class HalfPyramidWithNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = s.nextInt();
        s.close();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
