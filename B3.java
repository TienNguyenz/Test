import java.io.Reader;
import java.util.Scanner;
public class B3 {
    public static void main(String args[]) {
       java.util.Scanner Reader= new Scanner(System.in);
       System.out.print("Nhap ban kinh duong tron: ");
       float r =Reader.nextFloat();
       System.out.println("Chu vi hinh tron : "+Math.round((Math.PI*2*r)*100.0)/100.0);
       System.out.println("Dien tich hinh tron : "+Math.round((Math.PI*r*r)*100.0)/100.0);
    }
    
}
