import java.util.Scanner;

class Mid
{
  private double a;
  private double b;
Mid(){
a=b=0;

} 
Mid(int n){
a=n;
b=n;

}
 Mid(int m, int n){
 a=m;
b=n;
}
void disp(){
 System.out.println("("+a+","+b+")");
}
Mid axis(Mid c){
Mid t = new Mid();
t.a = (this.a+c.a)/2;
t.b = (this.b+c.b)/2;
return t;
}


}
class MidValue
{
 public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
// int x =sc.nextInt();
 //int y =sc.nextInt();
 Mid c1 =new Mid(2,4);
 Mid c2 =new Mid(7,-4);
 c1.disp();
 c2.disp();
 Mid c3 = c1.axis(c2);
c3.disp();
}
}