abstract interface Sample1
{
public abstract void disp();
public abstract void test();
}
class Demo1 implements Sample1
{
public void disp()
{
System.out.println("Hello java");
}
public void test()
{
System.out.println("Hello spring");
}
}
class Main1
{
public static void main(String[] args)
{
Demo1 d1 = new Demo1();
d1.disp();
d1.test();
}
}
