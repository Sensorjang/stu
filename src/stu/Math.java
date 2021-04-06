package stu;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.alibaba.fastjson.JSONObject;
import net.miginfocom.swing.*;
import org.apache.commons.lang3.StringEscapeUtils;
import stu.pojo.First;
/*
 * Created by JFormDesigner on Tue Mar 16 15:20:12 CST 2021
 */



/**
 * @author qipan
 */
public class Math extends JFrame {

    private  Map<String, Integer> map = new HashMap<>();//统计用

    public Math() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - qipan
        label6 = new JLabel();
        scrollPane3 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        label9 = new JLabel();
        label3 = new JLabel();
        label10 = new JLabel();
        label4 = new JLabel();
        label11 = new JLabel();
        label1 = new JLabel();
        label12 = new JLabel();
        label7 = new JLabel();
        label13 = new JLabel();
        label5 = new JLabel();
        label14 = new JLabel();
        label8 = new JLabel();
        label15 = new JLabel();

        //======== this ========
        setTitle("Statistics");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label6 ----
        label6.setText("\u7edf\u8ba1\u7ed3\u679c");
        label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 8f));
        contentPane.add(label6, "cell 6 1 5 1");

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(table1);
        }
        contentPane.add(scrollPane3, "cell 13 0 19 10");

        //---- label2 ----
        label2.setText("\u79d1\u7814\u6210\u679c");
        contentPane.add(label2, "cell 4 2 3 1");

        //---- label9 ----
        label9.setText("0");
        contentPane.add(label9, "cell 10 2");

        //---- label3 ----
        label3.setText("\u77e5\u8bc6\u4ea7\u6743");
        contentPane.add(label3, "cell 4 3 4 1");

        //---- label10 ----
        label10.setText("0");
        contentPane.add(label10, "cell 10 3");

        //---- label4 ----
        label4.setText("\u79d1\u7814\u8bad\u7ec3");
        contentPane.add(label4, "cell 4 4 4 1");

        //---- label11 ----
        label11.setText("0");
        contentPane.add(label11, "cell 10 4");

        //---- label1 ----
        label1.setText("\u5b66\u79d1\u4e0e\u79d1\u6280\u7ade\u8d5b");
        contentPane.add(label1, "cell 4 5 3 1");

        //---- label12 ----
        label12.setText("0");
        contentPane.add(label12, "cell 10 5");

        //---- label7 ----
        label7.setText("\u6280\u80fd\u8bc1\u4e66");
        contentPane.add(label7, "cell 4 6");

        //---- label13 ----
        label13.setText("0");
        contentPane.add(label13, "cell 10 6");

        //---- label5 ----
        label5.setText("\u521b\u4e1a\u5b9e\u8df5\u548c\u521b\u65b0\u521b\u4e1a\u6559\u80b2");
        contentPane.add(label5, "cell 4 7 4 1");

        //---- label14 ----
        label14.setText("0");
        contentPane.add(label14, "cell 10 7");

        //---- label8 ----
        label8.setText("\u603b\u8ba1\uff1a");
        contentPane.add(label8, "cell 4 9");

        //---- label15 ----
        label15.setText("0");
        contentPane.add(label15, "cell 10 9");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents


        long first = 0;
        long second = 0;
        long third = 0;
        long fourth = 0;
        long fifth = 0;
        long sixth = 0;
        //文件读入
        ArrayList<First> arrayList = new ArrayList<First>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null; //用于包装InputStreamReader,提高处理性能。因为BufferedReader有缓冲的，而InputStreamReader没有。
        try {
            String str = "";
            String str1 = "";
            fis = new FileInputStream("D:\\first.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(! str.equals(""))first++;

                //统计表
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                First firstOne = new First();
                String id = jsonObject.getString("stuid");
                Integer num = map.get(id);
                map.put(id, num == null ? 1 : num + 1);

            }
            fis = new FileInputStream("D:\\second.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(! str.equals(""))second++;

                //统计表
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                First firstOne = new First();
                String id = jsonObject.getString("stuid");
                Integer num = map.get(id);
                map.put(id, num == null ? 1 : num + 1);

            }
            fis = new FileInputStream("D:\\third.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(! str.equals(""))third++;

                //统计表
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                First firstOne = new First();
                String id = jsonObject.getString("stuid");
                Integer num = map.get(id);
                map.put(id, num == null ? 1 : num + 1);

            }
            fis = new FileInputStream("D:\\fourth.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(! str.equals(""))fourth++;

                //统计表
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                First firstOne = new First();
                String id = jsonObject.getString("stuid");
                Integer num = map.get(id);
                map.put(id, num == null ? 1 : num + 1);

            }
            fis = new FileInputStream("D:\\fifth.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(! str.equals(""))fifth++;

                //统计表
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                First firstOne = new First();
                String id = jsonObject.getString("stuid");
                Integer num = map.get(id);
                map.put(id, num == null ? 1 : num + 1);

            }
            fis = new FileInputStream("D:\\sixth.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(! str.equals(""))sixth++;

                //统计表
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                First firstOne = new First();
                String id = jsonObject.getString("stuid");
                Integer num = map.get(id);
                map.put(id, num == null ? 1 : num + 1);

            }

        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
        } catch (IOException e) {
            System.out.println("读取文件失败");
        } finally {
            try {
                br.close();
                isr.close();
                fis.close();
                // 关闭的时候最好按照先后顺序关闭最后开的先关闭所以先关s,再关n,最后关m
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        label9.setText(first+"");
        label10.setText(second+"");
        label11.setText(third+"");
        label12.setText(fourth+"");
        label13.setText(fifth+"");
        label14.setText(sixth+"");
        long total = first+second+third+fourth+fifth+sixth;
        label15.setText(total+"");

        count();
    }

    void count(){//统计表

        table1.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "学生姓名", "成果数目"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
                    false, true, true, true, true, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table1.getColumnModel().getColumn(0).setPreferredWidth(100);
        table1.getColumnModel().getColumn(1).setPreferredWidth(100);

        //初始化表格
        DefaultTableModel def = (DefaultTableModel) table1.getModel();
        def.setRowCount(0);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        Iterator it01 = map.keySet().iterator();
        Map treeMap = new TreeMap(map);
        for (Map.Entry entry : map.entrySet()) {
            Vector v = new Vector();
            v.add(entry.getKey());
            v.add(entry.getValue());
            def.addRow(v);
        }
//        while (it01.hasNext()) {
//            Object key = it01.next();
//            System.out.println("学生 " + key + " 出现次数 : " + map.get(key));
//
//
//
//        }


    }




    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label6;
    private JScrollPane scrollPane3;
    private JTable table1;
    private JLabel label2;
    private JLabel label9;
    private JLabel label3;
    private JLabel label10;
    private JLabel label4;
    private JLabel label11;
    private JLabel label1;
    private JLabel label12;
    private JLabel label7;
    private JLabel label13;
    private JLabel label5;
    private JLabel label14;
    private JLabel label8;
    private JLabel label15;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
