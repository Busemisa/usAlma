import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;
        int us;
        int sonuc=1;


        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        sayi=inp.nextInt();

        System.out.print("ussunu giriniz :");
        us=inp.nextInt();

        int i=1;
        while(i<=us){
            sonuc*=sayi;
            i++;

        }
        System.out.print("sonuc : "+ sonuc );


    }
}
