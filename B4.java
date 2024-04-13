import java.io.Reader;
import java.util.Scanner;
public class B4 {
public static void main(String args[])
 {
    java.util.Scanner Reader= new Scanner(System.in);
    System.out.print("Nhap N : ");
    int N= Reader.nextInt();
    if (N%2==0) System.out.println("Chan");
    else System.out.println("Le");
 }   
}
