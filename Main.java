package Project;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        System.out.println("Oyuna hoş geldiniz.  isminizi giriniz.");
        Scanner scan = new Scanner(System.in);
        String karakter_ismi = scan.nextLine();

        Character[] characters =
        	{
                new Character("Doktor", 19, 2, 10000, 0, 1000,0),
                new Character("Büyücü", 19, 3, 4200, 0, 1000,0),
                new Character("Hırsız", 19, 5, 3500, 0, 1000,0),
                new Character("Polis", 19, 6, 2000, 1, 20,0),
                new Character("Asker", 19, 5, 6500, 0, 1000,0),
                new Character("Dövüşçü", 19, 4, 5000, 0, 1000,0),
                new Character("Öğretmen", 19, 4, 2000, 0, 1000,0),
                new Character("Katil", 19, 6, 2200, 0, 1000,0),
                new Character("Dev", 19, 1, 14500, 0, 1000,0)
        };
            for (Character character : characters) {
                System.out.println("İsim: " + character.isim);
                System.out.println("Yaş: " + character.yas);
                System.out.println("Hız: " + character.hiz);
                System.out.println("Sağlık: " + character.saglik);
                System.out.println("Silah Sayısı: " + character.silah_sayisi);
                System.out.println("Mermi: " + character.mermi);
                System.out.println("Para: " + character.para);
                System.out.println("----------------"); 
            }
            System.out.println("LÜTFEN SEÇMEK İSTEDİĞİNİZ KARAKTERİN İSMİNİ YAZINIZ.");
            Scanner secim=new Scanner(System.in);
            String secilen_karakter=secim.nextLine();

        
        for (Character character : characters) 
        {
            if (character.isim.equalsIgnoreCase(secilen_karakter))
            {
                System.out.println("İsim: " + character.isim);
                System.out.println("Yaş: " + character.yas);
                System.out.println("Hız: " + character.hiz); 
                System.out.println("Sağlık: " + character.saglik);
                System.out.println("Silah Sayısı: " + character.silah_sayisi);
                System.out.println("Mermi: " + character.mermi);
                System.out.println("Para: " + character.para);
                break;
            }
   
        }
       
        scan.close(); 
        
        System.out.println("Merhaba "+karakter_ismi+"! Seçmiş olduğun "+secilen_karakter+"ile yepyeni bir maceraya başlamak üzeresin.\nİşte sana karakterinle alakalı bilmen gerekenler!");
System.out.println(Character.dev());
    }
}
