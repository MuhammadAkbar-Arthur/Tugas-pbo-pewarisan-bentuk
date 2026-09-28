public class Silinder extends Lingkaran {
    private double tinggi;
    public Silinder(double radius, double tinggi, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
    @Override public void printInfo() {
        System.out.println("Silinder ini berwarna: " + warna);
        System.out.println("Jari-jari: " + getRadius());
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}