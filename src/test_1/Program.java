package test_1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Program extends JFrame implements ActionListener {
private JComboBox box;

public static void main(String[] args) {
	 SwingUtilities.invokeLater(new Runnable() {
	        @Override
	        public void run() {
	            new Program().setVisible(true); 
	        }
	    });
}

public Program() {
    super("Text DEMO");
    setSize(300, 300);
    setLayout(new FlowLayout());
    Container cont = getContentPane();
    box = new JComboBox(new String[] { "First", "Second", "..." });
    box.setEditable(true);
    box.addActionListener(this);
    cont.add(box);
}

@Override
public void actionPerformed(ActionEvent e) {
	 if (e.getActionCommand().equals("comboBoxEdited")) {
    box.removeActionListener(this);
    box.insertItemAt(box.getSelectedItem(), 0);
    box.addActionListener(this);
	 }
}
}
