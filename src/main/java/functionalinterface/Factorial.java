package functionalinterface;

public class Factorial {

    public int factorialNum(int x) {
        if (x == 0)
            return 1;
        return x * factorialNum(x - 1);
    }
}
