/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac;

/**
 *
 * @author Pongo
 */
interface AC {
    void matikanAC();
    void hidupkanAC();
    void dinginkanAC();
    void panaskanAC();
}

public class ACBeraksi implements AC {
    private boolean statusAC = false;
    private int suhu = 16;

    @Override
    public void matikanAC() {
        statusAC = false;
        System.out.println("AC dimatikan.");
    }

    @Override
    public void hidupkanAC() {
        statusAC = true;
        System.out.println("AC dihidupkan.");
    }

    @Override
    public void dinginkanAC() {
        if (statusAC) {
            suhu = Math.max(16, suhu - 2); // Prevent going below 16°C
            System.out.println("Suhu AC diturunkan menjadi: " + suhu + "°C.");
        } else {
            System.out.println("AC mati. Hidupkan AC terlebih dahulu.");
        }
    }

    @Override
    public void panaskanAC() {
        if (statusAC) {
            suhu = Math.min(30, suhu + 5); // Prevent going above 30°C
            System.out.println("Suhu AC dinaikkan menjadi: " + suhu + "°C.");
        } else {
            System.out.println("AC mati. Hidupkan AC terlebih dahulu.");
        }
    }

    public static void main(String[] args) {
        ACBeraksi ac = new ACBeraksi();
        ac.hidupkanAC();
        ac.dinginkanAC();
        ac.panaskanAC();
        ac.matikanAC();
    }
}

    
