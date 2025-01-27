/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kuisonline.view.admin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kuisonline.controller.KategoriDAO;
import kuisonline.controller.KuisDAO;
import kuisonline.controller.HasilKuisDAO;
import kuisonline.controller.PertanyaanDAO;
import kuisonline.model.Kategori;
import kuisonline.model.Kuis;
import kuisonline.model.Pertanyaan;
import kuisonline.util.ComboItem;

/**
 *
 * @author TUF GAMING
 */
public class EditKuis extends javax.swing.JPanel {

    private DefaultTableModel tm;
    private Kuis kuis;
    private List<Pertanyaan> daftarPertanyaan = new ArrayList<>();

    private DashboardAdmin mainPanel;

    /**
     * Creates new form BuatKuis
     */
    public EditKuis(DashboardAdmin mainPanel) {
        this.mainPanel = mainPanel;

        initComponents();

        refreshTableDaftarSoal();
    }

    void setKuis(Kuis kuis) {
        this.kuis = kuis;

        setKategori();
        setFormValue();
        refreshTableDaftarSoal();
    }

    void setFormValue() {
        Input_JudulKuis.setText(kuis.getJudul());
        Input_JumlahSoal.setValue(kuis.getJumlahPertanyaan());
        Input_WaktuPengerjaan.setValue(kuis.getWaktuPengerjaan());
    }

