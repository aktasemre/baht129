package genelTekrarSrouları;

public class Sorular {
/*
      ************************************************************************
    7-----
       Ugly Number:
​
    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
​
​
    Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
​
    Test Data:
    13
​
    Beklenen çıktı:
    ugly number  degildir
​
    Test Data:
    25
    Beklenen Çıktı:
​
    ugly number
     ************************************************************************
    ************************************************************************


    Test data:
    12,24,34
​
    Beklenen Çıktı:
    12
    ************************************************************************

    ************************************************************************
    20----
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.
​
​
    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]
​
    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
    ************************************************************************
    21----
    Array deki sayıları tolpayan Java kodunu yazınız.
​
    array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
​
    Beklenen Çıktı:
    Array toplamı: 55
    ************************************************************************
    22----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
​
    Array =  [20, 30, 25, 35, -16, 60, -100 ]
​
    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
    ************************************************************************
    23----
    Aşağıdaki grid şeklini yazan Java Kodunu yazınız.
​
    Beklenen Çıktı:
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
    ************************************************************************
    24----
    yazılan değerin array içerisinde arayan Java Kodu yazınız.
​
    Array: [1551,1223,1443,1267,1789,1023,2020]
​
​
    Aranan Değer:2020
    Beklenen Çıktı:True
​
    Aranan Değer:2010
    Beklenen Çıktı :False
    ************************************************************************
    25----
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
​
    Array: [12,15,43,23,56,76,78,90,77,43]
​
    Aranan değer:56
​
    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı
​
    ************************************************************************
    26-----
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
​
    Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]
​
    ************************************************************************
    27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
​
    Array: [1232,2345,5467,678,3454,2312,3451]
​
    ************************************************************************
    28----
    Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
​
    Array: [1,2,3,4,5,6,7,8,9]
​
    Beklenen Çıktı:
​
    Tek Sayilar: 5
    Cift Sayilar: 4
    ************************************************************************
    29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
​
    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
​
    ************************************************************************
    30---
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
​
    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010
​
    Beklenen Çıktı:
    1010100
    ************************************************************************
    31----
    Saati saniyeye çeviren java methodunu yazınız.
​
    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    ************************************************************************
    32----
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.
​
    num1 = num2 => true
    ************************************************************************
    33-----
    Bir arrayi tersine çeviren  method yazınız.
​
    Test Data:
​
    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
    ************************************************************************
    34-----
    String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.
​
​
    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])
​
     ["Pair"]
    ************************************************************************
    35----
    Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.
​
    Test Data:
    arrayOfMultiples(7, 5)
​
    sonuç: [7,14,21,28,35]
​
    ************************************************************************
    36-----
    Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
​
    Test Data:
​
    isPrime(31)
    true
​
    isPrime(18)
    false
    ************************************************************************
    37-----
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
​
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
​
    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m
​
    İpucu harfleri değiştirin ve ekrana yazdırın.
    ************************************************************************
    38----
    Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.
​
    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
​
    ************************************************************************
    39-----
    Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.
​
    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.
​
    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
​
    ************************************************************************
   */
}
