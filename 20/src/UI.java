import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JTextField display = new JTextField(10);
        display.setEditable(true);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        JPanel space = new JPanel(new BorderLayout());

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+",
                "space"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Aral", 0, 40));
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String text = display.getText();
                    String command = e.getActionCommand();

                    switch (command) {
                        case "C" -> display.setText("");
                        case "space" -> display.setText(text + " ");
                        case "=" -> {
                            try {
                                double result = evaluateExpression(text);
                                display.setText(Double.toString(result));
                            } catch (Exception ex) {
                                display.setText("Error " + ex.getMessage());
                            }
                        }
                        default -> display.setText(text + command);
                    }
                }
            });
            if (label.equals("space")){
                space.add(button);
            }
            else
                buttonPanel.add(button);
        }

        JPanel mainPanel = new JPanel(new BorderLayout());

        display.setFont( new Font("Arial", Font.BOLD, 64));
        mainPanel.add(display, BorderLayout.NORTH);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        mainPanel.add(space, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    private static double evaluateExpression(String expression) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        return controller.RunCalc(expression);
    }
}