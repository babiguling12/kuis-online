/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.controller;

import kuisonline.model.Pertanyaan;
import kuisonline.util.Koneksi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUF GAMING
 */
public class PertanyaanDAO {

    // Create
    public static void addPertanyaan(Pertanyaan pertanyaan) throws SQLException {
        String query = "INSERT INTO pertanyaan (teks_pertanyaan, jawabanA, jawabanB, jawabanC, jawabanD, jawabanE, jawaban_benar, id_kuis) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pertanyaan.getTeksPertanyaan());
            statement.setString(2, pertanyaan.getJawabanA());
            statement.setString(3, pertanyaan.getJawabanB());
            statement.setString(4, pertanyaan.getJawabanC());
            statement.setString(5, pertanyaan.getJawabanD());
            statement.setString(6, pertanyaan.getJawabanE());
            statement.setString(7, pertanyaan.getJawabanBenar());
            statement.setInt(8, pertanyaan.getIdKuis());
            statement.executeUpdate();
        }
    }

    public static void addListPertanyan(List<Pertanyaan> daftarPertanyaan) throws SQLException {
        for (Pertanyaan p : daftarPertanyaan) {
            addPertanyaan(p);
        }
    }

    // Read (Get All)
    public static List<Pertanyaan> getAllPertanyaan() throws SQLException {
        List<Pertanyaan> pertanyaanList = new ArrayList<>();
        String query = "SELECT * FROM pertanyaan";
        try (Connection connection = Koneksi.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Pertanyaan pertanyaan = new Pertanyaan();
                pertanyaan.setIdPertanyaan(resultSet.getInt("id_pertanyaan"));
                pertanyaan.setTeksPertanyaan(resultSet.getString("teks_pertanyaan"));
                pertanyaan.setJawabanA(resultSet.getString("jawabanA"));
                pertanyaan.setJawabanB(resultSet.getString("jawabanB"));
                pertanyaan.setJawabanC(resultSet.getString("jawabanC"));
                pertanyaan.setJawabanD(resultSet.getString("jawabanD"));
                pertanyaan.setJawabanE(resultSet.getString("jawabanE"));
                pertanyaan.setJawabanBenar(resultSet.getString("jawaban_benar"));
                pertanyaan.setIdKuis(resultSet.getInt("id_kuis"));
                pertanyaanList.add(pertanyaan);
            }
        }
        return pertanyaanList;
    }

    // Read (Get All)
    public static List<Pertanyaan> getAllPertanyaanByIdKuis(int id) throws SQLException {
        List<Pertanyaan> pertanyaanList = new ArrayList<>();
        String query = "SELECT * FROM pertanyaan WHERE id_kuis = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Pertanyaan pertanyaan = new Pertanyaan();
                pertanyaan.setIdPertanyaan(resultSet.getInt("id_pertanyaan"));
                pertanyaan.setTeksPertanyaan(resultSet.getString("teks_pertanyaan"));
                pertanyaan.setJawabanA(resultSet.getString("jawabanA"));
                pertanyaan.setJawabanB(resultSet.getString("jawabanB"));
                pertanyaan.setJawabanC(resultSet.getString("jawabanC"));
                pertanyaan.setJawabanD(resultSet.getString("jawabanD"));
                pertanyaan.setJawabanE(resultSet.getString("jawabanE"));
                pertanyaan.setJawabanBenar(resultSet.getString("jawaban_benar"));
                pertanyaan.setIdKuis(resultSet.getInt("id_kuis"));
                pertanyaanList.add(pertanyaan);
            }
        }
        return pertanyaanList;
    }

    // Read (Get By ID)
    public static Pertanyaan getPertanyaanById(int id) throws SQLException {
        Pertanyaan pertanyaan = null;
        String query = "SELECT * FROM pertanyaan WHERE id_pertanyaan = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                pertanyaan = new Pertanyaan();
                pertanyaan.setIdPertanyaan(resultSet.getInt("id_pertanyaan"));
                pertanyaan.setTeksPertanyaan(resultSet.getString("teks_pertanyaan"));
                pertanyaan.setJawabanA(resultSet.getString("jawabanA"));
                pertanyaan.setJawabanB(resultSet.getString("jawabanB"));
                pertanyaan.setJawabanC(resultSet.getString("jawabanC"));
                pertanyaan.setJawabanD(resultSet.getString("jawabanD"));
                pertanyaan.setJawabanE(resultSet.getString("jawabanE"));
                pertanyaan.setJawabanBenar(resultSet.getString("jawaban_benar"));
                pertanyaan.setIdKuis(resultSet.getInt("id_kuis"));
            }
        }
        return pertanyaan;
    }

    // Update
    public static void updatePertanyaan(Pertanyaan pertanyaan) throws SQLException {
        String query = "UPDATE pertanyaan SET teks_pertanyaan = ?, jawabanA = ?, jawabanB = ?, jawabanC = ?, jawabanD = ?, jawabanE = ?, jawaban_benar = ?, id_kuis = ? WHERE id_pertanyaan = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pertanyaan.getTeksPertanyaan());
            statement.setString(2, pertanyaan.getJawabanA());
            statement.setString(3, pertanyaan.getJawabanB());
            statement.setString(4, pertanyaan.getJawabanC());
            statement.setString(5, pertanyaan.getJawabanD());
            statement.setString(6, pertanyaan.getJawabanE());
            statement.setString(7, pertanyaan.getJawabanBenar());
            statement.setInt(8, pertanyaan.getIdKuis());
            statement.setInt(9, pertanyaan.getIdPertanyaan());
            statement.executeUpdate();
        }
    }

    public static void updateListPertanyan(List<Pertanyaan> daftarPertanyaan) throws SQLException {
        for (Pertanyaan p : daftarPertanyaan) {
            updatePertanyaan(p);
        }
    }

    // Delete
    public static void deletePertanyaan(int id) throws SQLException {
        String query = "DELETE FROM pertanyaan WHERE id_pertanyaan = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
