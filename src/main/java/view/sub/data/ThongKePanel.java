/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.sub.data;


import dao.bill.BillDao;
import dao.bill.BillDaoImpl;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author Admin
 */
public class ThongKePanel extends javax.swing.JPanel {

    
    
    
    
    public ThongKePanel() {

        initComponents();
        initEvents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnChart = new javax.swing.JPanel();
        lbStatistic = new javax.swing.JLabel();
        btStaWeek = new javax.swing.JButton();
        btStaMonth = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1420, 745));

        pnChart.setBackground(new java.awt.Color(204, 255, 153));
        pnChart.setForeground(new java.awt.Color(255, 153, 153));
        pnChart.setMinimumSize(new java.awt.Dimension(1243, 615));
        pnChart.setPreferredSize(new java.awt.Dimension(1243, 615));
        pnChart.setLayout(new javax.swing.OverlayLayout(pnChart));

        lbStatistic.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbStatistic.setForeground(new java.awt.Color(51, 51, 255));
        lbStatistic.setText("THỐNG KÊ DOANH THU");

        btStaWeek.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btStaWeek.setText("Theo tuần");
        btStaWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStaWeekActionPerformed(evt);
            }
        });

        btStaMonth.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btStaMonth.setText("Theo tháng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 93, Short.MAX_VALUE)
                        .addComponent(lbStatistic, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btStaWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btStaMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbStatistic, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btStaWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btStaMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 494, Short.MAX_VALUE))
                    .addComponent(pnChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btStaWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStaWeekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btStaWeekActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btStaMonth;
    private javax.swing.JButton btStaWeek;
    private javax.swing.JLabel lbStatistic;
    private javax.swing.JPanel pnChart;
    // End of variables declaration//GEN-END:variables

    private void initEvents() {
        btMonthEvent();
        btWeekEvent();
    }

    private void btMonthEvent() {
        btStaMonth.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ChartPanel chartPanel = new ChartPanel(createChart(getDayAndSumOfMonth()));
                chartPanel.setPreferredSize(new Dimension(900, 700));
                chartPanel.setDomainZoomable(true);
                pnChart.removeAll();
                pnChart.add(chartPanel);
                pnChart.repaint();
                pnChart.validate();
            }

        });
    }

    private void btWeekEvent() {
        btStaWeek.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ChartPanel chartPanel = new ChartPanel(createChart(getDayAndSumOfWeek()));
                chartPanel.setPreferredSize(new Dimension(900, 700));
                chartPanel.setDomainZoomable(true);
                pnChart.removeAll();
                pnChart.add(chartPanel);
                pnChart.repaint();
                pnChart.validate();
            }

        });
    }

    private CategoryDataset createDataset(Map<String, Float> mmap) {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Map.Entry<String, Float> entry : mmap.entrySet()) {
            dataset.addValue(entry.getValue(), "Tổng thu", entry.getKey());
        }
        return dataset;
    }

    public JFreeChart createChart(Map<String, Float> mmapp) {
        JFreeChart barChart;
        barChart = ChartFactory.createBarChart(
                "",
                "Ngày", "Tổng thu",
                createDataset(mmapp), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }

    private static Map<String, Float> getDayAndSumOfMonth() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Map<String, Float> map = new LinkedHashMap<>();
        BillDao billDao = new BillDaoImpl();
        Calendar c = Calendar.getInstance();
        String dayy = "";
        for (int i = 0; i < c.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            c.set(Calendar.DAY_OF_MONTH, i + 1);
            dayy = format.format(c.getTime());
            map.put(Integer.toString(i + 1), billDao.getSumOfDay(dayy));
        }
        return map;
    }

    private static Map<String, Float> getDayAndSumOfWeek() {
        String[] DayOfWeeks = {"CHỦ NHẬT", "THỨ HAI", "THỨ BA", "THỨ TƯ", "THỨ NĂM", "THỨ SÁU", "THỨ BẢY"};
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Map<String, Float> map = new LinkedHashMap<>();
        BillDao billDao = new BillDaoImpl();
        Calendar c = Calendar.getInstance();
        String dayy = "";
        for (int i = 0; i < 7; i++) {
            c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() + i);
            dayy = format.format(c.getTime());
            map.put(DayOfWeeks[i], billDao.getSumOfDay(dayy));
        }
        return map;
    }

}
