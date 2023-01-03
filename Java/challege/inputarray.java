import java.util.*;
public class inputarray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Input array length");
int x= sc.nextInt();
int end=x-1;
ArrayList<Integer> listA= new ArrayList<Integer>();
for (int i=1; i<=x;i++){
System.out.println("Enter element");
int a=sc.nextInt();
listA.add(a);
}
ArrayList<Integer> listB= new ArrayList<Integer>();
for (int i=0;i<=3;i++){
listB.add(listA.get(i));

}
ArrayList<Integer> listC= new ArrayList<Integer>();
for (int i=3;i<=end;i++){
listC.add(listA.get(i));

}
int bsize=listB.size();
int csize=listC.size();
int i=0,j=0,k=0;
while(i<bsize && j<csize){
if(listB.get(i)<listC.get(i)){
listA.set(k,listB.get(i));
i++;
j++;
k++;
}

}
System.out.println(listA);
}
}