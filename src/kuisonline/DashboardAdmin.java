/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kuisonline;

import java.awt.Dimension;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUF GAMING
 */
public class DashboardAdmin extends javax.swing.JFrame {

    Kuis kuis;
    Pertanyaan pertanyaan[];
    DefaultTableModel model;
    
    /**
     * Creates new form Dashboard
     */
    public DashboardAdmin(String name) {
        initComponents();
        refreshTableDaftarSoal();
        hellotext.setText("Halo, " + name + "!");
    }
    
    void refreshTableDaftarSoal() {
        model = new DefaultTableModel(new Object[]{"Pertanyaan", "Action"}, 0);
        
        tabelDaftarSoal.setModel(model);
        model.getDataVector().removeAllElements();
        
        if(kuis != null) {
            for(int i = 0; i < kuis.jumPertanyaan; i++) {
                Object[] data = {
                    pertanyaan[i].pertanyaan,
                    "edit"
                };
                model.addRow(data);
            }
        }
    }
    
    //Edit container daftar soal
//    void editSoalContainer(int jumlahSoal) {
//        DaftarSoal.setPreferredSize(new Dimension(DaftarSoal.getWidth(), 50*jumlahSoal));
//        
//        //Buat Container Dari Masing-masing soal
//        ArrayList<javax.swing.JPanel> listsoal = new ArrayList<javax.swing.JPanel>();
//        
//        for(int i = 0; i < jumlahSoal; i++) {
//            listsoal.add(new javax.swing.JPanel());
//            listsoal.get(i).setBorder(javax.swing.BorderFactory.createEtchedBorder());
//            listsoal.get(i).setPreferredSize(new java.awt.Dimension(680, 40));
//            listsoal.get(i).setLayout(new java.awt.BorderLayout());
//
//            DaftarSoal.add(listsoal.get(i));
//        }
//        
//        ArrayList<javax.swing.JLabel> textpertanyaan = new ArrayList<javax.swing.JLabel>();
//        ArrayList<javax.swing.JButton> btnedit = new ArrayList<javax.swing.JButton>();
//        
//        for(int i = 0; i < jumlahSoal; i++) {
//            
//            textpertanyaan.add(new javax.swing.JLabel());
//            textpertanyaan.get(i).setText("apalah" + (i+1));
//            
//            btnedit.add(new javax.swing.JButton());
//            btnedit.get(i).setBackground(new java.awt.Color(255, 153, 0));
//            btnedit.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/edit.png"))); // NOI18N
//
//            listsoal.get(i).add(btnedit.get(i), java.awt.BorderLayout.LINE_END);
//            listsoal.get(i).add(textpertanyaan.get(i), java.awt.BorderLayout.CENTER);
//        }
//        
//        jScrollPane1.revalidate();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopBar = new javax.swing.JPanel();
        hellotext = new javax.swing.JLabel();
        SideBar = new javax.swing.JPanel();
        MenuItem = new javax.swing.JPanel();
        MenuItem_Dashboard = new javax.swing.JPanel();
        DashboardText = new javax.swing.JLabel();
        MenuItem_TambahSoal = new javax.swing.JPanel();
        TambahSoalText = new javax.swing.JLabel();
        MainContent_SemuaMapel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Card = new javax.swing.JPanel();
        CardGrid = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MainContent_Kuis = new javax.swing.JPanel();
        Header_BuatSoal = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        FormSoal = new javax.swing.JPanel();
        Form2 = new javax.swing.JPanel();
        JudulSoal1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Input_Pertanyaan = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Jawaban = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        opsi1 = new javax.swing.JPanel();
        opsibenar1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        opsi2 = new javax.swing.JPanel();
        opsibenar2 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        opsi3 = new javax.swing.JPanel();
        opsibenar3 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        opsi4 = new javax.swing.JPanel();
        opsibenar4 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        opsi5 = new javax.swing.JPanel();
        opsibenar5 = new javax.swing.JCheckBox();
        jTextField5 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        nextbtn1 = new javax.swing.JButton();
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
        jLabel17 = new javax.swing.JLabel();
        WaktuPengerjaan2 = new javax.swing.JPanel();
        Input_WaktuPengerjaan = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDaftarSoal = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        simpankuis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        TopBar.setBackground(new java.awt.Color(36, 37, 42));
        TopBar.setPreferredSize(new java.awt.Dimension(800, 32));
        TopBar.setLayout(new java.awt.CardLayout());

        hellotext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hellotext.setForeground(new java.awt.Color(255, 255, 255));
        hellotext.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        hellotext.setText("Halo, admin!");
        TopBar.add(hellotext, "card2");

        getContentPane().add(TopBar, java.awt.BorderLayout.PAGE_START);

