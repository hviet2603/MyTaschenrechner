package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import operator.operator;

public class GUI{
    private JPanel panel1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton add;
    private JButton sub;
    private JButton mul;
    private JButton div;
    private JButton equal;
    private JButton ACButton;
    private JTextPane txtPane;
    public String input = "";
    operator opr = new operator();


    public GUI() {
        txtPane.setText("0");
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '1';
                udtScr();
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '2';
                udtScr();
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '3';
                udtScr();
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '4';
                udtScr();
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '5';
                udtScr();
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '6';
                udtScr();
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '7';
                udtScr();
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '8';
                udtScr();
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '9';
                udtScr();
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input += '0';
                udtScr();
            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input = "";
                opr.execute(Float.parseFloat(txtPane.getText()));
                txtPane.setText(String.valueOf(opr.temp));
                opr.token += "+";
            }

        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input = "";
                opr.execute(Float.parseFloat(txtPane.getText()));
                txtPane.setText(String.valueOf(opr.temp));
                opr.token += "-";

            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input = "";
                opr.execute(Float.parseFloat(txtPane.getText()));
                txtPane.setText(String.valueOf(opr.temp));
                opr.token += "x";
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input = "";
                opr.execute(Float.parseFloat(txtPane.getText()));
                txtPane.setText(String.valueOf(opr.temp));
                opr.token += ":";
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input = "";
                opr.execute(Float.parseFloat(txtPane.getText()));
                txtPane.setText(String.valueOf(opr.temp));
                opr.token = "";
                opr.oprd2 = 0;
                opr.oprd1 = opr.temp;
            }
        });

        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtPane.setText("0");
                opr.temp = 0;
                opr.oprd1 = 0;
                opr.oprd2 = 0;
                opr.token = "";
                input = "";
            }
        });
    }

    public void udtScr() {
        txtPane.setText(input);
    }

    public void clrScr() {
        txtPane.setText("");
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        JFrame frame = new JFrame("Taschen Rechner");
        frame.setContentPane(gui.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
