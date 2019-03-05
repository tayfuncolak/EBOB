
package ebob;

import java.util.Scanner;

public class Ebob {

    public static int ebobBul(int sayi1, int sayi2){
        int ebob = 1;
        for(int i = 1; i<=sayi1 && i<=sayi2; i++){
            if((sayi1 % i ==0) && (sayi2 % i == 0)){
            ebob = i;
            }   
        }
        return ebob;
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz :");
        int birinci_sayi = scanner.nextInt();
        System.out.println("İkinci Sayıyı Giriniz :");
        int ikinci_sayi = scanner.nextInt();
        System.out.println(birinci_sayi + " ve " + ikinci_sayi +" Sayılarının EBOB'u :" + ebobBul(birinci_sayi, ikinci_sayi)  );
        
       
    }
    
}
