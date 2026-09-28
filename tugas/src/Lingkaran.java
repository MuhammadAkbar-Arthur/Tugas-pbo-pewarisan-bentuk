public class Lingkaran extends Bentuk {
    protected double radius;//di soal indo -/private, di soal eng #/protected
    public static final double PI = 3.14159;
    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double hitungLuas() {
        return PI * radius * radius;
    }
    @Override public void printInfo() {
        System.out.println("Lingkaran ini berwarna: " + warna);
        System.out.println("Jari-jari: " + radius);
        System.out.println("Luas: " + hitungLuas());
    }
}
