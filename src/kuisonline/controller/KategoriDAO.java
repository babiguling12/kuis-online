/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kuisonline.model.Kategori;
import kuisonline.util.Koneksi;

/**
 *
 * @author TUF GAMING
 */
public class KategoriDAO {
    
    // Read Kategori
    public static List<Kategori> getAllKategori() throws SQLException {
        List<Kategori> kategoriList = new ArrayList<>();
        String query = "SELECT * FROM kategori";
        try (Connection connection = Koneksi.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Kategori kategori = new Kategori();
                kategori.setIdKategori(resultSet.getInt("id_kategori"));
                kategori.setNamaKategori(resultSet.getString("nama_kategori"));
                kategoriList.add(kategori);
            }
        }
        return kategoriList;
    }
}
