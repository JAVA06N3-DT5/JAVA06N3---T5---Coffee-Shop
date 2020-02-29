/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import view.sub.QuanLyPanel;
import view.sub.DatMonPanel;
import view.sub.TablePanel;
import view.sub.NhanVienPanel;
import view.sub.KhoPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import util.ImageUtils;
import view.sub.ThongKePanel;
import view.sub.TroGiupPanel;

/**
 *
 * @author PC
 */
public class MainFrame extends javax.swing.JFrame {
    
    

    /**
     * Creates new form MainFrame
     */
    private TablePanel tablePanel = new TablePanel();
    private JLabel picLogo = new JLabel();
    private Component[] buttonComponents;
    
    private JPanel panelKho;
    private JPanel panelNhanVien;
    private JPanel panelQuanLy;
    private JPanel panelThongKe;
    private JPanel panelTroGiup;
    private JPanel panelDatMon;
    private CardLayout cardLayout;
    
    
    private final String sourcePath = new File("").getAbsolutePath();
    
    
    public MainFrame() {
        
        initComponents();
        setIcon();
        initMainPanelComponent();
        initTablePanel();
        initEvent();
        
    }
    
    private void setSelectedButtonColorEvent(JButton button){
       
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button.setBackground(new Color(39, 130, 192));
                button.setSelected(true);
                cardLayout.show(pnMain, button.getText());
                Arrays.stream(buttonComponents)
                        .filter(t -> ( t instanceof JButton))
                        .map(t -> (JButton)t )
                        .forEach(t -> {
                            if(t != button){
                                t.setBackground(new Color(75, 198, 242));
                                t.setSelected(false);
                                
                            }
                });               
            }   

            @Override
            public void mouseEntered(MouseEvent e) {
                if (!button.isSelected()){
                    button.setBackground(new Color(39,174,244));
                }
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (!button.isSelected()){
                    button.setBackground(new Color(75, 198, 242));
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

        pnTop = new javax.swing.JPanel();
        pnButton = new javax.swing.JPanel();
        btDatMon = new javax.swing.JButton();
        btThongKe = new javax.swing.JButton();
        btKho = new javax.swing.JButton();
        btQuanLy = new javax.swing.JButton();
        btNhanVien = new javax.swing.JButton();
        btTroGiup = new javax.swing.JButton();
        otherInforPanel = new javax.swing.JPanel();
        lbCalendar = new javax.swing.JLabel();
        pnCenter = new javax.swing.JPanel();
        pnMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnButton.setBackground(new java.awt.Color(39, 130, 192));

        btDatMon.setBackground(new java.awt.Color(75, 198, 242));
        btDatMon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDatMon.setForeground(new java.awt.Color(255, 255, 255));
        btDatMon.setText("Đặt Món");
        btDatMon.setBorderPainted(false);
        btDatMon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btDatMon.setFocusPainted(false);

        btThongKe.setBackground(new java.awt.Color(75, 198, 242));
        btThongKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btThongKe.setText("Thống Kê");
        btThongKe.setAlignmentY(0.0F);
        btThongKe.setBorderPainted(false);
        btThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btThongKe.setFocusPainted(false);

        btKho.setBackground(new java.awt.Color(75, 198, 242));
        btKho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btKho.setForeground(new java.awt.Color(255, 255, 255));
        btKho.setText("Kho");
        btKho.setBorderPainted(false);
        btKho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btKho.setFocusPainted(false);

        btQuanLy.setBackground(new java.awt.Color(75, 198, 242));
        btQuanLy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btQuanLy.setForeground(new java.awt.Color(255, 255, 255));
        btQuanLy.setText("Quản Lý");
        btQuanLy.setBorderPainted(false);
        btQuanLy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btQuanLy.setFocusPainted(false);

        btNhanVien.setBackground(new java.awt.Color(75, 198, 242));
        btNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btNhanVien.setText("Nhân Viên");
        btNhanVien.setBorderPainted(false);
        btNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btNhanVien.setFocusPainted(false);

        btTroGiup.setBackground(new java.awt.Color(75, 198, 242));
        btTroGiup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTroGiup.setForeground(new java.awt.Color(255, 255, 255));
        btTroGiup.setText("Trợ Giúp");
        btTroGiup.setBorderPainted(false);
        btTroGiup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btTroGiup.setFocusPainted(false);

        otherInforPanel.setBackground(new java.awt.Color(39, 130, 192));

        javax.swing.GroupLayout otherInforPanelLayout = new javax.swing.GroupLayout(otherInforPanel);
        otherInforPanel.setLayout(otherInforPanelLayout);
        otherInforPanelLayout.setHorizontalGroup(
            otherInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherInforPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
        );
        otherInforPanelLayout.setVerticalGroup(
            otherInforPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherInforPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnButtonLayout = new javax.swing.GroupLayout(pnButton);
        pnButton.setLayout(pnButtonLayout);
        pnButtonLayout.setHorizontalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addComponent(btDatMon, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btThongKe)
                .addGap(0, 0, 0)
                .addComponent(btKho)
                .addGap(0, 0, 0)
                .addComponent(btQuanLy)
                .addGap(0, 0, 0)
                .addComponent(btNhanVien)
                .addGap(0, 0, 0)
                .addComponent(btTroGiup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherInforPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnButtonLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btDatMon, btKho, btNhanVien, btQuanLy, btThongKe, btTroGiup});

        pnButtonLayout.setVerticalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addGroup(pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(otherInforPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btDatMon, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btThongKe)
                        .addComponent(btKho)
                        .addComponent(btQuanLy)
                        .addComponent(btNhanVien)
                        .addComponent(btTroGiup)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnButtonLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btDatMon, btKho, btNhanVien, btQuanLy, btThongKe, btTroGiup});

        javax.swing.GroupLayout pnTopLayout = new javax.swing.GroupLayout(pnTop);
        pnTop.setLayout(pnTopLayout);
        pnTopLayout.setHorizontalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTopLayout.setVerticalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnTop, java.awt.BorderLayout.PAGE_START);

