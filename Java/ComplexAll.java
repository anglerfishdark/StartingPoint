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
MyComp add(MyComp c){
 MyComp t = new MyComp();
t.a = this.a+c.a;
t.b = this.b+c.b;
return t;
}
MyComp sub(MyComp c){
 MyComp t = new MyComp();
t.a = this.a-c.a;
t.b = this.b-c.b;
return t;
}
MyComp mul(MyComp c){
 MyComp t = new MyComp();
t.a = this.a*c.a - this.b*c.b;
t.b = this.a*c.b + this.b*c.a;
return t;
}

}
class ComplexAll
{
public static void main(String[] args)
{
 MyComp c1 = new MyComp(2,3);
 MyComp c2 = new MyComp(1,2);
 c1.disp();
 c2.disp();
  MyComp c3 = c1.add(c2);
 c3.disp();
 MyComp s = c1.sub(c2);
 s.disp();
 MyComp m = c1.mul(c2);
 m.disp();
}
}