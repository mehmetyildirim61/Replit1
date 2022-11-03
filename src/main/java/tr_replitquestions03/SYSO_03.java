package tr_replitquestions03;

public class SYSO_03 {
    //Verilen integer sayilarin Toplamini, carpimini, cikarma islemini ve bolme islemini yapan java kodunu yaziniz.
    //
    //num1=100;
    //
    //num2=25;
    //
    //Ornek Cikti:
    //
    //125
    //
    //2500
    //
    //75
    //
    //4

    public static void main(String[] args) {
        int a= 100;
        int b = 25;

        int toplam = a+b;
        int carpim = a*b;
        int cikarma = a-b;
        int bolme = a/b;

        System.out.println("toplam = " + toplam);
        System.out.println("cikarma = " + cikarma);
        System.out.println("carpim = " + carpim);
        System.out.println("bolme = " + bolme);

    }
}
