
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class HotelBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereR
        Scanner input = new Scanner(System.in);

        // Inisialisasi Hotel
        Hotel hotel = new Hotel("Hotel Unsika");

        // Tambahkan beberapa kamar ke hotel
        hotel.tambahKamar(new Kamar(101));
        hotel.tambahKamar(new Kamar(102));
        hotel.tambahKamar(new Kamar(103));

        // Input data pengguna
        System.out.println("Masukkan nama Anda:");
        String nama = input.nextLine();
        System.out.println("Masukkan email Anda:");
        String email = input.nextLine();

        // Buat pengguna (sebagai Customer)
        Customer customer = new Customer(nama, email);

        // Proses pemesanan kamar
        System.out.println("Masukkan nomor kamar yang ingin dipesan:");
        int nomorKamar = input.nextInt();

        Kamar kamar = hotel.cekKetersediaan(nomorKamar);
        if (kamar != null) {
            Pesanan pesanan = new Pesanan(kamar, customer);
            hotel.tambahPesanan(pesanan);
            customer.tambahPesanan(pesanan);

            System.out.println("Kamar berhasil dipesan!");
            pesanan.lihatDetailPesanan();
        } else {
            System.out.println("Maaf, kamar tidak tersedia.");
        }

        // Melihat detail pesanan (Polymorphism)
        System.out.println("Apakah Anda ingin melihat pesanan Anda? (ya/tidak)");
        String lihatPesanan = input.next();
        if (lihatPesanan.equalsIgnoreCase("ya")) {
            customer.lihatPesanan(hotel.getDaftarPesanan());
        }

        input.close();
    }
    
    
}
