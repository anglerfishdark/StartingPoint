class  A{
    int l,v;
  Scanner sc =new Scanner(System.in);
  void get(int r, int c){
   l=r;
   v=c;
} 
 int [][]a =new int [l][v];
  void set(){
     for(int i=0;i<a.length;i++){
      for(int j=0; j<a[i].length;j++)
      a[l][v]= sc.nextInt();
    }   
  }
   int disp(){
     for(int i=0;i<l;i++){
      for(int j=0; j<v;j++)
       System.out.print(a[l][v]);
  }
System.out.println(" ");   
  return 0;  }
      }
class TwoD{
 public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
  int r,c;
 System.out.print("enter the number of rows : ");
 r=sc.nextInt();
System.out.print("enter the number of col. : ");
c=sc.nextInt();
 A b=new  A();
b.get(r,c);
b.set();
System.out.print(b.disp()); 

 }
}