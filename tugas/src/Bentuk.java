public class Bentuk {
    protected String warna; //di soal indo +/public, di soal inggris #/protected
    public Bentuk(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void printInfo() {
        System.out.println("Bentuk ini berwarna: " + warna);
    }
}