
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
public class Customer extends Pengguna implements AksesPengguna {
        private List<Pesanan> pesananPribadi = new ArrayList<>();

    public Customer(String nama, String email) {
        super(nama, email);
    }
    
    // Polymorphism untuk Customer: hanya bisa melihat pesanan pribadi

    @Override
    public void lihatPesanan(List<Pesanan> daftarPesanan) {
        System.out.println("Pesanan Anda:");
        for (Pesanan pesanan : pesananPribadi) {
            pesanan.lihatDetailPesanan();
        }
    }   
    
    void tambahPesanan(Pesanan pesanan) {
        pesananPribadi.add(pesanan);
    }
}


