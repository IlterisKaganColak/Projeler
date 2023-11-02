package geometıkSekilHesaplama;

public class Runner extends  TuretilenClasslar {
    public static void main(String[] args) {
        Sekil cember = new Cember(5);
        Sekil dikdortgen = new Dikdortgen(4, 6);
        Sekil kare = new Kare(5);

        hesaplaVeYazdir("Çember", cember);
        hesaplaVeYazdir("Dikdörtgen", dikdortgen);
        hesaplaVeYazdir("Kare", kare);
    }

    static void hesaplaVeYazdir(String sekilAdi, Sekil sekil) {
        System.out.println(sekilAdi + " Alanı: " + sekil.alanHesapla());
        System.out.println(sekilAdi + " Çevresi: " + sekil.cevreHesapla());
    }
}
