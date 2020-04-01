/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.sub.manager;

import entities.Product;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.BOTTOM;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import service.product.ProductService;
import service.product.ProductServiceImpl;
import util.ImageUtils;
import util.URL_Factory;

/**
 *
 * @author Admin
 */
public class QuanLyPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private final TitledBorder TitledBorder;
    private final ProductService productService;
    private final FlowLayout flowLayout = new FlowLayout();
    private static List<Product> products;
    private Product selectedProduct;
    private static JButton btSelected;
    

    public QuanLyPanel() {
        initComponents();

        productService = new ProductServiceImpl();
        products = productService.getAll();
        selectedProduct = null;
        flowLayout.setAlignment(FlowLayout.LEFT);
        flowLayout.setVgap(5);
        flowLayout.setHgap(10);

        TitledBorder = new TitledBorder("Tất cả các món");
        TitledBorder.setTitleFont(new Font("Tahoma", Font.BOLD, 18));
        TitledBorder.setTitleColor(new Color(51, 153, 255));

        initCenterInComponent(products);
        pnCenterIn.setBorder(TitledBorder);
        pnCenterIn.setLayout(flowLayout);

        initEvent();
        setEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_Top = new javax.swing.JPanel();
        pnTopRight = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_Left = new javax.swing.JPanel();
        btTatCaCacMon = new javax.swing.JButton();
        btDoUongCoga = new javax.swing.JButton();
        btTraSua = new javax.swing.JButton();
        btBanhNgot = new javax.swing.JButton();
        btNuocEp = new javax.swing.JButton();
        btSinhTo = new javax.swing.JButton();
        btCoffee = new javax.swing.JButton();
        pn_Center = new javax.swing.JPanel();
        pn_CenterBottom = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btChinhSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        pn_CenterTop = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnCenterIn = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setMinimumSize(new java.awt.Dimension(1470, 643));
        setPreferredSize(new java.awt.Dimension(1470, 643));
        setLayout(new java.awt.BorderLayout());

        pn_Top.setBackground(new java.awt.Color(255, 255, 255));
        pn_Top.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        pn_Top.setLayout(new java.awt.BorderLayout());

        pnTopRight.setBackground(new java.awt.Color(255, 255, 255));
        pnTopRight.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(51, 153, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        pnTopRight.setMinimumSize(new java.awt.Dimension(1150, 68));
        pnTopRight.setPreferredSize(new java.awt.Dimension(1150, 68));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("THÔNG TIN THỰC ĐƠN");
        pnTopRight.add(jLabel1);

        pn_Top.add(pnTopRight, java.awt.BorderLayout.CENTER);

        add(pn_Top, java.awt.BorderLayout.PAGE_START);

        pn_Left.setBackground(new java.awt.Color(255, 255, 255));
        pn_Left.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 5, 5, new java.awt.Color(51, 153, 255)), javax.swing.BorderFactory.createEmptyBorder(10, 0, 0, 0)));
        pn_Left.setForeground(new java.awt.Color(0, 153, 204));
        pn_Left.setPreferredSize(new java.awt.Dimension(260, 575));
        pn_Left.setLayout(new java.awt.GridLayout(10, 1));

        btTatCaCacMon.setBackground(new java.awt.Color(255, 255, 255));
        btTatCaCacMon.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        btTatCaCacMon.setForeground(new java.awt.Color(0, 153, 204));
        btTatCaCacMon.setText("Tất cả các món");
        btTatCaCacMon.setBorderPainted(false);
        btTatCaCacMon.setFocusPainted(false);
        btTatCaCacMon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btTatCaCacMon.setMaximumSize(new java.awt.Dimension(500, 56));
        btTatCaCacMon.setMinimumSize(new java.awt.Dimension(256, 56));
        btTatCaCacMon.setPreferredSize(new java.awt.Dimension(256, 56));
        btTatCaCacMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTatCaCacMonActionPerformed(evt);
            }
        });
        pn_Left.add(btTatCaCacMon);

        btDoUongCoga.setBackground(new java.awt.Color(255, 255, 255));
        btDoUongCoga.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        btDoUongCoga.setForeground(new java.awt.Color(0, 153, 204));
        btDoUongCoga.setText("Đồ uống có ga");
        btDoUongCoga.setBorderPainted(false);
        btDoUongCoga.setFocusPainted(false);
        btDoUongCoga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDoUongCoga.setMinimumSize(new java.awt.Dimension(256, 56));
        btDoUongCoga.setPreferredSize(new java.awt.Dimension(256, 56));
        pn_Left.add(btDoUongCoga);

        btTraSua.setBackground(new java.awt.Color(255, 255, 255));
        btTraSua.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        btTraSua.setForeground(new java.awt.Color(0, 153, 204));
        btTraSua.setText("Trà sữa");
        btTraSua.setBorderPainted(false);
        btTraSua.setFocusPainted(false);
        btTraSua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btTraSua.setMinimumSize(new java.awt.Dimension(256, 56));
        btTraSua.setPreferredSize(new java.awt.Dimension(256, 56));
        pn_Left.add(btTraSua);

        btBanhNgot.setBackground(new java.awt.Color(255, 255, 255));
        btBanhNgot.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        btBanhNgot.setForeground(new java.awt.Color(0, 153, 204));
        btBanhNgot.setText("Bánh ngọt");
        btBanhNgot.setBorderPainted(false);
        btBanhNgot.setFocusPainted(false);
        btBanhNgot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btBanhNgot.setMinimumSize(new java.awt.Dimension(256, 56));
        btBanhNgot.setPreferredSize(new java.awt.Dimension(256, 56));
        pn_Left.add(btBanhNgot);

        btNuocEp.setBackground(new java.awt.Color(255, 255, 255));
        btNuocEp.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        btNuocEp.setForeground(new java.awt.Color(0, 153, 204));
        btNuocEp.setText("Nước ép");
        btNuocEp.setBorderPainted(false);
        btNuocEp.setFocusPainted(false);
        btNuocEp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNuocEp.setMinimumSize(new java.awt.Dimension(256, 56));
        btNuocEp.setPreferredSize(new java.awt.Dimension(256, 56));
        pn_Left.add(btNuocEp);

        btSinhTo.setBackground(new java.awt.Color(255, 255, 255));
        btSinhTo.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        btSinhTo.setForeground(new java.awt.Color(0, 153, 204));
        btSinhTo.setText("Sinh tố");
        btSinhTo.setBorderPainted(false);
        btSinhTo.setFocusPainted(false);
        btSinhTo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSinhTo.setMinimumSize(new java.awt.Dimension(256, 56));
        btSinhTo.setPreferredSize(new java.awt.Dimension(256, 56));
        pn_Left.add(btSinhTo);

        btCoffee.setBackground(new java.awt.Color(255, 255, 255));
        btCoffee.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        btCoffee.setForeground(new java.awt.Color(0, 153, 204));
        btCoffee.setText("Coffee");
        btCoffee.setBorderPainted(false);
        btCoffee.setFocusPainted(false);
        btCoffee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCoffee.setMinimumSize(new java.awt.Dimension(256, 56));
        btCoffee.setPreferredSize(new java.awt.Dimension(256, 56));
        pn_Left.add(btCoffee);

        add(pn_Left, java.awt.BorderLayout.LINE_START);

        pn_Center.setLayout(new java.awt.BorderLayout());

        pn_CenterBottom.setBackground(new java.awt.Color(255, 255, 255));
        pn_CenterBottom.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 5, 5, new java.awt.Color(51, 153, 255)));
        pn_CenterBottom.setPreferredSize(new java.awt.Dimension(1150, 60));

        btThem.setBackground(new java.awt.Color(0, 153, 0));
        btThem.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btThem.setForeground(new java.awt.Color(255, 255, 255));
        btThem.setText("THÊM");
        btThem.setBorderPainted(false);
        btThem.setFocusPainted(false);
        btThem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btThem.setPreferredSize(new java.awt.Dimension(120, 40));
        pn_CenterBottom.add(btThem);

        btChinhSua.setBackground(new java.awt.Color(0, 153, 0));
        btChinhSua.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btChinhSua.setForeground(new java.awt.Color(255, 255, 255));
        btChinhSua.setText("CHỈNH SỬA");
        btChinhSua.setBorderPainted(false);
        btChinhSua.setEnabled(false);
        btChinhSua.setFocusPainted(false);
        btChinhSua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btChinhSua.setPreferredSize(new java.awt.Dimension(160, 40));
        btChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChinhSuaActionPerformed(evt);
            }
        });
        pn_CenterBottom.add(btChinhSua);

        btXoa.setBackground(new java.awt.Color(0, 153, 0));
        btXoa.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setText("XÓA");
        btXoa.setBorderPainted(false);
        btXoa.setEnabled(false);
        btXoa.setFocusPainted(false);
        btXoa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btXoa.setPreferredSize(new java.awt.Dimension(120, 40));
        pn_CenterBottom.add(btXoa);

        pn_Center.add(pn_CenterBottom, java.awt.BorderLayout.PAGE_END);

        pn_CenterTop.setBackground(new java.awt.Color(255, 255, 255));
        pn_CenterTop.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        pn_CenterTop.setMinimumSize(new java.awt.Dimension(1150, 450));
        pn_CenterTop.setLayout(new javax.swing.OverlayLayout(pn_CenterTop));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1000, 450));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 450));

        pnCenterIn.setBackground(new java.awt.Color(255, 153, 51));
        pnCenterIn.setPreferredSize(new java.awt.Dimension(1150, 900));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 30, 0);
        flowLayout1.setAlignOnBaseline(true);
        pnCenterIn.setLayout(flowLayout1);
        jScrollPane1.setViewportView(pnCenterIn);

        pn_CenterTop.add(jScrollPane1);

        pn_Center.add(pn_CenterTop, java.awt.BorderLayout.CENTER);

        add(pn_Center, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btTatCaCacMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTatCaCacMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTatCaCacMonActionPerformed

    private void btChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChinhSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btChinhSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBanhNgot;
    private javax.swing.JButton btChinhSua;
    private javax.swing.JButton btCoffee;
    private javax.swing.JButton btDoUongCoga;
    private javax.swing.JButton btNuocEp;
    private javax.swing.JButton btSinhTo;
    private javax.swing.JButton btTatCaCacMon;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTraSua;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JPanel pnCenterIn;
    private javax.swing.JPanel pnTopRight;
    private javax.swing.JPanel pn_Center;
    private javax.swing.JPanel pn_CenterBottom;
    private javax.swing.JPanel pn_CenterTop;
    private javax.swing.JPanel pn_Left;
    private javax.swing.JPanel pn_Top;
    // End of variables declaration//GEN-END:variables

    private void initEvent() {
        pnLeftHighLightButtonsEvents();
    }
    
    private JButton setProtmButton( Product product){
        JButton button = new JButton();
        button.setOpaque(false);
        button.setFont(new Font("Camboria", Font.PLAIN, 12));
        button.setForeground(Color.blue);
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(147, 140));
        button.setIcon(ImageUtils.loadImageIcon(URL_Factory.IMAGE_FOLDER_URL + "\\" + product.getImage(), 100, 100));
        button.setVerticalTextPosition(BOTTOM);
        button.setHorizontalTextPosition(CENTER);
        button.setText(product.getName());
        button.setActionCommand(product.getId() + "");
        return button;
    }

    private void initCenterInComponent(List<Product> products) {
        pnCenterIn.removeAll();
        products.forEach(new Consumer<Product>() {
            @Override
            public void accept(Product p) {
                
                JButton button = setProtmButton(p);
                pnCenterIn.add(button);
            }
        });
        pnCenterIn.revalidate();
        pnCenterIn.repaint();
        pnCenterEvent();
    }

    public void addComponentToPnCenterIn(){
       products = productService.getAll();
       initCenterInComponent(products);
    }

    private void pnLeftHighLightButtonsEvents() {
        final Component[] components = pn_Left.getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                final JButton button = (JButton) component;
                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        disableHighLightButtonsPnLeft(components);
                        button.setBackground(new Color(0, 153, 204));
                        button.setForeground(Color.WHITE);
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        button.setFont(new Font("Cambria Math", Font.BOLD, 30));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        button.setFont(new Font("Cambria Math", Font.BOLD, 26));
                    }

                });
            }
        }
    }

    private void disableHighLightButtonsCenter(Component... components) {
        for (Component component : components) {
            if (component instanceof JButton) {
                final JButton button = (JButton) component;
                button.setFont(new Font("Tahoma", Font.PLAIN, 12));
                button.setForeground(Color.BLUE);
            }
        }
    }

    private void disableHighLightButtonsPnLeft(Component... components) {
        for (Component component : components) {
            if (component instanceof JButton) {
                final JButton button = (JButton) component;
                button.setBackground(Color.WHITE);
                button.setForeground(new Color(0, 153, 204));
            }
        }
    }

    private void setEvent() {
        btTatCaCacMonEvent();
        btDoUongCoGaEvent();
        btTraSuaEvent();
        btBanhNgotEvent();
        btNuocEpRvent();
        btSinhToEvent();
        btCoffeeEvent();
        btRemoveEvent();
        btAddEvents();
        btEditEvents();
    }

    private void btTatCaCacMonEvent() {
        btTatCaCacMon.setIcon(ImageUtils.loadImageIcon(URL_Factory.IMAGE_FOLDER_URL + File.separator + "ALLFOOD.png", 30, 30));
        btTatCaCacMon.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                products = productService.getAll();
                TitledBorder.setTitle("Tất cả các món");
                pnCenterIn.setBorder(TitledBorder);
                initCenterInComponent(products);
            }
        });
    }

    private void btDoUongCoGaEvent() {
        btDoUongCoga.setIcon(new ImageIcon(URL_Factory.IMAGE_FOLDER_URL + "\\" + "DOUONG.png"));
        btDoUongCoga.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                products = productService.getAll(1);
                TitledBorder.setTitle("Đồ uống có ga");
                pnCenterIn.setBorder(TitledBorder);
                initCenterInComponent(products);
            }
        });
    }

    private void btTraSuaEvent() {
        btTraSua.setIcon(new ImageIcon(URL_Factory.IMAGE_FOLDER_URL + "\\" + "TRASUA.png"));
        btTraSua.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                products = productService.getAll(2);
                TitledBorder.setTitle("Trà sữa");
                pnCenterIn.setBorder(TitledBorder);
                initCenterInComponent(products);
            }
        });
    }

    private void btBanhNgotEvent() {
        btBanhNgot.setIcon(new ImageIcon(URL_Factory.IMAGE_FOLDER_URL + "\\" + "BANHNGOT.png"));
        btBanhNgot.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                products = productService.getAll(3);
                TitledBorder.setTitle("Bánh ngọt");
                pnCenterIn.setBorder(TitledBorder);
                initCenterInComponent(products);
            }
        });
    }

    private void btNuocEpRvent() {
        btNuocEp.setIcon(new ImageIcon(URL_Factory.IMAGE_FOLDER_URL + "\\" + "NUOCEP.png"));
        btNuocEp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                products = productService.getAll(4);
                TitledBorder.setTitle("Nước ép");
                pnCenterIn.setBorder(TitledBorder);
                initCenterInComponent(products);

            }
        });
    }

    private void btSinhToEvent() {
        btSinhTo.setIcon(new ImageIcon(URL_Factory.IMAGE_FOLDER_URL + "\\" + "SINHTO.png"));
        btSinhTo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                products = productService.getAll(5);
                TitledBorder.setTitle("Sinh tố");
                pnCenterIn.setBorder(TitledBorder);
                initCenterInComponent(products);
            }
        });
    }

    private void btCoffeeEvent() {
        btCoffee.setIcon(new ImageIcon(URL_Factory.IMAGE_FOLDER_URL + "\\" + "CAFFEE.png"));
        btCoffee.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                products = productService.getAll(6);
                TitledBorder.setTitle("Coffee");
                pnCenterIn.setBorder(TitledBorder);
                initCenterInComponent(products);
            }
        });
    }

    private void btRemoveEvent() {
        btXoa.setIcon(ImageUtils.loadImageIcon(URL_Factory.IMAGE_FOLDER_URL + File.separator + "DELETE.png", 30, 30));
        btXoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (btXoa.isEnabled() == true) {
                    int selected = JOptionPane.showConfirmDialog(null, "Xóa Món Ăn");
                    if (selected == 0) {
                        btXoa.setEnabled(false);
                        btChinhSua.setEnabled(false);
                        productService.delete(selectedProduct.getId());
                        pnCenterIn.remove(btSelected);
                        pnCenterIn.revalidate();
                        pnCenterIn.repaint();
                    }
                }
            }
        });
    }

    public void btAddEvents() {
        btThem.setIcon(ImageUtils.loadImageIcon(URL_Factory.IMAGE_FOLDER_URL + File.separator + "ADD.png", 30, 30));
        btThem.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                final ManagerFrom managerForm = new ManagerFrom(QuanLyPanel.this);
                managerForm.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                managerForm.setVisible(true);
            }
        });
    }

    public void btEditEvents() {
        btChinhSua.setIcon(ImageUtils.loadImageIcon(URL_Factory.IMAGE_FOLDER_URL + File.separator + "Edit.png", 30, 30));
        btChinhSua.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (btChinhSua.isEnabled()) {
                    ManagerEditFrom managerEditFrom = new ManagerEditFrom(selectedProduct);
                    managerEditFrom.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                    managerEditFrom.setVisible(true);
                }
            }
        });
    }

    private void pnCenterEvent() {
        Component[] components = pnCenterIn.getComponents();
        Arrays.stream(components).forEach((Component t) -> {
            JButton button = (JButton) t;
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    disableHighLightButtonsCenter(components);
                    button.setFont(new Font("Camboria", Font.BOLD, 14));
                    btXoa.setEnabled(true);
                    btChinhSua.setEnabled(true);
                    button.setForeground(Color.red);
                    products.forEach(p -> {
                        if (p.getId() == Integer.parseInt(button.getActionCommand())) {
                            selectedProduct = p;
                            btSelected = button;
                        } else {
                        }
                    });
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setFont(new Font("Camboria", Font.BOLD, 14));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setFont(new Font("Camboria", Font.PLAIN, 12));
                }
            });
        });
    }

    public static void update(Product product) {
        btSelected.setText(product.getName());
        btSelected.setIcon(ImageUtils.loadImageIcon(URL_Factory.IMAGE_FOLDER_URL + File.separator + product.getImage(), 100, 100));
        btSelected.setActionCommand(product.getId() + "");
    }
}
