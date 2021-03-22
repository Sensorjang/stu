import examine.Examine;

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
        SearchForFinishListView searchForFinishListView = new SearchForFinishListView();
        searchForFinishListView.setVisible(true);
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        ListView listView = new ListView();
        listView.setVisible(true);
    }


    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Examine examine = new Examine();
        examine.setVisible(true);
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Math math = new Math();
        math.setVisible(true);
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

        //---- label1 ----
        label1.setText("\u8001\u5e08\u60a8\u597d\uff0c\u6b22\u8fce\u767b\u9646\u672c\u7cfb\u7edf\uff0c\u8bf7\u9009\u62e9\u60a8\u9700\u8981\u6267\u884c\u7684\u64cd\u4f5c:");
        contentPane.add(label1, new GridBagConstraints(3, 2, 11, 3, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button5 ----
        button5.setText("\u5ba1\u6838\u5b66\u751f\u6210\u679c");
        button5.addActionListener(e -> button5ActionPerformed(e));
        contentPane.add(button5, new GridBagConstraints(3, 6, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button2 ----
        button2.setText("\u67e5\u770b\u5b66\u751f\u6210\u679c");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, new GridBagConstraints(10, 6, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button3 ----
        button3.setText("\u7edf\u8ba1\u6210\u679c");
        button3.addActionListener(e -> {
			button3ActionPerformed(e);
			button3ActionPerformed(e);
			button3ActionPerformed(e);
			button3ActionPerformed(e);
			button3ActionPerformed(e);
		});
        contentPane.add(button3, new GridBagConstraints(3, 8, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button4 ----
        button4.setText("\u8865\u5168\u6210\u679c\u4fe1\u606f");
        button4.addActionListener(e -> button4ActionPerformed(e));
        contentPane.add(button4, new GridBagConstraints(10, 8, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        setSize(580, 435);
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
