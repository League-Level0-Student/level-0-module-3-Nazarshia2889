package _04_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog(null, "Are you happy?");
		if(happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		else if(happy.equalsIgnoreCase("no")) {
			String next = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if(next.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			else if(next.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		}
	}

}
