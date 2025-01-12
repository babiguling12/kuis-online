/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kuisonline.model.HasilKuis;
import kuisonline.model.Kuis;
import kuisonline.util.Koneksi;

/**
 *
 * @author TUF GAMING
 */
public class HasilKuisDAO {

    // Create
    public static void addKuis(HasilKuis hasilKuis) throws SQLException {
        String query = "INSERT INTO hasil_kuis (total_benar, id_kuis, id_pengguna) VALUES (?, ?, ?)";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, hasilKuis.getTotalBenar());
            statement.setInt(2, hasilKuis.getIdKuis());
            statement.setInt(3, hasilKuis.getIdPengguna());
            statement.executeUpdate();
        }
    }

    // Read (Get All)
    public static List<HasilKuis> getAllHasilKuis() throws SQLException {
        List<HasilKuis> hasilKuisList = new ArrayList<>();
        String query = "SELECT * FROM hasil_kuis";
        try (Connection connection = Koneksi.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                HasilKuis hasilKuis = new HasilKuis();
                hasilKuis.setIdHasil(resultSet.getInt("id_hasil"));
                hasilKuis.setTotalBenar(resultSet.getInt("total_benar"));
                hasilKuis.setIdKuis(resultSet.getInt("id_kuis"));
                hasilKuis.setIdPengguna(resultSet.getInt("id_pengguna"));
                hasilKuisList.add(hasilKuis);
            }
        }
        return hasilKuisList;
    }
    
// Read (Get By ID Kuis and Pengguna)
    public static HasilKuis getHasilKuisByPengguna(int idKuis, int idPengguna) throws SQLException {
        HasilKuis hasilKuis = null;
        String query = "SELECT * FROM hasil_kuis WHERE id_kuis = ? AND id_pengguna = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idKuis);
            statement.setInt(2, idPengguna);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                hasilKuis = new HasilKuis();
                hasilKuis.setIdHasil(resultSet.getInt("id_hasil"));
                hasilKuis.setTotalBenar(resultSet.getInt("total_benar"));
                hasilKuis.setIdKuis(resultSet.getInt("id_kuis"));
                hasilKuis.setIdPengguna(resultSet.getInt("id_pengguna"));
            }
        }
        return hasilKuis;
    }

// Read (Get By ID Kuis)
    public static List<HasilKuis> getHasilKuisByKuis(int idKuis) throws SQLException {
        List<HasilKuis> hasilKuisList = new ArrayList<>();
        String query = "SELECT * FROM hasil_kuis WHERE id_kuis = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idKuis);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HasilKuis hasilKuis = new HasilKuis();
                hasilKuis.setIdHasil(resultSet.getInt("id_hasil"));
                hasilKuis.setTotalBenar(resultSet.getInt("total_benar"));
                hasilKuis.setIdKuis(resultSet.getInt("id_kuis"));
                hasilKuis.setIdPengguna(resultSet.getInt("id_pengguna"));
                hasilKuisList.add(hasilKuis);
            }
        }
        return hasilKuisList;
    }
    
    // Delete hasil kuis
    public static void deleteHasilKuisByKuis(int idKuis) throws SQLException {
        String query = "DELETE FROM hasil_kuis WHERE id_kuis = ?";
        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idKuis);
            statement.executeUpdate();
        }
    }
}
