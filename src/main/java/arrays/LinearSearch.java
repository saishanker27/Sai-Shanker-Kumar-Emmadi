package arrays;

public class LinearSearch {
    public int linearSearch(int a[],int element){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==element)
                return i;
        }
        return 0;

    }
    public static void main(String args[]) {
        LinearSearch linear = new LinearSearch();
        int a[] = {2, 13, 9, 18, 48, 50};
        int element = 18;
        System.out.println(element+" is found at index: "+linear.linearSearch(a, element));
    }
}