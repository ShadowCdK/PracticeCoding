import java.util.Locale;
import java.util.Scanner;

public class ConsonantVowelPractice {

    public static void main(String[] args) {

        //Method input (Scanner)
        Scanner input = new Scanner(System.in);

        //Input
        System.out.println("Masukkan Teks : ");
        String inputString = input.nextLine();

        //Proses
        process(inputString);
    }

    //Method for process
    private static void process (String inputString) {
        //Proses
        //Pembuatan Array huruf vokal dan konsonan
        char[] hurufVokal = ['a','i','u','e','o'];
        char[] hurufKonsonan = ['b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'];

        //Perulangan untuk mencari jumlah huruf vokal dan konsonan
        int jumlahHurufVokal = 0;
        int jumlahHurufKonsonan = 0;

        for (int i = 0; i<inputString.length(); i++) {
            //Jumlah Huruf Konsonan
            for (int j = 0; j < hurufKonsonan.length; j++) {
                if(inputString.toLowerCase().charAt(i) == hurufKonsonan[j]){
                    jumlahHurufKonsonan++;
                }

            }
            //Jumlah Huruf Vokal
            for (int j = 0; j < hurufVokal.length ; j++) {
                if (inputString.toLowerCase().charAt(i) == hurufVokal[j]){
                    jumlahHurufVokal++;
                }

            }
        }


    }
}
