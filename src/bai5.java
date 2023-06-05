import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        String a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input String: ");
        a=sc.nextLine();
        b=a.toLowerCase();
        c=a.toUpperCase();
        System.out.println("Lower String : "+b);
        System.out.println("Upper String : "+c);
    }
}
