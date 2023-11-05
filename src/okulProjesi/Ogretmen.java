package okulProjesi;

import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {

    static Scanner scanner = new Scanner(System.in);

    static Map<String , String> ogretmenlerMap = new HashMap<>();
    public static void sahteOgretmenEkle() {
        ogretmenlerMap.put("123456987411","Ali, Can,  1980,  Matematik");
        ogretmenlerMap.put("123456987412","Veli, Yan,  1981,  Fizik");
        ogretmenlerMap.put("123456987413","Ayse, Can,  1982,  Kimya");
        ogretmenlerMap.put("123456987414","Ali, San,  1983,  Kimya");
        ogretmenlerMap.put("123456987415","Alp, Yan,  1984,  Matematik");

    }

    public static void ogretmenMenu() throws InterruptedException {

        String tercih = "";

        do {


            System.out.println(" ⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ KAHRAMAN KOLEJI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                    "⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ OGRETMEN MENU ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +

                    "\n" +

                    "\t   1- Ogretmenler Listesi Yazdir \t\n " +

                    "\t   2- Soyisimden Ogretmen Bulma\n " +

                    "\t   3- Branstan Ogretmen Bulma \n " +

                    "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n " +

                    "\t   5- Kimlik No Ile Kayit Silme \t\n " +

                    "\t   A- ANAMENU\n " +

                    "\t   Q- CIKIS\n");


            tercih = scanner.nextLine();

            switch (tercih){

                 case "1":
                     ogretmenListesiYazdir();
                     break;
                 case "2":
                     soyisimdenOgretmenBulma();
                     break;
                 case "3":
                     branstanOgretmenBulma();
                     break;
                 case "4":
                     ogretmenEkleme();
                     break;
                 case "5":
                     tcNoIleOgretmenSil();
                     break;
                 case "a":
                 case "A":
                     methodDepo.anaMenu();
                     break;
                 case "q":
                 case "Q":
                     break;
                default:
                    System.out.println("Lutfen gecerli tercih yapiniz");
            }


        }while (!tercih.equalsIgnoreCase("q"));

        methodDepo.projeDurdur();


    }

    public static void tcNoIleOgretmenSil() {

        System.out.println("Lutfen Silinecek Ogretmenimizin Kimlik No'sunu Giriniz");

        String silinecekOgretmen  = scanner.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz Tc Numarasi ile Ogretmen Bulunamadi");
        }
    }

    public static void ogretmenEkleme() {

        System.out.println("TC No");
        String tcNo = scanner.nextLine();

        System.out.println("Isim");
        String isim = scanner.nextLine();

        System.out.println("Soyisim");
        String soyIsim = scanner.nextLine();

        System.out.println("Dogum Yili");
        String dogumYili = scanner.nextLine();

        System.out.println("Brans");
        String brans = scanner.nextLine();

        String eklenecekValue = isim + ", " + soyIsim + ", " + dogumYili + ", " +brans;
        ogretmenlerMap.put(tcNo, eklenecekValue);
    }

    public static void branstanOgretmenBulma() throws InterruptedException {


        System.out.println("Lutfen Aradiginiz Ogretmenimizin Bransini Giriniz");

        String istenenSoyisim = scanner.nextLine();


        Set<Map.Entry<String,String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.println(" ⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ KAHRAMAN KOLEJI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                "⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ BRANS ILE OGRETMEN  ARAMA ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                "TcNo          Isım    Soyisim   D.Yili   Brans");

        for (Map.Entry<String,String> each: ogretmenEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            System.out.println(eachKey + " " + eachValue);

            String eachValueArr[] = eachValue.split(", ");

            if (istenenSoyisim.equalsIgnoreCase(eachValueArr[4])){
                System.out.printf("%11s %-6s %-8s %4s %s \n "   , eachKey, eachValueArr[0] , eachValueArr[1] ,
                        eachValueArr[2] , eachValueArr[3]);
            }


        }
        Thread.sleep(6000);
    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {

        System.out.println("Lutfen Aradiginiz Ogretmenimizin Soyismini Giriniz");

        String istenenSoyisim = scanner.nextLine();


        Set<Map.Entry<String,String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.println(" ⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ KAHRAMAN KOLEJI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                "⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ SOYISIM ILE OGRETMEN  ARAMA ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                "TcNo          Isım    Soyisim   D.Yili   Brans");

        for (Map.Entry<String,String> each: ogretmenEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            System.out.println(eachKey + " " + eachValue);

            String eachValueArr[] = eachValue.split(", ");

            if (istenenSoyisim.equalsIgnoreCase(eachValueArr[1])){
                System.out.printf("%11s %-6s %-8s %4s %s \n "   , eachKey, eachValueArr[0] , eachValueArr[1] ,
                        eachValueArr[2] , eachValueArr[3]);
            }


        }
        Thread.sleep(6000);
    }

    public static void ogretmenListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String,String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.println(" ⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ KAHRAMAN KOLEJI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                           "⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ OGRETMEN LISTESI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                "TcNo          Isım    Soyisim   D.Yili   Brans");

        for (Map.Entry<String,String> each: ogretmenEntrySet
             ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            System.out.println(eachKey + " " + eachValue);

            String eachValueArr[] = eachValue.split(", ");

            System.out.printf("%11s %-6s %-8s %4s %s \n "   , eachKey, eachValueArr[0] , eachValueArr[1] ,
                    eachValueArr[2] , eachValueArr[3]);


        }
        Thread.sleep(6000);
    }
}
