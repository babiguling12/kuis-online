/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.model;

/**
 *
 * @author TUF GAMING
 */
public class Pertanyaan {
    private int idPertanyaan;
    private String teksPertanyaan;
    private String jawabanA;
    private String jawabanB;
    private String jawabanC;
    private String jawabanD;
    private String jawabanE;
    private String jawabanBenar;
    private int idKuis;
    
    public Pertanyaan() {}
    
    public Pertanyaan(int idPertanyaan, String teksPertanyaan, String jawabanA, String jawabanB, String jawabanC, String jawabanD, String jawabanE, String jawabanBenar, int idKuis) {
        this.idPertanyaan = idPertanyaan;
        this.teksPertanyaan = teksPertanyaan;
        this.jawabanA = jawabanA;
        this.jawabanB = jawabanB;
        this.jawabanC = jawabanC;
        this.jawabanD = jawabanD;
        this.jawabanE = jawabanE;
        this.jawabanBenar = jawabanBenar;
        this.idKuis = idKuis;
    }

    // Getter dan Setter untuk idPertanyaan
    public int getIdPertanyaan() {
        return idPertanyaan;
    }

    public void setIdPertanyaan(int idPertanyaan) {
        this.idPertanyaan = idPertanyaan;
    }

    // Getter dan Setter untuk teksPertanyaan
    public String getTeksPertanyaan() {
        return teksPertanyaan;
    }

    public void setTeksPertanyaan(String teksPertanyaan) {
        this.teksPertanyaan = teksPertanyaan;
    }

    // Getter dan Setter untuk jawabanA
    public String getJawabanA() {
        return jawabanA;
    }

    public void setJawabanA(String jawabanA) {
        this.jawabanA = jawabanA;
    }

    // Getter dan Setter untuk jawabanB
    public String getJawabanB() {
        return jawabanB;
    }

    public void setJawabanB(String jawabanB) {
        this.jawabanB = jawabanB;
    }

    // Getter dan Setter untuk jawabanC
    public String getJawabanC() {
        return jawabanC;
    }

    public void setJawabanC(String jawabanC) {
        this.jawabanC = jawabanC;
    }

    // Getter dan Setter untuk jawabanD
    public String getJawabanD() {
        return jawabanD;
    }

    public void setJawabanD(String jawabanD) {
        this.jawabanD = jawabanD;
    }

    // Getter dan Setter untuk jawabanE
    public String getJawabanE() {
        return jawabanE;
    }

    public void setJawabanE(String jawabanE) {
        this.jawabanE = jawabanE;
    }

    // Getter dan Setter untuk jawabanBenar
    public String getJawabanBenar() {
        return jawabanBenar;
    }

    public void setJawabanBenar(String jawabanBenar) {
        this.jawabanBenar = jawabanBenar;
    }

    // Getter dan Setter untuk idKuis
    public int getIdKuis() {
        return idKuis;
    }

    public void setIdKuis(int idKuis) {
        this.idKuis = idKuis;
    }
}
