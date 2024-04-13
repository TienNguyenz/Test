import java.util.Scanner;
public class B7 {
    public static int a(int n)
    {
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            System.out.print(" "+i);
            sum+=i;
        }
        System.out.println(" ");
        return sum;
    }
    public static int b(int n)
    {
        int sum=0;     
            for (int i=2;i<=n;i++)
            {
                if (i%2==0)
                {
                System.out.print(" "+i);
                sum+=i;
                i++;
                }
            }
        System.out.println(" ");
        return sum;
    }
    public static int c(int n)
    {
        int sum=0;
            for (int i=1;i<=n;i++)
            {
                if (i%2!=0)
                {
                System.out.print(" "+i);
                sum+=i;
                i++;
                }
            }
        System.out.println(" ");
        return sum;
    }
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
    public static int d(int n)
    {
        int sum=0;
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (KTSNT(i)) {
                System.out.print(" " + i);
                sum+=i;
            }
        }
        System.out.println(" ");
        return sum;
    }
    public static int e(int n)
    {
        int dem=0;
        for(int i=2;dem<n;i++)
        {
            if(KTSNT(i))
            {
            System.out.print(" "+i);
            dem++;
            }
        }
        System.out.println(" ");
        return 0;
        
    }
    public static void main (String args[])
    {
        java.util.Scanner Reader=new Scanner(System.in);
        System.out.print("Nhap N : ");
        int N =Reader.nextInt();
        System.out.println(a(N));
        System.out.println(b(N));
        System.out.println(c(N));
        System.out.println(d(N));
        System.out.println(e(N));
    }
}
