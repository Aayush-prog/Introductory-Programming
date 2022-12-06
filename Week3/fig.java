import java.util.*;
class fig{
    public static void main(String[] args){
        for(int i=0;i<=8;i+=2){//for amount of rows,used this increment and value for odd outputs of *
            for (int k=0;k<=7-i;k+=2){//for spaces 
            System.out.print(" ");
        }
            for (int j=0;j<=i;j++){//for *
                System.out.print("*");
            }
        System.out.println();//new line
            
            
        }
    }
}