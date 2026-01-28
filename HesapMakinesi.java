import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        while (true) {

            //Görsel şema
            System.out.println("-------------------------------------");
            System.out.println("| +(1) | -(2) | x(3) | /(4) |");
            System.out.println("| \u221A(5) | ^(6) | %(7) | !(8) |");
            System.out.println("|        0 - ÇIKIŞ          |");
            System.out.println("-------------------------------------");

            //Kullanıcıyı bilgilendirme
            System.out.print("HANGİ İŞLEMİ YAPACAĞINIZI SEÇİNİZ: ");
            int islemSec = giris.nextInt();

            // Eğer kullanıcı 0'a basarsa "break" komutu döngüyü kırar ve program biter.
            if (islemSec == 0) {
                System.out.println("HESAP MAKİNESİ KAPATILIYOR,İYİ GÜNLER!");
                break;
            }

            // Eğer yanlışlıkla 9, 10 gibi olmayan bir sayı girerse aşağıya inmesin, başa dönsün.
            if (islemSec < 1 || islemSec > 8) {
                System.out.println("HATALI SEÇİM! LÜTFEN LİSTEDEN BİR SAYI GİRİNİZ.");
                continue; // Döngünün başına (menüye) geri atar
            }

            System.out.print("KAÇ SAYI GİRECEKSİNİZ: ");
            int diziSayisi = giris.nextInt();

            int[] dizi = new int[diziSayisi];

            //Burada kullanıcı sayı girerek metoda gider
            switch (islemSec) {
                case 1:
                    System.out.println(toplama(islemSec, dizi));
                    break;
                case 2:
                    System.out.println(cikarma(islemSec, dizi));
                    break;
                case 3:
                    System.out.println(carpma(islemSec, dizi));
                    break;
                case 4:
                    System.out.println(bolme(islemSec, dizi));
                    break;
                case 5:
                    if (diziSayisi == 1) {
                        System.out.println(karekok(islemSec, dizi));
                        break;
                    } else {
                        System.out.println("HATA:LÜTFEN BİR TANE SAYI GİRİNİZ!");
                        break;
                    }
                case 6:
                    if (diziSayisi == 2) {
                        System.out.println(us(islemSec, dizi));
                        break;
                    } else {
                        System.out.println("HATA:ÜS ALMA İŞLEMİ İÇİN 2 SAYI GİRİNİZ (TABAN VE ÜS)!");
                        break;
                    }
                case 7:
                    if (diziSayisi == 1) {
                        System.out.println(yuzdelik(islemSec, dizi));
                        break;
                    } else {
                        System.out.println("HATA:LÜTFEN BİR TANE SAYI GİRİNİZ!");
                        break;
                    }
                case 8:
                    if (diziSayisi == 1) {
                        System.out.println(faktoriyel(islemSec, dizi));
                        break;
                    } else {
                        System.out.println("HATA:LÜTFEN BİR TANE SAYI GİRİNİZ!");
                        break;
                    }
                default:
                    System.out.println("LÜTFEN LİSTEDEKİ SAYILARDAN BİRİNİ GİRİNİZ!");
                    break;

            }

        }
    }
    //Toplama metodu
    static double toplama(int islem,int[] dizi){
        Scanner giris = new Scanner(System.in);

        int toplam = 0;
        for (int i =0 ;i <dizi.length;i++){
            System.out.print((i+1) + ".SAYIYI GİRİNİZ: ");
            dizi [i] = giris.nextInt();
            toplam += dizi[i];
        }
        return toplam;
    }
    //Çıkarma Metodu
    static double cikarma(int islem, int[] dizi) {
        Scanner giris = new Scanner(System.in);

        int cikarmaa = 0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ".SAYIYI GİRİNİZ: ");
            dizi[i] = giris.nextInt();

            if (i == 0) {
                //Kullanıcının girdiği ilk sayı burada sayacımıza eşitlenir
                cikarmaa = dizi[i];
            }
            else {
                //ardından diğer sayılar girilerek tek tek çıkarılır
                cikarmaa -= dizi[i];
            }
        }
        return cikarmaa;
    }
    //Çarpma metodu
    static double carpma(int islem,int[] dizi){
        Scanner giris = new Scanner(System.in);

        int carpmaa = 1;
        for (int i =0 ;i <dizi.length;i++){
            System.out.print((i+1) + ".SAYIYI GİRİNİZ: ");
            dizi [i] = giris.nextInt();
            carpmaa *= dizi[i];
        }
        return carpmaa;
    }
    //Bölme metodu
    static double bolme(int islem, int[] dizi) {
        Scanner giris = new Scanner(System.in);

        double bolmee = 0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ".SAYIYI GİRİNİZ: ");
            dizi[i] = giris.nextInt();

            if (i == 0) {
                // İlk sayıyı başlangıç değeri olarak alıyoruz.
                bolmee= dizi[i];
            }
            else {
                // Payda 0'a eşitse hata mesajı verilir yoksa bölünmeye devam eder
                if (dizi[i] == 0) {
                    System.out.println("HATA BİR SAYI 0'A BÖLÜNEMEZ!");
                }//Bundan sonra bölme işlemi yapılır
                else {
                    bolmee /= dizi[i];
                }
            }
        }
        return bolmee;
    }
    //Karekök metodu
    static double karekok(int islem,int[] dizi){
        Scanner giris = new Scanner(System.in);

        double karekokk = 0;
        System.out.print("KAREKÖKÜ ALINACAK SAYIYI GİRİNİZ:");
        int karekokGir = giris.nextInt();
        karekokk = Math.sqrt(karekokGir);

       return karekokk;
    }
    //Üs alma metodu
    static double us(int islem,int[] dizi){
        Scanner giris = new Scanner(System.in);

        System.out.print("TABANI GİRİNİZ:");
        dizi[0] = giris.nextInt();
        System.out.print("ÜSSÜ GİRİNİZ:");
        dizi[1] = giris.nextInt();

        double sonuc = Math.pow(dizi[0],dizi[1]);

        return sonuc;

    }
    //Yüzdelik metodu
    static double yuzdelik(int islem,int[] dizi){
        Scanner giris = new Scanner(System.in);

        System.out.print("YÜZDELİK ALINACAK SAYIYI GİRİNİZ:");
        int sayi = giris.nextInt();
        System.out.print("YÜZDELİK ORANINI GİRİNİZ:");
        int yuzdelikOrani = giris.nextInt();
        double sonucc = (sayi * yuzdelikOrani) /100.0;

        return sonucc;

    }
    //Faktöriyel metodu
    static double faktoriyel(int islem,int[] dizi){
        Scanner giris = new Scanner(System.in);

        int fact = 1;
        System.out.print("FAKTÖRİYELİ ALINACAK SAYIYI GİRİNİZ:");
        int factt = giris.nextInt();
        if(factt >= 0) {
            for (int i = 1; i <= factt; i++) {
                fact *= i;
            }
        }
        else{
            System.out.println("HATA");
        }
        return fact;
    }

}
