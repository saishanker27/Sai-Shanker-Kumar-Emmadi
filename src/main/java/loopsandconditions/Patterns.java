package loopsandconditions;

public class Patterns {
    public static void main(String args[]){
        int n=6,j;
        for(int i=n-1;i>0;i--)
        {
            for(j=0;j<i-1;j++){
                System.out.print("+");}
            for(int k=n;k>=i;k--){

                System.out.print("-");
            }
            System.out.println();
        }
    }
}
