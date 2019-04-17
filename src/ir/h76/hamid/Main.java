/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.h76.hamid;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.swing.*;
import sun.util.*;
import sun.util.logging.resources.logging;
/**
 *
 * @author A.I
 */
public class Main extends JFrame {
    Bitcoin bcPrice;
    int usdInT = 15000;
    int gfBitcoins = 30;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
           
        
        panel = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        bitCoinPriceText = new JLabel();
        jSeparator1 = new JSeparator();
        bitCoinPriceLabel = new JLabel();
        gfCountBitcoinText = new JLabel();
        gfBitCoins = new JLabel();
        gfFoolishText = new JLabel();
        gfFoolishPrice = new JLabel();
        jLabel3 = new JLabel();
        bitCoinPriceText1 = new JLabel();
        usdInTooman = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new Color(255, 255, 255));

        jLabel1.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new Color(200, 0, 0));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("پروژه‌ی محاسبه‌ی حماقت دوست‌دختر");

        jLabel2.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("توجه: قیمت بیت‌کوین هر  ۲ ثانیه به روز می‌شود، اعداد واقعی هستند");

        bitCoinPriceText.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        bitCoinPriceText.setHorizontalAlignment(SwingConstants.RIGHT);
        bitCoinPriceText.setText("قیمت هر بیت‌کوین در این لحظه به دلار آمریکا");

        bitCoinPriceLabel.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        bitCoinPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bitCoinPriceLabel.setText("Loading...");

        gfCountBitcoinText.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        gfCountBitcoinText.setHorizontalAlignment(SwingConstants.RIGHT);
        gfCountBitcoinText.setText("تعداد احتمالی بیت‌کوین‌های دوست‌دختر");

        gfBitCoins.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        gfBitCoins.setHorizontalAlignment(SwingConstants.CENTER);
        gfBitCoins.setText("30");

        gfFoolishText.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        gfFoolishText.setHorizontalAlignment(SwingConstants.RIGHT);
        gfFoolishText.setText("محاسبه‌ی هزینه‌ی حماقت دوست دختر در این لحظه");

        gfFoolishPrice.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        gfFoolishPrice.setForeground(new Color(255, 0, 0));
        gfFoolishPrice.setHorizontalAlignment(SwingConstants.CENTER);
        gfFoolishPrice.setText("Loading...");

        jLabel3.setForeground(new Color(150, 150, 150));
        jLabel3.setText("Story From: tdvlpr | Idea, Design & Programming: Hamid0x4c");

        bitCoinPriceText1.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        bitCoinPriceText1.setHorizontalAlignment(SwingConstants.RIGHT);
        bitCoinPriceText1.setText("قیمت دلار آمریکا به تومان - حدوداً");

        usdInTooman.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        usdInTooman.setHorizontalAlignment(SwingConstants.CENTER);
        usdInTooman.setText(usdInT + "");

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        
        // horizontal group
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(gfFoolishPrice, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gfFoolishText, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(bitCoinPriceLabel, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usdInTooman, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gfBitCoins, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(bitCoinPriceText, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bitCoinPriceText1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gfCountBitcoinText, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap()));
        
        // Vertical group
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(bitCoinPriceText, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(bitCoinPriceLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(usdInTooman)
                    .addComponent(bitCoinPriceText1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(gfCountBitcoinText)
                    .addComponent(gfBitCoins))
                .addGap(11, 11, 11)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(gfFoolishText)
                    .addComponent(gfFoolishPrice))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                HTTPClient client = new HTTPClient();                
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        bcPrice = client.getData();
                        bitCoinPriceLabel.setText(bcPrice.getPrice() + " دلار");
                        
                        
                        long calculatedPrice = (long) (bcPrice.getPrice() * usdInT) * gfBitcoins;
                        
                        // format number in three digit
                        NumberFormat myFormat = NumberFormat.getInstance();
                        myFormat.setGroupingUsed(true);
                        
                        String foolishText = myFormat.format(calculatedPrice) + " تومان";
                        gfFoolishPrice.setText(foolishText);
                    }
                }, 0, client.myLong);
            }
        });
        
    }// </editor-fold>
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Main myPanel = new Main();
        myPanel.setLocationRelativeTo(null);
        myPanel.setVisible(true);
        myPanel.setResizable(false);
    }

    // Variables declaration - do not modify                     
    private JLabel bitCoinPriceLabel;
    private JLabel bitCoinPriceText;
    private JLabel bitCoinPriceText1;
    private JLabel gfBitCoins;
    private JLabel gfCountBitcoinText;
    private JLabel gfFoolishPrice;
    private JLabel gfFoolishText;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JSeparator jSeparator1;
    private JPanel panel;
    private JLabel usdInTooman;
    // End of variables declaration                   
}
