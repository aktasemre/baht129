package Day11ForLop;

public class ForLoop01 {
    public static void main(String[] args) {
       String a="I love Java";
        for (int i=0;i<a.length();i++){

            if (a.charAt(i)=='a'){break;}
            System.out.print(a.charAt(i));
        }
        System.out.println();
        System.out.println("********************");
        String c="Germany";

        for ( int i=c.length()-1;i>=0;i--){
            char ch= c.charAt(i);
            if (ch=='a'){break;}

            System.out.print(ch);}









    }
}
