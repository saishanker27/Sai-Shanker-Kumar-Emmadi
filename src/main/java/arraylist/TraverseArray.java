package arraylist;

import java.util.ArrayList;
import java.util.List;

public class TraverseArray {
    public List<String> traverseWithForLoop(ArrayList<String> employeeList) {
        List<String> outputList = new ArrayList<>();
        for(int i = 0; i < employeeList.size(); i++) {
            outputList.add(employeeList.get(i));
        }
        return outputList;
    }
    public List<String> traverseWithEnhancedForLoop(ArrayList<String> employeeList) {
        List<String> outputList = new ArrayList<>();
        for(String name : employeeList) {
            outputList.add(name);
        }
        return outputList;
    }
}