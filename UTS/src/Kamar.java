/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Kamar {
    private int nomorKamar;
    private boolean dipesan;

    public Kamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
        this.dipesan = false;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public boolean isDipesan() {
        return dipesan;
    }

    public void pesanKamar() {
        this.dipesan = true;
    }

    public void batalPesan() {
        this.dipesan = false;
    }
}
