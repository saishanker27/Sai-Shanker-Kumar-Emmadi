package arrays;

public class ArrayLargeSmall {
    public static void main(String args[]){
        int a[] = {10,20,9,15,30};
        int large=a[0],small=a[0];
        for(int i=0;i<a.length;i++){
            if(large<=a[i])
                large=a[i];
            if(small>=a[i])
                small=a[i];
        }
        System.out.println("Largest:"+large);
        System.out.println("Smallest:"+small);
    }
}
