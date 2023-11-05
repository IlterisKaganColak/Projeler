package okulProjesi;

import java.util.HashMap;
import java.util.Map;

public class Ogrenci {

   static Map<String,String> ogrenciMap = new HashMap<>();

    public static void sahteOgrenciEkle() {
        ogrenciMap.put("123456987411","Ali, Can, 2008, 3569, 12, A");
        ogrenciMap.put("123456987412","Veli, Yan, 2008, 3559, 12, B");
        ogrenciMap.put("123456987413","Ayse, Can, 2007, 4569, 12, A");
        ogrenciMap.put("123456987414","Ali, San, 2009, 1569, 11, A");
        ogrenciMap.put("123456987415","Alp, Yan, 2009, 3769, 11, A");

    }
    public static void ogrenciMenu(){

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








    }

}
