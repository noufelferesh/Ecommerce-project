import java.util.*;
class ReverseNumber
{
public static void main(String []args)
{
int number=1234;
int reversednumber=0;
int temp=0;
while(number>0)
{
temp=number%10;
reversednumber=reversednumber*10+temp;
number=number/10;
}
System.out.println("the reverse number is :"+reversednumber);
}
}