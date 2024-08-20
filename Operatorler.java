public class Operatorler {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 5;
        // int toplam = a + b;
//        int cikarma = a-b;
//        int carpma = a*b;
//        int bolme = a/b;
//        int mod = a % b;
//        System.out.println("Toplama: " + toplam);
//        System.out.println("Çıkarma: 5" + cikarma);
//        System.out.println("Çarpma: " + carpma);
//        System.out.println("Bölme: " + bolme);
//        System.out.println("Mod: " + mod);
//        toplam++;
//        System.out.println(toplam);
//        cikarma--;
//        System.out.println(cikarma);
//
//        int sonuc = ++a + --b ;
//        System.out.println(sonuc);
//        System.out.println(a);
//        System.out.println(b);

        int sayi1 = 10;
        int sayi2 = 5;

        boolean kosul = (sayi1 / sayi2) == 2;
        System.out.println(kosul);

        boolean kosul1 = (sayi1 > sayi2);
        boolean kosul2 = (sayi2 < sayi1);

        boolean sonuc2 = kosul1 && kosul2;
        System.out.println(sonuc2);

        sonuc2 = kosul1 || kosul2;
        System.out.println(sonuc2);






    }
}
