import java.util.*;
public class StarFullPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of row : ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int c = sc.nextInt();
        sc.close();

        if(c%2==0){
            System.out.println("Number of columns should be Odd- Please Re-Enter");
        }

        while(r<c && c%2!=0){
            for(int i=0; i<r; i++){
                for(int j=1; j<=c; j++){
                    if(j>=c/2 +1-i && j<=c/2 +1+i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            break;
        }
    }
}
