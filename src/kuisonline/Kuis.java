/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author TUF GAMING
 */
public class Kuis {
    int idKuis;
    String judul;
    int jumPertanyaan;
    int waktuPengerjaan;
    int kategori;
    
    Kuis(int idKuis, String judul, int jumPertanyaan, int waktuPengerjaan, int kategori) {
        this.idKuis = idKuis;
        this.judul = judul;
        this.jumPertanyaan = jumPertanyaan;
        this.waktuPengerjaan = waktuPengerjaan;
        this.kategori = kategori;
    }
    
    Pertanyaan[] buatPertanyaan() {
        Pertanyaan[] p = new Pertanyaan[this.jumPertanyaan];
        for(int i=0;i<p.length;i++) {
            p[i] = new Pertanyaan();    
        }
        return p;
    }
}
