package okulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {

    static Scanner scanner = new Scanner(System.in);

   static Map<String,String> ogrenciMap = new HashMap<>();

    public static void sahteOgrenciEkle() {
        ogrenciMap.put("123456987411","Ali, Can, 2008, 3569, 12, A");
        ogrenciMap.put("123456987412","Veli, Yan, 2008, 3559, 12, B");
        ogrenciMap.put("123456987413","Ayse, Can, 2007, 4569, 12, A");
        ogrenciMap.put("123456987414","Ali, San, 2009, 1569, 11, A");
        ogrenciMap.put("123456987415","Alp, Yan, 2009, 3769, 11, A");

    }
    public static void ogrenciMenu() throws InterruptedException {

        String tercih = "";
        do {

        System.out.println(" ⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ KAHRAMAN KOLEJI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                "⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ OGRENCI MENU ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +

                "\n" +

                "\t   1- Ogrenci Listesi Yazdir \t\n " +

                "\t   2- Soyisimden Ogrenci Bulma\n " +

                "\t   3- Sinif ve Sube Ile Ogrenci Bulma \n " +

                "\t   4- Bilgilerini Girerek Ogrenci Ekleme\n " +

                "\t   5- Kimlik No Ile Kayit Silme \t\n " +

                "\t   A- ANAMENU\n " +

                "\t   Q- CIKIS");

        tercih = scanner.nextLine();

        switch (tercih){
            case "1" :
                ogrenciListeYazdir();
                break;
            case "2" :
                break;
            case "3" :
                break;
            case "4" :
                break;
            case "5" :
                break;
            case "a" :
            case "A" :
                methodDepo.anaMenu();
                break;
            case "q" :
            case "Q" :
                methodDepo.projeDurdur();
                break;
            default:
                System.out.println("Lutfen gecerli bir tercih giriniz");

        }

        } while (!tercih.equalsIgnoreCase("q"));
        methodDepo.projeDurdur();






    }

    public static void ogrenciListeYazdir() throws InterruptedException {

        Set<Map.Entry<String,String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println(ogrenciMap);

        System.out.println(" ⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ KAHRAMAN KOLEJI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                "⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ OGRENCI LISTESI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n " +
                "TC No      Isım  Soyisim   D.Yili Okul No Sinif Sube");

        for (Map.Entry<String,String> each: myEntrySet
             ) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String eachValueArr[] = eachValue.split(", ");
            System.out.printf("%12s %-6s %-9s %-7s %-8s %-5s %-2s\n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3],
                    eachValueArr[4],eachValueArr[5]);
        }
        Thread.sleep(5000);
    }

}
