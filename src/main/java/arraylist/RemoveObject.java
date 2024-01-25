package arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveObject {
    public ArrayList<String> removeObject(ArrayList<String> arrayList) {
        if(arrayList != null && !arrayList.isEmpty())
            arrayList.remove(arrayList.size() - 1);
        return arrayList;
    }
}