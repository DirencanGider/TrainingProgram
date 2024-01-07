import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*
        İdman oluşturma programı. İdmanda Burpee, Pushup(Şınav), Situp(Mekik) ve Squat hareketleri olacak.
        İlk olarak idmandaki hareketlerin sayısını gireceğiz. Örneğin herbirinden 50 tane.
        Sonrasıda ise kullanıcıdan idmandaki hareketlerden ne kadar yaptığını girmesini isteyeceğiz.
        OOP mantığı ile bu kodu yazacağız. 1 adet Main classımız olacak. 1 adet de Training (İdman) classımız olacak.
        Training class'ında featureları private olarak tanımlayacağız. Constructor metodu ile yazdıracağız. Sonrasında kullanırız diye de
        Getter ve Setter metodlarını yazdıracağız.
        Yine Training class'ına idmanın bitip bitmediğini anlamak, bittiyse sonlandırmak, bitmediyse devam ettirmek için metod ekleyeceğiz.
        Main class'ı üzerinden ise işlemlerimizi gerçekleştireceğiz.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("İdman Programına Hoşgeldiniz...");

        String idmanlar = "Geçerli Hareketler...\n"
                            +"Burpee\n"
                            +"Pushup\n"
                            +"Situp\n"
                            +"Squat";

        System.out.println("*******************************");
        System.out.println(idmanlar);
        System.out.println("*******************************");

        System.out.println("Bir idman oluşturun...");

        System.out.println("Burpee Sayısı : ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup Sauısı : ");
        int pushup = scanner.nextInt();
        System.out.println("Situp Sayısı : ");
        int situp = scanner.nextInt();
        System.out.println("Squat sayısı : ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Training training = new Training(burpee, pushup, situp, squat);
        System.out.println("İdmanınız başlıyor...");

        while (training.idmanBittiMi() == false) {

            System.out.println("Hareket Türü(Burpee, Pushup, Situp, Squat) : ");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();

            training.hareketYap(tur, sayi);


        }
        System.out.println("Programı başarı ile tamamladınız...Tebrikler!");



    }

}
