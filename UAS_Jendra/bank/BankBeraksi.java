/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Pongo
 */
public class BankBeraksi {
    public static void main(String[] args) {
        
        Bank bf = new Bank (1500000);
        bf.getSaldo();
        bf.simpanUang(5000000);
        bf.ambil(280000);
    }   
}
