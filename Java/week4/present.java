import java.util.*;
class present{
    public static void main(String[] args){
        List num=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Scanner x= new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n=x.nextInt();
        if (num.contains(n)){//checks if the list contains the value or not
            System.out.println("The list has it");
        }else{
            System.out.println("The list doesnot contain the number");
        }
    }
}