package day05;
import java.util.Scanner;
public class Asal {
    public static int AsalSayi (int sayi,int i) {

        if(i==1) {
            return 1;
        } else {
            {
                if (sayi % i==0) {
                    return 0;
                }
                else {
                    return AsalSayi(sayi,i-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sayac=0;
        while (sayac!=1) {
            System.out.print("Pozitif sayi giriniz: ");
            int b = sc.nextInt();

            int c = AsalSayi(b,b/2);

            if(c == 1){
                System.out.println(b+"  asal sayıdır");
            }
            else {
                System.out.println(b+" asal sayı degildir");
            }
        }
    }
}
