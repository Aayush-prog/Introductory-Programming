import java.util.*;
class count{
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        System.out.println("Input number");
        int a=x.nextInt();
        int f=0,g=0,h=0;
        if (a>0){
                f++;//postive num then value increases
            }else if (a<0){
                g++;//negative num then value increases
            }else{
                h++;}//zero then value increase
        System.out.println("Do you want to continue? Y/N");//asking to continue or not
            char d=x.next().charAt(0);
            char c=Character.toUpperCase(d);
        while(c=='Y'){//only works if user wants to continue
            System.out.println("Input number");
            a=x.nextInt();
            if (a>0){
                f++;
            }else if (a<0){
                g++;
            }else{
                h++;}
            System.out.println("Do you want to continue? Y/N");
            d=x.next().charAt(0);
            c=Character.toUpperCase(d);
            }
        //user doesnot want to continue then
        System.out.printf("There are %d positive numbers,%d negative numbers and %d zeros",f,g,h);
    }
}
