
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Admin extends Pengguna implements AksesPengguna {
        public Admin(String nama, String email) {
        super(nama, email);
    }
        
       // Polymorphism untuk Admin: bisa melihat semua pesanan
        
    @Override
    public void lihatPesanan(List<Pesanan> daftarPesanan) {
    System.out.println("Daftar Semua Pesanan:");
        for (Pesanan pesanan : daftarPesanan) {
            pesanan.lihatDetailPesanan();
        }
    }   
}
