/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematik;

/**
 *
 * @author Pongo
 */
public class MatematikBiasa extends Matematik {
    protected int pilihan;
    
    public void pilihan() {
        System.out.println("1. Pengurangan");
        System.out.println("2. Pertambahan");
        System.out.println("3. Modulus / Sisa bagi");
    }
    
    public void getpilihan() {
        switch (pilihan) {
            case 1 ->
                System.out.println("Hasil pengurangan " + angka1 + " - " + angka2 + " = " + pengurangan());
            case 2 ->
                System.out.println("Hasil Pertambahan " + angka1 + " + " + angka2 + " = " + pertambahan());
            case 3 ->
                System.out.println("Hasil Modulus " + angka1 + " % " + angka2 + " = " + modulus());
            default ->
                System.out.println("Pilihan Tidak Valid");
        }
    }
}