        pnCenter.setBackground(new java.awt.Color(39, 130, 192));

        pnMain.setMinimumSize(new java.awt.Dimension(1420, 745));
        pnMain.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnCenterLayout = new javax.swing.GroupLayout(pnCenter);
        pnCenter.setLayout(pnCenterLayout);
        pnCenterLayout.setHorizontalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnCenterLayout.setVerticalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
              new MainFrame().setVisible(true);

    }
    
    private void initTablePanel(){
        //PanelTable.add(tablePanel);
        //tablePanel.setVisible(true);
        //tablePanel.dra
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDatMon;
    private javax.swing.JButton btKho;
    private javax.swing.JButton btNhanVien;
    private javax.swing.JButton btQuanLy;
    private javax.swing.JButton btThongKe;
    private javax.swing.JButton btTroGiup;
    private javax.swing.JLabel lbCalendar;
    private javax.swing.JPanel otherInforPanel;
    private javax.swing.JPanel pnButton;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnTop;
    // End of variables declaration//GEN-END:variables

    private void initEvent() {
        buttonEvent();
                
    }
    private void buttonEvent(){
        btDatMon.setBackground(new Color(39, 130, 192));
        buttonComponents = pnButton.getComponents();
        btDatMonEvent();
        btKhoEvent();
        btNhanVienEvent();
        btQuanLyEvent();
        btThongKeEvent();
        btTroGiupEvent();
    }

    private void btDatMonEvent() {
        setSelectedButtonColorEvent(btDatMon);
  
    }

    private void btKhoEvent() {
        setSelectedButtonColorEvent(btKho);
    }

    private void btNhanVienEvent() {
        setSelectedButtonColorEvent(btNhanVien);
    }

    private void btQuanLyEvent() {
        setSelectedButtonColorEvent(btQuanLy);
    }

    private void btThongKeEvent() {
        setSelectedButtonColorEvent(btThongKe);
    }

    private void btTroGiupEvent() {
        setSelectedButtonColorEvent(btTroGiup);
    }

    private void setIcon() {
        final String imageDirectoryPath = sourcePath+"\\images";
        
        btDatMon.setIcon(ImageUtils.loadImage(imageDirectoryPath+"\\icons8_food_40px.png")); 
        btThongKe.setIcon(ImageUtils.loadImage(imageDirectoryPath+"\\icons8_activity_history_40px.png"));
        btKho.setIcon(ImageUtils.loadImage(imageDirectoryPath+"\\icons8_online_store_40px.png"));
        btQuanLy.setIcon(ImageUtils.loadImage(imageDirectoryPath+"\\icons8_chart_40px.png"));
        btNhanVien.setIcon(ImageUtils.loadImage(imageDirectoryPath+"\\icons8_manager_40px.png"));
        btTroGiup.setIcon(ImageUtils.loadImage(imageDirectoryPath+"\\icons8_help_40px.png"));
        
        //lbCalendar.setIcon(ImageUtils.loadImage(imageDirectoryPath+"\\icons8_calendar_64px.png"));
    }

    private void initMainPanelComponent() {
        
        DatMonPanel datMonPanel = new DatMonPanel();
        KhoPanel khoPanel = new KhoPanel();
        NhanVienPanel nhanVienPanel = new NhanVienPanel();
        QuanLyPanel quanLyPanel = new QuanLyPanel();
        ThongKePanel thongKePanel = new ThongKePanel();
        TroGiupPanel troGiupPanel = new TroGiupPanel();
        
        pnMain.add(datMonPanel, btDatMon.getText());
        pnMain.add(khoPanel, btKho.getText());
        pnMain.add(nhanVienPanel, btNhanVien.getText());
        pnMain.add(quanLyPanel, btQuanLy.getText());
        pnMain.add(thongKePanel, btThongKe.getText());
        pnMain.add(troGiupPanel, btTroGiup.getText());
        
        cardLayout = (CardLayout) pnMain.getLayout();
        
    }
}
