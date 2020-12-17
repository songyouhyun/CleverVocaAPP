package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

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
		ImagePanel BG = new ImagePanel(new ImageIcon("./image/BackgroundIMG(FIX).jpg").getImage());
		frame.setSize(BG.getWidth(),BG.getHeight());
		frame.setBounds(100, 100, 1920, 1080);
		frame.getContentPane().add(BG);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
<<<<<<< HEAD
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
=======
				JPanel TestPage = new JPanel();
				TestPage.setBackground(Color.WHITE);
				TestPage.setBounds(0, 0, 1920, 1080);
				frame.getContentPane().add(TestPage);
				TestPage.setLayout(null);
				
						
				
						JLabel lblTest = new JLabel("Test");
						lblTest.setHorizontalAlignment(SwingConstants.CENTER);
						lblTest.setBounds(695, 97, 560, 130);
						TestPage.add(lblTest);
						lblTest.setFont(BlackBrutal);
						TestPage.setVisible(false);
						lblTest.setFont(BlackBrutal);
						
						JButton SelectBtnWrite = new JButton("WRITE");
						SelectBtnWrite.setBounds(1255, 540, 280, 130);
						SelectBtnWrite.setBackground(Color.white);
						SelectBtnWrite.setFont(null);
						SelectBtnWrite.setBorder(null);
						try {
							BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(80f);
							GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
							ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
						} catch (IOException | FontFormatException e) {

						}
						SelectBtnWrite.setFont(BlackBrutal);
						TestPage.add(SelectBtnWrite);
						
						
						JButton SelectBtnCard = new JButton("CARD");
						SelectBtnCard.setBounds(415, 540, 280, 130);
						TestPage.add(SelectBtnCard);
		
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
								WritetestWord.setFont(BlackBrutal);
								
										txtWriteHere = new JTextField();
										txtWriteHere.setHorizontalAlignment(SwingConstants.CENTER);
										txtWriteHere.setBounds(409, 375, 560, 130);
										lineborderPanel.add(txtWriteHere);
										txtWriteHere.setColumns(10);
										txtWriteHere.setFont(BlackBrutal);
										
												JLabel Writetestlabel = new JLabel("Write Test");
												Writetestlabel.setHorizontalAlignment(SwingConstants.CENTER);
												Writetestlabel.setBounds(695, 97, 560, 130);
												Writetestlabel.setFont(BlackBrutal);
												WriteTestPage.add(Writetestlabel);
												Writetestlabel.setFont(BlackBrutal);

		JPanel StartPage = new JPanel();
		StartPage.setBackground(Color.WHITE);
		StartPage.setBounds(0, 0, 1902, 1033);
		
		frame.getContentPane().add(StartPage);
		StartPage.setLayout(null);

>>>>>>> ea4f8cbd7f7e9dbf8683a21134ad967b8b2f6236
		JLabel lblTitle = new JLabel("Clever Voca", SwingConstants.CENTER);
		lblTitle.setFont(null);
		lblTitle.setBounds(156, 169, 690, 310);
		BG.add(lblTitle);
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
		btnSearchModule.setBackground(SystemColor.info);
		btnSearchModule.setBounds(1041, 420, 379, 67);
		BG.add(btnSearchModule);
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
		btnMakeModule.setBackground(SystemColor.info);
		btnMakeModule.setBounds(1237, 592, 330, 66);
		BG.add(btnMakeModule);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		btnMakeModule.setFont(BlackBrutal);

		JButton btnTest = new JButton("Test");
		btnTest.setFont(null);
		btnTest.setBorder(null);
		btnTest.setBackground(SystemColor.info);
		btnTest.setBounds(1523, 794, 135, 70);
		BG.add(btnTest);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		btnTest.setFont(BlackBrutal);
<<<<<<< HEAD
		
		
		ImagePanel TestPage = new ImagePanel(new ImageIcon("./image/BackgroundIMG(FIX).jpg").getImage());
		frame.getContentPane().add(TestPage);
		
=======

>>>>>>> ea4f8cbd7f7e9dbf8683a21134ad967b8b2f6236
		btnTest.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BG.setVisible(false);
				TestPage.setVisible(true);
			}
		});
<<<<<<< HEAD

		JLabel lblTest = new JLabel("Test");
		lblTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblTest.setBounds(695, 97, 560, 170);
		TestPage.add(lblTest);
		lblTest.setFont(BlackBrutal);
		TestPage.setVisible(false);
=======
>>>>>>> ea4f8cbd7f7e9dbf8683a21134ad967b8b2f6236
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(170f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(100f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}

		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}

	}
}

class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}
	
	public int getHeight() {
		return img.getHeight(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

