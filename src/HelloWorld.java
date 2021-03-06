import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HelloWorld {
    private JButton halloButton;
    private JPanel mainPanel;
    private JTextField nameField;
    private JLabel namensLabel;
    private JCheckBox informalCheckBox;

    public HelloWorld() {
        halloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ausgabe();


            }
        });



        nameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Color mintgruen = Color.decode("#ade3d1");
                nameField.setBackground(mintgruen);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                nameField.setBackground(null);
            }
        });
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ausgabe();
            }
        });
    }

    private void ausgabe() {
        boolean informell = informalCheckBox.isSelected();
        String name = nameField.getText();
        if (informell){
            JOptionPane.showMessageDialog(halloButton,"Yo "+name+" !");
        }else{
            JOptionPane.showMessageDialog(halloButton,"Herzlich Willkommen "+name+" !");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
