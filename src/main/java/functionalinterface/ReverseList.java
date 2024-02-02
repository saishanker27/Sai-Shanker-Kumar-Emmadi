package functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseList {
    public ArrayList<String> reverseList(ArrayList<String> arrlist){
        if (arrlist != null && !arrlist.contains(null)) {
            Collections.reverse(arrlist);}
        return arrlist;
    }
    public static void main(String args[]){
        ReverseList rl = new ReverseList();
        ArrayList<String> arr = new ArrayList<>();
        arr.add(null);
        System.out.println(rl.reverseList(arr));
    }
}