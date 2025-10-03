// 12S25021-Gabriel Ignasius Sinaga 12S25030-Nina Theresia Tarigan

import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;

        x = input.nextInt();
        y = input.nextInt();
        if (x % 2 == 0) {
            System.out.println(" Bilangan pertama: Genap ");
        } else {
            System.out.println(" Bilangan pertama: Ganjil ");
        }
        if (y % 2 == 0) {
            System.out.println(" Bilangan kedua: Genap ");
        } else {
            System.out.println(" Bilangan kedua: Ganjil");
        }
        if (x > y) {
            System.out.println(" Bilangan pertama lebih besar ");
        }
        if (x < y) {
            System.out.println(" Bilangan kedua lebih besar ");
        }
        if (y == x) {
            System.out.println(" Kedua Bilangan sama besar ");
        }
        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println(" Hasil Penjumlahan :" + x + y);
        }
        if (x % 2 != 0 && y % 2 != 0) {
            System.out.println("Hasil Perkalian: " + x * y);
        }
        if (x % 2 != 0 && y % 2 == 0) {
            System.out.println("Berbeda Jenis");
        }
        if (x % 2 == 0 && y % 2 != 0) {
            System.out.println("Berbeda Jenis");
        }
    }
}
