import java.util.Scanner;
public class B5 {
   public static void main(String args[])
   {
    java.util.Scanner Reader= new Scanner(System.in);
    System.out.print("Nhap N : ");
    int N= Reader.nextInt();
    if (N==0) 
        {
            System.out.println("N la so 0");
        }
    else if (N<0) 
        {
            System.out.println("N la so am");
        }
    else
        {
            System.out.println("N la so duong");
        }
    }
} 
