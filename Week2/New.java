import java.util.Scanner;
public class New{
    public static void main(String args[]){
    Scanner x=new Scanner(System.in);
    System.out.println("Input character");
    char y=x.next().charAt(0);
    char z=Character.toUpperCase(y);
    if(z!='A'){
        if(z!='B'){
            System.out.println("Coconut");
        }else{
            System.out.println("Banana");
        }
    }else {
            System.out.println("Apple");
        }
    }
}


