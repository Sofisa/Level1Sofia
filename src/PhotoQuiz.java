import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
int score = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String url = "https://images-na.ssl-images-amazon.com/images/I/61fSO5L9fTL._SL1001_.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component url2;
		// 3. use the "createImage()" method below to initialize your Component
url2 = createImage (url);
		// 4. add the image to the quiz window
quizWindow.add(url2);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("What chemical makes plants green?");
		// 7. print "CORRECT" if the user gave the right answer
if (answer.equals("chlorophyll")) {
JOptionPane.showMessageDialog(null,"CORRECT");
score += 1;
JOptionPane.showMessageDialog(null, "Your score is " + score);
} else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
	JOptionPane.showMessageDialog(null, "Your score is " + score);
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(url2);
		// 10. find another image and create it (might take more than one line of code)
String jupiter = "https://www.nasa.gov/sites/default/files/thumbnails/image/jupapr3color-jd-170304.png";
Component jupiter2;
jupiter2 = createImage (jupiter);
		// 11. add the second image to the quiz window
quizWindow.add(jupiter2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String planetanswer = JOptionPane.showInputDialog("What planet is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if (planetanswer.equals("jupiter")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
	score += 1;
	JOptionPane.showMessageDialog(null, "Your score is " + score);
}else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
	JOptionPane.showMessageDialog(null, "Your score is " + score);
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





