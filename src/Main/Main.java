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
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Main {

	private JFrame frame;
	Font BlackBrutal;
	private JTextField txtWriteHere;
	private JTextField InsertMdName;
	private JTextField InsertWordEn01;
	private JTextField InsertWordKo01;
	private JTextField InsertWordEn02;
	private JTextField InsertWordEn03;
	private JTextField InsertWordEn04;
	private JTextField InsertWordKo02;
	private JTextField InsertWordKo03;
	private JTextField InsertWordKo00;




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
		
		String fonts = new String ("Typo_DonQuixoteL.ttf");
		
		String BGlink = new String("./image/BackgroundIMG(FIX).jpg");
		String [] headings = {"Number", "Name","none","none"};
		Object [] [] data = {
				{"1","TOEIC 700점 토익 영단어", "Start!", "BookMark"},
				{"2","TOEIC 800점 토익 영단어", "Start!", "BookMark"},
				{"3","TOEIC 850점 토익 영단어", "Start!", "BookMark"},
				{"4","TOEIC 900점 토익 영단어", "Start!", "BookMark"},
		};

		ImagePanel BG = new ImagePanel(new ImageIcon(BGlink).getImage());
		frame.getContentPane().add(BG);
		BG.setLayout(null);

		ImagePanel WriteTestPage = new ImagePanel(new ImageIcon(BGlink).getImage());
		frame.getContentPane().add(WriteTestPage);
		WriteTestPage.setVisible(false);
		WriteTestPage.setLayout(null);

		ImagePanel TestPage = new ImagePanel(new ImageIcon(BGlink).getImage());
		frame.getContentPane().add(TestPage);
		TestPage.setVisible(false);
		TestPage.setLayout(null);


		ImagePanel CardTestPage = new ImagePanel(new ImageIcon(BGlink).getImage());
		frame.getContentPane().add(CardTestPage);
		CardTestPage.setVisible(false);
		CardTestPage.setLayout(null);

		ImagePanel SearchModulePage = new ImagePanel(new ImageIcon(BGlink).getImage());
		frame.getContentPane().add(SearchModulePage);
		SearchModulePage.setVisible(false);
		SearchModulePage.setLayout(null);

		ImagePanel MakeModulePage = new ImagePanel(new ImageIcon(BGlink).getImage());
		frame.getContentPane().add(MakeModulePage);
		MakeModulePage.setVisible(false);
		MakeModulePage.setLayout(null);


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

		JPanel lineborderPanel3 = new JPanel();
		lineborderPanel3.setBorder(new LineBorder(new Color(0,0,0),20,true));
		lineborderPanel3.setBounds(445,400,1050,500);
		SearchModulePage.add(lineborderPanel3);
		lineborderPanel3.setLayout(null);

		JPanel lineborderPanel4 = new JPanel();
		lineborderPanel4.setBorder(new LineBorder(new Color(0,0,0),20,true));
		lineborderPanel4.setBounds(204, 170, 1600, 830);
		MakeModulePage.add(lineborderPanel4);
		lineborderPanel4.setLayout(null);
		
		InsertMdName = new JTextField();
		InsertMdName.setBounds(50, 50, 1100, 100);
		lineborderPanel4.add(InsertMdName);
		InsertMdName.setColumns(10);
		
		InsertWordEn01 = new JTextField();
		InsertWordEn01.setBounds(50, 200, 500, 100);
		lineborderPanel4.add(InsertWordEn01);
		InsertWordEn01.setColumns(10);
		
		InsertWordEn02 = new JTextField();
		InsertWordEn02.setColumns(10);
		InsertWordEn02.setBounds(50, 350, 500, 100);
		lineborderPanel4.add(InsertWordEn02);
		
		InsertWordEn03 = new JTextField();
		InsertWordEn03.setColumns(10);
		InsertWordEn03.setBounds(50, 500, 500, 100);
		lineborderPanel4.add(InsertWordEn03);
		
		InsertWordEn04 = new JTextField();
		InsertWordEn04.setColumns(10);
		InsertWordEn04.setBounds(50, 650, 500, 100);
		lineborderPanel4.add(InsertWordEn04);
		
		InsertWordKo01 = new JTextField();
		InsertWordKo01.setColumns(10);
		InsertWordKo01.setBounds(650, 350, 500, 100);
		lineborderPanel4.add(InsertWordKo01);
		
		InsertWordKo02 = new JTextField();
		InsertWordKo02.setColumns(10);
		InsertWordKo02.setBounds(650, 500, 500, 100);
		lineborderPanel4.add(InsertWordKo02);
		
		InsertWordKo03 = new JTextField();
		InsertWordKo03.setColumns(10);
		InsertWordKo03.setBounds(650, 650, 500, 100);
		lineborderPanel4.add(InsertWordKo03);
		
		InsertWordKo00 = new JTextField();
		InsertWordKo00.setColumns(10);
		InsertWordKo00.setBounds(650, 200, 500, 100);
		lineborderPanel4.add(InsertWordKo00);
		
		JButton MdSavebtn = new JButton("Save");
		MdSavebtn.setBounds(1200, 650, 350, 100);
		lineborderPanel4.add(MdSavebtn);



		JLabel lblTitle = new JLabel("Clever Voca", SwingConstants.CENTER);
		lblTitle.setFont(null);
		lblTitle.setBounds(156, 169, 750, 310);
		BG.add(lblTitle);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
		} catch (IOException | FontFormatException e) {

		}
		lblTitle.setFont(BlackBrutal);
		
		JButton btnSearchModule = new JButton("Search Module");
		btnSearchModule.setFont(null);
		btnSearchModule.setBorder(null);
		btnSearchModule.setBackground(SystemColor.info);
		btnSearchModule.setFocusPainted(false);
		btnSearchModule.setBounds(1041, 420, 480, 67);
		BG.add(btnSearchModule);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
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
		btnMakeModule.setBounds(1237, 592, 480, 67);
		btnMakeModule.setFocusPainted(false);
		BG.add(btnMakeModule);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
		} catch (IOException | FontFormatException e) {

		}
		btnMakeModule.setFont(BlackBrutal);

		btnMakeModule.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MakeModulePage.setVisible(true);
				BG.setVisible(false);
			}
		});

		JButton btnTest = new JButton("Test");
		btnTest.setFont(null);
		btnTest.setBorder(null);
		btnTest.setBackground(SystemColor.info);
		btnTest.setBounds(1523, 794, 200, 70);
		btnTest.setFocusPainted(false);
		BG.add(btnTest);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
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
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(200f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
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
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
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
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
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
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(100f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
		} catch (IOException | FontFormatException e) {

		}
		WritetestWord.setFont(BlackBrutal);

		txtWriteHere = new JTextField();
		txtWriteHere.setHorizontalAlignment(SwingConstants.CENTER);
		txtWriteHere.setBounds(409, 375, 560, 130);
		lineborderPanel1.add(txtWriteHere);
		txtWriteHere.setColumns(10);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
		} catch (IOException | FontFormatException e) {

		}
		txtWriteHere.setFont(BlackBrutal);

		JLabel Writetestlabel = new JLabel("Write Test");
		Writetestlabel.setHorizontalAlignment(SwingConstants.CENTER);
		Writetestlabel.setBounds(695, 97, 560, 130);
		Writetestlabel.setFont(BlackBrutal);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
		} catch (IOException | FontFormatException e) {

		}
		WriteTestPage.add(Writetestlabel);
		Writetestlabel.setFont(BlackBrutal);

		JLabel Cardtestlabel = new JLabel("Card Test");
		Cardtestlabel.setHorizontalAlignment(SwingConstants.CENTER);
		Cardtestlabel.setBounds(695, 97, 560, 130);
		Cardtestlabel.setFont(BlackBrutal);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(130f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
		} catch (IOException | FontFormatException e) {

		}
		CardTestPage.add(Cardtestlabel);
		Writetestlabel.setFont(BlackBrutal);

		JLabel SearchModulelabel = new JLabel("SearchModule");
		SearchModulelabel.setHorizontalAlignment(SwingConstants.CENTER);
		SearchModulelabel.setBounds(625, 97, 700, 130);
		SearchModulelabel.setFont(BlackBrutal);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(100f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
		} catch (IOException | FontFormatException e) {

		}
		SearchModulePage.add(SearchModulelabel);
		SearchModulelabel.setFont(BlackBrutal);

		JLabel MakeModulelabel = new JLabel("MakeModule");
		MakeModulelabel.setHorizontalAlignment(SwingConstants.CENTER);
		MakeModulelabel.setBounds(625, 30, 700, 130);
		MakeModulelabel.setFont(BlackBrutal);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(100f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Typo_CrayonM.ttf")));
		} catch (IOException | FontFormatException e) {

		}
		MakeModulePage.add(MakeModulelabel);
		MakeModulelabel.setFont(BlackBrutal);

		JTextArea SearchTxt =  new JTextArea();
		SearchTxt.setBounds(450,270,970,70);
		SearchTxt.setFont(BlackBrutal);
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(80f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
		} catch (IOException | FontFormatException e) {

		}
		SearchModulePage.add(SearchTxt);
		SearchTxt.setFont(BlackBrutal);

		JButton Searchbtn = new JButton();
		Searchbtn.setIcon(new ImageIcon("D:\\GSMFestival\\CleverVocaApp\\image\\Search Button image.jpg"));
		Searchbtn.setBounds(1420,270,70,70);
		SearchModulePage.add(Searchbtn);

		JTable table = new JTable(data,headings);
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "TOEIC 700\uC810 \uD1A0\uC775 \uC601\uB2E8\uC5B4", "Start!", "BookMark"},
				{"2", "TOEIC 800\uC810 \uD1A0\uC775 \uC601\uB2E8\uC5B4", "Start!", "BookMark"},
				{"3", "TOEIC 850\uC810 \uD1A0\uC775 \uC601\uB2E8\uC5B4", "Start!", "BookMark"},
				{"4", "TOEIC 900\uC810 \uD1A0\uC775 \uC601\uB2E8\uC5B4", "Start!", "BookMark"},
			},
			new String[] {
				"Number", "Name", "none", "none"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(160);
		table.setSize(1010, 460);
		table.setLocation(20, 21);
		table.setFillsViewportHeight(true);
		lineborderPanel3.add(table);
		table.setFillsViewportHeight(true);
//		lineborderPanel3.add(new JScrollPane(table));
		try {
			BlackBrutal = Font.createFont(Font.TRUETYPE_FONT, new File(fonts)).deriveFont(25f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fonts)));
		} catch (IOException | FontFormatException e) {

		}
		table.setFont(BlackBrutal);

		JButton BackKey = new JButton();
		BackKey.setIcon(new ImageIcon("D:\\GSMFestival\\CleverVocaApp\\image\\BackKey.png"));
		BackKey.setBounds(12, 12, 130, 78);
		SearchModulePage.add(BackKey);
		BackKey.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SearchModulePage.setVisible(false);
				BG.setVisible(true);
			}
		});

		JButton BackKey2 = new JButton();
		BackKey2.setIcon(new ImageIcon("D:\\GSMFestival\\CleverVocaApp\\image\\BackKey.png"));
		BackKey2.setBounds(12, 12, 130, 78);
		TestPage.add(BackKey2);
		BackKey2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TestPage.setVisible(false);
				BG.setVisible(true);
			}
		});

		JButton BackKey3 = new JButton();
		BackKey3.setIcon(new ImageIcon("D:\\GSMFestival\\CleverVocaApp\\image\\BackKey.png"));
		BackKey3.setBounds(12, 12, 130, 78);
		CardTestPage.add(BackKey3);
		BackKey3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CardTestPage.setVisible(false);
				TestPage.setVisible(true);
			}
		});

		JButton BackKey4 = new JButton();
		BackKey4.setIcon(new ImageIcon("D:\\GSMFestival\\CleverVocaApp\\image\\BackKey.png"));
		BackKey4.setBounds(12, 12, 130, 78);
		WriteTestPage.add(BackKey4);
		BackKey4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				WriteTestPage.setVisible(false);
				TestPage.setVisible(true);
			}
		});

		JButton BackKey5 = new JButton();
		BackKey5.setIcon(new ImageIcon("D:\\GSMFestival\\CleverVocaApp\\image\\BackKey.png"));
		BackKey5.setBounds(12, 12, 130, 78);
		MakeModulePage.add(BackKey5);
		BackKey5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MakeModulePage.setVisible(false);
				BG.setVisible(true);
			}
		});
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