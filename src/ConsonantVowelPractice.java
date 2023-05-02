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

    }
}
