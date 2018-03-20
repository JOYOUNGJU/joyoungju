package °è»ê±â;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calulator extends JFrame {
	JPanel panel;
	JTextField tField;
	JButton[] buttons;
	String[] label = {
			"Backspace","","","CE","C",
			"7","8","9","/","sqrt",
			"4","5","6","x","%",
			"1","2","3","-","1/x",
			"0","+/-",".","+","=",
	};
	public calulator() {
		// TODO Auto-generated constructor stub
		panel = new JPanel();
		panel.setLayout(new GridLayout(5, 5,3,3));
		tField = new JTextField();
		tField.setText("0.");
		tField.setEnabled(false);
		buttons = new JButton[25];
		int index = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				buttons[index] = new JButton(label[index]);
				if(j>=3)
					buttons[index].setForeground(Color.red);
				else 
					buttons[index].setForeground(Color.yellow);
				buttons[index].setBackground(Color.blue);
				panel.add(buttons[index]);
				index++;
			}
		}
	    add(panel, BorderLayout.NORTH);
	    add(tField, BorderLayout.CENTER);
	    pack();
	    setVisible(true);
		   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 new calulator();

	}

}
