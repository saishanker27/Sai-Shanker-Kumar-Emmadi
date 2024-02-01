package functionalinterface;

public class Swap {

    public void swapVal(int[] arr){
        int x=arr[0];
        int y=arr[1];
        x=(x*y)/(y=x);
        arr[0]=x;
        arr[1]=y;
    }
}
