import java.util.Scanner; 
public class B1
{
    public static void main(String args[])
    {
    Scanner Reader = new Scanner(System.in);
    System.out.print("Nhap s: ");
    int s = Reader.nextInt();
    System.out.print("Nhap v: ");
    int v = Reader.nextInt();
    System.out.println("tong= "+(s+v));
    System.out.println("hieu= "+(s-v));
    System.out.println("tich= "+(s*v));
    System.out.println("thuong= "+(s*1.0/v*1.0));
    }
}