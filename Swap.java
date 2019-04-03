import java.util.Scanner;
 
class Swap
{
   public static void main(String args[])
   {
      int x, y,a,b,temp;
      System.out.println("ENTER VALUES TO SWAP USING TEMP VARIABLE \n Enter x");
      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();
      System.out.println("Enter Y");
      y = sc.nextInt();
 
      System.out.println("Before Swapping with twmp variable \nx = "+x+"\ny = "+y);
 
      temp = x;
      x = y;
      y = temp;
 
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);

      System.out.println("ENTER VALUES TO SWAP WITHOUT USING TEMP VARIABLE \n Enter x");
      a = sc.nextInt();
      System.out.println("Enter Y");
      b = sc.nextInt();
      System.out.println("Before Swapping\nx = "+a+"\ny = "+b);
      a = a +b;  
      b = a - b;  
      a = a - b;  
     System.out.println("After Swapping withount temp variable\nx = "+a+"\ny = "+b);
   }
}