package vue;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ihm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		ihm window = new ihm();
		window.frame.setVisible(true);

	}

	/**
	 * Create the application.
	 */
	public ihm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton start = new JButton("Start");
		start.setBounds(24, 257, 78, 25);
		frame.getContentPane().add(start);

		JButton stop = new JButton("Stop");
		stop.setBounds(154, 257, 78, 25);
		frame.getContentPane().add(stop);

		JButton inc = new JButton("Inc");
		inc.setBounds(320, 257, 78, 25);
		frame.getContentPane().add(inc);


		JButton dec = new JButton("Dec");
		dec.setBounds(471, 257, 78, 25);
		frame.getContentPane().add(dec);
		
		JLabel tempo = new JLabel("Tempo");
		tempo.setBounds(32, 77, 70, 15);
		frame.getContentPane().add(tempo);
		
		JSlider slider = new JSlider();
		slider.setBounds(12, 117, 150, 16);
		frame.getContentPane().add(slider);
		
		textField = new JTextField("40");
		textField.setBounds(214, 114, 100, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		Button led11 = new Button();
		led11.setBackground(Color.BLACK);
		led11.setBounds(451, 103, 30, 30);
		frame.getContentPane().add(led11);
		
		JLabel led1 = new JLabel("LED1");
		led1.setBounds(502, 118, 70, 15);
		frame.getContentPane().add(led1);
		
		JLabel mesure = new JLabel("Mesure");
		mesure.setBounds(103, 177, 70, 15);
		frame.getContentPane().add(mesure);
		
		textField_1 = new JTextField("3");
		textField_1.setBounds(214, 175, 100, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton led22 = new JButton();
		led22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		led22.setBackground(Color.BLACK);
		led22.setBounds(451, 174, 30, 30);
		frame.getContentPane().add(led22);
		
		JLabel led2 = new JLabel("LED2");
		led2.setBounds(502, 189, 70, 15);
		frame.getContentPane().add(led2);
		
		
	
	
	}
}
