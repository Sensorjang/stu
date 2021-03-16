import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Mar 16 03:28:04 GMT+08:00 2021
 */



/**
 * @author qipan
 */
public class Teacher extends JFrame {
    public Teacher() {
        initComponents();
    }

    private void button4ActionPerformed(ActionEvent e) {
        UploadView uploadView = new UploadView();
        uploadView.setVisible(true);
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - qipan
        label1 = new JLabel();
        button5 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setTitle("Teacher");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("\u8001\u5e08\u60a8\u597d\uff0c\u6b22\u8fce\u767b\u9646\u672c\u7cfb\u7edf\uff0c\u8bf7\u9009\u62e9\u60a8\u9700\u8981\u6267\u884c\u7684\u64cd\u4f5c:");
        contentPane.add(label1, new GridBagConstraints(3, 2, 11, 3, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button5 ----
        button5.setText("\u5ba1\u6838\u5b66\u751f\u6210\u679c");
        contentPane.add(button5, new GridBagConstraints(3, 6, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button2 ----
        button2.setText("\u67e5\u770b\u5b66\u751f\u6210\u679c");
        contentPane.add(button2, new GridBagConstraints(10, 6, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button3 ----
        button3.setText("\u7edf\u8ba1\u6210\u679c");
        contentPane.add(button3, new GridBagConstraints(3, 8, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button4 ----
        button4.setText("\u5f55\u5165\u5b66\u751f\u6210\u679c");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button4ActionPerformed(e);
            }
        });
        contentPane.add(button4, new GridBagConstraints(10, 8, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label1;
    private JButton button5;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
