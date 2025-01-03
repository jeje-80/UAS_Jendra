/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handphone;

/**
 *
 * @author Pongo
 */
public class Handphone {
    
   void turnOn() {
       System.out.println("Mengaktifkan smartphone...");
   }
   
   void makeCall(String number) {
       System.out.println("Memanggil nomor " + number);
   }
   
   void sendMessage(String number, String message) {
       System.out.println("Mengirim pesan ke " + number + ": " + message);
   }
   
   void turnOff() {
       System.out.println("Mematikan smartphone...");
   }
}