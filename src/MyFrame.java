import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    private static final int w = 600;
    private static final  int h = 400;

    private JTextField mem_1;
    private JTextField mem_2;
    private JTextField mem_3;
    private JTextField answer;
    private JTextField pole;

    Double mem1 = null;
    Double mem2 = null;
    Double mem3 = null;
    Double result = null;
    Integer count = 0;
    Double value1 = 0.0;
    Double value2 = 0.0;
    Double value3 = 0.0;

    String formatResult = "";
    String a = "";
    String b = "";
    String c = "";

    public MyFrame(){
        super("Calculator");        //заголовок
        setSize(w, h);                      //установка размеров окна

        Toolkit kit = Toolkit.getDefaultToolkit();          //взаимодействие с ОС
        setLocation(kit.getScreenSize().height-3*h, kit.getScreenSize().width-3*w);     //установка не выхода за пределы окна

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");               //Button
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton start = new JButton("START");
        JButton x = new JButton("X");
        JButton y = new JButton("Y");
        JButton z = new JButton("Z");
        JButton mc = new JButton("MC");
        JButton mPlus = new JButton("M+");

        ButtonGroup myButton = new ButtonGroup();
        JRadioButton fun1 = new JRadioButton("Формула 1", true);
        myButton.add(fun1);
        JRadioButton fun2 = new JRadioButton("Формула 2", false);
        myButton.add(fun2);
                                                                                //JRadioButton
        ButtonGroup buttonValue = new ButtonGroup();
        JRadioButton value_1 = new JRadioButton("Переменная 1", true);
        buttonValue.add(value_1);
        JRadioButton value_2 = new JRadioButton("Переменная 2", false);
        buttonValue.add(value_2);
        JRadioButton value_3 = new JRadioButton("Переменная 3", false);
        buttonValue.add(value_3);

        mem_1 = new JTextField(" ",10);     //задает вид поля по умолчанию, максимальное количество символов
        mem_1.setEditable(false);                       //задает, разрешено ли редактировать поле
        mem_1.setMaximumSize(mem_1.getPreferredSize());
        mem_2 = new JTextField(" ",10);
        mem_2.setEditable(false);
        mem_2.setMaximumSize(mem_2.getPreferredSize());
        mem_3 = new JTextField(" ",10);
        mem_3.setEditable(false);
        mem_3.setMaximumSize(mem_3.getPreferredSize());
        answer = new JTextField(" ",10);
        answer.setEditable(false);
        answer.setMaximumSize(answer.getPreferredSize());
        pole = new JTextField(" ", 10);
        pole.setEditable(false);
        pole.setMaximumSize(answer.getPreferredSize());


        x.addActionListener(new ActionListener() {          //слушатели
            public void actionPerformed(ActionEvent ev) {
                try{
                    count = 1;

                    mem1 = null;
                    a = "";
                    mem_1.setText(a);

                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    count = 2;

                    mem2 = null;
                    b = "";
                    mem_2.setText(b);
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        z.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    count = 3;

                    mem3 = null;
                    c = "";
                    mem_3.setText(c);
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="1";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="1";
                        mem_2.setText(b);
                    }
                    else {
                        c+="1";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="2";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="2";
                        mem_2.setText(b);
                    }
                    else {
                        c+="2";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="3";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="3";
                        mem_2.setText(b);
                    }
                    else {
                        c+="3";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="4";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="4";
                        mem_2.setText(b);
                    }
                    else {
                        c+="4";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="5";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="5";
                        mem_2.setText(b);
                    }
                    else {
                        c+="5";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="6";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="6";
                        mem_2.setText(b);
                    }
                    else {
                        c+="6";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="7";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="7";
                        mem_2.setText(b);
                    }
                    else {
                        c+="7";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="8";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="8";
                        mem_2.setText(b);
                    }
                    else {
                        c+="8";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="9";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="9";
                        mem_2.setText(b);
                    }
                    else {
                        c+="9";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(count == 1){
                        a+="0";
                        mem_1.setText(a);
                    }
                    else if(count == 2){
                        b+="0";
                        mem_2.setText(b);
                    }
                    else {
                        c+="0";
                        mem_3.setText(c);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        mc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    if(value_1.isSelected()){
                        value1 = 0.0;
                        formatResult = String.format("%2f", value1);
                        pole.setText(formatResult);
                    }
                    else if(value_2.isSelected()){
                        value2 = 0.0;
                        formatResult = String.format("%2f", value2);
                        pole.setText(formatResult);
                    }
                    else {
                        value3 = 0.0;
                        formatResult = String.format("%2f", value3);
                        pole.setText(formatResult);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        mPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try {
                    if (value_1.isSelected()) {
                        value1 += result;
                        formatResult = String.format("%2f", value1);
                        pole.setText(formatResult);
                    } else if (value_2.isSelected()) {
                        value2 += result;
                        formatResult = String.format("%2f", value2);
                        pole.setText(formatResult);
                    } else {
                        value3 += result;
                        formatResult = String.format("%2f", value3);
                        pole.setText(formatResult);
                    }
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try{
                    result = null;
                    mem1 = Double.parseDouble(mem_1.getText());
                    mem2 = Double.parseDouble(mem_2.getText());
                    mem3 = Double.parseDouble(mem_3.getText());

                    if (fun1.isSelected()){

                        if(mem1!=0 && mem2!=0)
                            // mem1+mem2;
                            result = Math.pow((Math.log((1 + mem1) * (1 + mem1)) + Math.cos(mem3 * mem3 * mem3 * Math.PI)), Math.sin(mem2)) + Math.exp(Math.log(Math.pow(Math.E, mem1 * mem1) + Math.cos(Math.pow(Math.E, mem3)) + Math.sqrt(1 / mem2)) / (1 / mem1));
                        else{
                            JOptionPane.showMessageDialog(MyFrame.this, "Ошибка!");
                        }
                    }
                    else {

                        Double denominator = (Math.log10(Math.pow(mem3,mem2))+Math.pow(Math.cos(Math.exp(Math.log(mem1)/3)),2));

                        if (denominator != 0)
                            // mem1 + mem3;
                        result = (mem2*mem1*mem1)/denominator;
                        else{
                            JOptionPane.showMessageDialog(MyFrame.this, "Ошибка!");
                        }
                    }

                    formatResult = String.format("%2f",result);
                    answer.setText(formatResult);
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(MyFrame.this, "Неверный формат!");
                }
            }
        });

        Box xbox = Box.createVerticalBox();                     //"коробочная" компановка
        xbox.add(Box.createVerticalGlue());
        xbox.add(x);
        xbox.add(Box.createVerticalStrut(2));
        xbox.add(mem_1);
        xbox.add(Box.createVerticalGlue());

        Box ybox = Box.createVerticalBox();
        ybox.add(Box.createVerticalGlue());
        ybox.add(y);
        ybox.add(Box.createVerticalStrut(2));
        ybox.add(mem_2);
        ybox.add(Box.createVerticalGlue());

        Box zbox = Box.createVerticalBox();
        zbox.add(Box.createVerticalGlue());
        zbox.add(z);
        zbox.add(Box.createVerticalStrut(2));
        zbox.add(mem_3);
        zbox.add(Box.createVerticalGlue());

        Box value = Box.createHorizontalBox();
        value.add(Box.createHorizontalGlue());
        value.add(xbox);
        value.add(Box.createHorizontalStrut(10));
        value.add(ybox);
        value.add(Box.createHorizontalStrut(10));
        value.add(zbox);
        value.add(Box.createHorizontalGlue());

        Box box1 = Box.createHorizontalBox();
        box1.add(Box.createHorizontalGlue());
        box1.add(one);
        box1.add(Box.createHorizontalStrut(3));
        box1.add(two);
        box1.add(Box.createHorizontalStrut(3));
        box1.add(three);
        box1.add(Box.createHorizontalGlue());

        Box box2 = Box.createHorizontalBox();
        box2.add(Box.createHorizontalGlue());
        box2.add(four);
        box2.add(Box.createHorizontalStrut(3));
        box2.add(five);
        box2.add(Box.createHorizontalStrut(3));
        box2.add(six);
        box2.add(Box.createHorizontalGlue());

        Box box3 = Box.createHorizontalBox();
        box3.add(Box.createHorizontalGlue());
        box3.add(seven);
        box3.add(Box.createHorizontalStrut(3));
        box3.add(eight);
        box3.add(Box.createHorizontalStrut(3));
        box3.add(nine);
        box3.add(Box.createHorizontalGlue());

        Box box4 = Box.createHorizontalBox();
        box4.add(Box.createHorizontalGlue());
        box4.add(zero);
        box4.add(Box.createHorizontalGlue());

        Box radio = Box.createHorizontalBox();
        radio.add(Box.createHorizontalGlue());
        radio.add(fun1);
        radio.add(Box.createHorizontalStrut(5));
        radio.add(fun2);
        radio.add(Box.createHorizontalGlue());

        Box box5 = Box.createHorizontalBox();
        box5.add(Box.createHorizontalGlue());
        box5.add(start);
        box5.add(Box.createHorizontalStrut(5));
        box5.add(answer);
        box5.add(Box.createHorizontalGlue());

        Box mbox = Box.createHorizontalBox();
        mbox.add(Box.createHorizontalGlue());
        mbox.add(value_1);
        mbox.add(Box.createHorizontalStrut(2));
        mbox.add(value_2);
        mbox.add(Box.createHorizontalStrut(2));
        mbox.add(value_3);
        mbox.add(Box.createHorizontalGlue());

        Box mbox2 = Box.createHorizontalBox();
        mbox2.add(Box.createHorizontalGlue());
        mbox2.add(mc);
        mbox2.add(Box.createHorizontalStrut(5));
        mbox2.add(mPlus);
        mbox2.add(Box.createHorizontalStrut(5));
        mbox2.add(pole);
        mbox2.add(Box.createHorizontalGlue());

        Box content = Box.createVerticalBox();
        content.add(Box.createVerticalGlue());
        content.add(value);
        content.add(Box.createVerticalStrut(5));
        content.add(box1);
        content.add(Box.createVerticalStrut(3));
        content.add(box2);
        content.add(Box.createVerticalStrut(3));
        content.add(box3);
        content.add(Box.createVerticalStrut(3));
        content.add(box4);
        content.add(Box.createVerticalStrut(5));
        content.add(radio);
        content.add(Box.createVerticalStrut(5));
        content.add(box5);
        content.add(Box.createVerticalStrut(5));
        content.add(mbox);
        content.add(Box.createVerticalStrut(5));
        content.add(mbox2);
        content.add(Box.createVerticalGlue());

        getContentPane().add(content);


    }
}
