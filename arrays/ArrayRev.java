package arrays;

public class ArrayRev {

    public static void main(String args[]){
        int a[] = {1,5,2,6,3};
        int b[] = new int[a.length];
        int j=0;
        for(int i=a.length;i>0;i--){
            b[j++]=a[i-1];
        }
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
}