    void setKategori() {
        Input_KategoriKuis.removeAllItems();
        try {
            for (Kategori k : KategoriDAO.getAllKategori()) {
                ComboItem item = new ComboItem(k.getIdKategori(), k.getNamaKategori());
                Input_KategoriKuis.addItem(item);
                if (kuis.getIdKategori() == k.getIdKategori()) {
                    Input_KategoriKuis.setSelectedItem(item);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditKuis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void refreshTableDaftarSoal() {
        tm = new DefaultTableModel(new Object[]{"No", "Pertanyaan", "Jawaban Benar", "ID", "A", "B", "C", "D", "E"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Mengembalikan false agar semua sel tidak bisa diedit
                return false;
            }
        };

        tabelDaftarSoal.setModel(tm);
        tm.getDataVector().removeAllElements();

        if (kuis != null) {
            int i = 0;
            for (Pertanyaan p : kuis.getPertanyaan()) {
                Object[] data = {
                    ++i,
                    p.getTeksPertanyaan(),
                    p.getJawabanBenar(),
                    p.getIdPertanyaan(),
                    p.getJawabanA(),
                    p.getJawabanB(),
                    p.getJawabanC(),
                    p.getJawabanD(),
                    p.getJawabanE(),};
                tm.addRow(data);
            }
        }

        for (int i = 3; i <= 8; i++) {
            tabelDaftarSoal.getColumnModel().getColumn(i).setMinWidth(0);
            tabelDaftarSoal.getColumnModel().getColumn(i).setMaxWidth(0);
            tabelDaftarSoal.getColumnModel().getColumn(i).setWidth(0);
        }
    }

    void formEditSoalDisable() {
        tabelDaftarSoal.getSelectionModel().clearSelection();
        input_pertanyaan.setEnabled(false);
        input_jawabana.setEnabled(false);
        input_jawabanb.setEnabled(false);
        input_jawabanc.setEnabled(false);
        input_jawaband.setEnabled(false);
        input_jawabane.setEnabled(false);
        simpan_soal.setEnabled(false);
        input_pertanyaan.setText("");
        input_jawabana.setText("");
        input_jawabanb.setText("");
        input_jawabanc.setText("");
        input_jawaband.setText("");
        input_jawabane.setText("");
        jawabanBenar.clearSelection();
    }

    void formEditSoalEnable() {
        input_pertanyaan.setEnabled(true);
        input_jawabana.setEnabled(true);
        input_jawabanb.setEnabled(true);
        input_jawabanc.setEnabled(true);
        input_jawaband.setEnabled(true);
        input_jawabane.setEnabled(true);
        simpan_soal.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jawabanBenar = new javax.swing.ButtonGroup();
        FormKuis = new javax.swing.JPanel();
        Form1 = new javax.swing.JPanel();
        Form3 = new javax.swing.JPanel();
        JudulSoal2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Input_JudulKuis = new javax.swing.JTextField();
        InputGroup2 = new javax.swing.JPanel();
        KategoriSoal1 = new javax.swing.JPanel();
        Input_KategoriKuis = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        WaktuPengerjaan1 = new javax.swing.JPanel();
        Input_JumlahSoal = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        WaktuPengerjaan2 = new javax.swing.JPanel();
        Input_WaktuPengerjaan = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDaftarSoal = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        simpankuis = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        input_pertanyaan = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        abenar = new javax.swing.JRadioButton();
        input_jawabana = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        bbenar = new javax.swing.JRadioButton();
        input_jawabanb = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        cbenar = new javax.swing.JRadioButton();
        input_jawabanc = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        dbenar = new javax.swing.JRadioButton();
        input_jawaband = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        ebenar = new javax.swing.JRadioButton();
        input_jawabane = new javax.swing.JTextField();
        simpan_soal = new javax.swing.JButton();
        Header_BuatSoal = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        judulKuis = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(640, 468));
        setLayout(new java.awt.BorderLayout());

        FormKuis.setBackground(new java.awt.Color(255, 255, 255));
        FormKuis.setPreferredSize(new java.awt.Dimension(740, 140));
        FormKuis.setLayout(new java.awt.CardLayout(10, 10));

        Form1.setBackground(new java.awt.Color(255, 255, 255));
        Form1.setLayout(new java.awt.BorderLayout());

        Form3.setBackground(new java.awt.Color(255, 255, 255));
        Form3.setLayout(new java.awt.GridLayout(2, 1, 0, 8));

        JudulSoal2.setBackground(new java.awt.Color(255, 255, 255));
        JudulSoal2.setLayout(new java.awt.BorderLayout());

        jLabel15.setText("Judul Kuis");
        JudulSoal2.add(jLabel15, java.awt.BorderLayout.PAGE_START);

        Input_JudulKuis.setText("Judul Kuis");
        JudulSoal2.add(Input_JudulKuis, java.awt.BorderLayout.CENTER);

        Form3.add(JudulSoal2);

        InputGroup2.setBackground(new java.awt.Color(255, 255, 255));
        InputGroup2.setLayout(new java.awt.GridLayout(1, 0, 6, 0));

        KategoriSoal1.setBackground(new java.awt.Color(255, 255, 255));
        KategoriSoal1.setLayout(new java.awt.BorderLayout());

        KategoriSoal1.add(Input_KategoriKuis, java.awt.BorderLayout.CENTER);

        jLabel16.setText("Kategori Kuis");
        KategoriSoal1.add(jLabel16, java.awt.BorderLayout.PAGE_START);

        InputGroup2.add(KategoriSoal1);

        WaktuPengerjaan1.setBackground(new java.awt.Color(255, 255, 255));
        WaktuPengerjaan1.setLayout(new java.awt.BorderLayout());

        Input_JumlahSoal.setEnabled(false);
        WaktuPengerjaan1.add(Input_JumlahSoal, java.awt.BorderLayout.CENTER);

        jLabel19.setText("Jumlah Soal");
        WaktuPengerjaan1.add(jLabel19, java.awt.BorderLayout.PAGE_START);

        InputGroup2.add(WaktuPengerjaan1);

        WaktuPengerjaan2.setBackground(new java.awt.Color(255, 255, 255));
        WaktuPengerjaan2.setLayout(new java.awt.BorderLayout());
        WaktuPengerjaan2.add(Input_WaktuPengerjaan, java.awt.BorderLayout.CENTER);

        jLabel18.setText("Waktu Pengerjaan Per Soal");
        WaktuPengerjaan2.add(jLabel18, java.awt.BorderLayout.PAGE_START);

        InputGroup2.add(WaktuPengerjaan2);

        Form3.add(InputGroup2);

        Form1.add(Form3, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportView(null);

        tabelDaftarSoal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelDaftarSoal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDaftarSoalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDaftarSoal);

        Form1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        simpankuis.setText("Simpan Perubahan");
        simpankuis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpankuisActionPerformed(evt);
            }
        });
        jPanel9.add(simpankuis, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel9);

        Form1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        input_pertanyaan.setColumns(20);
        input_pertanyaan.setLineWrap(true);
        input_pertanyaan.setRows(5);
        input_pertanyaan.setEnabled(false);
        jScrollPane2.setViewportView(input_pertanyaan);

        jPanel13.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel17.setText("Pertanyaan");
        jPanel13.add(jLabel17, java.awt.BorderLayout.PAGE_START);

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.GridLayout(3, 2, 2, 2));

        jPanel22.setLayout(new java.awt.BorderLayout());

        abenar.setBackground(new java.awt.Color(255, 255, 255));
        jawabanBenar.add(abenar);
        jPanel22.add(abenar, java.awt.BorderLayout.LINE_START);

