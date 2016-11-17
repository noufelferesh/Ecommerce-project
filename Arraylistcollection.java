
Array list using collection:-
------------------------------


import java.util *;
public class CollectonArraylist
{
public static void main(String[] args)
{
Arraylist<String> al=new arraylist<String>();
al.add("Noufel");
al.add("Feresh");
al.add("Mohmed");
al.add("People");
System.out.println("the collection arraylist is:" +al);
al.add(0, "priya");
al.add(1, "shree");
al.remove("Mohamed");
al.remove("Feresh");
System.out.println("the collection list is:"+al);
al.remove(1);
System.out.println("the list is" +al);
}
}