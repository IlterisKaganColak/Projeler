package geometıkSekilHesaplama;

public class sorunun_Cozumu_1 {

    public static void main(String[] args) {

        class Sekil {
            double alanHesapla() {
                return 0.0;
            }

            double cevreHesapla() {
                return 0.0;
            }
        }

        class Cember extends Sekil {
            private double yaricap;

            public Cember(double yaricap) {
                this.yaricap = yaricap;
            }

            @Override
            double alanHesapla() {
                return Math.PI * yaricap * yaricap;
            }

            @Override
            double cevreHesapla() {
                return 2 * Math.PI * yaricap;
            }
        }

        class Dikdortgen extends Sekil {
            private double uzunluk;
            private double genislik;

            public Dikdortgen(double uzunluk, double genislik) {
                this.uzunluk = uzunluk;
                this.genislik = genislik;
            }

            @Override
            double alanHesapla() {
                return uzunluk * genislik;
            }

            @Override
            double cevreHesapla() {
                return 2 * (uzunluk + genislik);
            }
        }

        class Kare extends Dikdortgen {
            public Kare(double kenarUzunlugu) {
                super(kenarUzunlugu, kenarUzunlugu);
            }
        }




    }
}
