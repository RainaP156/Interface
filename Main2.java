abstract interface Sample2
{
 public abstract void display();
public abstract void tester();
}
abstract class Demo2 implements Sample2
{
 public void display()
{
System.out.println("Java");
}
}
class Test2 extends  Demo2 
{
 public void tester()
{
System.out.println("SQL");
}
}
class Main2
{
public static void main(String[] args)
{
Test2 t1 = new Test2();
t1.display();
t1.tester();
}
}
