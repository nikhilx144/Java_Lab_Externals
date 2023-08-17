import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class que6 extends JFrame {
    private JTextField textField = new JTextField(20);
    private char operator = ' ';
    private double num1 = 0, num2 = 0;

    public que6() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 10, 10));

        String[] buttonLabels = {"7", "8", "9", "/",
                                 "4", "5", "6", "*",
                                 "1", "2", "3", "-",
                                 "0", "C", "=", "+"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonListener());
            buttonPanel.add(button);
        }

        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String label = ((JButton) e.getSource()).getText();

            if ("0123456789".contains(label)) {
                textField.setText(textField.getText() + label);
            } else if ("+-*/".contains(label)) {
                num1 = Double.parseDouble(textField.getText());
                operator = label.charAt(0);
                textField.setText("");
            } else if (label.equals("=")) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case '+': textField.setText(String.valueOf(num1 + num2)); break;
                    case '-': textField.setText(String.valueOf(num1 - num2)); break;
                    case '*': textField.setText(String.valueOf(num1 * num2)); break;
                    case '/': textField.setText(String.valueOf(num1 / num2)); break;
                }
            } else if (label.equals("C")) {
                textField.setText("");
                operator = ' ';
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new que6().setVisible(true));
    }
}
