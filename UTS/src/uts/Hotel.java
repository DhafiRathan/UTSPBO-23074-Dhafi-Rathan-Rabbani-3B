
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Hotel {
        private String namaHotel;
    private List<Kamar> daftarKamar;
    private List<Pesanan> daftarPesanan;

    public Hotel(String namaHotel) {
        this.namaHotel = namaHotel;
        this.daftarKamar = new ArrayList<>();
        this.daftarPesanan = new ArrayList<>();
    }

    public void tambahKamar(Kamar kamar) {
        daftarKamar.add(kamar);
    }

    public Kamar cekKetersediaan(int nomorKamar) {
        for (Kamar kamar : daftarKamar) {
            if (kamar.getNomorKamar() == nomorKamar && !kamar.isDipesan()) {
                return kamar;
            }
        }
        return null;  // Kamar tidak tersedia
    }

    public void tambahPesanan(Pesanan pesanan) {
        daftarPesanan.add(pesanan);
    }


    List<Pesanan> getDaftarPesanan() {
        return daftarPesanan;
    }
}
