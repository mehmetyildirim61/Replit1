package tr_replitquestions03;

public class SYSO_05 {
    //Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.
    //
    //A=5
    //
    //B=3
    //
    //Ipucu:
    //Dikdortgenin Cevresi : 2*(A+B);
    //
    //Dikdortgenin Alani : A * B ;
    //
    //Ornek Cikti:
    //
    //Dikdortgenin Cevresi : 16
    //
    //Dikdortgenin Alani : 15

    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int dikdortgeninAlani = a*b;
        int dikdortgeninCevresi = 2*a+2*b;

        System.out.println("Dikdortgenin Cevresi = " + dikdortgeninCevresi+" cm");
        System.out.println("Dikdortgenin Alani = " + dikdortgeninAlani+ " cm2");

    }
}
