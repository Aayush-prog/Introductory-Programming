import java.util.*;
import java.io.*;
public class debug {
public static void main(String[] args) {
int num;
int product = 1;
Console x= System.console();
System.out.println("Enter first number:");
String a = x.readLine();
num = Integer.parseInt(a);
while (num != 0) {
    product = product * num;
    System.out.println("Enter another number:");
a = x.readLine();
num = Integer.parseInt(a);
}
System.out.printf("product = %d", product);
}
}