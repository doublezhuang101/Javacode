package src.Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;//头文件

public class Calculator {

    private JFrame frame;//定义框架
    private JTextField field;//定义文本框
    private JButton clearButton;//定义C按钮
    private JButton[] allButton;//定义所有数字、符号按钮

    public Calculator() {

        frame = new JFrame("计算器");//定义窗口名
        field = new JTextField("", 20);//文本框长度
        clearButton = new JButton("C");//定义C按钮名称
        String s = "123+456-789*0.=/()E~";//添加（）计算以及E
        allButton = new JButton[s.length()];

        for (int i = 0; i < s.length(); i++) {
            allButton[i] = new JButton(s.charAt(i) + "");//定义所有字母、符号的按钮显示值

        }
    }

    private void init() {//布局

        frame.setLayout(new BorderLayout(10, 10));//布局管理器，构造一个水平间距为3,垂直间距为3的边框布局(也叫边界布局)对象.南北只可调节宽，东西只可调节高.
        JPanel northPanel = new JPanel();//构造对象北区
        JPanel centerPanel = new JPanel();//构造对象中区
        northPanel.setLayout(new FlowLayout());
        centerPanel.setLayout(new GridLayout(5, 4, 20, 6));//设置中区行、列，横纵间距
        northPanel.add(field);//北区添加文本框
        northPanel.add(clearButton);//北区添加C按钮

        for (JButton jButton : allButton) {//foreach语句，功能性很强的一种循环语句，用于依次处理数组中每个元素。比起传统for语句，更加简洁且不易出错。
            centerPanel.add(jButton);//在中区添加数字、符号按钮
        }

        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(northPanel, BorderLayout.NORTH);//添加文本框
        frame.add(centerPanel, BorderLayout.CENTER);//添加C按钮

    }

    private void setStyle() {

        clearButton.setFont(new Font("Courier New", Font.BOLD + Font.ITALIC, 16));//C按钮文本设置
        Font font = new Font("Courier New", Font.PLAIN, 16);//其余按键的文本格式

        for (JButton jButton : allButton) {                              //数字、符号按键的文本设置
            jButton.setFont(font);
        }

        field.setHorizontalAlignment(JTextField.RIGHT);//文本框对齐格式为右对齐
        field.setEditable(false);//使调用这个函数的控件不能被编辑
        field.setBackground(Color.WHITE);//设置窗口背景颜色为白色
        frame.setResizable(false);//设置窗口大小不可改变

    }

    private void expression_Calculation(String exp)  {//此方法用于运算

        double result = String_calculate.conversion(exp);
        String result1 = ""+result;
        System.out.println(exp + " = " + result);//运算记忆功能
        field.setText(result1);

    }

    private void addEventHandler() {//触发事件

        clearButton.addActionListener(e -> {//C按钮
            field.setText("");//清零的效果为文本框输出“0”

        });

        String number = "0123456789.";//将所有按钮定义为一个字符串
        String operator = "+-*/";
        String equal = "=";
        String special ="()E~";

        for (JButton jButton : allButton) {//foreach语句，功能很强，更加简洁且不易出错
            String s = jButton.getActionCommand();//监听器获取按钮上的字符串

            if (number.contains(s)) {//判断集合是否存在某元素 数字按钮
                jButton.addActionListener(e -> {//鼠标监听器获取按键点击
                    System.out.println(e.getActionCommand());
                    if (field.getText().equals("0")) {
                        field.setText(e.getActionCommand());
                    }
                    else{
                        field.setText(field.getText() + e.getActionCommand());
                    }
                });
            }

            if (operator.contains(s)) { //判断集合是否存在某元素                   //符号按钮
                jButton.addActionListener(e -> {
                    System.out.println(e.getActionCommand());
                    if (field.getText().equals("0")) {
                        field.setText(e.getActionCommand());
                    }
                    else{
                        field.setText(field.getText() + e.getActionCommand());
                    }
                });
            }

            if (special.contains(s)) {   //判断集合是否存在某元素                  //特殊按钮
                jButton.addActionListener(e -> {
                    System.out.println(e.getActionCommand());
                    if (field.getText().equals("0")) {
                        field.setText(e.getActionCommand());
                    }
                    else{
                        field.setText(field.getText() + e.getActionCommand());
                    }
                });
            }

            if (equal.equals(s)) {                         //计算按钮
                jButton.addActionListener(e -> {
                    String expression = field.getText();
                    System.out.println(expression);
                    expression_Calculation(expression);
                });
            }
        }
    }

    public void menu() {

        init();//设置框架布局方法
        setStyle();//设置控件格式方法
        addEventHandler();//计算方

        frame.setSize(600, 400);//设置窗口宽、高
        frame.setVisible(true);//将图形界面设置为可见
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口按钮
    }

    public static void main(String[] args) {//这是java程序的入口地址,java虚拟机运行程序的时候首先找的就是main方法
        new Calculator().menu();

    }
}
