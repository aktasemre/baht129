package Day11ForLop;

public class ForLoop03 {
    public static void main(String[] args) {

        String a="Java";
        String t="";
        for (int i=a.length()-1;i>=0;i--){


            t=t+a.charAt(i);
            System.out.print(a.charAt(i));}
        System.out.println();
        System.out.println(t);

        String p="avka";
        String k="";
        for (int i=p.length()-1;i>=0;i--){



            k=k+p.charAt(i);}

            if (p.equalsIgnoreCase(k)){
                System.out.println(p+ ":  polidromdur");}else {
                System.out.println(p+ ":  polindrom değildir");}



    }}
