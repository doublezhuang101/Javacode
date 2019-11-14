package src.Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;//ͷ�ļ�

public class Calculator {

    private JFrame frame;//������
    private JTextField field;//�����ı���
    private JButton clearButton;//����C��ť
    private JButton[] allButton;//�����������֡����Ű�ť

    public Calculator() {

        frame = new JFrame("������");//���崰����
        field = new JTextField("", 20);//�ı��򳤶�
        clearButton = new JButton("C");//����C��ť����
        String s = "123+456-789*0.=/()E~";//��ӣ��������Լ�E
        allButton = new JButton[s.length()];

        for (int i = 0; i < s.length(); i++) {
            allButton[i] = new JButton(s.charAt(i) + "");//����������ĸ�����ŵİ�ť��ʾֵ

        }
    }

    private void init() {//����

        frame.setLayout(new BorderLayout(10, 10));//���ֹ�����������һ��ˮƽ���Ϊ3,��ֱ���Ϊ3�ı߿򲼾�(Ҳ�б߽粼��)����.�ϱ�ֻ�ɵ��ڿ�����ֻ�ɵ��ڸ�.
        JPanel northPanel = new JPanel();//���������
        JPanel centerPanel = new JPanel();//�����������
        northPanel.setLayout(new FlowLayout());
        centerPanel.setLayout(new GridLayout(5, 4, 20, 6));//���������С��У����ݼ��
        northPanel.add(field);//��������ı���
        northPanel.add(clearButton);//�������C��ť

        for (JButton jButton : allButton) {//foreach��䣬�����Ժ�ǿ��һ��ѭ����䣬�������δ���������ÿ��Ԫ�ء�����ͳfor��䣬���Ӽ���Ҳ��׳���
            centerPanel.add(jButton);//������������֡����Ű�ť
        }

        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(northPanel, BorderLayout.NORTH);//����ı���
        frame.add(centerPanel, BorderLayout.CENTER);//���C��ť

    }

    private void setStyle() {

        clearButton.setFont(new Font("Courier New", Font.BOLD + Font.ITALIC, 16));//C��ť�ı�����
        Font font = new Font("Courier New", Font.PLAIN, 16);//���ఴ�����ı���ʽ

        for (JButton jButton : allButton) {                              //���֡����Ű������ı�����
            jButton.setFont(font);
        }

        field.setHorizontalAlignment(JTextField.RIGHT);//�ı�������ʽΪ�Ҷ���
        field.setEditable(false);//ʹ������������Ŀؼ����ܱ��༭
        field.setBackground(Color.WHITE);//���ô��ڱ�����ɫΪ��ɫ
        frame.setResizable(false);//���ô��ڴ�С���ɸı�

    }

    private void expression_Calculation(String exp)  {//�˷�����������

        double result = String_calculate.conversion(exp);
        String result1 = ""+result;
        System.out.println(exp + " = " + result);//������书��
        field.setText(result1);

    }

    private void addEventHandler() {//�����¼�

        clearButton.addActionListener(e -> {//C��ť
            field.setText("");//�����Ч��Ϊ�ı��������0��

        });

        String number = "0123456789.";//�����а�ť����Ϊһ���ַ���
        String operator = "+-*/";
        String equal = "=";
        String special ="()E~";

        for (JButton jButton : allButton) {//foreach��䣬���ܺ�ǿ�����Ӽ���Ҳ��׳���
            String s = jButton.getActionCommand();//��������ȡ��ť�ϵ��ַ���

            if (number.contains(s)) {//�жϼ����Ƿ����ĳԪ�� ���ְ�ť
                jButton.addActionListener(e -> {//����������ȡ�������
                    System.out.println(e.getActionCommand());
                    if (field.getText().equals("0")) {
                        field.setText(e.getActionCommand());
                    }
                    else{
                        field.setText(field.getText() + e.getActionCommand());
                    }
                });
            }

            if (operator.contains(s)) { //�жϼ����Ƿ����ĳԪ��                   //���Ű�ť
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

            if (special.contains(s)) {   //�жϼ����Ƿ����ĳԪ��                  //���ⰴť
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

            if (equal.equals(s)) {                         //���㰴ť
                jButton.addActionListener(e -> {
                    String expression = field.getText();
                    System.out.println(expression);
                    expression_Calculation(expression);
                });
            }
        }
    }

    public void menu() {

        init();//���ÿ�ܲ��ַ���
        setStyle();//���ÿؼ���ʽ����
        addEventHandler();//���㷽

        frame.setSize(600, 400);//���ô��ڿ���
        frame.setVisible(true);//��ͼ�ν�������Ϊ�ɼ�
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ��ڰ�ť
    }

    public static void main(String[] args) {//����java�������ڵ�ַ,java��������г����ʱ�������ҵľ���main����
        new Calculator().menu();

    }
}
