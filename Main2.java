abstract interface Sample2
{
 public abstract void disp();
public abstract void test();
}
abstract class Demo2 implements Sample2
{
 public void disp()
{
System.out.println("Java");
}
}
class Test2 extends  Demo2 
{
 public void test()
{
System.out.println("SQL");
}
}
class Main2
{
public static void main(String[] args)
{
Test2 t1 = new Test2();
t1.disp();
t1.test();
}
}