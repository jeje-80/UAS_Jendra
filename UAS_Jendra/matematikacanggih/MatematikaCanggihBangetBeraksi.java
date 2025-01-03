/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikacanggih;

/**
 *
 * @author Pongo
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget mcb = new MatematikaCanggihBanget();

        System.out.println("Pertambahan: 10 + 20 = " + mcb.pertambahan(10, 20));
        System.out.println("Perkalian: 10 * 5 = " + mcb.perkalian(10, 5));
        System.out.println("Modulus: 10 % 3 = " + mcb.modulus(10, 3));
        System.out.println("Pertambahan Tiga: 5 + 10 + 15 = " + mcb.pertambahanTiga(5, 10, 15));
    }
}