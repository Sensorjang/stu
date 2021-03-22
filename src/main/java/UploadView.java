import stuUpload.*;
import upload.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Mar 16 03:22:21 GMT+08:00 2021
 */



/**
 * @author qipan
 */
public class UploadView extends JFrame {

    public int usr = 0;//1老师 2学生

    public UploadView() {
        initComponents();
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here

            FirstUpload firstUpload = new FirstUpload();
            firstUpload.setVisible(true);

    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here

            SecondUpload secondUpload = new SecondUpload();
            secondUpload.setVisible(true);

    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here

            ThirdUpload thirdUpload = new ThirdUpload();
            thirdUpload.setVisible(true);

    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here

            FourthUpload fourthUpload = new FourthUpload();
            fourthUpload.setVisible(true);

    }

    private void button6ActionPerformed(ActionEvent e) {
        // TODO add your code here

            FifthUpload fifthUpload = new FifthUpload();
            fifthUpload.setVisible(true);

    }

    private void button7ActionPerformed(ActionEvent e) {
        // TODO add your code here

            SixthUpload sixthUpload = new SixthUpload();
            sixthUpload.setVisible(true);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - qipan
        label1 = new JLabel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();

        //======== this ========
        setTitle("Student");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //---- label1 ----
        label1.setText("\u8bf7\u9009\u62e9\u4f60\u8981\u4e0a\u4f20\u7684\u6210\u679c\u7c7b\u578b\uff1a");
        contentPane.add(label1, new GridBagConstraints(1, 0, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- button2 ----
        button2.setText("\u79d1\u7814\u6210\u679c");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button3 ----
        button3.setText("\u77e5\u8bc6\u4ea7\u6743");
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button4 ----
        button4.setText("\u79d1\u7814\u8bad\u7ec3");
        button4.addActionListener(e -> button4ActionPerformed(e));
        contentPane.add(button4, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button5 ----
        button5.setText("\u5b66\u79d1\u4e0e\u79d1\u6280\u7ade\u8d5b");
        button5.addActionListener(e -> button5ActionPerformed(e));
        contentPane.add(button5, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button6 ----
        button6.setText("\u6280\u80fd\u8bc1\u4e66");
        button6.addActionListener(e -> button6ActionPerformed(e));
        contentPane.add(button6, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button7 ----
        button7.setText("\u521b\u4e1a\u5b9e\u8df5\u548c\u521b\u65b0\u521b\u4e1a\u6559\u80b2");
        button7.addActionListener(e -> button7ActionPerformed(e));
        contentPane.add(button7, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        setSize(390, 410);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
