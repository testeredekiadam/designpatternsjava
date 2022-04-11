import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

interface displayModule {
		public String display();
	}
	
	class Monitor implements displayModule{
		public String display() {
			return "Display! Monitor! Display!";
		}
	}
	
	class Project implements displayModule {
		public String display() {
			return "Display! Projector! Display!";
		}
	}


public class Computer {
		displayModule dm;
		
		public void setDisplayModule(displayModule dm) {
			this.dm = dm;
		}
		
		public String display() {
			return dm.display();
		}
		
	

	public static void main(String[] args) {
		Runnable runner = new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Display");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				Computer cm = new Computer();
				displayModule dm1 = new Monitor();
				displayModule dm2 = new Project();
				
				JLabel label1;
				JLabel label2;
				cm.setDisplayModule(dm1);
				label1 = new JLabel(cm.display());
				
				cm.setDisplayModule(dm2);
				label2 = new JLabel(cm.display());
				
				frame.add(label1, BorderLayout.NORTH);
				frame.add(label2, BorderLayout.SOUTH);
				frame.setSize(300, 300);
				frame.setVisible(true);
				
				
			}
		};
		
		EventQueue.invokeLater(runner);
		
	}
}