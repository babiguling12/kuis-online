/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.controller;

import kuisonline.model.Kuis;
import kuisonline.util.Koneksi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUF GAMING
 */
public class KuisDAO {

    // Create
    public static int addKuis(Kuis kuis) throws SQLException {
        String query = "INSERT INTO kuis (judul, jumlah_pertanyaan, waktu_pengerjaan, id_kategori) VALUES (?, ?, ?, ?)";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, kuis.getJudul());
            statement.setInt(2, kuis.getJumlahPertanyaan());
            statement.setInt(3, kuis.getWaktuPengerjaan());
            statement.setInt(4, kuis.getIdKategori());
            statement.executeUpdate();
            
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("Creating pertanyaan failed, no ID obtained.");
            }
        }
    }

    // Read (Get All)
    public static List<Kuis> getAllKuis() throws SQLException {
        List<Kuis> kuisList = new ArrayList<>();
        String query = "SELECT * FROM kuis";
        try (Connection connection = Koneksi.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Kuis kuis = new Kuis();
                kuis.setIdKuis(resultSet.getInt("id_kuis"));
                kuis.setJudul(resultSet.getString("judul"));
                kuis.setJumlahPertanyaan(resultSet.getInt("jumlah_pertanyaan"));
                kuis.setWaktuPengerjaan(resultSet.getInt("waktu_pengerjaan"));
                kuis.setIdKategori(resultSet.getInt("id_kategori"));
                kuisList.add(kuis);
            }
        }
        return kuisList;
    }

    // Read (Get By ID)
    public static Kuis getKuisById(int id) throws SQLException {
        Kuis kuis = null;
        String query = "SELECT * FROM kuis WHERE id_kuis = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                kuis = new Kuis();
                kuis.setIdKuis(resultSet.getInt("id_kuis"));
                kuis.setJudul(resultSet.getString("judul"));
                kuis.setJumlahPertanyaan(resultSet.getInt("jumlah_pertanyaan"));
                kuis.setWaktuPengerjaan(resultSet.getInt("waktu_pengerjaan"));
                kuis.setIdKategori(resultSet.getInt("id_kategori"));
            }
        }
        return kuis;
    }
    
    // Read (Get By ID Kategori)
    public static List<Kuis> getKuisByIdKategori(int id) throws SQLException {
        List<Kuis> kuisList = new ArrayList<>();
        String query = "SELECT * FROM kuis WHERE id_kategori = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Kuis kuis = new Kuis();
                kuis.setIdKuis(resultSet.getInt("id_kuis"));
                kuis.setJudul(resultSet.getString("judul"));
                kuis.setJumlahPertanyaan(resultSet.getInt("jumlah_pertanyaan"));
                kuis.setWaktuPengerjaan(resultSet.getInt("waktu_pengerjaan"));
                kuis.setIdKategori(resultSet.getInt("id_kategori"));
                kuisList.add(kuis);
            }
        }
        return kuisList;
    }

    // Update
    public static void updateKuis(Kuis kuis) throws SQLException {
        String query = "UPDATE kuis SET judul = ?, jumlah_pertanyaan = ?, waktu_pengerjaan = ?, id_kategori = ? WHERE id_kuis = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, kuis.getJudul());
            statement.setInt(2, kuis.getJumlahPertanyaan());
            statement.setInt(3, kuis.getWaktuPengerjaan());
            statement.setInt(4, kuis.getIdKategori());
            statement.setInt(5, kuis.getIdKuis());
            statement.executeUpdate();
        }
    }

    // Delete
    public static void deleteKuis(int id) throws SQLException {
        String query = "DELETE FROM kuis WHERE id_kuis = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
