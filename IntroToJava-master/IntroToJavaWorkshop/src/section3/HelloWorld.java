package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "HelloWorld");
	String name=JOptionPane.showInputDialog("Enter you name");
	JOptionPane.showMessageDialog(null, "Nice To Meet You "+name);
}
}
