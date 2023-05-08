package Day11ForLop;

public class Forloop02 {
    public static void main(String[] args) {

String a="madagaskar";

for (int i=0;i <a.length();i++){

    char ch=a.charAt(i);
    if (ch!='a'){
        System.out.print(ch);}}
        System.out.println();

String t=a.replaceAll("a","");
        System.out.println(t);

        for (int i=0;i<a.length();i++){

            char ch=a.charAt(i);
            if (ch=='a'){continue;}
            System.out.print(ch);}






    }}
