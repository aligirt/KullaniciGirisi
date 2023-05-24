import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String id, pw, key;
        String ch;

        Scanner inp = new Scanner(System.in);

        System.out.print("ID :");
        id = inp.nextLine();

        System.out.print("PW :");
        pw = inp.nextLine();

        if(id.equals("AliGirit") && pw.equals("123ali")){
            System.out.println("Giriş Başarılı !");
        }
        else{
            System.out.println("Kullanıcı Bilgileri Hatalı !\n\nDeğiştirmek İster misiniz?\nYes(y)  No(n)");
            ch = inp.nextLine();
            if(ch.equals("y")){
                System.out.print("Anahtarınızı Giriniz :");
                key = inp.nextLine();
                if(key.equals("456")){
                    System.out.print("ID :");
                    id = inp.nextLine();
                    System.out.print("PW :");
                    pw = inp.nextLine();
                    System.out.println("\nKullanıcı Bilgileriniz Başarılı Bir Şekilde Değiştirildi.");
                }
                else{
                    System.out.println("Bilgiler Hatalı. Program Sonlandı.");
                }
            }
            else{
                System.out.println("İyi Günler Dilerim.");
            }
        }
    }
}