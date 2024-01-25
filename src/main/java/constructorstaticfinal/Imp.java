package constructorstaticfinal;

class Staticclass{
    static int statvalue=70;
   public static int staticMethod(){
        return statvalue;
    }
}
final class Finalclass{
    final int finalvalue;

    public Finalclass(int finalvalue) {
        this.finalvalue = finalvalue;
    }

     final int finalMethod(){
        return 34;
    }
}

class Parent{
    int a;

    public Parent(int a) {
        this.a = a;
    }
    public Parent(){

    }
}
class Child extends Parent{
    int b;

    public Child(int a,int b) {
        super(a);
        this.b = b;
    }

    public Child(int b) {
        this.b = b;
    }
}

public class Imp {
    public static void main(String args[]) {
        System.out.println("Static Value:" + Staticclass.staticMethod());

        Finalclass f = new Finalclass(71);
        System.out.println("Final Value:"+f.finalMethod());

        Child c1=new Child(45,56);
        Child c2=new Child(69);
        System.out.println("Child Instance with Parent Variable:"+c1.a);
        System.out.println("Child Instance with Child Variable:"+c1.b);
        System.out.println("Child Instance with Overloaded Constructor:"+c2.b);
    }
}