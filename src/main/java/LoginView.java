import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Mar 16 02:52:44 GMT+08:00 2021
 */



/**
 * @author qipan
 */
public class LoginView extends JFrame {
    public LoginView() {
        initComponents();
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(comboBox1.getSelectedIndex() == 0){//辅导员
            Teacher teacher = new Teacher();
            teacher.setVisible(true);
            this.setVisible(false);
        }else{//学生
            StuView stuView = new StuView();
            stuView.setVisible(true);
            stuView.stuAcc = textField1.getText();
            this.setVisible(false);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - qipan
        label4 = new JLabel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        label3 = new JLabel();
        comboBox1 = new JComboBox();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("Achievement management system");
        setFont(new Font(Font.DIALOG, Font.PLAIN, 21));
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 0, 90, 190, 0, 5, 0, 5, 0, 5, 0, 5, 0};

        //---- label4 ----
        label4.setText("\u5927\u5b66\u751f\u8bfe\u5916\u79d1\u6280\u6d3b\u52a8\u6210\u679c\u7ba1\u7406\u7cfb\u7edf");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 13f));
        contentPane.add(label4, new GridBagConstraints(7, 3, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- label1 ----
        label1.setText("\u8d26\u53f7\uff1a");
        contentPane.add(label1, new GridBagConstraints(7, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        contentPane.add(textField1, new GridBagConstraints(8, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- label2 ----
        label2.setText("\u5bc6\u7801\uff1a");
        contentPane.add(label2, new GridBagConstraints(7, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        contentPane.add(passwordField1, new GridBagConstraints(8, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- label3 ----
        label3.setText("\u7528\u6237\u7c7b\u578b\uff1a");
        contentPane.add(label3, new GridBagConstraints(7, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        contentPane.add(comboBox1, new GridBagConstraints(8, 7, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- button1 ----
        button1.setText("\u6ce8\u518c");
        contentPane.add(button1, new GridBagConstraints(8, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));

        //---- button2 ----
        button2.setText("\u767b\u5f55");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, new GridBagConstraints(9, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(710, 390);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        comboBox1.addItem("辅导员");
        comboBox1.addItem("学生");

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label4;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JLabel label3;
    private JComboBox comboBox1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
