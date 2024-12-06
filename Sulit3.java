import java.util.Scanner;

public class Sulit3j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("» Masukkan jumlah array yang ingin di input");
        int jum = scanner.nextInt();
        int[] array = new int[jum];

        System.out.println("» Masukkan Elemen Array");
        for (int i = 0; i<jum; i++) {
            System.out.print("-> Elemen ke-" +(i+1)+": ");
            array[i]= scanner.nextInt();
        }

        int sering = array[0];
        int jumlahser = 0;
        boolean semuaSama = true;

        for(int i=0; i<jum; i++) {
            int count = 0;
            for(int o = 0; o < jum; o++) {
                if (array[i]==array[o]) {
                    count++;
                }
            }

            if (count>jumlahser) {
                sering = array[i];
                jumlahser = count;
            }

            if(i>0 && count != jumlahser) {
                semuaSama = false;
            }
        }
        if (semuaSama) {
            System.out.println("» Semua elemen memeiliki total sama");
        } else {
            System.out.println("» Elemen yang paling sering muncul adalah "
                    + sering+ " Sebanyak "
                    + jumlahser+ " kali ");
        }



        scanner.close();
    }
}
