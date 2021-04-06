/*
 * Created by JFormDesigner on Tue Mar 16 04:13:07 GMT+08:00 2021
 */

package stu.upload;

import com.alibaba.fastjson.JSONObject;
import stu.pojo.Sixth;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @author qipan
 */
public class SixthUploadTh extends JFrame {
    private int row;
    public SixthUploadTh(String file,int row) {
        this.row = row;
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Sixth sixth = new Sixth();

        sixth.setTh(textField3.getText());
        sixth.setManager(textField4.getText());
        sixth.setTel(textField5.getText());
        sixth.setDate(textField6.getText());
        String Str = JSONObject.toJSONString(sixth);

        //2.创建文件
        File myFilePath = new File("D:\\sixth.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            java.util.List<String> lines = Files.readAllLines(Paths.get("D:\\sixth.txt"));
            List<String> replaced = new ArrayList<>();
            int lineNo = 1;

            for (String line : lines) {
                if(line.equals(""))continue;
                if (lineNo == row+1) {
                    replaced.add(line.replace("\"th\":\"\"","\"th\":\""+sixth.getTh()+"\"")
                            .replace("\"manager\":\"\"","\"manager\":\""+ sixth.getManager()+"\"")
                            .replace("\"tel\":\"\"","\"tel\":\""+ sixth.getTel()+"\"")
                            .replace("\"date\":\"\"","\"data\":\""+ sixth.getDate()+"\"")
                            .replace("\"finish\":0","\"finish\":1"));
                } else {
                    replaced.add(line);
                }
                lineNo++;
            }
            Files.write(Paths.get("D:\\sixth.txt"), replaced);
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
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        textField5 = new JTextField();
        label6 = new JLabel();
        textField6 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setTitle("Upload");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //---- label3 ----
        label3.setText("\u8f85\u5bfc\u8001\u5e08\uff1a");
        contentPane.add(label3, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField3, new GridBagConstraints(2, 6, 8, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label4 ----
        label4.setText("\u673a\u6784\u8d1f\u8d23\u4eba\uff1a");
        contentPane.add(label4, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField4, new GridBagConstraints(2, 7, 8, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label5 ----
        label5.setText("\u673a\u6784\u8054\u7cfb\u65b9\u5f0f\uff1a");
        contentPane.add(label5, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField5, new GridBagConstraints(2, 8, 8, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label6 ----
        label6.setText("\u5b8c\u6210\u65f6\u95f4\uff1a");
        contentPane.add(label6, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField6, new GridBagConstraints(2, 9, 8, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText("\u63d0\u4ea4\u6210\u679c");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, new GridBagConstraints(2, 12, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        setSize(655, 480);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JTextField textField5;
    private JLabel label6;
    private JTextField textField6;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
