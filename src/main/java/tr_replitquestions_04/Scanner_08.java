package tr_replitquestions_04;

import java.util.Scanner;

public class Scanner_08 {
    //Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
    //
    //   Örnek Çıktı:
    //
    //   Verilen tamsayının rakamları toplamı 10'dur.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uc basamakli bir tamsayi giriniz");
        int sayi = input.nextInt();

        if(sayi/1000>0 || sayi/100<1){
            System.out.println("Girdiginiz sayi 3 basamakli pozitif bir tamsayi olmalidir");
        }else{
            System.out.println("Verilen tamsayının rakamları toplamı "+((sayi%10)+((sayi/10)%10)+((sayi/100)%10))+" 'dir");
        }

    }
}
