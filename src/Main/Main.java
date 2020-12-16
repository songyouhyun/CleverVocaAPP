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
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class Main {

	private JFrame frame;
	Font BlackBrutal;
	private JTextField txtWriteHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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

		JPanel StartPage = new JPanel();
		StartPage.setBackground(Color.WHITE);
		StartPage.setBounds(0, 0, 1902, 1033);
		frame.getContentPane().add(StartPage);
		StartPage.setLayout(null);

		JLabel lblTitle = new JLabel("Clever Voca", SwingConstants.CENTER);
		lblTitle.setFont(null);
		lblTitle.setBounds(156, 169, 690, 310);
		StartPage.add(lblTitle);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(150f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		lblTitle.setFont(BlackBrutal);

		JButton btnSearchModule = new JButton("Search Module");
		btnSearchModule.setFont(null);
		btnSearchModule.setBorder(null);
		btnSearchModule.setBackground(Color.WHITE);
		btnSearchModule.setBounds(1041, 420, 380, 90);
		StartPage.add(btnSearchModule);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		btnSearchModule.setFont(BlackBrutal);

		JButton btnMakeModule = new JButton("Make Module");
		btnMakeModule.setFont(null);
		btnMakeModule.setBorder(null);
		btnMakeModule.setBackground(Color.WHITE);
		btnMakeModule.setBounds(1237, 592, 417, 126);
		StartPage.add(btnMakeModule);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		btnMakeModule.setFont(BlackBrutal);

		JButton btnTest = new JButton("Test");
		btnTest.setFont(null);
		btnTest.setBorder(null);
		btnTest.setBackground(Color.WHITE);
		btnTest.setBounds(1523, 794, 200, 100);
		StartPage.add(btnTest);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		btnTest.setFont(BlackBrutal);
		JPanel TestPage = new JPanel();
		TestPage.setBackground(Color.WHITE);
		TestPage.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(TestPage);
		TestPage.setLayout(null);

		btnTest.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StartPage.setVisible(false);
				TestPage.setVisible(true);
			}
		});

		

		JLabel lblTest = new JLabel("Test");
		lblTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblTest.setBounds(695, 97, 560, 130);
		TestPage.add(lblTest);
		lblTest.setFont(BlackBrutal);
		TestPage.setVisible(false);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(170f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		lblTest.setFont(BlackBrutal);

		JPanel WriteTestPage = new JPanel();
		WriteTestPage.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(WriteTestPage);
		WriteTestPage.setLayout(null);
		WriteTestPage.setVisible(false);

		JPanel lineborderPanel = new JPanel();
		lineborderPanel.setBorder(new LineBorder(new Color(0, 0, 0), 20, true));
		lineborderPanel.setBounds(290, 290, 1370, 700);
		WriteTestPage.add(lineborderPanel);
		lineborderPanel.setLayout(null);

		JLabel WritetestWord = new JLabel("clever");
		WritetestWord.setHorizontalAlignment(SwingConstants.CENTER);
		WritetestWord.setBounds(409, 97, 560, 130);
		lineborderPanel.add(WritetestWord);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(100f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		WritetestWord.setFont(BlackBrutal);

		txtWriteHere = new JTextField();
		txtWriteHere.setHorizontalAlignment(SwingConstants.CENTER);
		txtWriteHere.setBounds(409, 375, 560, 130);
		lineborderPanel.add(txtWriteHere);
		txtWriteHere.setColumns(10);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		txtWriteHere.setFont(BlackBrutal);

		JLabel Writetestlabel = new JLabel("Write Test");
		Writetestlabel.setHorizontalAlignment(SwingConstants.CENTER);
		Writetestlabel.setBounds(695, 97, 560, 130);
		Writetestlabel.setFont(BlackBrutal);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		WriteTestPage.add(Writetestlabel);
		Writetestlabel.setFont(BlackBrutal);

		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}

	}
}
