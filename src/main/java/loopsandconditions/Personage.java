package loopsandconditions;

public class Personage {
    public static void main(String args[]){
        int x=12;
        if(x<13){
            System.out.println("The Person is Kid");
        } else if (x>=13 && x<=19) {
            System.out.println("The Person is Teen");
        }else{
            System.out.println("The Person is adult");
        }
    }
}
