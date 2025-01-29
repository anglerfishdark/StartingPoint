import java.util.Scanner;
class DemoA{
  int x,y;
  DemoA(){
  x=y=0;  
  System.out.println("default");
}
   DemoA(int m){
   x=m;
   y=m;
  System.out.println("one parameter");
}
void set(int m){
  x =m;
  y= m;
}
 DemoA(int m, int n){
 x = m;
 y = n;
 System.out.println("two parameter");
 
}
void set(int m, int n){
  x=m;
  y=n;
}
void disp(){
  System.out.println(x +" and " + y);
}
}
class DemoOr{
 public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
   System.out.println("enter the two number m and n :");  
   int m = sc.nextInt();
   int n = sc.nextInt();
        
     DemoA c1 = new DemoA();
    // DemoA c2 = new DemoA(m);
     DemoA c3 = new DemoA(m,n);

}
}