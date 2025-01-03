/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikacanggih;

/**
 *
 * @author Pongo
 */
public class Matematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian oleh nol tidak diperbolehkan.");
        }
        return a / b;
    }
}
