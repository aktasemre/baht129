package genelTekrarSrouları;

import java.util.Scanner;
     //3----elirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız
      //  Örnek Sonuç:
      //  5 x 1 = 5
//        5 x 2 = 10
  //      5 x 3 = 15
    //    5 x 4 = 20
      //  5 x 5 = 25
 //       5 x 6 = 30
   //     5 x 7 = 35
     //   5 x 8 = 40
//   5 x 9 = 45
//      5 x 10 = 50
//      ************************************************************************
//      4----1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

//      Beklenen çıltı:

//      1
//   12
//        123
                //      1234
//      12345
//      123456
//      1234567
//      12345678
////      123456789
//    12345678910

public class soru03 {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz = ");
        int num = scan.nextInt();


        for (int i =1 ; i <11 ; i++) {


            System.out.println(num+"x"+i+"="+i*num);

        }


        for (int i = 1; i <12 ; i++) {


            for (int j=1;j<i;j++){
                System.out.print(j);


            }
            System.out.println();

        }
    }}
