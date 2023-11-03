package tugasliokusnata;
import java.util.Scanner;
public class perulanganwhile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan batas maksimum: ");
            int batas = scanner.nextInt();

            int angka = 5;

            while (angka <= batas) {
                if (angka % 5 == 0) {
                    System.out.println(angka);
                }
                angka += 5;
            }

            scanner.close();
        }
    }