import java.util.*;
class sorts{
    public static void main(String [] args){
        boolean a;
        int[] z= {5,3,1,4,2};
        
        for (int i=0;i<z.length-1;i++){
            if (z[i]<z[i+1]){
                a= true;
            }else{
                a=false;
            }
            
        }
        if (a==true){
            System.out.println("It is sorted");
        }else{
            System.out.println("It is not sorted");
        }
        
        
            
        }
    }
