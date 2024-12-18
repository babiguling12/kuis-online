/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kuisonline;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author Gustu
 */
public class Form_login extends javax.swing.JFrame {
    
    /**
     * Creates new form form_login
     */
    
    private Connection conn;
    
    public Form_login() {
        initComponents();
        conn = Koneksi.getConnection();
        
        ResizeImage.setImageToLabel(foto_login, "/kuisonline/assets/Logo-Politeknik-Negeri-Bali.png", 174, 170);
        
        password.setText("Password");
        password.setEchoChar((char)0);
        
        foto_login.requestFocusInWindow();
        
        nis.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) { // berfungsi untuk menangani logika ketika tombol ditekan
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    button_loginActionPerformed(null);  // panggil metode login
                }
            }
        });
        
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    button_loginActionPerformed(null);  // panggil metode login
                }
            }
        });
        
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) { // keyTyped berfungsi untuk menangkap input karakter
                if (show_password.isSelected()) {
                    password.setEchoChar((char) 0);  
                } else {
                    password.setEchoChar('*');
                }
            }
        });
        
         show_password.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    button_loginActionPerformed(null);
                }
            }
        });
         
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        minbtn = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        maxbtn = new javax.swing.JPanel();
        maximize = new javax.swing.JLabel();
        exitbtn = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        foto_login = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logopanel = new javax.swing.JPanel();
        login_title = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        nis = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        show_password = new javax.swing.JCheckBox();
        button_login = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(204, 204, 255));
        Header.setPreferredSize(new java.awt.Dimension(500, 30));
        Header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 0));

        minbtn.setBackground(new java.awt.Color(204, 204, 255));
        minbtn.setPreferredSize(new java.awt.Dimension(30, 30));
        minbtn.setLayout(new java.awt.BorderLayout());

        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/minimize.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        minbtn.add(minimize, java.awt.BorderLayout.CENTER);

        Header.add(minbtn);

        maxbtn.setBackground(new java.awt.Color(204, 204, 255));
        maxbtn.setLayout(new java.awt.BorderLayout());

        maximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/maximize.png"))); // NOI18N
        maximize.setPreferredSize(new java.awt.Dimension(30, 30));
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });
        maxbtn.add(maximize, java.awt.BorderLayout.CENTER);

        Header.add(maxbtn);

        exitbtn.setBackground(new java.awt.Color(204, 204, 255));
        exitbtn.setLayout(new java.awt.BorderLayout());

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/exit.png"))); // NOI18N
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.setPreferredSize(new java.awt.Dimension(30, 30));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exitbtn.add(exit, java.awt.BorderLayout.CENTER);

        Header.add(exitbtn);

        jPanel4.add(Header, java.awt.BorderLayout.PAGE_START);

        Content.setBackground(new java.awt.Color(253, 253, 253));
        Content.setLayout(new java.awt.BorderLayout());

        foto_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Content.add(foto_login, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 270));
        jPanel1.setLayout(new java.awt.BorderLayout());

        logopanel.setBackground(new java.awt.Color(253, 253, 253));

        login_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 34)); // NOI18N
        login_title.setForeground(new java.awt.Color(0, 204, 204));
        login_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_title.setText("KUISIS");
        login_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logopanel.add(login_title);

        jPanel1.add(logopanel, java.awt.BorderLayout.PAGE_START);

        form.setBackground(new java.awt.Color(253, 253, 253));
        form.setPreferredSize(new java.awt.Dimension(240, 100));
        java.awt.GridBagLayout formLayout = new java.awt.GridBagLayout();
        formLayout.columnWidths = new int[] {2};
        formLayout.rowHeights = new int[] {2};
        form.setLayout(formLayout);

        jPanel3.setBackground(new java.awt.Color(253, 253, 253));
        jPanel3.setPreferredSize(new java.awt.Dimension(180, 140));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 8));

        nis.setText("NIS");
        nis.setPreferredSize(new java.awt.Dimension(180, 28));
        nis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nisFocusLost(evt);
            }
        });
        nis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nisActionPerformed(evt);
            }
        });
        jPanel3.add(nis);

        password.setText("Password");
        password.setPreferredSize(new java.awt.Dimension(180, 28));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password);

        show_password.setBackground(new java.awt.Color(253, 253, 253));
        show_password.setText("Show Password");
        show_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_password.setPreferredSize(new java.awt.Dimension(300, 25));
        show_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                show_passwordFocusGained(evt);
            }
        });
        show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passwordActionPerformed(evt);
            }
        });
        jPanel3.add(show_password);

        button_login.setBackground(new java.awt.Color(253, 253, 253));
        button_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button_login.setText("LOGIN");
        button_login.setToolTipText("");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });
        jPanel3.add(button_login);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        form.add(jPanel3, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(253, 253, 253));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("Tidak punya akun?");
        jLabel2.setPreferredSize(new java.awt.Dimension(102, 16));
        jPanel5.add(jLabel2);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(47, 16));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        form.add(jPanel5, gridBagConstraints);

        jPanel1.add(form, java.awt.BorderLayout.CENTER);

        Content.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel4.add(Content, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    int xx, xy;
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX(); // x awal
        xy = evt.getY(); // y awal
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen(); // seberapa jauh x pindah
        int y = evt.getYOnScreen(); // seberapa jauh y pindah
        this.setLocation(x - xx, y - xy); // lokasi akhir
    }//GEN-LAST:event_formMouseDragged

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        
        try {
            char[] pass = password.getPassword();
            String nisDB = null;
            String nameDB = null;
            String passDB = null;
            String roleDB = null;
            int found = 0;
            
            String query = "SELECT * FROM pengguna WHERE nis = ? ";
            PreparedStatement pst = conn.prepareStatement(query); // Membuat Statement untuk mengeksekusi query
            pst.setString(1, nis.getText());
            ResultSet rs = pst.executeQuery(); // Menjalankan query dan menyimpan hasilnya dalam ResultSet
            
            while(rs.next()) {
                nisDB = rs.getString("nis");
                nameDB =  rs.getString("name");
                passDB = rs.getString("password");
                roleDB = rs.getString("role");
                found = 1;
            }
            
            if(found == 1 && Arrays.equals(pass, passDB.toCharArray())){
                if("admin".equalsIgnoreCase(roleDB)) {
                    DashboardAdmin admin = new DashboardAdmin(nameDB);
                    admin.setVisible(true);
                } else if("siswa".equalsIgnoreCase(roleDB)) {
                    DashboardSiswa siswa = new DashboardSiswa(nameDB);
                    siswa.setVisible(true);
                }
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong NIS or password!", "Message", JOptionPane.ERROR_MESSAGE);
                nis.setText("NIS");
                password.setText("Password");
                password.setEchoChar((char)0);
                
                foto_login.requestFocusInWindow();
            }
            
            rs.close();
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
         
    }//GEN-LAST:event_button_loginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        String password_focus = password.getText();
        if(password_focus.equals("Password")) {
            password.setText("");
            password.setEchoChar('*'); // saat menginput, karakter yang ditampilkan adalah "*"
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        String password_lost = password.getText();
        if(password_lost.equals("") || password_lost.equals("Password")) {
            password.setText("Password");
            password.setEchoChar((char)0); // menampilkan teks biasa
        }
    }//GEN-LAST:event_passwordFocusLost

    private void show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passwordActionPerformed
        if(show_password.isSelected()){
            password.setEchoChar((char)0);
        } else {
            password.setEchoChar('*');
        }
        
    }//GEN-LAST:event_show_passwordActionPerformed

    private void show_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_show_passwordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_show_passwordFocusGained

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        if(this.getExtendedState()!= Form_login.MAXIMIZED_BOTH) {
            this.setExtendedState(Form_login.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(Form_login.NORMAL);
        }
    }//GEN-LAST:event_maximizeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(Form_login.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        dispose(); // untuk close
    }//GEN-LAST:event_exitMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Form_register form_register = new Form_register();
        form_register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void nisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nisActionPerformed

    private void nisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nisFocusGained
        String nis_focus = nis.getText();
        if(nis_focus.equals("NIS")) {
            nis.setText("");
        }
    }//GEN-LAST:event_nisFocusGained

    private void nisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nisFocusLost
        String email_lost = nis.getText();
        if(email_lost.equals("")||email_lost.equals("NIS")) {
            nis.setText("NIS");
        }
    }//GEN-LAST:event_nisFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Header;
    private javax.swing.JButton button_login;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel form;
    private javax.swing.JLabel foto_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel login_title;
    private javax.swing.JPanel logopanel;
    private javax.swing.JPanel maxbtn;
    private javax.swing.JLabel maximize;
    private javax.swing.JPanel minbtn;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField nis;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show_password;
    // End of variables declaration//GEN-END:variables
}