        input_jawabana.setEnabled(false);
        jPanel22.add(input_jawabana, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel22);

        jPanel18.setLayout(new java.awt.BorderLayout());

        bbenar.setBackground(new java.awt.Color(255, 255, 255));
        jawabanBenar.add(bbenar);
        jPanel18.add(bbenar, java.awt.BorderLayout.LINE_START);

        input_jawabanb.setEnabled(false);
        jPanel18.add(input_jawabanb, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel18);

        jPanel19.setLayout(new java.awt.BorderLayout());

        cbenar.setBackground(new java.awt.Color(255, 255, 255));
        jawabanBenar.add(cbenar);
        jPanel19.add(cbenar, java.awt.BorderLayout.LINE_START);

        input_jawabanc.setEnabled(false);
        jPanel19.add(input_jawabanc, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel19);

        jPanel20.setLayout(new java.awt.BorderLayout());

        dbenar.setBackground(new java.awt.Color(255, 255, 255));
        jawabanBenar.add(dbenar);
        jPanel20.add(dbenar, java.awt.BorderLayout.LINE_START);

        input_jawaband.setEnabled(false);
        jPanel20.add(input_jawaband, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel20);

        jPanel21.setLayout(new java.awt.BorderLayout());

        ebenar.setBackground(new java.awt.Color(255, 255, 255));
        jawabanBenar.add(ebenar);
        jPanel21.add(ebenar, java.awt.BorderLayout.LINE_START);

        input_jawabane.setEnabled(false);
        jPanel21.add(input_jawabane, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel21);

