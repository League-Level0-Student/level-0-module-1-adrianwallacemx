package _02_unbirthday;


import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		
	
	String input=JOptionPane.showInputDialog("when is your birthday");
			if(input.equals("08/19")) {
				JOptionPane.showMessageDialog(null, "happy birthday");
				
			
				
			}
			else {
				JOptionPane.showMessageDialog(null, "happy unbirthday");
			}
			
}
}
