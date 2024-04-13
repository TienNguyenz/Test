import java.util.Scanner;
public class B8 {
    public static boolean KTSNT(int n)
    {
        if (n < 2 )
            return false;
        else
        {
            for (int i = 2 ; i <= (float)Math.sqrt(n) ; i++ )
            {
                if (n % i == 0 )
                    return false;
            }
        }
        return true;
    }
    
    public static void main (String args[])
    {
        Scanner N=new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n=N.nextInt();

        int arr[]=new int[n];
        System.out.print("Nhap cac phan tu: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=N.nextInt();
        }

        int sum=0;
        System.out.print("Mang: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            sum += arr[i];
        }
        System.out.println("\nTong cac phan tu trong mang: "+sum);

        int sumchan=0;
        System.out.print("Phan tu chan: ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
                sumchan+=arr[i];
            }
        }
        System.out.println("\nTong chan: "+sumchan);
        
        int sumle=0;
        System.out.print("Phan tu le: ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
                sumle+=arr[i];
            }
        }
        System.out.println("\nTong le: "+sumle);

        int sumSNT=0;
        System.out.print("Phan tu thuoc SNT: ");
        for(int i=0;i<n;i++)
        {
            if(KTSNT(arr[i]))
            {
                System.out.print(arr[i]+" ");
                sumSNT+=arr[i];
            }
        }
        System.out.println("\nTong SNT: "+sumSNT);

        System.out.print("Them phan tu : ");
        int x = N.nextInt();
        System.out.print("Vi tri : ");
        int a = N.nextInt();

        // int arr2[]=array.coppyof(arr,n+1);
        if(a == 0)
        {
            System.out.printf(x+" ");
            for(int i = 0 ; i < n ; i++)
            {
                System.out.printf(arr[i]+" ");   
            }
        }      
        else if (a == n - 1)
        {
            for(int i = 0 ; i < n ; i++)
            {
                System.out.printf(arr[i]+" ");   
            }
            System.out.printf(x+" ");
        }
        else
        {
            System.out.printf(arr[0]+" ");
            for(int i = 1 ; i < n ; i++)
            {    
                if ( i == a )
                {
                    System.out.printf(x+" ");
                    System.out.printf(arr[i]+" ");
                    i = i + 1;
                }
                System.out.printf(arr[i]+" ");
            }
        }

        System.out.print("\nVi tri xoa: ");
        int k = N.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            if ( i == k )
            {
                i = i + 1;
            }
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nNhap so can kiem tra: ");
        int t = N.nextInt();
        for (int i = 0 ; i < n ; i++)
        {
            if(arr[i] == t)
            {
                System.out.print("Vi tri cua so can kiem tra la : "+i);
                
            }
        }
    }
}