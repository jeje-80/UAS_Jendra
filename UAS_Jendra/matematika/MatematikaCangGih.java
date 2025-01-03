package Matematika;

/**
 *
 * @author Pongo
 */
class MatematikaCangGih extends Matematika {
    public int perkalian(int a, int b) {
        return a * b;
    }
    
    public double pembagian(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        MatematikaCangGih mcg = new MatematikaCangGih();
        
        System.out.println("Perkalian 4 dan 5: " + mcg.perkalian(4, 5));
        System.out.println("Pembagian 10.0 dan 2.0: " + mcg.pembagian(10.0, 2.0));
        System.out.println("Modulus 10 dan 3: " + mcg.modulus(10, 3));
    }
}