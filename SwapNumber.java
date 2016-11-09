import java.util.*;
class SwapNumber
{
public static void main(String[]args)
{
int num1=10;;
int num2=20;
System .out.println("Before swapping");
System .out.println("value of num1 : "+num1);
System .out.println("value of num2 : "+num2);
swap(num1,num2);
}
public static void swap(int a,int b)
{
int temp= a;
a=b;
b=temp;
System.out.println("After swapping");
System.out.println("value of num1 : "+a);
System.out.println("value of num2 : "+b);

}
}