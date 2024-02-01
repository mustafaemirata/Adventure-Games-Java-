package Project;

public class Character {
    String isim;
    int yas;
    int saglik;
    int silah_sayisi;
    int mermi;
    int para;
    int hiz; // Yeni eklendi

    public Character(String isim, int yas, int hiz, int saglik, int silah_sayisi, int mermi, int para) {
        this.isim = isim;
        this.yas = yas;
        this.hiz = hiz;
        this.saglik = saglik;
        this.silah_sayisi = silah_sayisi;
        this.mermi = mermi;
        this.para = para;
    }
    public static String dev() {
    	String mesaj="Karakteriniz oyundaki en güçlü savaşçıdır. En fazla cana sahip olmasının yanında fiziği gereği çok yavaş hareket eder.\nÇünkü çok fazla kiloludur. Karşısındaki düşmana vereceği hasarın ardından açlık durumu diğer karakterlerden\n daha fazla etkilenecek ve bulması gereken yemek miktarı nedeniyle ekonomik olarak zayıflayacaksın. Fakat\nformda bir devin yapabileceklerini kestirmek çok güçtür.";
  
    	return mesaj;
    }
    
    
    public String toString() {
        return "Character{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                ", hiz=" + hiz +
                ", saglik=" + saglik +
                ", silah_sayisi=" + silah_sayisi +
                ", mermi=" + mermi +
                ", para=" + para +
                '}';
    }

   
    }


