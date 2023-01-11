import java.util.*;
public class HollowStarRectangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = s.nextInt();
        System.out.print("Enter no. of Columns : ");
        int m = s.nextInt();
        s.close();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
