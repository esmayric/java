import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {

        int yil;
        Scanner yil1 = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        yil = yil1.nextInt();

        if (yil % 100 == 0){
            if (yil % 400 == 0) {
                System.out.println(yil + " bir artık yıldır.");
            }else {
                System.out.println(yil + " bir artık yıl değildir.");
            }
        }else if (yil % 4 == 0){
            System.out.println(yil + " bir artık yıldır.");
        }else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
