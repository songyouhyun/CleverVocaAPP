package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;

public class CleverVoca {

	private JFrame frame;
	Font BlackBrutal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CleverVoca window = new CleverVoca();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CleverVoca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(150f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		
		JPanel WriteTestPage = new JPanel();
		WriteTestPage.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(WriteTestPage);
		WriteTestPage.setLayout(null);
		
		JPanel lineborderPanel = new JPanel();
		lineborderPanel.setBounds(290, 290,1370, 700);
		WriteTestPage.add(lineborderPanel);
		lineborderPanel.setLayout(null);
		
		JLabel WritetestWord = new JLabel("New label");
		WritetestWord.setBounds(457, 26, 62, 18);
		lineborderPanel.add(WritetestWord);
		
		JLabel Writetestlabel = new JLabel("Write Test");
		Writetestlabel.setBounds(712, 82, 116, 18);
		Writetestlabel.setFont(BlackBrutal);
		WriteTestPage.add(Writetestlabel);
		
		
		
		
		
		JPanel TestPage = new JPanel();
		TestPage.setBackground(Color.WHITE);
		TestPage.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(TestPage);
		TestPage.setLayout(null);
		
		JLabel lblTest = new JLabel("Test");
		lblTest.setBounds(930, 31, 62, 18);
		TestPage.add(lblTest);
		TestPage.setVisible(false);
		
		JPanel StartPage = new JPanel();
		StartPage.setBackground(Color.WHITE);
		StartPage.setBounds(0, 0, 1902, 1033);
		frame.getContentPane().add(StartPage);
		StartPage.setLayout(null);
		
		
		
		
		JLabel lblTitle = new JLabel("Clever Voca", SwingConstants.CENTER);
		lblTitle.setFont(null);
		lblTitle.setBounds(156, 169, 690, 310);
		StartPage.add(lblTitle);
		lblTitle.setFont(BlackBrutal);
		
		JButton btnSearchModule = new JButton("Search Module");
		btnSearchModule.setFont(null);
		btnSearchModule.setBorder(null);
		btnSearchModule.setBackground(Color.WHITE);
		btnSearchModule.setBounds(1041, 420, 380, 90);
		StartPage.add(btnSearchModule);
		btnSearchModule.setFont(BlackBrutal);
		btnSearchModule.setFont(BlackBrutal);
		
				
				JButton btnMakeModule = new JButton("Make Module");
				btnMakeModule.setFont(null);
				btnMakeModule.setBorder(null);
				btnMakeModule.setBackground(Color.WHITE);
				btnMakeModule.setBounds(1237, 592, 417, 126);
				StartPage.add(btnMakeModule);
				btnMakeModule.setFont(BlackBrutal);
				

		JButton btnTest = new JButton("Test");
		btnTest.setFont(null);
		btnTest.setBorder(null);
		btnTest.setBackground(Color.WHITE);
		btnTest.setBounds(1523, 794, 200, 100);
		StartPage.add(btnTest);
		btnTest.setFont(BlackBrutal);
		
		btnTest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StartPage.setVisible(false);
	            TestPage.setVisible(true);
			}
		});
		
		
	}
}
