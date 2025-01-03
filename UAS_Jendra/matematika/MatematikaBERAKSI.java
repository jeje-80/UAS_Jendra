package Matematika;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */

class MatematikaBERAKSI extends Matematika {
    public double hitungPecahan(double a, double b, double c) {
        return a + b + c;
    }

    public int[] deret(int n) {
        int[] hasil = new int[n];
        for (int i = 0; i < n; i++) {
            hasil[i] = i + 1;
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        MatematikaBERAKSI mb = new MatematikaBERAKSI();

        // Menguji metode hitungPecahan
        double resultPecahan = mb.hitungPecahan(12.5, 28.7, 14.2);
        System.out.println("Hasil hitung pecahan: " + resultPecahan);

        // Menguji metode deret
        int n = 5;
        int[] deretHasil = mb.deret(n);
        System.out.print("Deret angka dari 1 hingga " + n + ": ");
        for (int num : deretHasil) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class MatematikaBERAKSITest {
    public void testHitungPecahan() {
        MatematikaBERAKSI mb = new MatematikaBERAKSI();
        double result = mb.hitungPecahan(12.5, 28.7, 14.2);
        assertEquals(55.4, result, 0.001);
    }

    private void assertEquals(double expected, double actual, double delta) {
        if (Math.abs(expected - actual) > delta) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }
}