package MatematikVeFizikProblemleri;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("matematik ve fizik roblemleri programına hoşgeldiniz... ");

            String islemler = "İşlemler.... \n"
                               + "1. Dairenin alanı Hesaplama \n "
                               + "2. üçgen çevresi Hesaplama  \n "
                               + "3. iç çarpım vektör hesaplama  \n"
                               + "Çıkış : q ";

            while (true) {
                System.out.println(islemler);
                System.out.println("işlemi seçin : ");

                String islem = scanner.nextLine();

                if(islem.equals("q")) {
                    System.out.println("programdan çıkılıyor");
                    break;
                }
                else if(islem.equals("1")) {
                    System.out.println("dairenin yarıcapı:  " );
                    int yaricap = scanner.nextInt();
                    scanner.nextLine();
                problem.Matematik.daireAlan(yaricap);


                }
                else if(islem.equals("2")) {
                    System.out.println("kenar 1: ");
                    int kenar1 = scanner. nextInt();
                    System.out.println("kenar 2: ");
                    int kenar2 = scanner. nextInt();
                    System.out.println("kenar 3: ");
                    int kenar3 = scanner. nextInt();
                    scanner.nextLine();

                    problem.Matematik.UcgenCevresi(kenar1, kenar2, kenar3);
                    
                }
                else if(islem.equals("3")) {

                    Vec vec1 = new Vec("vektör 1");
                    Vec vec2 = new Vec("vektör 2");

                    problem.Fizik.İcCarpım(vec1, vec2);
                }
                else {
                    System.out.println("geçersiz işlem......");
                }
            }
        }
    }
    
}
