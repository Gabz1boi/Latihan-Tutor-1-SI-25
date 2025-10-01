import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
        int x, y;

        x = input.nextInt();
        y = input.nextInt();

        // Bagian A
        if (x % 2 == 0) {
            System.out.println("Bilangan pertama : Genap");
        } else {
            System.out.println("Bilangan pertama : Ganjil");
        }

        if (y % 2 == 0) {
            System.out.println("Bilangan kedua : Genap");
        } else {
            System.out.println("Bilangan kedua : Ganjil");
        }

        // Bagian B
        if (x > y) {
            System.out.println("Bilangan pertama lebih besar");
        } else if (y > x) {
            System.out.println("Bilangan kedua lebih besar");
        } else {
            System.out.println("Kedua bilangan sama besar");
        }

        // Bagian C
        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println("Hasil Penjumlahan: " + (x + y));
        } else if (x % 2 != 0 && y % 2 != 0) {
            System.out.println("Hasil Perkalian: " + (x * y));
        } else {
            System.out.println("Berbeda Jenis");
        }
    }
}
