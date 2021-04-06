/*
 * Created by JFormDesigner on Tue Mar 16 04:07:53 GMT+08:00 2021
 */

package stu.upload;

import com.alibaba.fastjson.JSONObject;
import stu.pojo.Forth;


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
public class FourthUploadTh extends JFrame {
    private int row;
    public FourthUploadTh(String file,int row) {
        this.row = row;
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Forth forth = new Forth();

        forth.setCmp(textField2.getText());
        forth.setDesc(textField3.getText());

        String Str = JSONObject.toJSONString(forth);

        //2.创建文件
        File myFilePath = new File("D:\\fourth.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            java.util.List<String> lines = Files.readAllLines(Paths.get("D:\\fourth.txt"));
            List<String> replaced = new ArrayList<>();
            int lineNo = 1;

            for (String line : lines) {
                if(line.equals(""))continue;
                if (lineNo == row+1) {
                    replaced.add(line.replace("\"cmp\":\"\"","\"cmp\":\""+forth.getCmp()+"\"")
                            .replace("\"desc\":\"\"","\"desc\":\""+forth.getDesc()+"\"")
                            .replace("\"finish\":0","\"finish\":1"));
                } else {
                    replaced.add(line);
                }
                lineNo++;
            }
            Files.write(Paths.get("D:\\fourth.txt"), replaced);
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
        label2.setText("\u4e3b\u529e\u5355\u4f4d\uff1a");
        contentPane.add(label2, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField2, new GridBagConstraints(5, 6, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText("\u5956\u9879\u63cf\u8ff0\uff1a");
        contentPane.add(label3, new GridBagConstraints(3, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField3, new GridBagConstraints(5, 7, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText("\u63d0\u4ea4\u6210\u679c");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, new GridBagConstraints(4, 9, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        setSize(660, 455);
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
