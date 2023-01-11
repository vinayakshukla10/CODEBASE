public class NaiveGCD {
    static int gcd(int a, int b){
        int temp = Math.min(a,b);
        while(temp > 0){
            if(a%temp == 0 && b%temp == 0){
                break;
            }
            temp--;
        }
        return temp;
    }
    public static void main(String[] args){
        int x = 42, y = 48;
        System.out.println(gcd(x,y));
    }
}
//This code has time complexity = O(min(a,b))
//because maximum iterations that can be performed are min(a,b) to 1
//and minimum iterations could be 1 if we get min(a,b) as the gcd