package loopsandconditions;

public class Reversedigit {
    public static void main(String args[]) {
        int a;
        int x = 12345;
        while(x>0){
            a = x % 10;
            System.out.print(a);
            x = x / 10;
        }
    }
}
