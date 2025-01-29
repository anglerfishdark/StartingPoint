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
MyComp mul(MyComp c){
 MyComp t = new MyComp();
t.a = this.a*c.a - this.b*c.b;
t.b = this.a*c.b + this.b*c.a;
return t;
}

}
class ComplexMul
{
public static void main(String[] args)
{
 MyComp c1 = new MyComp(12,13);
 MyComp c2 = new MyComp(4,5);
 c1.disp();
 c2.disp();
 MyComp c3 = c1.mul(c2);
 c3.disp();
}
}