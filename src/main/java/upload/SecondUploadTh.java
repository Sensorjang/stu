/*
 * Created by JFormDesigner on Tue Mar 16 03:57:24 GMT+08:00 2021
 */

package upload;

import com.alibaba.fastjson.JSONObject;
import pojo.Second;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @author qipan
 */
public class SecondUploadTh extends JFrame {
    private int row;
    public SecondUploadTh(String file,int row) {
        this.row = row;
        initComponents();
    }

    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here
        textField1.setText("");
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        //1.填充对象
        Second second = new Second();
        second.setId(textField1.getText());

        String Str = JSONObject.toJSONString(second);

        //2.创建文件
        File myFilePath = new File("D:\\second.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            java.util.List<String> lines = Files.readAllLines(Paths.get("D:\\second.txt"));
            List<String> replaced = new ArrayList<>();
            int lineNo = 1;

            for (String line : lines) {
                if(line.equals(""))continue;
                if (lineNo == row+1) {
                    replaced.add(line.replace("\"id\":\"\"","\"id\":\""+second.getId()+"\"")
                            .replace("\"finish\":0","\"finish\":1"));
                } else {
                    replaced.add(line);
                }
                lineNo++;
            }
            Files.write(Paths.get("D:\\second.txt"), replaced);
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
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setTitle("Upload");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //---- label2 ----
        label2.setText("\u8bc1\u4e66\u7f16\u53f7\uff1a");
        contentPane.add(label2, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(textField1, new GridBagConstraints(5, 4, 9, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText("\u63d0\u4ea4\u6210\u679c");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, new GridBagConstraints(4, 7, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        setSize(645, 300);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
