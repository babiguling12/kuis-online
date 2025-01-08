/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.util;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class DragListener extends MouseAdapter {
    private Point mouseDownScreenCoords = null; // Posisi mouse di layar saat klik
    private Point mouseDownCompCoords = null;  // Posisi mouse relatif ke JFrame
    private JFrame frame;

    public DragListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Simpan posisi mouse di layar dan relatif ke JFrame
        mouseDownScreenCoords = e.getLocationOnScreen();
        mouseDownCompCoords = e.getPoint();

        // Jika JFrame dalam keadaan maximized
        if (frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            // Hitung posisi klik relatif terhadap layar sebelum keluar dari maximized
            int clickX = mouseDownScreenCoords.x;
            int clickY = mouseDownScreenCoords.y;

            // Ubah JFrame ke mode normal
            frame.setExtendedState(JFrame.NORMAL);

            // Tunggu hingga JFrame selesai merespon perubahan ke normal
            SwingUtilities.invokeLater(() -> {
                // Hitung ukuran JFrame dalam mode normal
                Dimension frameSize = frame.getSize();

                // Hitung lokasi baru JFrame sehingga posisi klik tetap di bawah mouse
                int newX = clickX - (frameSize.width / 2);
                int newY = clickY - mouseDownCompCoords.y;
                frame.setLocation(newX, newY);
            });
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Reset koordinat saat mouse dilepas
        mouseDownScreenCoords = null;
        mouseDownCompCoords = null;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Lakukan drag hanya jika koordinat awal mouse tersedia
        if (mouseDownCompCoords != null) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(
                currCoords.x - mouseDownCompCoords.x,
                currCoords.y - mouseDownCompCoords.y
            );
        }
    }
}