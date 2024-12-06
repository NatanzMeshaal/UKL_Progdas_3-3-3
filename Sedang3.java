
import java.util.Random;
import java.util.Scanner;

public class Sedang3 {
    public static void main(String[] args) {
        String acc;
        boolean status=true;
        System.out.println("» Selamat datang di Kuis Perkalian, Pembagian, dan Modulus!\n");
        do {
            Scanner s = new Scanner(System.in);
            Random x = new Random();
        
            // angka acak
            int pertama = x.nextInt(100);
            int kedua = x.nextInt(100);
            int rumus = x.nextInt(3);

            String simbolRumus = "";
            int correctAnswer = 0;

            // menentukan rumus
            if (rumus == 0) {
                simbolRumus = " x ";
                correctAnswer = pertama * kedua;
            } else if (rumus == 1) {
                simbolRumus = " : ";
                correctAnswer = pertama / kedua;
                pertama = correctAnswer * kedua; // agar bilangan tetap bulat
            } else {
                simbolRumus = " % ";
                correctAnswer = pertama % kedua;
            }

            System.out.println("Berapa hasil dari " +pertama+simbolRumus+kedua+ "?");
            String jawaban = s.nextLine();

            try {
                int userAnswer = Integer.parseInt(jawaban);
                if (userAnswer == correctAnswer) {
                    System.out.println("Jawaban Anda benar!\n");
                } else {
                    System.out.println("Jawaban anda salah, Jawaban yang benar adalah: " + correctAnswer + "\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid (input hanya boleh angka). Silahkan mulai restart game.");
                break;
            }

            System.out.println("Lanjut gak nih quiznya?\nJawab Gas/Tidak");
            acc = s.next();

            if(acc.equalsIgnoreCase("Tidak")){
                status = false;
            }
        } while (status);
        closing();
    }
    public static void closing(){
        System.out.println("=================================");
        System.out.println("Quiz telah Selesai, Terimakasih!!");
    }
}
