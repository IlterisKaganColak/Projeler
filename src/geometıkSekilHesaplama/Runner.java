package geometıkSekilHesaplama;

public class Runner {
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

        class runner {
            public static void main(String[] args) {
                hesaplaVeYazdir(new Cember(5));
                hesaplaVeYazdir(new Dikdortgen(4, 6));
                hesaplaVeYazdir(new Kare(5));
            }

            static void hesaplaVeYazdir(Sekil sekil) {
                System.out.println("Alan: " + sekil.alanHesapla());
                System.out.println("Cevre: " + sekil.cevreHesapla());
            }
        }

    }

}

