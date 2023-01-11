import java.util.*;
public class StarRectangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int m = s.nextInt();
        System.out.print("Enter no. of columns : ");
        int n = s.nextInt();
        s.close();

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
