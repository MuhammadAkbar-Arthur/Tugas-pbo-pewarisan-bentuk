import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // POLYMORPHISM: Array induk (Bentuk) menampung berbagai objek turunannya
        Bentuk[] daftarBentuk = new Bentuk[10];
        int jumlahBentuk = 0;
        boolean isRunning = true;
        
        System.out.println("=========================================");
        System.out.println(" 🛠️ BENGKEL GEOMETRI AKBAR 🛠️ ");
        System.out.println("=========================================");

        while (isRunning) {
            System.out.println("\n--- MENU BENGKEL ---");
            System.out.println("1. Buat Bentuk Umum");
            System.out.println("2. Buat Bujur Sangkar");
            System.out.println("3. Buat Lingkaran");
            System.out.println("4. Buat Silinder");
            System.out.println("5. Tampilkan Semua (Test Polymorphism!)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            
            int pilihan = input.nextInt();
            input.nextLine(); // Consume newline

            // Proteksi agar array tidak jebol
            if (pilihan >= 1 && pilihan <= 4 && jumlahBentuk >= 10) {
                System.out.println("-> Peringatan: Kapasitas bengkel penuh (Maksimal 10 bentuk)!");
                continue; 
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan warna: ");
                    String warnaBentuk = input.nextLine();
                    daftarBentuk[jumlahBentuk] = new Bentuk(warnaBentuk);
                    jumlahBentuk++;
                    System.out.println("-> Bentuk umum berhasil dibuat!");
                    break;
                    
                case 2:
                    System.out.print("Masukkan warna: ");
                    String warnaBujur = input.nextLine();
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = input.nextDouble();
                    input.nextLine(); 
                    daftarBentuk[jumlahBentuk] = new BujurSangkar(sisi, warnaBujur);
                    jumlahBentuk++;
                    System.out.println("-> Bujur Sangkar berhasil dibuat!");
                    break;
                    
                case 3:
                    System.out.print("Masukkan warna: ");
                    String warnaLingkaran = input.nextLine();
                    System.out.print("Masukkan jari-jari: ");
                    double radiusLingkaran = input.nextDouble();
                    input.nextLine(); 
                    daftarBentuk[jumlahBentuk] = new Lingkaran(radiusLingkaran, warnaLingkaran);
                    jumlahBentuk++;
                    System.out.println("-> Lingkaran berhasil dibuat!");
                    break;
                    
                case 4:
                    System.out.print("Masukkan warna: ");
                    String warnaSilinder = input.nextLine();
                    System.out.print("Masukkan jari-jari alas: ");
                    double radiusSilinder = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();
                    input.nextLine(); 
                    daftarBentuk[jumlahBentuk] = new Silinder(radiusSilinder, tinggi, warnaSilinder);
                    jumlahBentuk++;
                    System.out.println("-> Silinder berhasil dibuat!");
                    break;
                    
                case 5:
                    System.out.println("\n=== 📊 DAFTAR BENTUK ===");
                    if (jumlahBentuk == 0) {
                        System.out.println("Belum ada bentuk yang tersimpan.");
                    } else {
                        // Looping Polymorphism
                        for (int i = 0; i < jumlahBentuk; i++) {
                            System.out.print((i + 1) + ". ");
                            daftarBentuk[i].printInfo();
                        }
                    }
                    break;
                    
                case 6:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan BENGKEL GEOMETRI AKBAR!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        input.close();
    }
}