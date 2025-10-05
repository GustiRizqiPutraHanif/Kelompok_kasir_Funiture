/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Koneksi {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // URL koneksi ke MySQL
            String url = "jdbc:mysql://localhost:3306/kelompok";
            String user = "root";
            String password = ""; // isi kalau ada password

            // Buat koneksi
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi ke database berhasil!");

        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.out.println("Gagal menutup koneksi: " + ex.getMessage());
            }
        }
    }
}
