package day05;
import java.util.Scanner;
public class Desen {
    static void pattern(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi Giriniz:");
        int Sayi= scan.nextInt();

        int temp = Sayi;
        System.out.print(Sayi +"\t");

        do {
            temp=temp-5;
            System.out.print( temp+"\t");
        }while (temp>0);
        do {
            temp=temp+5;
            System.out.print(temp+"\t");
        }while (temp!=Sayi);
    }
    public static void main(String[] args) {
        pattern();
    }
}