public class NaiveLCM {
    static int lcm(int a, int b){
        int temp = Math.max(a, b);
        while(true){
            if(temp%a == 0 && temp%b == 0)
                return temp;
            temp++;
        }
    }
    public static void main(String[] args){
        int x = 11 , y = 13;
        System.out.println(lcm(x,y));
    }
}
