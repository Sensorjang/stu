/*
 * Created by JFormDesigner on Tue Mar 16 03:38:53 GMT+08:00 2021
 */

package stu.stuUpload;

import com.alibaba.fastjson.JSONObject;
import stu.pojo.First;

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
public class FirstUpload extends JFrame {
    public FirstUpload() {
        initComponents();
    }

    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here
        textField1.setText("");
        textField2.setText("");
//        textField3.setText("");
//        textField4.setText("");
//        textField5.setText("");
//        textField6.setText("");
        if(comboBox1.getSelectedIndex()<2){
            label2.setVisible(true);
            textField1.setVisible(true);
            label3.setVisible(false);
//            label4.setVisible(false);
//            label5.setVisible(false);
//            label6.setVisible(false);
//            label7.setVisible(false);
//            label8.setVisible(false);
            textField2.setVisible(false);
//            textField3.setVisible(false);
//            textField4.setVisible(false);
//            textField5.setVisible(false);
//            textField6.setVisible(false);
//            comboBox2.setVisible(false);
        }else{
            label2.setVisible(false);
            textField1.setVisible(false);
            label3.setVisible(true);
//            label4.setVisible(true);
//            label5.setVisible(true);
//            label6.setVisible(true);
//            label7.setVisible(true);
//            label8.setVisible(true);
            textField2.setVisible(true);
//            textField3.setVisible(true);
//            textField4.setVisible(true);
//            textField5.setVisible(true);
//            textField6.setVisible(true);
//            comboBox2.setVisible(true);
        }
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        //1.填充对象
        First first = new First();
        first.setName(textField8.getText());
        first.setStuid(textField9.getText());
        first.setType(comboBox1.getSelectedItem().toString());
        first.setDesc(textField1.getText());
        first.setBookName(textField2.getText());
//        first.setBookWriter(textField3.getText());
//        first.setBookFlow(textField4.getText());
//        first.setTheBook(textField5.getText());
//        first.setData(textField6.getText());
//        if(comboBox2.getSelectedIndex()==0) first.setAccept(true);
//        else first.setAccept(false);

        String Str = JSONObject.toJSONString(first);

        //2.创建文件
        File myFilePath = new File("D:\\first.txt");
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
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        button1 = new JButton();
        label9 = new JLabel();

        //======== this ========
        setTitle("Upload");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //---- label10 ----
        label10.setText("\u59d3\u540d\uff1a");
        contentPane.add(label10, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField8, new GridBagConstraints(1, 1, 8, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label11 ----
        label11.setText("\u5b66\u53f7\uff1a");
        contentPane.add(label11, new GridBagConstraints(9, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField9, new GridBagConstraints(10, 1, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- label1 ----
        label1.setText("\u6210\u679c\u7c7b\u578b\uff1a");
        contentPane.add(label1, new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- comboBox1 ----
        comboBox1.addItemListener(e -> comboBox1ItemStateChanged(e));
        contentPane.add(comboBox1, new GridBagConstraints(5, 3, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("\u6210\u679c\u63cf\u8ff0\uff1a");
        contentPane.add(label2, new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField1, new GridBagConstraints(5, 5, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText("\u8bba\u6587\u540d\u79f0\uff1a");
        contentPane.add(label3, new GridBagConstraints(1, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField2, new GridBagConstraints(5, 6, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText("\u63d0\u4ea4\u6210\u679c");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, new GridBagConstraints(3, 9, 7, 2, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        setSize(690, 470);
        setLocationRelativeTo(getOwner());

        //---- label9 ----
        label9.setText("\u5b66\u5206\u503c\uff1a");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        comboBox1.addItem("国家级科技成果奖");
        comboBox1.addItem("省级科技成果奖");
        comboBox1.addItem("公开出版的学术期刊上发表的论文");
        comboBox1.addItem("省级以上学术会议收录的论文");
        comboBox1.addItem("在报刊、杂志上发表作品");
//        comboBox2.addItem("是");
//        comboBox2.addItem("否");
        label2.setVisible(false);
        label3.setVisible(false);
//        label4.setVisible(false);
//        label5.setVisible(false);
//        label6.setVisible(false);
//        label7.setVisible(false);
//        label8.setVisible(false);
        textField1.setVisible(false);
        textField2.setVisible(false);
//        textField3.setVisible(false);
//        textField4.setVisible(false);
//        textField5.setVisible(false);
//        textField6.setVisible(false);
//        comboBox2.setVisible(false);

        label2.setVisible(true);
        textField1.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label10;
    private JTextField textField8;
    private JLabel label11;
    private JTextField textField9;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JButton button1;
    private JLabel label9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
