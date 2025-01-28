import java.util.Scanner;
class Mid
{
  private int a;
  private int b;
Mid(){
a=b=0;
System.out.println("we can not find");
} 
Mid(int n){
a=n;
b=n;
System.out.println("we can not find");
}
 Mid(int m, int n){
 a=m;
b=n;
}
void disp(){
 System.out.println("mid point of two number : "+((a+b)/2));
}

}
class MidPoint
{
 public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int x =sc.nextInt();
 int y =sc.nextInt();
 Mid c1 =new Mid(x,y);
 c1.disp();
}
}