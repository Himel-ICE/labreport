import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StudentForm {
    private static JLabel success;
    private static JFrame frame;
    private static JLabel label1, label2, label3;
    private static JPanel panel;
    private static JButton button;
    private static JTextField userText1, userText2, userText3;
    private static JTextArea displayArea;

    public static void main(String[] args) {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        // Setting all Three Labels
        label1 = new JLabel("Name");
        label1.setBounds(10, 10, 80, 25);
        panel.add(label1);
        label2 = new JLabel("Roll");
        label2.setBounds(10, 60, 80, 25);
        panel.add(label2);
        label3 = new JLabel("Department");
        label3.setBounds(10, 110, 80, 25);
        panel.add(label3);
        // Creating all Textfields
        userText1 = new JTextField();
        userText1.setBounds(100, 10, 200, 25);
        panel.add(userText1);
        JTextField userText2 = new JTextField();
        userText2.setBounds(100, 60, 200, 25);
        panel.add(userText2);
        JTextField userText3 = new JTextField();
        userText3.setBounds(100, 110, 200, 25);
        panel.add(userText3);
        // Save Button
        button = new JButton("Save");
        button.setBounds(150, 160, 80, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayData(userText1.getText(), userText2.getText(), userText3.getText());
            }
        });
        panel.add(button);
        // Display Area
        displayArea = new JTextArea();
        displayArea.setBounds(10, 200, 360, 150);
        panel.add(displayArea);
        
        success = new JLabel("Not Submitted Yet");
        success.setBounds(130, 370, 300, 25);
        panel.add(success);
        frame.setVisible(true);
    }
    
    // Method to display data in JTextArea
    private static void displayData(String name, String roll, String department) {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Roll: ").append(roll).append("\n");
        sb.append("Department: ").append(department).append("\n");
        displayArea.setText(sb.toString());
        success.setText("Saved Successfully");
    }
}

