import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;



public class Calculator implements ActionListener {
    JFrame frame;
    JTextField text;
    JButton  b1, b2, b3, b4, b5, b6, b7, b8,b9, b0, bplus, bminus, bmul, bdiv, bclear, bdec, bequal;
    double b;
    double c;
    double result;
    String operator;


    Calculator(){

        frame = new JFrame("Calculator");
        text = new JTextField("");
        frame.getContentPane().setBackground(Color.BLACK);
        b1 = new JButton("1");b1.setBackground(Color.CYAN);
        b2 = new JButton("2");b2.setBackground(Color.CYAN);
        b3 = new JButton("3");b3.setBackground(Color.CYAN);
        b4 = new JButton("4");b4.setBackground(Color.CYAN);
        b5 = new JButton("5");b5.setBackground(Color.CYAN);
        b6 = new JButton("6");b6.setBackground(Color.CYAN);
        b7 = new JButton("7");b7.setBackground(Color.CYAN);
        b8 = new JButton("8");b8.setBackground(Color.CYAN);
        b9 = new JButton("9");b9.setBackground(Color.CYAN);
        b0 = new JButton("0");b0.setBackground(Color.CYAN);
        bplus = new JButton("+");bplus.setBackground(Color.YELLOW);
        bminus = new JButton("-");bminus.setBackground(Color.YELLOW);
        bmul = new JButton("*");bmul.setBackground(Color.YELLOW);
        bdiv = new JButton("/");bdiv.setBackground(Color.YELLOW);
        bclear = new JButton("C");bclear.setBackground(Color.YELLOW);
        bdec = new JButton(".");bdec.setBackground(Color.YELLOW);
        bequal = new JButton("=");bequal.setBackground(Color.YELLOW);

        text.setBounds(30,40,280,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);

        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);

        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bminus.setBounds(250,240,50,40);

        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        bequal.setBounds(180,310,50,40);
        bplus.setBounds(250,310,50,40);

        bclear.setBounds(180,380,100,40);

        frame.add(text);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bdiv);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bmul);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bminus);
        frame.add(bdec);
        frame.add(b0);
        frame.add(bequal);
        frame.add(bplus);
        frame.add(bclear);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(350 , 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bplus.addActionListener(this);
        bminus.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bequal.addActionListener(this);
        bclear.addActionListener(this);
        bdec.addActionListener(this);

    }


    public  void actionPerformed (ActionEvent a){
        if (a.getSource() == b1){
            text.setText(text.getText().concat("1"));

        }
        if (a.getSource() == b2){
            text.setText(text.getText().concat("2"));
        }
        if (a.getSource() == b3){
            text.setText(text.getText().concat("3"));
        }
        if (a.getSource() == b4){
            text.setText(text.getText().concat("4"));
        }
        if (a.getSource() == b5){
            text.setText(text.getText().concat("5"));
        }
        if (a.getSource() == b6){
            text.setText(text.getText().concat("6"));
        }
        if (a.getSource() == b7){
            text.setText(text.getText().concat("7"));
        }
        if (a.getSource() == b8){
            text.setText(text.getText().concat("8"));
        }
        if (a.getSource() == b9){
            text.setText(text.getText().concat("9"));
        }
        if (a.getSource() == b0){
            text.setText(text.getText().concat("0"));
        }
        if (a.getSource() == bdec){
            text.setText(text.getText().concat("."));
        }
        if (a.getSource() == bplus){
            b = Double.parseDouble(text.getText());
            text.setText("");
            operator = "+";
        }
        if (a.getSource() == bminus){
            b = Double.parseDouble(text.getText());
            text.setText("");
            operator = "-";
        }
        if (a.getSource() == bmul){
            b = Double.parseDouble(text.getText());
            text.setText("");
            operator = "*";
        }
        if (a.getSource() == bdiv){
            b = Double.parseDouble(text.getText());
            text.setText("");
            operator = "/";
        }
        if (a.getSource() == bequal) {
            c = Double.parseDouble(text.getText());
            if (operator.equals("+")) {
                result = b + c;
            }
            if (operator.equals("-")){
                result = b - c;
            }
            if (operator.equals("*")) {
                result = b * c;
            }
            if (operator.equals("/")) {
                result = b / c;
            }
            text.setText(result + "");
        }
        if (a.getSource() == bclear){
            text.setText("");
        }

    }

    public static void main(String[] args) {
        new Calculator();
    }
}




