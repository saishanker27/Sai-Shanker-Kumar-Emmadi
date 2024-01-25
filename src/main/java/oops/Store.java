package oops;

abstract class Department {
    int size=69;
    public abstract int getDepartmentsize();
}
class Departmentsize extends Department{
    @Override
    public int getDepartmentsize() {
        return size;
    }
}
public class Store{
    public static void main(String args[]){
        Departmentsize d = new Departmentsize();
        System.out.println(d.getDepartmentsize());
    }
}