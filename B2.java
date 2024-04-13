import java.io.Reader;
import java.util.Scanner;
public class B2 {
    public static void main(String args[])
    {
    Scanner Reader = new Scanner(System.in);
    System.out.print("Nhap chieu dai: ");
    int dai = Reader.nextInt();
    System.out.print("Nhap chieu rong: ");
    int rong = Reader.nextInt();
    System.out.println("chu vi hinh chu nhat : "+(dai+rong));
    System.out.println("dien tich hinh chu nhat :"+(dai*rong)); 
}
}