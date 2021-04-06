package stu.examine;

import java.awt.event.*;
import com.alibaba.fastjson.JSONObject;
import net.miginfocom.swing.MigLayout;
import org.apache.commons.lang3.StringEscapeUtils;
import stu.pojo.*;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
/*
 * Created by JFormDesigner on Tue Mar 16 14:06:40 CST 2021
 */


/**
 * @author qipan
 */
public class Examine extends JFrame {
    public Examine() {
        initComponents();
    }

    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here
        if(comboBox1.getSelectedIndex() == 0){
            print1();
        }else if(comboBox1.getSelectedIndex() == 1){
            print2();
        }else if(comboBox1.getSelectedIndex() == 2){
            print3();
        }else if(comboBox1.getSelectedIndex() == 3){
            print4();
        }else if(comboBox1.getSelectedIndex() == 4){
            print5();
        }else if(comboBox1.getSelectedIndex() == 5){
            print6();
        }
    }

    private void refersh() {

        if(comboBox1.getSelectedIndex() == 0){
            print1();
        }else if(comboBox1.getSelectedIndex() == 1){
            print2();
        }else if(comboBox1.getSelectedIndex() == 2){
            print3();
        }else if(comboBox1.getSelectedIndex() == 3){
            print4();
        }else if(comboBox1.getSelectedIndex() == 4){
            print5();
        }else if(comboBox1.getSelectedIndex() == 5){
            print6();
        }
    }

    private void button2ActionPerformed(ActionEvent e) {//驳回
        // TODO add your code here
        int row = table1.getSelectedRow()+1;

        try{
            String file = null;
            if(comboBox1.getSelectedIndex()==0){
                file = "D:\\first.txt";
            }else if(comboBox1.getSelectedIndex()==1){
                file = "D:\\second.txt";
            }else if(comboBox1.getSelectedIndex()==2){
                file = "D:\\third.txt";
            }else if(comboBox1.getSelectedIndex()==3){
                file = "D:\\fourth.txt";
            }else if(comboBox1.getSelectedIndex()==4){
                file = "D:\\fifth.txt";
            }else if(comboBox1.getSelectedIndex()==5){
                file = "D:\\sixth.txt";
            }
            List<String> lines = Files.readAllLines(Paths.get(file));
            List<String> replaced = new ArrayList<>();
            int lineNo = 1;

            for (String line : lines) {
                if(line.equals(""))continue;
                if (lineNo == row) {
                    replaced.add(line.replace("\"flag\":0","\"flag\":2").replace("\"flag\":1","\"flag\":2"));
                } else {
                    replaced.add(line);
                }
                lineNo++;
            }
            Files.write(Paths.get(file), replaced);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        refersh();
        DelSuccess delSuccess = new DelSuccess();
        delSuccess.setVisible(true);


    }

    private void button1ActionPerformed(ActionEvent e) {//通过
        // TODO add your code here
        int row = table1.getSelectedRow()+1;

        try{
            String file = null;
            if(comboBox1.getSelectedIndex()==0){
                file = "D:\\first.txt";
            }else if(comboBox1.getSelectedIndex()==1){
                file = "D:\\second.txt";
            }else if(comboBox1.getSelectedIndex()==2){
                file = "D:\\third.txt";
            }else if(comboBox1.getSelectedIndex()==3){
                file = "D:\\fourth.txt";
            }else if(comboBox1.getSelectedIndex()==4){
                file = "D:\\fifth.txt";
            }else if(comboBox1.getSelectedIndex()==5){
                file = "D:\\sixth.txt";
            }
            List<String> lines = Files.readAllLines(Paths.get(file));
            List<String> replaced = new ArrayList<>();
            int lineNo = 1;

            for (String line : lines) {
                if(line.equals(""))continue;
                if (lineNo == row) {
                    replaced.add(line.replace("\"flag\":0","\"flag\":1").replace("\"flag\":2","\"flag\":1"));
                } else {
                    replaced.add(line);
                }
                lineNo ++;
            }
            Files.write(Paths.get(file), replaced);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        refersh();
        Ok ok = new Ok();
        ok.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - qipan
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane3 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
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
            "[]"));

        //---- label1 ----
        label1.setText("\u6210\u679c\u7c7b\u578b\uff1a");
        contentPane.add(label1, "cell 8 0 3 1");

        //---- comboBox1 ----
        comboBox1.addItemListener(e -> comboBox1ItemStateChanged(e));
        contentPane.add(comboBox1, "cell 12 0 8 1");

        //---- button1 ----
        button1.setText("\u5ba1\u6838\u901a\u8fc7");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 21 0 4 1");

        //---- button2 ----
        button2.setText("\u5ba1\u6838\u9a73\u56de");
        button2.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
		});
        contentPane.add(button2, "cell 25 0 3 1");

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(table1);
        }
        contentPane.add(scrollPane3, "cell 0 1 41 17");
        setSize(1095, 565);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents


        comboBox1.addItem("科研成果");
        comboBox1.addItem("知识产权");
        comboBox1.addItem("科研训练");
        comboBox1.addItem("学科与科技竞赛");
        comboBox1.addItem("技能证书");
        comboBox1.addItem("创业实践和创新创业教育");
        table1.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "类型", "学生姓名", "学号"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
                    false, true, true, true, true, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table1.getColumnModel().getColumn(0).setPreferredWidth(119);
        table1.getColumnModel().getColumn(1).setPreferredWidth(50);
        table1.getColumnModel().getColumn(2).setPreferredWidth(77);
        scrollPane3.setViewportView(table1);

        //初始化表格
        DefaultTableModel def = (DefaultTableModel) table1.getModel();
        def.setRowCount(0);
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
                if(str.equals(""))continue;
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                First first = new First();
                first.setType(jsonObject.getString("type"));
                first.setName(jsonObject.getString("name"));
                first.setStuid(jsonObject.getString("stuid"));
                first.setFlag(Integer.parseInt(jsonObject.getString("flag")));
                arrayList.add(first);
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
        int i=0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(First one : arrayList) {
            i++;
            Vector v = new Vector();
            v.add(one.getType());
            v.add(one.getName());
            v.add(one.getStuid());

            if(one.getFlag()==1){
                arrayList1.add(i);
            }else if(one.getFlag()==2){
                arrayList2.add(i);
            }
            def.addRow(v);
        }
        System.out.println(arrayList1);
        setcolor(table1,arrayList1,arrayList2);
    }

    void print1(){
        table1.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "类型", "学生姓名", "学号"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
                    false, true, true, true, true, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table1.getColumnModel().getColumn(0).setPreferredWidth(119);
        table1.getColumnModel().getColumn(1).setPreferredWidth(50);
        table1.getColumnModel().getColumn(2).setPreferredWidth(77);
        scrollPane3.setViewportView(table1);

        //初始化表格
        DefaultTableModel def = (DefaultTableModel) table1.getModel();
        def.setRowCount(0);
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
                if(str.equals(""))continue;
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                First first = new First();
                first.setType(jsonObject.getString("type"));
                first.setName(jsonObject.getString("name"));
                first.setStuid(jsonObject.getString("stuid"));
                first.setFlag(Integer.parseInt(jsonObject.getString("flag")));
                arrayList.add(first);
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
        int i=0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(First one : arrayList) {
            i++;

            Vector v = new Vector();
            v.add(one.getType());
            v.add(one.getName());
            v.add(one.getStuid());
            if(one.getFlag()==1){
                arrayList1.add(i);
            }else if(one.getFlag()==2){
                arrayList2.add(i);
            }
            def.addRow(v);
        }
        setcolor(table1,arrayList1,arrayList2);
    }

    void print2(){
        table1.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "证书类型", "学生姓名", "学号","证书编号"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
                    false, true, true, true, true, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table1.getColumnModel().getColumn(0).setPreferredWidth(119);
        table1.getColumnModel().getColumn(1).setPreferredWidth(50);
        table1.getColumnModel().getColumn(2).setPreferredWidth(77);
        table1.getColumnModel().getColumn(3).setPreferredWidth(100);
        scrollPane3.setViewportView(table1);

        //初始化表格
        DefaultTableModel def = (DefaultTableModel) table1.getModel();
        def.setRowCount(0);
        //文件读入
        ArrayList<Second> arrayList = new ArrayList<Second>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null; //用于包装InputStreamReader,提高处理性能。因为BufferedReader有缓冲的，而InputStreamReader没有。
        try {
            String str = "";
            String str1 = "";
            fis = new FileInputStream("D:\\second.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(str.equals(""))continue;
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Second second = new Second();
                second.setType(jsonObject.getString("type"));
                second.setName(jsonObject.getString("name"));
                second.setStuid(jsonObject.getString("stuid"));
                second.setId(jsonObject.getString("id"));
                second.setFlag(Integer.parseInt(jsonObject.getString("flag")));
                arrayList.add(second);
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
        int i=0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(Second one : arrayList) {
            i++;
            Vector v = new Vector();
            v.add(one.getType());
            v.add(one.getName());
            v.add(one.getStuid());
            v.add(one.getId());
            if(one.getFlag()==1){
                arrayList1.add(i);
            }else if(one.getFlag()==2){
                arrayList2.add(i);
            }
            def.addRow(v);
        }
        setcolor(table1,arrayList1,arrayList2);
    }

    void print3(){
        table1.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "科研训练", "学生姓名", "学号","指导老师","完成日期（年/月/日）","指导老师联系方式"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
                    false, true, true, true, true, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table1.getColumnModel().getColumn(0).setPreferredWidth(119);
        table1.getColumnModel().getColumn(1).setPreferredWidth(50);
        table1.getColumnModel().getColumn(2).setPreferredWidth(77);
        table1.getColumnModel().getColumn(3).setPreferredWidth(77);
        table1.getColumnModel().getColumn(4).setPreferredWidth(97);
        table1.getColumnModel().getColumn(5).setPreferredWidth(77);

        scrollPane3.setViewportView(table1);

        //初始化表格
        DefaultTableModel def = (DefaultTableModel) table1.getModel();
        def.setRowCount(0);
        //文件读入
        ArrayList<Third> arrayList = new ArrayList<Third>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null; //用于包装InputStreamReader,提高处理性能。因为BufferedReader有缓冲的，而InputStreamReader没有。
        try {
            String str = "";
            String str1 = "";
            fis = new FileInputStream("D:\\third.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(str.equals(""))continue;
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Third third = new Third();
                third.setName(jsonObject.getString("name"));
                third.setStuid(jsonObject.getString("stuid"));
                third.setActionName(jsonObject.getString("actionName"));
                third.setTh(jsonObject.getString("th"));
                third.setData(jsonObject.getString("data"));
                third.setTel(jsonObject.getString("tel"));
                third.setFlag(Integer.parseInt(jsonObject.getString("flag")));
                arrayList.add(third);
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
        int i=0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(Third one : arrayList) {
            i++;
            Vector v = new Vector();
            v.add(one.getName());
            v.add(one.getStuid());
            v.add(one.getActionName());
            v.add(one.getTh());
            v.add(one.getData());
            v.add(one.getTel());
            if(one.getFlag()==1){
                arrayList1.add(i);
            }else if(one.getFlag()==2){
                arrayList2.add(i);
            }
            def.addRow(v);
        }
        setcolor(table1,arrayList1,arrayList2);
    }

    void print4(){
        table1.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                         "学生姓名", "学号","竞赛名称","主办单位","奖项描述"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
                    false, true, true, true, true, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table1.getColumnModel().getColumn(0).setPreferredWidth(50);
        table1.getColumnModel().getColumn(1).setPreferredWidth(77);
        table1.getColumnModel().getColumn(2).setPreferredWidth(119);
        table1.getColumnModel().getColumn(3).setPreferredWidth(100);
        table1.getColumnModel().getColumn(4).setPreferredWidth(100);
        scrollPane3.setViewportView(table1);

        //初始化表格
        DefaultTableModel def = (DefaultTableModel) table1.getModel();
        def.setRowCount(0);
        //文件读入
        ArrayList<Forth> arrayList = new ArrayList<Forth>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null; //用于包装InputStreamReader,提高处理性能。因为BufferedReader有缓冲的，而InputStreamReader没有。
        try {
            String str = "";
            String str1 = "";
            fis = new FileInputStream("D:\\fourth.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(str.equals(""))continue;
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Forth forth = new Forth();
                forth.setName(jsonObject.getString("name"));
                forth.setStuid(jsonObject.getString("stuid"));
                forth.setActName(jsonObject.getString("actName"));
                forth.setCmp(jsonObject.getString("cmp"));
                forth.setDesc(jsonObject.getString("desc"));
                forth.setFlag(Integer.parseInt(jsonObject.getString("flag")));

                arrayList.add(forth);
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
        int i=0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(Forth one : arrayList) {
            i++;
            Vector v = new Vector();
            v.add(one.getName());
            v.add(one.getStuid());
            v.add(one.getActName());
            v.add(one.getCmp());
            v.add(one.getDesc());
            if(one.getFlag()==1){
                arrayList1.add(i);
            }else if(one.getFlag()==2){
                arrayList2.add(i);
            }
            def.addRow(v);
        }
        setcolor(table1,arrayList1,arrayList2);
    }

    void print5(){
        table1.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "学生姓名", "学号","证书名称","证书编号","发证日期"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
                    false, true, true, true, true, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table1.getColumnModel().getColumn(0).setPreferredWidth(50);
        table1.getColumnModel().getColumn(1).setPreferredWidth(77);
        table1.getColumnModel().getColumn(2).setPreferredWidth(119);
        table1.getColumnModel().getColumn(3).setPreferredWidth(100);
        table1.getColumnModel().getColumn(4).setPreferredWidth(100);
        scrollPane3.setViewportView(table1);

        //初始化表格
        DefaultTableModel def = (DefaultTableModel) table1.getModel();
        def.setRowCount(0);
        //文件读入
        ArrayList<Fifth> arrayList = new ArrayList<Fifth>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null; //用于包装InputStreamReader,提高处理性能。因为BufferedReader有缓冲的，而InputStreamReader没有。
        try {
            String str = "";
            String str1 = "";
            fis = new FileInputStream("D:\\fifth.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(str.equals(""))continue;
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Fifth fifth = new Fifth();
                fifth.setName(jsonObject.getString("name"));
                fifth.setStuid(jsonObject.getString("stuid"));
                fifth.setCardName(jsonObject.getString("cardName"));
                fifth.setCardId(jsonObject.getString("cardId"));
                fifth.setCardDate(jsonObject.getString("cardDate"));
                fifth.setFlag(Integer.parseInt(jsonObject.getString("flag")));

                arrayList.add(fifth);
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
        int i=0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(Fifth one : arrayList) {
            i++;
            Vector v = new Vector();
            v.add(one.getName());
            v.add(one.getStuid());
            v.add(one.getCardName());
            v.add(one.getCardId());
            v.add(one.getCardDate());
            if(one.getFlag()==1){
                arrayList1.add(i);
            }else if(one.getFlag()==2){
                arrayList2.add(i);
            }
            def.addRow(v);
        }
        setcolor(table1,arrayList1,arrayList2);
    }

    void print6(){
        table1.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "学生姓名", "学号","项目名称","实践机构或企业","辅导老师","机构负责人","机构联系方式","完成时间"
                }
        ) {
            boolean[] columnEditables = new boolean[]{
                    false, true, true, true, true, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table1.getColumnModel().getColumn(0).setPreferredWidth(50);
        table1.getColumnModel().getColumn(1).setPreferredWidth(100);
        table1.getColumnModel().getColumn(2).setPreferredWidth(119);
        table1.getColumnModel().getColumn(3).setPreferredWidth(100);
        table1.getColumnModel().getColumn(4).setPreferredWidth(50);
        table1.getColumnModel().getColumn(5).setPreferredWidth(50);
        table1.getColumnModel().getColumn(6).setPreferredWidth(100);
        table1.getColumnModel().getColumn(7).setPreferredWidth(100);
        scrollPane3.setViewportView(table1);

        //初始化表格
        DefaultTableModel def = (DefaultTableModel) table1.getModel();
        def.setRowCount(0);
        //文件读入
        ArrayList<Sixth> arrayList = new ArrayList<Sixth>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null; //用于包装InputStreamReader,提高处理性能。因为BufferedReader有缓冲的，而InputStreamReader没有。
        try {
            String str = "";
            String str1 = "";
            fis = new FileInputStream("D:\\sixth.txt");// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                if(str.equals(""))continue;
                JSONObject jsonObject = new JSONObject();
                try{
                    jsonObject = JSONObject.parseObject(StringEscapeUtils.unescapeJava(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Sixth sixth = new Sixth();
                sixth.setName(jsonObject.getString("name"));
                sixth.setStuid(jsonObject.getString("stuid"));
                sixth.setActName(jsonObject.getString("actName"));
                sixth.setCmp(jsonObject.getString("cmp"));
                sixth.setTh(jsonObject.getString("th"));
                sixth.setManager(jsonObject.getString("manager"));
                sixth.setTel(jsonObject.getString("tel"));
                sixth.setDate(jsonObject.getString("date"));
                sixth.setFlag(Integer.parseInt(jsonObject.getString("flag")));

                arrayList.add(sixth);
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
        int i=0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(Sixth one : arrayList) {
            i++;
            Vector v = new Vector();
            v.add(one.getName());
            v.add(one.getStuid());
            v.add(one.getActName());
            v.add(one.getCmp());
            v.add(one.getTh());
            v.add(one.getManager());
            v.add(one.getTel());
            v.add(one.getDate());
            if(one.getFlag()==1){
                arrayList1.add(i);
            }else if(one.getFlag()==2){
                arrayList2.add(i);
            }
            def.addRow(v);
        }
        setcolor(table1,arrayList1,arrayList2);
    }

    private void setcolor (JTable table,ArrayList<Integer> pass,ArrayList<Integer> unpass){
        try {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer() {
                public Component getTableCellRendererComponent(JTable table,
                                                               Object value, boolean isSelected, boolean hasFocus,
                                                               int row, int column) {
                    if(pass.contains(row+1))
                        setBackground(Color.green);
                    else if(unpass.contains(row+1)){
                        setBackground(Color.red);
                    }else{
                        setBackground(Color.white);
                    }
                    return super.getTableCellRendererComponent(table, value,
                            isSelected, hasFocus, row, column);
                }
            };
            for (int k = 0; k < table1.getColumnCount(); k++) {
                table1.getColumn(table1.getColumnName(k)).setCellRenderer(tcr);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - qipan
    private JLabel label1;
    private JComboBox comboBox1;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane3;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
