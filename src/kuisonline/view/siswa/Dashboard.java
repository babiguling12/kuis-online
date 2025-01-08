/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kuisonline.view.siswa;

import kuisonline.view.admin.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kuisonline.controller.KategoriDAO;
import kuisonline.controller.KuisDAO;
import kuisonline.controller.PertanyaanDAO;
import kuisonline.model.Kategori;
import kuisonline.model.Kuis;
import kuisonline.util.ComboItem;
import kuisonline.util.PaginateData;

/**
 *
 * @author TUF GAMING
 */
public class Dashboard extends javax.swing.JPanel {

    private List<Kuis> daftarKuis = new ArrayList<>();
    private int page = 1;
    private int idKategori = 0;

    private javax.swing.JPanel container;

    private DashboardSiswa mainPanel;

    /**
     * Creates new form Dashboard
     */
    public Dashboard(DashboardSiswa mainPanel) {
        this.mainPanel = mainPanel;
        
        initComponents();

        setMapelComboBox();
        refreshKuisPanel();
    }

    void setMapelComboBox() {
        pilihmapel.addItem(new ComboItem(0, "Semua Mapel"));
        try {
            for (Kategori k : KategoriDAO.getAllKategori()) {
                pilihmapel.addItem(new ComboItem(k.getIdKategori(), k.getNamaKategori()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuatKuis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setDaftarKuis() {
        try {
            if (idKategori == 0) {
                daftarKuis = KuisDAO.getAllKuis();
            } else {
                daftarKuis = KuisDAO.getKuisByIdKategori(idKategori);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (Kuis k : daftarKuis) {
            try {
                k.setPertanyaan(PertanyaanDAO.getAllPertanyaanByIdKuis(k.getIdKuis()));
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void refreshKuisPanel() {
        DaftarKuis.removeAll();
        setDaftarKuis();
        addKuisPanel();
        DaftarKuis.revalidate();
        DaftarKuis.repaint();
        cekPaginationButton();
    }

    void cekPaginationButton() {
        if (page == 1) {
            previous.setEnabled(false);
        } else {
            previous.setEnabled(true);
        }

        if (page == PaginateData.getTotalPages(daftarKuis.size(), 8)) {
            next.setEnabled(false);
        } else {
            next.setEnabled(true);
        }
    }

    void addKuisPanel() {
        List<Kuis> kuisTerlihat = PaginateData.paginateList(daftarKuis, page, 8);

        container = new javax.swing.JPanel();
        container.setLayout(new java.awt.GridLayout(2, 4, 6, 6));
        container.setBackground(new java.awt.Color(255, 255, 255));

        for (Kuis k : kuisTerlihat) {
            javax.swing.JPanel kuisCard = new javax.swing.JPanel();
            kuisCard.setLayout(new java.awt.BorderLayout());

            javax.swing.JPanel judulKuisPanel = new javax.swing.JPanel();
            judulKuisPanel.setLayout(new java.awt.BorderLayout());

            javax.swing.JLabel judulKuis = new javax.swing.JLabel();
            judulKuis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            judulKuis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            judulKuis.setText(k.getJudul());
            
            javax.swing.JLabel jumlahSoal = new javax.swing.JLabel();
            jumlahSoal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jumlahSoal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jumlahSoal.setText(k.getPertanyaan().size() + " Soal");

            judulKuisPanel.add(judulKuis, java.awt.BorderLayout.CENTER);
            judulKuisPanel.add(jumlahSoal, java.awt.BorderLayout.SOUTH);

            javax.swing.JPanel gambarKuisPanel = new javax.swing.JPanel();
            gambarKuisPanel.setLayout(new java.awt.CardLayout(6, 6));

            javax.swing.JLabel gambarKuis = new javax.swing.JLabel();
            gambarKuis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            gambarKuis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            gambarKuis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/add_post.png"))); // NOI18N
            gambarKuisPanel.add(gambarKuis, "card2");

            kuisCard.add(judulKuisPanel, java.awt.BorderLayout.PAGE_END);
            kuisCard.add(gambarKuisPanel, java.awt.BorderLayout.CENTER);

            // Tambahkan MouseListener ke kuisCard
            kuisCard.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    mainPanel.kuisDetail(k);
                }
            });

            container.add(kuisCard);
        }

        DaftarKuis.add(container, "card2");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihmapel = new javax.swing.JComboBox<>();
        DaftarKuis = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Footer = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setPreferredSize(new java.awt.Dimension(640, 50));
        Header.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Daftar Kuis");
        Header.add(jLabel1, java.awt.BorderLayout.LINE_START);

        pilihmapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihmapelActionPerformed(evt);
            }
        });
        Header.add(pilihmapel, java.awt.BorderLayout.LINE_END);

        add(Header, java.awt.BorderLayout.PAGE_START);

        DaftarKuis.setBackground(new java.awt.Color(255, 255, 255));
        DaftarKuis.setPreferredSize(new java.awt.Dimension(640, 140));
        DaftarKuis.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(2, 4, 6, 6));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.CardLayout(6, 6));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/add_post.png"))); // NOI18N
        jPanel11.add(jLabel2, "card2");

        jPanel2.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Judul 1");
        jPanel12.add(jLabel3, java.awt.BorderLayout.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("10 Soal");
        jPanel12.add(jLabel4, java.awt.BorderLayout.SOUTH);

        jPanel2.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel2);
        jPanel1.add(jPanel3);
        jPanel1.add(jPanel5);
        jPanel1.add(jPanel6);
        jPanel1.add(jPanel7);
        jPanel1.add(jPanel8);
        jPanel1.add(jPanel9);
        jPanel1.add(jPanel10);

        DaftarKuis.add(jPanel1, "card2");

        add(DaftarKuis, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(255, 255, 255));
        Footer.setLayout(new java.awt.BorderLayout());

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        Footer.add(next, java.awt.BorderLayout.LINE_END);

        previous.setBackground(new java.awt.Color(255, 255, 255));
        previous.setText("Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });
        Footer.add(previous, java.awt.BorderLayout.LINE_START);

        add(Footer, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        page--;
        refreshKuisPanel();
    }//GEN-LAST:event_previousActionPerformed

    private void pilihmapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihmapelActionPerformed
        this.idKategori = ((ComboItem)pilihmapel.getSelectedItem()).getId();
        refreshKuisPanel();
    }//GEN-LAST:event_pilihmapelActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        page++;
        refreshKuisPanel();
    }//GEN-LAST:event_nextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DaftarKuis;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton next;
    private javax.swing.JComboBox<ComboItem> pilihmapel;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
