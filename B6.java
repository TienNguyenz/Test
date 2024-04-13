import java.util.Scanner;
public class B6 {
    public static boolean KTSNT(int n) 
    {
        if(n<2) return false;
        for (int i = 2; i <= n / 2; i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
    public static void main (String args[])
    {
        java.util.Scanner Reader=new Scanner(System.in);
        System.out.print("Nhap N : ");
        int N=Reader.nextInt();
        if(KTSNT(N))
        System.out.println("N la so nguyen to");
        else System.out.println("N ko phai la so nguyen to");
    }
}
