 import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur

        Scanner input = new Scanner(System.in);
        int sayi, i, k, topla, say;
        topla = 0;
        say = 0;

        System.out.println("Sayi giriniz :");
        k = input.nextInt();

        for ( i = 1; i <= k; i++ ){
            if ( i%3 == 0 && i%4 == 0)
                System.out.println("i" + i);
            topla +=i;

            say   +=1;

            System.out.println("Ortalama : " + topla/say);
        }


    }
}