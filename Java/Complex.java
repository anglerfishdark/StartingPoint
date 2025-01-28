import java.util.Scanner;
class Mat
{
  int []a;
 Scanner sc = new Scanner(System.in);
   Mat() 
{
   a=new int[2][2];
}
Mat(int n){
a=new int[n][n];
}
 Mat(int m, int n){
 a=new int[m][n];
}
 void set(){
  for(int i=0;i<a.length;i++){
    for(iny j=0;j<a[0].length;j++){
   a[i][j]=sc.nextInt();
}
}}
 void disp(){
  for(int i=0;i<a.length;i++){
    for(iny j=0;j<a[0].length;j++){
     System.out.print(a[i][j]+" ");
}
}}
}
class Matrix
{
public static void main(String[] args)
{
 Mat c1 = new Mat(2,2);
//  Mat c2 = new Mat(4,5);
c1.set();
 c1.disp();
}
}