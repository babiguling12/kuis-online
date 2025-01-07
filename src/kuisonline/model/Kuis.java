/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.model;

import java.util.List;

/**
 *
 * @author TUF GAMING
 */
public class Kuis {
    private int idKuis;
    private String judul;
    private int jumlahPertanyaan;
    private int waktuPengerjaan;
    private int idKategori;
    private List<Pertanyaan> pertanyaan;
    
    public Kuis() {}
    
    public Kuis(int idKuis, String judul, int jumlahPertanyaan, int waktuPengerjaan, int idKategori) {
        this.idKuis = idKuis;
        this.judul = judul;
        this.jumlahPertanyaan = jumlahPertanyaan;
        this.waktuPengerjaan = waktuPengerjaan;
        this.idKategori = idKategori;
    }
    
    // Getter dan Setter untuk idKuis
    public int getIdKuis() {
        return idKuis;
    }

    public void setIdKuis(int idKuis) {
        this.idKuis = idKuis;
    }

    // Getter dan Setter untuk judul
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter dan Setter untuk jumlahPertanyaan
    public int getJumlahPertanyaan() {
        return jumlahPertanyaan;
    }

    public void setJumlahPertanyaan(int jumlahPertanyaan) {
        this.jumlahPertanyaan = jumlahPertanyaan;
    }

    // Getter dan Setter untuk waktuPengerjaan
    public int getWaktuPengerjaan() {
        return waktuPengerjaan;
    }

    public void setWaktuPengerjaan(int waktuPengerjaan) {
        this.waktuPengerjaan = waktuPengerjaan;
    }

    // Getter dan Setter untuk idKategori
    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    // Getter dan Setter untuk pertanyaan
    public List<Pertanyaan> getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(List<Pertanyaan> pertanyaan) {
        this.pertanyaan = pertanyaan;
    }
}
