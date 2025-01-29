import java.util.Scanner;
class Circle{
 public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
   System.out.println("enter the radius of circle :"); 
   int r = sc.nextInt();
   System.out.println("if you find area of circle press : 1");
   System.out.println("if you find parimeter of circle press : 2");
   System.out.println("if you find area and parimeter (both) of circle press : 3");
   int x = sc.nextInt();
   switch(x){
    case 1:
     System.out.println("Area of circle : "+((22*r*r)/7));
     break;
  case 2:
    System.out.println("parimeter of circle : "+((2*22*r)/7));
    break;
  case 3:
    System.out.println("Area of circle : "+((22*r*r)/7));
    System.out.println("parimeter of circle : "+((2*22*r)/7));
    break;
  default:
     System.out.println("you enter worng number ");
    
}  

}
}