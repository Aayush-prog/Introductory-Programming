import java.util.Scanner;
public class switchCase{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Input your size");
        String a=x.next();
        switch (a.toUpperCase()){
            case "XL":
                System.out.println("Available");
                break;
            case "L":
                System.out.println("Unavailable");
                break;
            case "M":
                System.out.println("Available");
                break;
            case "S":
                System.out.println("Unvailable");
                break;
            case "XS":
                System.out.println("Available");
                break;
                
        }
    
    }
}