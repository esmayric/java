import java.util.Scanner;
public class PalindromSayi {
    static boolean isPalindrome(int number){
        int temp = number;
        int reverseNumber=0;
        int LastNumber;

        while(temp != 0){
            LastNumber = temp % 10;
            reverseNumber += LastNumber;
            if(temp / 10 != 0)
                reverseNumber *= 10;
            temp /= 10;
        }

        if(number == reverseNumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isTrue;
        int number;

        System.out.print("Enter the number : ");
        number = input.nextInt();
        isTrue = isPalindrome(number);
        if(isTrue)
            System.out.println(number +"\t" + "is Palindrome Number");
        else
            System.out.println(number +"\t" +" is NOT Palindrome Number!");
    }
}