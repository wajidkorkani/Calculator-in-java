import javax.swing.*;
import java.awt.*;
class App{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        Font btnFont = new Font("Arial", Font.BOLD, 50);
        Font inputFont = new Font("Arial", Font.BOLD, 30);
        JTextField textField = new JTextField(20);
        textField.setBounds(20, 20, 240, 40);
        textField.setFont(inputFont);
        JTextField textFieldTwo = new JTextField(20);
        textFieldTwo.setBounds(20, 20, 240, 40);
        textFieldTwo.setFont(inputFont);
        JTextField operator = new JTextField(20);
        operator.setBounds(20, 20, 240, 40);
        operator.setFont(inputFont);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 20, 10, 10));
        frame.add(inputPanel);
        inputPanel.add(textField);
        inputPanel.add(textFieldTwo);
        inputPanel.add(operator);
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(3, 100, 10, 10));
        btnPanel.setBounds(20, 80, 1000, 500);
        frame.add(btnPanel);
        JButton plus = new JButton("+");
        btnPanel.add(plus);
        JButton subtract = new JButton("-");
        btnPanel.add(subtract);
        JButton multiply = new JButton("*");
        btnPanel.add(multiply);
        JButton divide = new JButton("/");
        btnPanel.add(divide);
        JButton reminder = new JButton("%");
        btnPanel.add(reminder);
        JButton calculate = new JButton("=");
        btnPanel.add(calculate);
        JButton clear = new JButton("Clear");
        inputPanel.add(clear);
        plus.setBackground(Color.black);
        plus.setForeground(Color.white);
        subtract.setBackground(Color.black);
        subtract.setForeground(Color.white);
        multiply.setBackground(Color.black);
        multiply.setForeground(Color.white);
        divide.setBackground(Color.black);
        divide.setForeground(Color.white);
        reminder.setBackground(Color.black);
        reminder.setForeground(Color.white);
        calculate.setBackground(Color.red);
        calculate.setForeground(Color.white);
        clear.setBackground(Color.red);
        clear.setForeground(Color.white);
        clear.setFont(inputFont);
        plus.setFont(btnFont);
        subtract.setFont(btnFont);
        multiply.setFont(btnFont);
        divide.setFont(btnFont);
        reminder.setFont(btnFont);
        calculate.setFont(btnFont);

        plus.addActionListener(e -> {
            operator.setText(plus.getText());
        });
        subtract.addActionListener(e -> {
            operator.setText(subtract.getText());
        });
        multiply.addActionListener(e -> {
            operator.setText(multiply.getText());
        });
        divide.addActionListener(e -> {
            operator.setText(divide.getText());
        });
        reminder.addActionListener(e -> {
            operator.setText(reminder.getText());
        });

        clear.addActionListener(e -> {
            operator.setText(null);
            textField.setText(null);
            textFieldTwo.setText(null);
        });


        JButton[] numberBtn = new JButton[10];
        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(5, 2, 10, 10));
        frame.add(numberPanel);
        for(int i = 0; i < 10; i++){
            numberBtn[i] = new JButton(String.valueOf(i));
            numberPanel.add(numberBtn[i]);
            numberBtn[i].setBackground(Color.black);
            numberBtn[i].setForeground(Color.white);
            numberBtn[i].setFont(new Font("Arial", Font.BOLD,23));
        }

        for (JButton jButton : numberBtn) {
            jButton.addActionListener(e ->{
                String existingText = textField.getText();
                String btnText = jButton.getText();
                String allText = existingText + btnText;
                textField.setText(allText);
            });
        }

        JButton[] numberBtn2 = new JButton[10];
        JPanel numberPanel2 = new JPanel();
        numberPanel2.setLayout(new GridLayout(5, 2, 10, 10));
        frame.add(numberPanel2);
        for(int i = 0; i < 10; i++){
            numberBtn2[i] = new JButton(String.valueOf(i));
            numberPanel2.add(numberBtn2[i]);
            numberBtn2[i].setBackground(Color.black);
            numberBtn2[i].setForeground(Color.white);
            numberBtn2[i].setFont(new Font("Arial", Font.BOLD,23));
        }

        for (JButton jButton : numberBtn2) {
            jButton.addActionListener(e -> {
                String allText = textFieldTwo.getText() + jButton.getText();
                textFieldTwo.setText(allText);
            });
        }
    }
}