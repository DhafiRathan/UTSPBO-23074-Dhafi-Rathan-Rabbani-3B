/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Pesanan {
       private Kamar kamar;
    private Pengguna pengguna;

    public Pesanan(Kamar kamar, Pengguna pengguna) {
        this.kamar = kamar;
        this.pengguna = pengguna;
        kamar.pesanKamar();
    }

    public void lihatDetailPesanan() {
        System.out.println("Kamar nomor: " + kamar.getNomorKamar());
        System.out.println("Pemesan: " + pengguna.getNama());
    }

    public Kamar getKamar() {
        return kamar;
    }
 
}
