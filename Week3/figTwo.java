import java.util.*;
class figTwo{
    public static void main(String[] args){
        int a=1;
        for(int i=0;i<5;i++){//for amount of rows,used this increment and value for odd outputs of *
            for (int k=0;k<4-i;k++){//for spaces 
            System.out.print(" ");
        }
            for (int j=0;j<=i*2;j++){//for *
                System.out.print(a);
            }
        System.out.println();//new line
        a++;  
            
        }
    }
}