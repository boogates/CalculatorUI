import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener {

    Calculator theCalculator = new Calculator();
    JLabel displayLabel;

    public CalculatorUI() {
        super("Calculator with Swing UI");

        // Make fonts bigger in the whole app
        UIManager.put("Label.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));
        UIManager.put("Button.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));

        JPanel panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        setContentPane(panel);

        displayLabel = new JLabel("0");
        var displayLabelConstraints = new GridBagConstraints(0, 0, 4, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(displayLabel, displayLabelConstraints);

        JButton button0 = new JButton("0");
        var button0constraints = new GridBagConstraints(1, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button0.addActionListener(e -> {
            theCalculator.appendToMainNumber("0");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button0, button0constraints);

        JButton button1 = new JButton("1");
        var button1constraints = new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("1");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button1, button1constraints);

        JButton button2 = new JButton("2");
        var button2constraints = new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("2");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button2, button2constraints);

        JButton button3 = new JButton("3");
        var button3constraints = new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("3");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button3, button3constraints);

        JButton button4 = new JButton("4");
        var button4constraints = new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("4");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button4, button4constraints);

        JButton button5 = new JButton("5");
        var button5constraints = new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("5");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button5, button5constraints);

        JButton button6 = new JButton("6");
        var button6constraints = new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("6");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button6, button6constraints);

        JButton button7 = new JButton("7");
        var button7constraints = new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("7");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button7, button7constraints);

        JButton button8 = new JButton("8");
        var button8constraints = new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("8");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button8, button8constraints);

        JButton button9 = new JButton("9");
        var button9constraints = new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("9");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button9, button9constraints);


        JButton minusButton = new JButton("-");
        var minusButtonConstraints = new GridBagConstraints(3, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        minusButton.addActionListener(this);
        panel.add(minusButton, minusButtonConstraints);

        JButton plusButton = new JButton("+");
        var plusButtonConstraints = new GridBagConstraints(3, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        plusButton.addActionListener(this);
        panel.add(plusButton, plusButtonConstraints);

        JButton multiplyButton = new JButton("x");
        var multiplyButtonConstraints = new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        multiplyButton.addActionListener(this);
        panel.add(multiplyButton, multiplyButtonConstraints);

        JButton divideButton = new JButton("/");
        var divideButtonConstraints = new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        divideButton.addActionListener(this);
        panel.add(divideButton, divideButtonConstraints);

        JButton equalButton = new JButton("=");
        var equalButtonConstraints = new GridBagConstraints(2, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        equalButton.addActionListener(this);
        panel.add(equalButton, equalButtonConstraints);

        JButton clearButton = new JButton("C");
        var clearButtonConstraints = new GridBagConstraints(0, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        clearButton.addActionListener(this);
        panel.add(clearButton, clearButtonConstraints);

        setPreferredSize(new Dimension(400, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals("=")) {
            theCalculator.show(displayLabel.getText());
            displayLabel.setText(theCalculator.getMainNumber());
        }
        else if (((JButton) e.getSource()).getText().equals("+")){
            theCalculator.storeAndResetMainNumber();
            theCalculator.add(displayLabel.getText());
            displayLabel.setText(theCalculator.getMainNumber());
        }
        else if (((JButton) e.getSource()).getText().equals("-")){
            theCalculator.storeAndResetMainNumber();
            theCalculator.sub(displayLabel.getText());
            displayLabel.setText(theCalculator.getMainNumber());
        }
        else if (((JButton) e.getSource()).getText().equals("x")){
            theCalculator.storeAndResetMainNumber();
            theCalculator.mult(displayLabel.getText());
            displayLabel.setText(theCalculator.getMainNumber());
        }
        else if (((JButton) e.getSource()).getText().equals("/")){
            theCalculator.storeAndResetMainNumber();
            theCalculator.div(displayLabel.getText());
            displayLabel.setText(theCalculator.getMainNumber());
        }
        else if (((JButton) e.getSource()).getText().equals("C")){
            theCalculator.resetMainNumber();
            displayLabel.setText(theCalculator.getMainNumber());
        }
    }
}
