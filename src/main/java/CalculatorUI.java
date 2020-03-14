import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener {

    Calculator theCalculator = new Calculator();
    JLabel numberLabel;
    JLabel symbolLabel;

    public CalculatorUI() {
        super("Calculator with Swing UI");

        // Make fonts bigger in the whole app
        UIManager.put("Label.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));
        UIManager.put("Button.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));

        JPanel panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        setContentPane(panel);

        numberLabel = new JLabel("0");
        var numberLabelConstraints = new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(numberLabel, numberLabelConstraints);

        symbolLabel = new JLabel("");
        var symbolLabelConstraints = new GridBagConstraints(2, 0, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(symbolLabel, symbolLabelConstraints);


        JButton button0 = new JButton("0");
        var button0constraints = new GridBagConstraints(1, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button0.addActionListener(e -> {
            theCalculator.appendToMainNumber("0");
            numberLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button0, button0constraints);

        JButton button1 = new JButton("1");
        var button1constraints = new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("1");
                numberLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button1, button1constraints);

        JButton button2 = new JButton("2");
        var button2constraints = new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("2");
                numberLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button2, button2constraints);

        JButton button3 = new JButton("3");
        var button3constraints = new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("3");
                numberLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button3, button3constraints);

        JButton button4 = new JButton("4");
        var button4constraints = new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("4");
                numberLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button4, button4constraints);

        JButton button5 = new JButton("5");
        var button5constraints = new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("5");
                numberLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button5, button5constraints);

        JButton button6 = new JButton("6");
        var button6constraints = new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("6");
                numberLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button6, button6constraints);

        JButton button7 = new JButton("7");
        var button7constraints = new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("7");
                numberLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button7, button7constraints);

        JButton button8 = new JButton("8");
        var button8constraints = new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("8");
                numberLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button8, button8constraints);

        JButton button9 = new JButton("9");
        var button9constraints = new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("9");
                numberLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button9, button9constraints);



        JButton plusButton = new JButton("+");
        var plusButtonConstraints = new GridBagConstraints(3, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToSymbol("+");
                symbolLabel.setText(theCalculator.getSymbol());
                theCalculator.storeAndResetMainNumber();
            }
        });
        panel.add(plusButton, plusButtonConstraints);

        JButton minusButton = new JButton("-");
        var minusButtonConstraints = new GridBagConstraints(3, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToSymbol("-");
                symbolLabel.setText(theCalculator.getSymbol());
                theCalculator.storeAndResetMainNumber();
            }
        });
        panel.add(minusButton, minusButtonConstraints);

        JButton multiplyButton = new JButton("x");
        var multiplyButtonConstraints = new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToSymbol("x");
                symbolLabel.setText(theCalculator.getSymbol());
                theCalculator.storeAndResetMainNumber();
            }
        });
        panel.add(multiplyButton, multiplyButtonConstraints);

        JButton divideButton = new JButton("/");
        var divideButtonConstraints = new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToSymbol("/");
                symbolLabel.setText(theCalculator.getSymbol());
                theCalculator.storeAndResetMainNumber();
            }
        });
        panel.add(divideButton, divideButtonConstraints);



        JButton equalButton = new JButton("=");
        var equalButtonConstraints = new GridBagConstraints(2, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        equalButton.addActionListener(this);
        panel.add(equalButton, equalButtonConstraints);

        JButton clearButton = new JButton("C");
        var clearButtonConstraints = new GridBagConstraints(0, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        clearButton.addActionListener(this);
        panel.add(clearButton, clearButtonConstraints);



        JButton mcButton = new JButton("MC");
        var mcButtonConstraints = new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        mcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.resetMemory();
            }
        });
        panel.add(mcButton, mcButtonConstraints);

        JButton mrButton = new JButton("MR");
        var mrButtonConstraints = new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        mrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberLabel.setText(theCalculator.getMemory());
            }
        });
        panel.add(mrButton, mrButtonConstraints);

        JButton mAddButton = new JButton("M+");
        var mAddButtonConstraints = new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        mAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.memoryAdd(numberLabel.getText());
            }
        });
        panel.add(mAddButton, mAddButtonConstraints);

        JButton mSubButton = new JButton("M-");
        var mSubButtonConstraints = new GridBagConstraints(3, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        mSubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.memorySub(numberLabel.getText());
            }
        });
        panel.add(mSubButton, mSubButtonConstraints);

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
            if (symbolLabel.getText().equals("+")){
                theCalculator.add(numberLabel.getText());
                numberLabel.setText(theCalculator.getMainNumber());
            }
            else if (symbolLabel.getText().equals("-")){
                theCalculator.sub(numberLabel.getText());
                numberLabel.setText(theCalculator.getMainNumber());
            }
            else if (symbolLabel.getText().equals("x")){
                theCalculator.mult(numberLabel.getText());
                numberLabel.setText(theCalculator.getMainNumber());
            }
            else if (symbolLabel.getText().equals("/")){
                theCalculator.div(numberLabel.getText());
                numberLabel.setText(theCalculator.getMainNumber());
            }
            theCalculator.resetSymbol();
            symbolLabel.setText(theCalculator.getSymbol());
        }

        else if (((JButton) e.getSource()).getText().equals("C")){
            theCalculator.resetMainNumber();
            theCalculator.resetSymbol();
            numberLabel.setText(theCalculator.getMainNumber());
            symbolLabel.setText(theCalculator.getSymbol());
        }
        else {
            numberLabel.setText(theCalculator.getMainNumber());
            symbolLabel.setText(theCalculator.getSymbol());
        }
    }
}
