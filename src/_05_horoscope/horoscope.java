package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "What is your star sign?");
		if(answer.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is courageous, energetic, willful, commanding, leading.");
		}
		else if(answer.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Leasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}
		else if(answer.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
		}
		else if(answer.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
		}
		else if(answer.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
		}
		else if(answer.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
		}
		else if(answer.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
		}
		else if(answer.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
		}
		else if(answer.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Do not focus on things that wont lead anywhere today as this will exhaust you and take all your time.");
		}
		else if(answer.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Stop worrying about the future and pay attention to the help someone can give you right now.");
		}
		else if(answer.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Do not let old memories hold you back, deal with them ad learn from them and move forward.");
		}
		else if(answer.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "You need to listen to what your heart tells you today and let go of negative emotions that hold you back.");
		}
		else {
			JOptionPane.showMessageDialog(null, "That's not a star sign");
		}
		
		
	}

}
