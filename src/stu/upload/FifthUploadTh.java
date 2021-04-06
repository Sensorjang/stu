/*
 * Created by JFormDesigner on Tue Mar 16 04:10:31 GMT+08:00 2021
 */

package stu.upload;

import com.alibaba.fastjson.JSONObject;
import stu.pojo.Fifth;


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
public class FifthUploadTh extends JFrame {
    private int row;
    public FifthUploadTh(String file,int row) {
        this.row = row;
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Fifth fifth = new Fifth();

        fifth.setCardId(textField2.getText());
        fifth.setCardDate(textField3.getText());

        String Str = JSONObject.toJSONString(fifth);

        //2.创建文件
        File myFilePath = new File("D:\\fifth.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            java.util.List<String> lines = Files.readAllLines(Paths.get("D:\\fifth.txt"));
            List<String> replaced = new ArrayList<>();
            int lineNo = 1;

            for (String line : lines) {
                if(line.equals(""))continue;
                if (lineNo == row+1) {
                    replaced.add(line.replace("\"cardId\":\"\"","\"cardId\":\""+fifth.getCardId()+"\"")
                            .replace("\"cardDate\":\"\"","\"cardDate\":\""+fifth.getCardDate()+"\"")
                            .replace("\"finish\":0","\"finish\":1"));
                } else {
                    replaced.add(line);
                }
                lineNo++;
            }
            Files.write(Paths.get("D:\\fifth.txt"), replaced);
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
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setTitle("Upload");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //---- label2 ----
        label2.setText("\u8bc1\u4e66\u7f16\u53f7\uff1a");
        contentPane.add(label2, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField2, new GridBagConstraints(4, 2, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText("\u53d1\u8bc1\u65e5\u671f\uff1a");
        contentPane.add(label3, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField3, new GridBagConstraints(4, 3, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText("\u63d0\u4ea4\u6210\u679c");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, new GridBagConstraints(3, 5, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        setSize(570, 345);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
