package kuisonline.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static final String URL = "jdbc:mysql://localhost:3306/kuisonline"; // Ganti dengan nama database Anda
    private static final String USER = "root"; // Ganti dengan username database Anda
    private static final String PASSWORD = ""; // Ganti dengan password database Anda

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}