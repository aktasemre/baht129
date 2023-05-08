package Day09;

public class NestedTerneri01 {
    public static void main(String[] args) {

        int a=2020;

       String b=a%100==0?(a%400==0?"leap":"Not leap"):(a%4==0?"Leap":"Not lep");

        System.out.println(b);
    }
}
