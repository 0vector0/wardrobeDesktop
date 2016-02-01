package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ListDataListener;

public class ComboBox {

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
ComboBoxFrame frame = new ComboBoxFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
});

}

}
class ComboBoxFrame extends JFrame {
public ComboBoxFrame() {
setTitle("ComboBox");
setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

label = new JLabel("Pro-Java.ru - любимый блог про Java");
label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
add(label, BorderLayout.CENTER);

faceCombo = new JComboBox();
faceCombo.setEditable(true);
faceCombo.addItem("Serif");
faceCombo.addItem("SansSerif");
faceCombo.addItem("MonoSpaced");
faceCombo.addItem("Dialog");
faceCombo.addItem("DialogInput");
faceCombo.addItem("Arial");

faceCombo.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent event) {
label.setFont(new Font((String) faceCombo.getSelectedItem(),Font.PLAIN,DEFAULT_SIZE));
}
});

JPanel comboPanel = new JPanel();
comboPanel.add(faceCombo);
add(comboPanel, BorderLayout.SOUTH);
}
public static final int DEFAULT_WIDTH = 300;
public static final int DEFAULT_HEIGHT = 300;

private JComboBox faceCombo;
private JLabel label;
private static final int DEFAULT_SIZE = 12;
}