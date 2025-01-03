/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikacanggih;

/**
 *
 * @author Pongo
 */
public class MatematikaCanggih extends Matematika {
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus oleh nol tidak diperbolehkan.");
        }
        return a % b;
    }
}


