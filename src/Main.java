import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        sayi=scan.nextInt();

        for(int i=1;i<=sayi;i*=4){
            System.out.println(i);
        }
        for(int i=1;i<=sayi;i*=5){
            System.out.println(i);
        }


    }
}