/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kuisonline;

import java.awt.Color;
import kuisonline.model.Pengguna;
import kuisonline.util.DragListener;
import kuisonline.view.Login;
import kuisonline.view.Register;
import kuisonline.view.admin.DashboardAdmin;
import kuisonline.view.siswa.DashboardSiswa;

/**
 *
 * @author TUF GAMING
 */
public class MainFrame extends javax.swing.JFrame {
    
    private java.awt.CardLayout cardLayout = new java.awt.CardLayout();
    private Login login = new Login(this);
    private Register register = new Register(this);
    private DashboardAdmin dashboardAdmin = new DashboardAdmin(this);
    private DashboardSiswa dashboardSiswa = new DashboardSiswa(this);
    
    /**
     * Creates new form Auth
     */
    public MainFrame() {
        setUndecorated(true);
        this.getContentPane().setBackground(Color.BLACK);
        
        initComponents();
        
        // Menambahkan fitur drag
        DragListener drag = new DragListener(this);
        Header.addMouseListener(drag);
        Header.addMouseMotionListener(drag);
        
        Content.setLayout(cardLayout);
        Content.add(login, "LoginPage");
        Content.add(register, "RegisterPage");
        Content.add(dashboardAdmin, "DashboardAdmin");
        Content.add(dashboardSiswa, "DashboardSiswa");
    }
    
    public void login() {
        cardLayout.show(Content, "LoginPage");
        login.reset();
    }

    public void register() {
        cardLayout.show(Content, "RegisterPage");
        register.reset();
    }
    
    public void dashboardAdmin(Pengguna userLogged) {
        cardLayout.show(Content, "DashboardAdmin");
        dashboardAdmin.setUser(userLogged);
    }

    public void dashboardSiswa(Pengguna userLogged) {
        cardLayout.show(Content, "DashboardSiswa");
        dashboardSiswa.setUser(userLogged);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        minbtn = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        maxbtn = new javax.swing.JPanel();
        maximize = new javax.swing.JLabel();
        exitbtn = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new java.awt.CardLayout(1, 1));

        jPanel2.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(204, 204, 255));
        Header.setPreferredSize(new java.awt.Dimension(500, 30));
        Header.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 12, 0));

        minbtn.setBackground(new java.awt.Color(204, 204, 255));
        minbtn.setPreferredSize(new java.awt.Dimension(30, 30));
        minbtn.setLayout(new java.awt.BorderLayout());

        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/minimize.png"))); // NOI18N
        minimize.setPreferredSize(new java.awt.Dimension(30, 40));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        minbtn.add(minimize, java.awt.BorderLayout.CENTER);

        jPanel1.add(minbtn);

        maxbtn.setBackground(new java.awt.Color(204, 204, 255));
        maxbtn.setLayout(new java.awt.BorderLayout());

        maximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/maximize.png"))); // NOI18N
        maximize.setPreferredSize(new java.awt.Dimension(30, 40));
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });
        maxbtn.add(maximize, java.awt.BorderLayout.CENTER);

        jPanel1.add(maxbtn);

        exitbtn.setBackground(new java.awt.Color(204, 204, 255));
        exitbtn.setLayout(new java.awt.BorderLayout());

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kuisonline/assets/exit.png"))); // NOI18N
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.setPreferredSize(new java.awt.Dimension(30, 40));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exitbtn.add(exit, java.awt.BorderLayout.CENTER);

        jPanel1.add(exitbtn);

        Header.add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel2.add(Header, java.awt.BorderLayout.PAGE_START);

        Content.setPreferredSize(new java.awt.Dimension(800, 500));
        Content.setLayout(new java.awt.CardLayout());
        jPanel2.add(Content, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(MainFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        if (this.getExtendedState() != MainFrame.MAXIMIZED_BOTH) {
            this.setExtendedState(MainFrame.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(MainFrame.NORMAL);
        }
    }//GEN-LAST:event_maximizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose(); // untuk close
    }//GEN-LAST:event_exitMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel maxbtn;
    private javax.swing.JLabel maximize;
    private javax.swing.JPanel minbtn;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
