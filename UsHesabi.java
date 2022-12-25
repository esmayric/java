import java.util.Scanner;
public class UsHesabi {
    public static int UsHesaplama (int taban, int us) {
        int sonuc;
        sonuc=1;
        for(int i=1;i<=us;i++) {
            sonuc*=taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t,u;
            int sonuc;
        int sayac=0;

        while (sayac!=1) {
            System.out.print("tabani giriniz: ");
            t=sc.nextInt();
            System.out.print("Üssü giriniz: ");
            u=sc.nextInt();

            sonuc=UsHesaplama(t,u);
            System.out.print("Sonuç: " +sonuc +"\n");
        }
    }
}
