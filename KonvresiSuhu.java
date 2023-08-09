import java.util.Scanner;

public class KonvresiSuhu{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai Celcius: ");
        double NilaiCelcius = input.nextDouble();
        System.out.println("1.Reamur");
        System.out.println("2.Fahrenheit");
        int Pilihan = input.nextInt();

        double Hasil;
        switch (Pilihan){
            case 1:
                Hasil= 0.8 * NilaiCelcius;
                System.out.println("Konversi Celcius Ke Reamur:" +Hasil);
            case 2:
                Hasil= (1.8 * NilaiCelcius) + 32;
                System.out.println("Konversi Celcius Ke Fahrenheit: " +Hasil);
        }

        
    }
}