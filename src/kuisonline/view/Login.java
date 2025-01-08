/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kuisonline.view;

import kuisonline.MainFrame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import kuisonline.util.ResizeImage;
import kuisonline.controller.PenggunaDAO;
import kuisonline.model.Pengguna;

/**
 *
 * @author TUF GAMING
 */
public class Login extends javax.swing.JPanel {

    private MainFrame mainFrame;

    /**
     * Creates new form Login
     */
    public Login(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        initComponents();

        ResizeImage.setImageToLabel(foto_login, "/kuisonline/assets/Logo-Politeknik-Negeri-Bali.png", 174, 170);

        password.setText("Password");
        password.setEchoChar((char) 0);

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

        setLayout(new java.awt.BorderLayout());

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
        form.setLayout(new java.awt.GridBagLayout());

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

        add(Content, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void nisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nisFocusGained
        String nis_focus = nis.getText();
        if (nis_focus.equals("NIS")) {
            nis.setText("");
        }
    }//GEN-LAST:event_nisFocusGained

    private void nisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nisFocusLost
        String email_lost = nis.getText();
        if (email_lost.equals("") || email_lost.equals("NIS")) {
            nis.setText("NIS");
        }
    }//GEN-LAST:event_nisFocusLost

    private void nisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nisActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        String password_focus = password.getText();
        if (password_focus.equals("Password")) {
            password.setText("");
            password.setEchoChar('*'); // saat menginput, karakter yang ditampilkan adalah "*"
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        String password_lost = password.getText();
        if (password_lost.equals("") || password_lost.equals("Password")) {
            password.setText("Password");
            password.setEchoChar((char) 0); // menampilkan teks biasa
        }
    }//GEN-LAST:event_passwordFocusLost

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void show_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_show_passwordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_show_passwordFocusGained

    private void show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passwordActionPerformed
        if (show_password.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }

    }//GEN-LAST:event_show_passwordActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed

        try {
            Pengguna userLogged = PenggunaDAO.login(nis.getText(), password.getPassword());

            if (userLogged == null) {
                JOptionPane.showMessageDialog(null, "Wrong NIS or password!", "Message", JOptionPane.ERROR_MESSAGE);
                nis.setText("NIS");
                password.setText("Password");
                password.setEchoChar((char) 0);

                foto_login.requestFocusInWindow();
            } else {
                if (userLogged.getRole().equalsIgnoreCase("admin")) {
                    mainFrame.dashboardAdmin(userLogged);
                } else if (userLogged.getRole().equalsIgnoreCase("siswa")) {
                    mainFrame.dashboardSiswa(userLogged);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_button_loginActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        mainFrame.register();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JButton button_login;
    private javax.swing.JPanel form;
    private javax.swing.JLabel foto_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel login_title;
    private javax.swing.JPanel logopanel;
    private javax.swing.JTextField nis;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show_password;
    // End of variables declaration//GEN-END:variables
}