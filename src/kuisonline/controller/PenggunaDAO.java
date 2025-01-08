/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import kuisonline.model.Pengguna;
import kuisonline.util.Koneksi;

/**
 *
 * @author TUF GAMING
 */
public class PenggunaDAO {

    public static Pengguna login(String nis, char[] password) {
        String query = "SELECT * FROM pengguna WHERE nis = ?";
        try (Connection conn = Koneksi.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nis);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                if (Arrays.equals(password, rs.getString("password").toCharArray())) {
                    return new Pengguna(rs.getInt("id_pengguna"), rs.getString("name"), rs.getString("nis"), rs.getString("role"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Pengguna getPenggunaByID(int id) {
        String query = "SELECT * FROM pengguna WHERE id_pengguna = ?";
        try (Connection conn = Koneksi.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Pengguna(rs.getInt("id_pengguna"), rs.getString("name"), rs.getString("nis"), rs.getString("role"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean registerPengguna(Pengguna pengguna) throws SQLException {
        String query = "INSERT INTO pengguna (name, nis, password, role) VALUES (?, ?, ?, ?)";

        try (Connection connection = Koneksi.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            // Set parameter untuk query
            statement.setString(1, pengguna.getName());
            statement.setString(2, pengguna.getNis());
            statement.setString(3, pengguna.getPassword()); // Password di-hash jika perlu
            statement.setString(4, "siswa"); // "siswa" atau "admin"

            // Eksekusi query
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0; // Return true jika berhasil, false jika gagal
        }
    }

}
