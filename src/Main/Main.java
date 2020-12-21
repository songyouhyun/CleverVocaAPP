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
import java.awt.BorderLayout;

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
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagePanel BG = new ImagePanel(new ImageIcon("./image/BackgroundIMG(FIX).jpg").getImage());
		frame.getContentPane().add(BG);
		BG.setLayout(null);

		ImagePanel WriteTestPage = new ImagePanel(new ImageIcon("./image/BackgroundIMG(FIX).jpg").getImage());
		frame.getContentPane().add(WriteTestPage);
		WriteTestPage.setVisible(false);
		WriteTestPage.setLayout(null);

		ImagePanel TestPage = new ImagePanel(new ImageIcon("./image/BackgroundIMG(FIX).jpg").getImage());
		frame.getContentPane().add(TestPage);
		TestPage.setVisible(false);
		TestPage.setLayout(null);


		ImagePanel CardTestPage = new ImagePanel(new ImageIcon("./image/BackgroundIMG(FIX).jpg").getImage());
		frame.getContentPane().add(CardTestPage);
		CardTestPage.setVisible(false);
		CardTestPage.setLayout(null);

		ImagePanel SearchModulePage = new ImagePanel(new ImageIcon("./image/BackgroundIMG(FIX).jpg").getImage());
		frame.getContentPane().add(SearchModulePage);
		SearchModulePage.setVisible(false);
		SearchModulePage.setLayout(null);


		JPanel lineborderPanel1 = new JPanel();
		lineborderPanel1.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		lineborderPanel1.setBounds(290, 290, 1370, 700);
		WriteTestPage.add(lineborderPanel1);
		lineborderPanel1.setLayout(null);

		JPanel lineborderPanel2 = new JPanel();
		lineborderPanel2.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		lineborderPanel2.setBounds(290, 290, 1370, 700);
		CardTestPage.add(lineborderPanel2);
		lineborderPanel2.setLayout(null);

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
		btnSearchModule.setBounds(1041, 420, 380, 67);
		BG.add(btnSearchModule);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		btnSearchModule.setFont(BlackBrutal);
		btnSearchModule.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BG.setVisible(false);
				SearchModulePage.setVisible(true);
			}
		});

		JButton btnMakeModule = new JButton("Make Module");
		btnMakeModule.setBorder(null);
		btnMakeModule.setBackground(SystemColor.info);
		btnMakeModule.setBounds(1237, 592, 350, 66);
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

		btnTest.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BG.setVisible(false);
				TestPage.setVisible(true);
			}
		});

		JLabel lblTest = new JLabel("Test");
		lblTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblTest.setBounds(695, 97, 560, 170);
		TestPage.add(lblTest);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(200f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		lblTest.setFont(BlackBrutal);

		
		JButton btnCard = new JButton("Card");
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCard.setHorizontalAlignment(SwingConstants.CENTER);
		btnCard.setBackground(SystemColor.info);
		btnCard.setBounds(325,500,320,170);
		btnCard.setBorder(null);
		TestPage.add(btnCard);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		btnCard.setFont(BlackBrutal);
		btnCard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TestPage.setVisible(false);
				CardTestPage.setVisible(true);
			}
		});

		JButton btnWrite = new JButton("Write");
		btnWrite.setHorizontalAlignment(SwingConstants.CENTER);
		btnWrite.setBackground(SystemColor.info);
		btnWrite.setBounds(1300,500,370,165);
		btnWrite.setBorder(null);
		TestPage.add(btnWrite);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		btnWrite.setFont(BlackBrutal);
		btnWrite.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TestPage.setVisible(false);
				WriteTestPage.setVisible(true);
			}
		});

		JLabel WritetestWord = new JLabel("clever");
		WritetestWord.setHorizontalAlignment(SwingConstants.CENTER);
		WritetestWord.setBounds(409, 97, 560, 130);
		lineborderPanel1.add(WritetestWord);
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
		lineborderPanel1.add(txtWriteHere);
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

		JLabel Cardtestlabel = new JLabel("Card Test");
		Cardtestlabel.setHorizontalAlignment(SwingConstants.CENTER);
		Cardtestlabel.setBounds(695, 97, 560, 130);
		Cardtestlabel.setFont(BlackBrutal);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		CardTestPage.add(Cardtestlabel);
		Writetestlabel.setFont(BlackBrutal);

		JLabel SearchModulelabel = new JLabel("SearchModule");
		SearchModulelabel.setHorizontalAlignment(SwingConstants.CENTER);
		SearchModulelabel.setBounds(695, 97, 700, 130);
		SearchModulelabel.setFont(BlackBrutal);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")).deriveFont(100f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BlackBrutal.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		SearchModulePage.add(SearchModulelabel);
		SearchModulelabel.setFont(BlackBrutal);

	}
}

class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
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