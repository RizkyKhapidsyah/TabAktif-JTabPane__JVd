package com.rk;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JTabbedPane tab;

    public FormUtama() {
        super("Tab Selected Height");
        inisialisasi_Komponen();
    }

    private void inisialisasi_Komponen() {
        tab = new JTabbedPane();
        tab.addTab("System", null);
        tab.addTab("Personalisasi", null);
        tab.addTab("Pengaturan Lainnya", null);

        tab.setUI(new TampilanTab());

        setPreferredSize(new Dimension(600, 600));
        getContentPane().add(tab, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
