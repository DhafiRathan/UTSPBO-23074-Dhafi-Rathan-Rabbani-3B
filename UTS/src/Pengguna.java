/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Kelas Pengguna
 */

abstract public class Pengguna {
    protected String nama;
    protected String email;

    public Pengguna(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }
}
