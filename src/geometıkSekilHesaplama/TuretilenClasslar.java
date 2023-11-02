package geometıkSekilHesaplama;

public class TuretilenClasslar {
    interface Sekil {
        double alanHesapla();
        double cevreHesapla();
    }

    static class Cember implements Sekil {
        private final double yaricap;

        public Cember(double yaricap) {
            this.yaricap = yaricap;
        }

        @Override
        public double alanHesapla() {
            return 3.14159265 * yaricap * yaricap;   //3.14159265 yaklaşık pi deger
        }

        @Override
        public double cevreHesapla() {
            return 2 * 3.14159265 * yaricap;
        }
    }

    static class Dikdortgen implements Sekil {
        private final double uzunluk;
        private final double genislik;

        public Dikdortgen(double uzunluk, double genislik) {
            this.uzunluk = uzunluk;
            this.genislik = genislik;
        }

        @Override
        public double alanHesapla() {
            return uzunluk * genislik;
        }

        @Override
        public double cevreHesapla() {
            return 2 * (uzunluk + genislik);
        }
    }

    static class Kare implements Sekil {
        private final double kenarUzunlugu;

        public Kare(double kenarUzunlugu) {
            this.kenarUzunlugu = kenarUzunlugu;
        }

        @Override
        public double alanHesapla() {
            return kenarUzunlugu * kenarUzunlugu;
        }

        @Override
        public double cevreHesapla() {
            return 4 * kenarUzunlugu;
        }
    }
}
