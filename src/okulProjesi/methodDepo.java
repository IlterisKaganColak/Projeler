package okulProjesi;

import java.util.Scanner;

public class methodDepo {
    static Scanner scanner = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {


        String tercih = "";

        do{

        System.out.println(" ⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ KAHRAMAN KOLEJI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                              "⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ ANA MENU ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                "\n" +

                "\t   1- Okul Bilgileri Goruntule\n \n" +

                "\t   2- Ogretmen\n \n" +

                "\t   3- Ogrenci Menu\t\t \n \n" +

                "\t   Q- ÇIKIŞ\n");

        System.out.println("Lutfen Menuden Tercihinizi Yapınız");

        tercih= scanner.nextLine();

            switch (tercih) {         // try... catch kullanılabilir
                case "1": // Okul Bilgileri
                    methodDepo.okulBilgileriniYazdir();
                    break;
                case "2": // Ogretmen Menu
                    Ogretmen.ogretmenMenu();
                    break;
                case "3": // Ogrenci Menu
                    Ogrenci.ogrenciMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");
            }

            }while (!tercih.equalsIgnoreCase("q"));


        methodDepo.projeDurdur();

        }

    private static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println(" ⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚⇚ KAHRAMAN KOLEJI ⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛⇛ \n" +
                "\t\t Adres : " + Okul.adres +
                "\n\t\t Telefon : " + Okul.telefon);
        Thread.sleep(6000);
    }

    static void projeDurdur() {
        System.out.println("Okul projesinden ciktiniz");
        System.exit(0);    //Sistemin tamamen java'da durmasını istiyorsanız "System.exit" komutunu kullanabiliriz
    }


}


