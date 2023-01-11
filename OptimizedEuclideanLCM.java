public class OptimizedEuclideanLCM {
    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b , a%b);
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args){
        int x = 12, y = 32;
        System.out.println(lcm(x,y));
    }
}
//Time complexity = O(log(min(a,b)))