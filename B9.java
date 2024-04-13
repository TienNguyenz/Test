import java.util.Scanner;
public class B9 {
    public static void main(String[] args)
    {
    char t;
    Scanner NhapN = new Scanner(System.in);
    Scanner Chuoi = new Scanner(System.in);
    System.out.print("Hay nhap chuoi : ");
    String s = Chuoi.nextLine();
    System.out.println("Chuoi vua nhap la : "+s);   
    int p = s.length(); 
    System.out.println("Do dai chuoi la : "+p);

    System.out.print("Chuoi xoa dau cach la : ");
    for(int i = 0 ; i < p ; i++)
    {
        t = s.charAt(i);
        if (t >= 'a' && t <='z' || t >= 'A' && t <= 'Z')
            System.out.print(t);
    }

    //đếm số từ trong chuỗi
    int dem = 1 ;
    for(int i = 0 ; i < p ; i++)
    {
        t = s.charAt(i);
        if (t == ' ' && t+1 != ' ')
            dem++;
    }
    System.out.print("\nSo tu trong chuoi la : "+dem);


    //Tach tung tu trong chuoi
    System.out.println();
    for(int i = 0 ; i < p ; i++)
    {
        t = s.charAt(i);
        if(Character.isSpace(t))
        {
            System.out.println(t);
        }
        else
        {
            System.out.print(t);
        }
    }

    int k;
    //k kí tự bên trái chuỗi s
    System.out.println();
    System.out.print("Nhap k : ");
    k = NhapN.nextInt();
    for (int i = 0 ; i < k ; i++)
    {
        t = s.charAt(i);
        System.out.print(t);
    }
    
    //k kí tự bên phải chuỗi s
    System.out.println();
    for (int i = p-k ; i < p ; i++)
    {
        t = s.charAt(i);
        System.out.print(t);
    }

    System.out.println();
    System.out.print("Nhap h : ");
    int h = NhapN.nextInt();
    System.out.print("Nhap j : ");
    int j = NhapN.nextInt();

    for (int i = h ; i < h+j ; i++)
    {
        t = s.charAt(i);
        System.out.print(t);
    }
}
}
