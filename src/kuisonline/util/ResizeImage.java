package kuisonline.util;

import kuisonline.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


 public class ResizeImage {

    // fungsi untuk meresize gambar dan set ke JLabel
        public static void setImageToLabel(JLabel label, String imagePath, int width, int height) {
            ImageIcon originalIcon = new ImageIcon(ResizeImage.class.getResource(imagePath)); // ambil gambar dari resource
            Image image = originalIcon.getImage(); // Dapatkan objek Image dari ImageIcon
            Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH); // resize gambar
            ImageIcon resizedIcon = new ImageIcon(resizedImage); // bungkus kembali ke ImageIcon
        
            label.setIcon(resizedIcon); // set gambar yang sudah diresize ke JLabel
        }
    }
