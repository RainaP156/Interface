interface Nike
{
void shoes();
}
interface Puma extends Nike
{
void bags();
}
class Sample implements Puma
{
public void shoes()
{
System.out.println("Shoes");
}
public void bags()
{
System.out.println("Bags");
}
public static void main(String[] args)
{
Sample s1=new Sample();
s1.shoes();
s1.bags();
}
}

