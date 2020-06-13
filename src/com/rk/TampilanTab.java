package com.rk;

import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

public class TampilanTab extends BasicTabbedPaneUI {

    @Override
    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        return 36;
    }

    @Override
    protected void paintTab(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect) {
        int indeksDipilih = tabPane.getSelectedIndex();
        boolean apakahDipilih = indeksDipilih == tabIndex;

        if (!apakahDipilih) {
            rects[tabIndex].y = 12;
            rects[tabIndex].height = 24;
        }

        super.paintTab(g, tabPlacement, rects, tabIndex, iconRect, textRect);
    }
}
