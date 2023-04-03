import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Dialog1 {
 public static void main(String[] args){

	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	}
	catch(Exception e){
		}

	JFrame frm = new JFrame("Перше візуальне застосування");
	frm.setSize(300, 200);
	Container c = frm.getContentPane();
	c.add(new JLabel("Hello, привіт"));

	WindowListener wndCloser = new WindowAdapter() {
		public void windowClosing(WindowEvent e){
		System.exit(0);
		}
	};
	frm.addWindowListener(wndCloser);
	frm.setVisible(true);
	}
}
