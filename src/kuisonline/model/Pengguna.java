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
public class Pengguna {

    private int idPengguna;
    private String name;
    private String nis;
    private String password;
    private String role;
    private List<HasilKuis> hasilKuis; // Relasi One-to-Many (satu pengguna punya banyak hasil kuis)

    // Constructor
    public Pengguna() {
    }

    public Pengguna(int idPengguna, String name, String nis, String role) {
        this.idPengguna = idPengguna;
        this.name = name;
        this.nis = nis;
        this.role = role;
    }

    // Getters and Setters
    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<HasilKuis> getHasilKuis() {
        return hasilKuis;
    }

    public void setHasilKuis(List<HasilKuis> hasilKuis) {
        this.hasilKuis = hasilKuis;
    }
}
