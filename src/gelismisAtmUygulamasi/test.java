package gelismisAtmUygulamasi;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        /*

        İhsan Beyler : IBAN TR1234 000 567 985 345 6572 23 45
        Bilal Çamur : IBAN TR1265 0780 127 985 345 7572 13 89
        İhsan Beyler kullanici adi ve sifresi --- kullanici adi: ihsanbeyler123 sifre: 321
        Bilal Çamur kullanici adi ve sifresi --- kullanici adi: bilalcamur123 sifre: 654
        *Bakiye goruntuleme icin -->1
        *Para cekmek icin -->2
        *Farklı hesaba para transferi icin -->3
        *Uygulamadan cıkmak icin -->q'tusuna basiniz

         */

        Scanner scanner = new Scanner(System.in);

        int sifre = Integer.parseInt(scanner.nextLine());

                System.out.println("ATM'ye Hosgeldiniz");
        System.out.println("Lutfen Bilgilerinizi Giriniz");

        double bilalBakiye = 2450;
        String bilalIban = "TR1265 0780 127 985 345 7572 13 89";

        double ihsanBakiye = 1200;
        String ihsanIban = "TR1234 000 567 985 345 6572 23 45";

        String bilalKullaniciAdi = "bilalcamur123";
        int bilalSifre = 654;

        String ihsanKullaniciAdi = "ihsanbeyler123";
        int ihsanSifre = 321;

        System.out.println("Kullanici Adi :");
        System.out.println("Sıfre :");

    }
}
