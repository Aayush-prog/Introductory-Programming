import java.util.*;
class figThree{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){//for amount of rows,used this increment and value for odd outputs of *
            for (int k=0;k<5-i;k++){//for spaces 
            System.out.print(" ");
        }
            for (int j=i;j>0;j--){//for 4321 part
                System.out.print(j);
            }
            for (int k=2;k<=i;k++){//for 234 part
                System.out.print(k);
            }
        System.out.println();//new line
          
            
        }
    }
}