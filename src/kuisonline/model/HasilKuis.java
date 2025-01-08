/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.model;

/**
 *
 * @author TUF GAMING
 */
public class HasilKuis {
    private int idHasil;
    private int total_benar;
    private int idKuis;
    private int idPengguna;
    
    // Getter dan Setter untuk idHasil
    public int getIdHasil() {
        return idHasil;
    }

    public void setIdHasil(int idHasil) {
        this.idHasil = idHasil;
    }

    // Getter dan Setter untuk nilai
    public int getTotalBenar() {
        return total_benar;
    }

    public void setTotalBenar(int total_benar) {
        this.total_benar = total_benar;
    }

    // Getter dan Setter untuk idKuis
    public int getIdKuis() {
        return idKuis;
    }

    public void setIdKuis(int idKuis) {
        this.idKuis = idKuis;
    }

    // Getter dan Setter untuk idPengguna
    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }
}