        simpan_soal.setText("Simpan Soal");
        simpan_soal.setEnabled(false);
        simpan_soal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_soalActionPerformed(evt);
            }
        });
        jPanel14.add(simpan_soal);

        jPanel12.add(jPanel14, java.awt.BorderLayout.CENTER);

        Form1.add(jPanel12, java.awt.BorderLayout.LINE_START);

        FormKuis.add(Form1, "card2");

        add(FormKuis, java.awt.BorderLayout.CENTER);

        Header_BuatSoal.setBackground(new java.awt.Color(255, 255, 255));
        Header_BuatSoal.setPreferredSize(new java.awt.Dimension(640, 50));
        Header_BuatSoal.setLayout(new java.awt.BorderLayout());

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        Header_BuatSoal.add(back, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.CardLayout(14, 6));

        judulKuis.setBackground(new java.awt.Color(255, 255, 255));
        judulKuis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        judulKuis.setText("Edit Soal");
        jPanel4.add(judulKuis, "card2");

        Header_BuatSoal.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(Header_BuatSoal, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void simpankuisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpankuisActionPerformed
        String judulKuis = Input_JudulKuis.getText();
        int kategoriKuis = ((ComboItem) Input_KategoriKuis.getSelectedItem()).getId();
        int waktuPengerjaan = waktuPengerjaan = (int) Input_WaktuPengerjaan.getValue();;
        int jumlahSoal = (int) Input_JumlahSoal.getValue();

        kuis.setJudul(judulKuis);
        kuis.setWaktuPengerjaan(waktuPengerjaan);
        kuis.setIdKategori(kategoriKuis);
        
         // Validasi input judul
        if(judulKuis == null || judulKuis.trim().isEmpty()) { // trim().isEmpty() : ngecek apakah yg diiinput cuma spasi kosong
            JOptionPane.showMessageDialog(null, "Judul tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Validasi input jumlah soal
        if(jumlahSoal <= 0) {
            JOptionPane.showMessageDialog(null, "Jumlah soal tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Validasi input waktu
        if(waktuPengerjaan <= 0) {
            JOptionPane.showMessageDialog(null, "Waktu Pengerjaan tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Update Kuis
        try {
            KuisDAO.updateKuis(kuis);
            JOptionPane.showMessageDialog(null, "Kuis Berhasil diupdate", "success", JOptionPane.INFORMATION_MESSAGE);
            HasilKuisDAO.deleteHasilKuisByKuis(kuis.getIdKuis());
        } catch (SQLException ex) {
            Logger.getLogger(EditKuis.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Simpan Pertanyaan
        try {
            PertanyaanDAO.updateListPertanyan(kuis.getPertanyaan());
        } catch (SQLException ex) {
            Logger.getLogger(EditKuis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        mainPanel.kuisDetail(kuis);
        refreshTableDaftarSoal();
    }//GEN-LAST:event_simpankuisActionPerformed

    private void tabelDaftarSoalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDaftarSoalMouseClicked
        int selectedRow = tabelDaftarSoal.getSelectedRow();

        if (selectedRow != -1) { // artinya jika ada data yang diklik

            formEditSoalEnable();

            String pertanyaan = tabelDaftarSoal.getValueAt(selectedRow, 1).toString();
            String jawabanbenar = tabelDaftarSoal.getValueAt(selectedRow, 2).toString();
            int id = Integer.parseInt(tabelDaftarSoal.getValueAt(selectedRow, 3).toString());
            String jawabana = tabelDaftarSoal.getValueAt(selectedRow, 4).toString();
            String jawabanb = tabelDaftarSoal.getValueAt(selectedRow, 5).toString();
            String jawabanc = tabelDaftarSoal.getValueAt(selectedRow, 6).toString();
            String jawaband = tabelDaftarSoal.getValueAt(selectedRow, 7).toString();
            String jawabane = tabelDaftarSoal.getValueAt(selectedRow, 8).toString();

            input_pertanyaan.setText(pertanyaan);
            input_jawabana.setText(jawabana);
            input_jawabanb.setText(jawabanb);
            input_jawabanc.setText(jawabanc);
            input_jawaband.setText(jawaband);
            input_jawabane.setText(jawabane);

            switch (jawabanbenar) {
                case "a":
                    abenar.setSelected(true);
                    break;
                case "b":
                    bbenar.setSelected(true);
                    break;
                case "c":
                    cbenar.setSelected(true);
                    break;
                case "d":
                    dbenar.setSelected(true);
                    break;
                case "e":
                    ebenar.setSelected(true);
                    break;
            }
        }
    }//GEN-LAST:event_tabelDaftarSoalMouseClicked

    private void simpan_soalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_soalActionPerformed
        int selectedRow = tabelDaftarSoal.getSelectedRow();
        String jawabanbenar = "a";

        if (abenar.isSelected()) {
            jawabanbenar = "a";
        }
        if (bbenar.isSelected()) {
            jawabanbenar = "b";
        }
        if (cbenar.isSelected()) {
            jawabanbenar = "c";
        }
        if (dbenar.isSelected()) {
            jawabanbenar = "d";
        }
        if (ebenar.isSelected()) {
            jawabanbenar = "e";
        }

        Pertanyaan pertanyaan = new Pertanyaan(
                kuis.getPertanyaan().get(selectedRow).getIdPertanyaan(),
                input_pertanyaan.getText(),
                input_jawabana.getText(),
                input_jawabanb.getText(),
                input_jawabanc.getText(),
                input_jawaband.getText(),
                input_jawabane.getText(),
                jawabanbenar,
                kuis.getIdKuis()
        );

        kuis.getPertanyaan().set(selectedRow, pertanyaan);

        formEditSoalDisable();
        refreshTableDaftarSoal();
    }//GEN-LAST:event_simpan_soalActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        mainPanel.kuisDetail(kuis);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Form1;
    private javax.swing.JPanel Form3;
    private javax.swing.JPanel FormKuis;
    private javax.swing.JPanel Header_BuatSoal;
    private javax.swing.JPanel InputGroup2;
    private javax.swing.JTextField Input_JudulKuis;
    private javax.swing.JSpinner Input_JumlahSoal;
    private javax.swing.JComboBox<ComboItem> Input_KategoriKuis;
    private javax.swing.JSpinner Input_WaktuPengerjaan;
    private javax.swing.JPanel JudulSoal2;
    private javax.swing.JPanel KategoriSoal1;
    private javax.swing.JPanel WaktuPengerjaan1;
    private javax.swing.JPanel WaktuPengerjaan2;
    private javax.swing.JRadioButton abenar;
    private javax.swing.JButton back;
    private javax.swing.JRadioButton bbenar;
    private javax.swing.JRadioButton cbenar;
    private javax.swing.JRadioButton dbenar;
    private javax.swing.JRadioButton ebenar;
    private javax.swing.JTextField input_jawabana;
    private javax.swing.JTextField input_jawabanb;
    private javax.swing.JTextField input_jawabanc;
    private javax.swing.JTextField input_jawaband;
    private javax.swing.JTextField input_jawabane;
    private javax.swing.JTextArea input_pertanyaan;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jawabanBenar;
    private javax.swing.JLabel judulKuis;
    private javax.swing.JButton simpan_soal;
    private javax.swing.JButton simpankuis;
    private javax.swing.JTable tabelDaftarSoal;
    // End of variables declaration//GEN-END:variables
}
