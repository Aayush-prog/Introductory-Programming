import java.util.*;
class infinite{
    public static void main(String [] args){
        int a=100, sum=0;
        while (a>=100){
            sum +=a;
            if (a>200){
                break;
            }
            a +=2;
        }
        System.out.println("the sum is "+sum);
    }
}