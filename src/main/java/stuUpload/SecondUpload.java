/*
 * Created by JFormDesigner on Tue Mar 16 03:57:24 GMT+08:00 2021
 */

package stuUpload;

import com.alibaba.fastjson.JSONObject;
import pojo.Second;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author qipan
 */
public class SecondUpload extends JFrame {
    public SecondUpload() {
        initComponents();
    }

    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here
//        textField1.setText("");
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        //1.填充对象
        Second second = new Second();
        second.setName(textField8.getText());
        second.setStuid(textField9.getText());
        second.setType(comboBox1.getSelectedItem().toString());
//        second.setId(textField1.getText());

        String Str = JSONObject.toJSONString(second);

        //2.创建文件
        File myFilePath = new File("D:\\second.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            FileWriter resultFile = new FileWriter(myFilePath,true);
            PrintWriter myFile = new PrintWriter(resultFile);
            myFile.println(Str);
//            myFile.println("\n");
            resultFile.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        dispose();
        UploadSuccessView uploadSuccessView = new UploadSuccessView();
        uploadSuccessView.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - qipan
        label10 = new JLabel();
        textField8 = new JTextField();
        label11 = new JLabel();
        textField9 = new JTextField();
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        button1 = new JButton();

        //======== this ========
        setTitle("Upload");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //---- label10 ----
        label10.setText("\u59d3\u540d\uff1a");
        contentPane.add(label10, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField8, new GridBagConstraints(3, 2, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label11 ----
        label11.setText("\u5b66\u53f7\uff1a");
        contentPane.add(label11, new GridBagConstraints(9, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField9, new GridBagConstraints(10, 2, 8, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label1 ----
        label1.setText("\u6210\u679c\u7c7b\u578b\uff1a");
        contentPane.add(label1, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- comboBox1 ----
        comboBox1.addItemListener(e -> comboBox1ItemStateChanged(e));
        contentPane.add(comboBox1, new GridBagConstraints(5, 3, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText("\u63d0\u4ea4\u6210\u679c");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, new GridBagConstraints(4, 7, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        setSize(645, 345);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        comboBox1.addItem("专利");
        comboBox1.addItem("软著");
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label10;
    private JTextField textField8;
    private JLabel label11;
    private JTextField textField9;
    private JLabel label1;
    private JComboBox comboBox1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
