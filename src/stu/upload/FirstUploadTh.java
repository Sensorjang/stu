/*
 * Created by JFormDesigner on Tue Mar 16 03:38:53 GMT+08:00 2021
 */

package stu.upload;

import com.alibaba.fastjson.JSONObject;
import stu.pojo.First;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @author qipan
 */
public class FirstUploadTh extends JFrame {
    private int row;
    public FirstUploadTh(String file,int row) {
        this.row = row;
        initComponents();
    }

    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");

    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        //1.填充对象
        First first = new First();

        first.setBookWriter(textField3.getText());
        first.setBookFlow(textField4.getText());
        first.setTheBook(textField5.getText());
        first.setData(textField6.getText());
        if(comboBox2.getSelectedIndex()==0) first.setAccept(true);
        else first.setAccept(false);

        String Str = JSONObject.toJSONString(first);

        //2.创建文件
        File myFilePath = new File("D:\\first.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            java.util.List<String> lines = Files.readAllLines(Paths.get("D:\\first.txt"));
            List<String> replaced = new ArrayList<>();
            int lineNo = 1;

            for (String line : lines) {
                if(line.equals(""))continue;
                if (lineNo == row+1) {
                    replaced.add(line.replace("\"bookWriter\":\"\"","\"bookWriter\":\""+first.getBookWriter()+"\"")
                            .replace("\"bookFlow\":\"\"","\"bookFlow\":\""+first.getBookFlow()+"\"")
                            .replace("\"theBook\":\"\"","\"theBook\":\""+first.getTheBook()+"\"")
                            .replace("\"data\":\"\"","\"data\":\""+first.getData()+"\"")
                            .replace("\"accept\":false","\"accept\":"+first.isAccept())
                            .replace("\"finish\":0","\"finish\":1"));
                } else {
                    replaced.add(line);
                }
                lineNo++;
            }
            Files.write(Paths.get("D:\\first.txt"), replaced);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        dispose();
        UploadSuccessViewTh uploadSuccessView = new UploadSuccessViewTh();
        uploadSuccessView.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - qipan
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        textField5 = new JTextField();
        label7 = new JLabel();
        textField6 = new JTextField();
        label8 = new JLabel();
        comboBox2 = new JComboBox();
        button1 = new JButton();
        label9 = new JLabel();

        //======== this ========
        setTitle("Upload");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //---- label4 ----
        label4.setText("\u4f5c\u8005\uff1a");
        contentPane.add(label4, new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField3, new GridBagConstraints(5, 2, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label5 ----
        label5.setText("\u6392\u5e8f\uff1a");
        contentPane.add(label5, new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField4, new GridBagConstraints(5, 3, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label6 ----
        label6.setText("\u520a\u7269\u540d\u79f0\uff1a");
        contentPane.add(label6, new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField5, new GridBagConstraints(5, 4, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label7 ----
        label7.setText("\u53d1\u8868\u5e74\u6708\uff1a");
        contentPane.add(label7, new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField6, new GridBagConstraints(5, 5, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label8 ----
        label8.setText("\u6536\u5f55\u60c5\u51b5\uff1a");
        contentPane.add(label8, new GridBagConstraints(1, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(comboBox2, new GridBagConstraints(5, 6, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText("\u63d0\u4ea4\u6210\u679c");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, new GridBagConstraints(5, 8, 7, 2, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        setSize(690, 390);
        setLocationRelativeTo(getOwner());

        //---- label9 ----
        label9.setText("\u5b66\u5206\u503c\uff1a");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        comboBox2.addItem("是");
        comboBox2.addItem("否");



    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField5;
    private JLabel label7;
    private JTextField textField6;
    private JLabel label8;
    private JComboBox comboBox2;
    private JButton button1;
    private JLabel label9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
