package exercises;

import javax.swing.JOptionPane;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String StringFirst;
		String StringSecond;
		
		double first;
		double second;
		
		StringFirst = JOptionPane.showInputDialog(null, "What is the number?", "Number Input", JOptionPane.INFORMATION_MESSAGE);
		StringSecond = JOptionPane.showInputDialog(null, "What is the number?", "Number Input 2", JOptionPane.INFORMATION_MESSAGE);
		
		first = Double.parseDouble(StringFirst);
		second = Double.parseDouble(StringSecond);
		
		
	}
public static void computePercent (double first, double second)
{
	double answer;
	double percent;
	
	answer = first / second;
	percent = answer * 100;
	JOptionPane.showMessageDialog(null, first + " is " + percent + " percent of " + second);
}
}
