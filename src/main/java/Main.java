import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        //创建文件
        File myFilePath = new File("D:\\first.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        myFilePath = new File("D:\\second.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        myFilePath = new File("D:\\third.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        myFilePath = new File("D:\\fourth.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        myFilePath = new File("D:\\fifth.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        myFilePath = new File("D:\\sixth.txt");
        try {
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        LoginView lv = new LoginView();
        lv.setSize(350,190);
        lv.setVisible(true);
    }

}
