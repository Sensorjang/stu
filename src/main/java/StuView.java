import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
import stuSearchAcv.SearchAVH;
/*
 * Created by JFormDesigner on Mon Mar 22 20:34:41 CST 2021
 */



/**
 * @author qipan
 */
public class StuView extends JFrame {

    public String stuAcc = null;
    public StuView() {
        initComponents();
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        UploadView uploadView = new UploadView();
        uploadView.usr = 2;
        uploadView.setVisible(true);
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        SearchAVH avh = new SearchAVH(stuAcc);
        avh.setVisible(true);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - qipan
        label1 = new JLabel();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("Student");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets 0,hidemode 3,gap 0 0",
            // columns
            "[grow,fill]",
            // rows
            "[fill]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[grow,fill]"));

        //---- label1 ----
        label1.setText("\u540c\u5b66\u4f60\u597d\uff0c\u6b22\u8fce\u767b\u9646\u672c\u7cfb\u7edf\uff0c\u8bf7\u9009\u62e9\u9700\u8981\u6267\u884c\u7684\u64cd\u4f5c:");
        contentPane.add(label1, "cell 0 1");

        //---- button2 ----
        button2.setText("\u4e0a\u4f20\u6210\u679c");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, "cell 0 3");

        //---- button3 ----
        button3.setText("\u67e5\u770b\u6211\u7684\u6210\u679c");
        button3.addActionListener(e -> {
			button3ActionPerformed(e);
		});
        contentPane.add(button3, "cell 0 3");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
