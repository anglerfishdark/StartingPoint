import java.util.Scanner;
class Mat
{
  int []a;

   Mat() 
{
   a= new int [2][2];
}
Mat(int n){
a= new int [n][n];
}
 Mat(int m, int n){
 a= new int [m][n];
}
 void set(){
     Scanner sc = new Scanner(System.in);
  for(int i=0;i<a.length;i++){
    for(int j=0;j<a[0].length;j++){
    a[i][j]=sc.nextInt();
}
}}
 void disp(){
  for(int i=0;i<a.length;i++){
    for(int j=0;j<a[0].length;j++){
     System.out.print(a[i][j]+" ");
}
 System.out.println();
}}
}
class Matrix
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the first array: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
       Mat c1 = new Mat(m,n);
       c1.set();
        c1.disp();

        System.out.println("Enter the dimensions of the second array: ");
        m = sc.nextInt();
        n = sc.nextInt();

        Mat c2 = new Mat(4,5);
        c2.set();
         c2.disp();
        /*TwoDArraySum sum = a.add(b);
        if (sum != null) {
            System.out.println("Sum of arrays: ");
            sum.displayArray();
        }
*/


}
}