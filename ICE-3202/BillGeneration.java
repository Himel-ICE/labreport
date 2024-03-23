import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BillGeneration extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    JComboBox<Integer> quantityComboBox1, quantityComboBox2, quantityComboBox3;

    BillGeneration() {
        l = new JLabel("Akif Restaurant");
        l.setBounds(50, 50, 300, 20);
        cb1 = new JCheckBox("Pizza  100tk");
        cb1.setBounds(100, 100, 150, 20);
        quantityComboBox1 = new JComboBox<>();
        quantityComboBox1.setBounds(270, 100, 50, 20);
        for (int i = 0; i <= 10; i++) {
            quantityComboBox1.addItem(i);
        }
        
        cb2 = new JCheckBox("Burger  30tk");
        cb2.setBounds(100, 150, 150, 20);
        quantityComboBox2 = new JComboBox<>();
        quantityComboBox2.setBounds(270, 150, 50, 20);
        for (int i = 0; i <= 10; i++) {
            quantityComboBox2.addItem(i);
        }
        
        cb3 = new JCheckBox("Tea 10tk");
        cb3.setBounds(100, 200, 150, 20);
        quantityComboBox3 = new JComboBox<>();
        quantityComboBox3.setBounds(270, 200, 50, 20);
        for (int i = 0; i <= 10; i++) {
            quantityComboBox3.addItem(i);
        }

        b = new JButton("Order");
        b.setBounds(100, 250, 80, 30);
        b.addActionListener(this);
        add(l);
        add(cb1);
        add(quantityComboBox1);
        add(cb2);
        add(quantityComboBox2);
        add(cb3);
        add(quantityComboBox3);
        add(b);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if (cb1.isSelected()) {
            amount += 100 * (int) quantityComboBox1.getSelectedItem();
            msg = "Pizza: 100tk" + "  Quantity: " + quantityComboBox1.getSelectedItem()+ " -> tk: " + (100 * (int) quantityComboBox1.getSelectedItem())  + "\n";
        }
        if (cb2.isSelected()) {
            amount += 30 * (int) quantityComboBox2.getSelectedItem();
            msg += "Burger: 30tk" + "  Quantity: " + quantityComboBox2.getSelectedItem()+ " -> tk: " + (30 * (int) quantityComboBox2.getSelectedItem()) + "\n";
        }
        if (cb3.isSelected()) {
            amount += 10 * (int) quantityComboBox3.getSelectedItem();
            msg += "Tea: 10tk" + "  Quantity: " + quantityComboBox3.getSelectedItem()+ " -> tk: " + (10 * (int) quantityComboBox3.getSelectedItem()) + "\n";
        }
        msg += "Net ammount: " + amount + "\n" + "-----------------\n vat 15% \n tax 2%\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + (amount + amount * 0.17));
    }

    public static void main(String[] args) {
        new BillGeneration();
    }
}
