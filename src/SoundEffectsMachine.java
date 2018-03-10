import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine {
public static void main(String[] args) {
	JFrame window = new JFrame();
	window.setVisible(true);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	JButton moo = new JButton();
	window.add(panel);
	panel.add(moo);
	moo.setText("Cow Moo");
	window.pack();
}
}
