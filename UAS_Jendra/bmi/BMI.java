/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author Pongo
 */
public class BMI {

    public double hasil;
    void bmi(double tinggi, double berat){
        hasil = berat/(tinggi*tinggi);
        
        System.out.println("hasil bmi anda adalah "+ hasil);
        String category = getBMICategory(hasil);
        System.out.println("kategori bmi: "+ category);
        System.out.println("berat badan anda "+ berat);
        System.out.println("tinggi anda "+ tinggi);
    } 

    public String getBMICategory(double hasil){
        if (hasil < 18.5){
            return "Underweight";
        } else if (hasil >= 18.5 && hasil < 24.9){
            return "Normal weight";
        } else  if (hasil >= 24.9 && hasil < 29.9){
            return "Overweight";
        } else {
            return "Obesitas";
        }
    }

    
    
    
}
