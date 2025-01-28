import java.util.Scanner;

class MyComp
{
   private int a;
   private int b;

   MyComp() 
{
    a=b=0;
}
MyComp(int n){
 a=n;
b=n;
}
 MyComp(int m, int n){
 a=m;
b=n;
}
 void disp(){
  System.out.println("("+a+","+b+")");
}
MyComp sub(MyComp c){
 MyComp t = new MyComp();
t.a = this.a-c.a;
t.b = this.b-c.b;
return t;
}

}
class ComplexSub
{
public static void main(String[] args)
{
 MyComp c1 = new MyComp(12,13);
 MyComp c2 = new MyComp(4,5);
 c1.disp();
 c2.disp();
 MyComp c3 = c1.sub(c2);
 c3.disp();
}
}