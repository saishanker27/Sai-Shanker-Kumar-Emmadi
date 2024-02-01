package functionalinterface;

public class Palindrome {

    public int palindromeCheck(int num) {
        int sum = 0;
        int orignum = num;
        while (num != 0) {
            int x = num % 10;
            sum = (sum * 10) + x;
            num = num / 10;
        }
        return (orignum == sum) ? 1 : 0;
    }
}
