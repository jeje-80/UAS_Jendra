/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author Pongo
 */
public class Bank {
    int saldo;
    public Bank (int saldo){
        this.saldo = saldo;
    }
    
    void getSaldo (){
        System.out.println("Welcome to BANK Finex");
        System.out.println("Saldo anda saat ini : Rp." + saldo);
    }
    
    void simpanUang (int simpan){
        saldo += simpan;
        System.out.println("Anda menyimpan uang sebesar : Rp." + simpan);
        System.out.println("Saldo anda saat ini : Rp." + saldo);
    }
    
    void ambil (int ambil){
        saldo -= ambil;
        System.out.println("Anda ambil uang dengan nominal : Rp." + ambil);
        System.out.println("Saldo anda saat ini : Rp." + saldo);
        System.out.println("Terima kasih atas kunjungan anda");
    } 
}
