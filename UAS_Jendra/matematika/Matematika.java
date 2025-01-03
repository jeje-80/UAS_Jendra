package Matematika;

public class Matematika {

    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pertambahan(int a, int b, int c) {
        return a + b + c;
    }

    public double pertambahan(double a, double b) {
        return a + b;
    }
    
    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Matematika matematika = new Matematika();
        System.out.println("Pertambahan (23, 34): " + matematika.pertambahan(23, 34));
        System.out.println("Pertambahan (12, 28, 14): " + matematika.pertambahan(12, 28, 14));
        System.out.println("Pertambahan (12.5, 28.7, 14.2): " + matematika.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (3.4, 4.9): " + matematika.pertambahan(3.4, 4.9));
    }
}