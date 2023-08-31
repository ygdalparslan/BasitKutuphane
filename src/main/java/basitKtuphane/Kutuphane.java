package basitKtuphane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kutuphane {
    static Scanner input = new Scanner(System.in);
    static List<String> kutuphane = new ArrayList<>();

    public static void main(String[] args) {

        kutuphane();
    }

    public static void kutuphane() {
        System.out.println("Kütüphanemize Hoş Geldiniz " +
                "\nLütfen Yapmak İstediğiniz İşlemi Seçiniz " +
                "\n1 -KİTAP EKLE" +
                "\n2 -KİTAP LİSTESİ" +
                "\n3 -KİTAP SİL" +
                "\n4 -TÜM KİTAPLARI SİL");
        int islem = input.nextInt();
        kutuphane.add("Dijital Kale");
        kutuphane.add("Dünya");
        kutuphane.add("Ay");

        switch (islem) {
            case 1:
                kitapEkle();
                break;
            case 2:
                kitapListele();
                break;
            case 3:
                kitapSil();
                break;
            case 4:
                temizle();
                break;
            default:
                System.out.println("Geçersiz İşlem");
        }

    }

    public static void kitapEkle() {
        System.out.println("Lütfen Eklemek İstediğiniz Kitabın İsmini Giriniz");
        String kitapEkle = input.next();
        kutuphane.add(kitapEkle);
        System.out.println("kutuphane = " + kutuphane);
    }

    public static void kitapListele() {
        System.out.println("kutuphane = " + kutuphane);
    }

    public static void kitapSil() {
        System.out.println("Lütfen Silmek İstediğiniz Kitabın İsmini Giriniz");
        String kitapSil = input.next();

        for (int i = 0; i < kutuphane.size(); i++) {
            if (kutuphane.get(i).contains(kitapSil)) {
                kutuphane.remove(i);
                System.out.println("kutuphane = " + kutuphane);
            }
        }
    }

    public static void temizle() {
        kutuphane.clear();
        System.out.println("kutuphane = " + kutuphane);
    }

}
