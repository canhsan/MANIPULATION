package while_Loop;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ornek_7 {
    /*
    Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
    bulunuz, tamkare ise true değilse false yazdırınız.
    Ornek : input : 16, output: 4
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int sayi = scan.nextInt();
        int flag = 0;


        for (int i = 1; i < sayi; i++) {
            if (i * i == sayi) {
                flag++;
                System.out.println(i + "\n true");
            }

        }
        if (flag == 0) {
            System.out.println("false");
        }

    }

}
