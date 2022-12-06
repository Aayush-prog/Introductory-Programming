import java.util.Scanner;
public class elses{
    public static void main(String args[]){
    Scanner x=new Scanner(System.in);
    System.out.println("Input character");
    String y=x.next();
    String z=y.toUpperCase();
    if (z.equals("A")){
        System.out.println("Apple");
    }else if(z.equals("B")){
        System.out.println("Banana");
    }else{
        System.out.println("Coconut");
    }
}
}