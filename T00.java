import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;

        x = input.nextInt();
        y = input.nextInt();
        if (x % 2 == 0) {
            System.out.println(" Bilangan pertama : Genap ");
        } else {
            System.out.println(" Bilangan pertama : Ganjil ");
        }
        if (y % 2 == 0) {
            System.out.println(" Bilangan kedua: Genap ");
        } else {
            System.out.println(" Bilangan kedua: Ganjil");
        }
        if (x > y) {
            System.out.println(" Bilangan Pertama lebih besar ");
        } else {
            System.out.println(" Bilangan Kedua lebih besar ");
        }
        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println(" Hasil Penjumlahan " + x + y);
        } else {
            if (x % 2 != 0 && y % 2 != 0) {
                System.out.println(" Kedua ganjil, Hasil Perkalian" + x * y);
            } else {
                System.out.println("Berbeda Jenis");
            }
        }
    }
}
