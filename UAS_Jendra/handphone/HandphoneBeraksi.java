/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handphone;

/**
 *
 * @author Pongo
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        // Create phone object
        Handphone hp = new Handphone();
        
        // Test phone functions
        hp.turnOn();
        hp.makeCall("081234567890");
        hp.sendMessage("081234567890", "Bayar Utangmu!");
        hp.turnOff();
    }
}