package Day09;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

     String   dayNumber=input.next();
        switch (dayNumber){
            case "Sunday":
                System.out.println(1);
        break;
            case "Monday":
                System.out.println(2);
                break;

            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thusdey":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturdey":
                System.out.println(1);
                break;
            default:
                System.out.println("lütfen geçerli bir gün giriniz");



        }




    }
}
