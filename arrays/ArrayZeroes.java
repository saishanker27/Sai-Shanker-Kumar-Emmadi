package arrays;

public class ArrayZeroes {
    public static void main(String args[]) {
        int a[] = {10, 0, 0, 30, 15, 0, 6,0};
        int n = a.length;
        int cnt = 0,i=0;
        int b[] = new int[n];
        // For non-zero elements
        for (i = 0; i < n; i++) {
            if (a[i] != 0) {
                b[cnt++] = a[i];
            }
        }
        // For zeros
        while(i<n){
            b[cnt++]=0;
        }
        // Print the modified array
        for (i = 0; i < b.length; i++)
            System.out.print(b[i]+" ");
    }
}