        SideBar.setBackground(new java.awt.Color(55, 58, 73));
        SideBar.setPreferredSize(new java.awt.Dimension(60, 480));
        SideBar.setLayout(new java.awt.BorderLayout());

        MenuItem.setLayout(new java.awt.GridLayout(0, 1));

        MenuItem_Dashboard.setBackground(new java.awt.Color(55, 58, 73));
        MenuItem_Dashboard.setPreferredSize(new java.awt.Dimension(100, 60));
        MenuItem_Dashboard.setLayout(new java.awt.CardLayout(10, 10));

        DashboardText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DashboardText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/home.png"))); // NOI18N
        DashboardText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuItem_Dashboard.add(DashboardText, "card2");

        MenuItem.add(MenuItem_Dashboard);

        MenuItem_TambahSoal.setBackground(new java.awt.Color(55, 58, 73));
        MenuItem_TambahSoal.setPreferredSize(new java.awt.Dimension(100, 40));
        MenuItem_TambahSoal.setLayout(new java.awt.CardLayout(10, 10));

        TambahSoalText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TambahSoalText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/add_post.png"))); // NOI18N
        TambahSoalText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuItem_TambahSoal.add(TambahSoalText, "card2");

        MenuItem.add(MenuItem_TambahSoal);

        SideBar.add(MenuItem, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(SideBar, java.awt.BorderLayout.WEST);

        MainContent_SemuaMapel.setBackground(new java.awt.Color(255, 255, 255));
        MainContent_SemuaMapel.setPreferredSize(new java.awt.Dimension(640, 468));
        MainContent_SemuaMapel.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setPreferredSize(new java.awt.Dimension(640, 50));
        Header.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Semua Mapel");
        Header.add(jLabel1, "card2");

        MainContent_SemuaMapel.add(Header, java.awt.BorderLayout.PAGE_START);

        Card.setBackground(new java.awt.Color(255, 255, 255));
        Card.setPreferredSize(new java.awt.Dimension(640, 140));
        Card.setLayout(new java.awt.CardLayout());

        CardGrid.setBackground(new java.awt.Color(255, 255, 255));
        CardGrid.setPreferredSize(new java.awt.Dimension(700, 140));
        CardGrid.setLayout(new java.awt.GridLayout(2, 4, 5, 5));

        jPanel2.setBackground(new java.awt.Color(251, 251, 251));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel2.setLayout(new java.awt.CardLayout(20, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bahasa Indonesia");
        jPanel2.add(jLabel2, "card2");

        CardGrid.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(251, 251, 251));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel3.setLayout(new java.awt.CardLayout(20, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Matematika");
        jPanel3.add(jLabel3, "card2");

        CardGrid.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(251, 251, 251));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel4.setLayout(new java.awt.CardLayout(20, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("IPA");
        jPanel4.add(jLabel4, "card2");

        CardGrid.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(251, 251, 251));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel6.setLayout(new java.awt.CardLayout(20, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("IPS");
        jPanel6.add(jLabel5, "card2");

        CardGrid.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(251, 251, 251));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel7.setLayout(new java.awt.CardLayout(20, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bahasa Java");
        jPanel7.add(jLabel6, "card2");

        CardGrid.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(251, 251, 251));
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel8.setLayout(new java.awt.CardLayout(20, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bahasa PHP");
        jPanel8.add(jLabel7, "card2");

        CardGrid.add(jPanel8);

        Card.add(CardGrid, "card2");

        MainContent_SemuaMapel.add(Card, java.awt.BorderLayout.CENTER);

        getContentPane().add(MainContent_SemuaMapel, java.awt.BorderLayout.CENTER);

        MainContent_Kuis.setBackground(new java.awt.Color(255, 255, 255));
        MainContent_Kuis.setPreferredSize(new java.awt.Dimension(640, 468));
        MainContent_Kuis.setLayout(new java.awt.BorderLayout());

        Header_BuatSoal.setBackground(new java.awt.Color(255, 255, 255));
        Header_BuatSoal.setPreferredSize(new java.awt.Dimension(640, 50));
        Header_BuatSoal.setLayout(new java.awt.CardLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Buat Kuis");
        Header_BuatSoal.add(jLabel8, "card2");

        MainContent_Kuis.add(Header_BuatSoal, java.awt.BorderLayout.PAGE_START);

        FormSoal.setBackground(new java.awt.Color(255, 255, 255));
        FormSoal.setPreferredSize(new java.awt.Dimension(740, 140));
        FormSoal.setLayout(new java.awt.CardLayout(10, 10));

        Form2.setBackground(new java.awt.Color(255, 255, 255));
        Form2.setLayout(new java.awt.BorderLayout());

        JudulSoal1.setBackground(new java.awt.Color(255, 255, 255));
        JudulSoal1.setPreferredSize(new java.awt.Dimension(66, 68));
        JudulSoal1.setLayout(new java.awt.BorderLayout());

        jLabel13.setText("Pertanyaan");
        JudulSoal1.add(jLabel13, java.awt.BorderLayout.PAGE_START);

        Input_Pertanyaan.setViewportView(jTextPane1);

        JudulSoal1.add(Input_Pertanyaan, java.awt.BorderLayout.CENTER);

        Form2.add(JudulSoal1, java.awt.BorderLayout.PAGE_START);

        Jawaban.setBackground(new java.awt.Color(255, 255, 255));
        Jawaban.setLayout(new java.awt.BorderLayout());

        jLabel14.setText("Jawaban");
        Jawaban.add(jLabel14, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        opsi1.setBackground(new java.awt.Color(255, 255, 255));
        opsi1.setLayout(new java.awt.BorderLayout());

        opsibenar1.setBackground(new java.awt.Color(255, 255, 255));
        opsi1.add(opsibenar1, java.awt.BorderLayout.LINE_START);

        jTextField1.setText("Opsi 1");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        opsi1.add(jTextField1, java.awt.BorderLayout.CENTER);

        jPanel1.add(opsi1);

        opsi2.setBackground(new java.awt.Color(255, 255, 255));
        opsi2.setLayout(new java.awt.BorderLayout());

        opsibenar2.setBackground(new java.awt.Color(255, 255, 255));
        opsi2.add(opsibenar2, java.awt.BorderLayout.LINE_START);

        jTextField2.setText("Opsi 2");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        opsi2.add(jTextField2, java.awt.BorderLayout.CENTER);

        jPanel1.add(opsi2);

        opsi3.setBackground(new java.awt.Color(255, 255, 255));
        opsi3.setLayout(new java.awt.BorderLayout());

        opsibenar3.setBackground(new java.awt.Color(255, 255, 255));
        opsi3.add(opsibenar3, java.awt.BorderLayout.LINE_START);

        jTextField3.setText("Opsi 3");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        opsi3.add(jTextField3, java.awt.BorderLayout.CENTER);

        jPanel1.add(opsi3);

        opsi4.setBackground(new java.awt.Color(255, 255, 255));
        opsi4.setLayout(new java.awt.BorderLayout());

        opsibenar4.setBackground(new java.awt.Color(255, 255, 255));
        opsi4.add(opsibenar4, java.awt.BorderLayout.LINE_START);

        jTextField4.setText("Opsi 4");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        opsi4.add(jTextField4, java.awt.BorderLayout.CENTER);

        jPanel1.add(opsi4);

        opsi5.setBackground(new java.awt.Color(255, 255, 255));
        opsi5.setLayout(new java.awt.BorderLayout());

        opsibenar5.setBackground(new java.awt.Color(255, 255, 255));
        opsi5.add(opsibenar5, java.awt.BorderLayout.LINE_START);

        jTextField5.setText("Opsi 5");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        opsi5.add(jTextField5, java.awt.BorderLayout.CENTER);

        jPanel1.add(opsi5);

        Jawaban.add(jPanel1, java.awt.BorderLayout.CENTER);

        Form2.add(Jawaban, java.awt.BorderLayout.CENTER);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.CardLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        nextbtn1.setText("Simpan");
        jPanel11.add(nextbtn1, java.awt.BorderLayout.LINE_END);

        jPanel10.add(jPanel11, "card3");

        Form2.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        FormSoal.add(Form2, "card2");

        MainContent_Kuis.add(FormSoal, java.awt.BorderLayout.CENTER);

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
        Input_JudulKuis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_JudulKuisActionPerformed(evt);
            }
        });
        JudulSoal2.add(Input_JudulKuis, java.awt.BorderLayout.CENTER);

        Form3.add(JudulSoal2);

        InputGroup2.setBackground(new java.awt.Color(255, 255, 255));
        InputGroup2.setLayout(new java.awt.GridLayout(1, 0, 6, 0));

        KategoriSoal1.setBackground(new java.awt.Color(255, 255, 255));
        KategoriSoal1.setLayout(new java.awt.BorderLayout());

        Input_KategoriKuis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori", "Matematika", "Bahasa Indonesia", "Bahasa Inggris" }));
        Input_KategoriKuis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_KategoriKuisActionPerformed(evt);
            }
        });
        KategoriSoal1.add(Input_KategoriKuis, java.awt.BorderLayout.CENTER);

        jLabel16.setText("Kategori Kuis");
        KategoriSoal1.add(jLabel16, java.awt.BorderLayout.PAGE_START);

        InputGroup2.add(KategoriSoal1);

        WaktuPengerjaan1.setBackground(new java.awt.Color(255, 255, 255));
        WaktuPengerjaan1.setLayout(new java.awt.BorderLayout());
        WaktuPengerjaan1.add(Input_JumlahSoal, java.awt.BorderLayout.CENTER);

        jLabel17.setText("Jumlah Soal");
        WaktuPengerjaan1.add(jLabel17, java.awt.BorderLayout.PAGE_START);

        InputGroup2.add(WaktuPengerjaan1);

        WaktuPengerjaan2.setBackground(new java.awt.Color(255, 255, 255));
        WaktuPengerjaan2.setLayout(new java.awt.BorderLayout());
        WaktuPengerjaan2.add(Input_WaktuPengerjaan, java.awt.BorderLayout.CENTER);

        jLabel18.setText("Waktu Pengerjaan (Menit)");
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
        ));
        jScrollPane1.setViewportView(tabelDaftarSoal);

        Form1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        simpankuis.setText("Simpan");
        simpankuis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpankuisActionPerformed(evt);
            }
        });
        jPanel9.add(simpankuis, java.awt.BorderLayout.LINE_END);

        jPanel5.add(jPanel9);

        Form1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        FormKuis.add(Form1, "card2");

        MainContent_Kuis.add(FormKuis, java.awt.BorderLayout.CENTER);

        getContentPane().add(MainContent_Kuis, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void Input_JudulKuisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_JudulKuisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_JudulKuisActionPerformed

    private void Input_KategoriKuisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_KategoriKuisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_KategoriKuisActionPerformed

    private void simpankuisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpankuisActionPerformed
        String  judulkuis       = Input_JudulKuis.getText();
        int     kategorikuis    = Input_KategoriKuis.getSelectedIndex();
        int     jumlahsoal      = (int) Input_JumlahSoal.getValue();
        int     waktupengerjaan = (int) Input_WaktuPengerjaan.getValue();
        
        kuis = new Kuis(0, judulkuis, jumlahsoal, waktupengerjaan, kategorikuis);
        pertanyaan = kuis.buatPertanyaan();
        
        refreshTableDaftarSoal();
    }//GEN-LAST:event_simpankuisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstateFormBuatlapsed" desc=" Look and feel setting code (optional) ">
   /* If Nimbus (introduced in Java SE 6) is not available, stayFormBuat the default look and feel.
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
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdmin("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Card;
    private javax.swing.JPanel CardGrid;
    private javax.swing.JLabel DashboardText;
    private javax.swing.JPanel Form1;
    private javax.swing.JPanel Form2;
    private javax.swing.JPanel Form3;
    private javax.swing.JPanel FormKuis;
    private javax.swing.JPanel FormSoal;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Header_BuatSoal;
    private javax.swing.JPanel InputGroup2;
    private javax.swing.JTextField Input_JudulKuis;
    private javax.swing.JSpinner Input_JumlahSoal;
    private javax.swing.JComboBox<String> Input_KategoriKuis;
    private javax.swing.JScrollPane Input_Pertanyaan;
    private javax.swing.JSpinner Input_WaktuPengerjaan;
    private javax.swing.JPanel Jawaban;
    private javax.swing.JPanel JudulSoal1;
    private javax.swing.JPanel JudulSoal2;
    private javax.swing.JPanel KategoriSoal1;
    private javax.swing.JPanel MainContent_Kuis;
    private javax.swing.JPanel MainContent_SemuaMapel;
    private javax.swing.JPanel MenuItem;
    private javax.swing.JPanel MenuItem_Dashboard;
    private javax.swing.JPanel MenuItem_TambahSoal;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel TambahSoalText;
    private javax.swing.JPanel TopBar;
    private javax.swing.JPanel WaktuPengerjaan1;
    private javax.swing.JPanel WaktuPengerjaan2;
    private javax.swing.JLabel hellotext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton nextbtn1;
    private javax.swing.JPanel opsi1;
    private javax.swing.JPanel opsi2;
    private javax.swing.JPanel opsi3;
    private javax.swing.JPanel opsi4;
    private javax.swing.JPanel opsi5;
    private javax.swing.JCheckBox opsibenar1;
    private javax.swing.JCheckBox opsibenar2;
    private javax.swing.JCheckBox opsibenar3;
    private javax.swing.JCheckBox opsibenar4;
    private javax.swing.JCheckBox opsibenar5;
    private javax.swing.JButton simpankuis;
    private javax.swing.JTable tabelDaftarSoal;
    // End of variables declaration//GEN-END:variables
}