import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi;

        System.out.println("Sayi giriniz: ");
        sayi = sc.nextInt();

        int a=0,b=1,c;
        int i;
        System.out.print(a+ " " +b);
        for(i=2;i<sayi;i++) {
            c=a+b;
            System.out.print(" " +c);
            a=b;
            b=c;
        }
        System.out.println();
    }
}
