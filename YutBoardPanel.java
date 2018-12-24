package yut_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class YutBoardPanel extends JPanel{
	
	private BufferedImage img = null;
	public static int i = 0;
	public static int j = 0;
	public static String s = "";
	public static JPanel boardPanel = new JPanel();
	
	public YutBoardPanel(int i, String s) {
		if (s == "YutBoard1")
			img("YutBoard1");
		else if(s == "YutBoard2")
			img("YutBoard2");
		else if(s == "YutBoard1_p1")
			img("YutBoard1_p1");
		else if(s == "YutBoard1_p2")	
			img("YutBoard1_p2");
		else if(s == "YutBoard2_p1")
			img("YutBoard2_p1");
		else if(s == "YutBoard2_p2")
			img("YutBoard2_p2");
		else img("YutBoard1");			
		setLayout(null);
		
		
		JPanel panImg = new InnerPanel();
		panImg.setBounds(0, 0, 99, 99);
		panImg.setOpaque(false);
		
		add(panImg);
		setVisible(true);
		setOpaque(false);
		setFocusable(true);
		
	}
	
	public static String setboard(int i) {
		String setboard = "";
		if (getBoard(i) == "YutBoard1") 
			setboard = "YutBoard1";
		else if(getBoard(i) == "YutBoard2") 
			setboard = "YutBoard2";
		else if(getBoard(i) == "YutBoard1_p1") 
			setboard = "YutBoard1_p1";
		else if(getBoard(i) == "YutBoard1_p2") 
			setboard = "YutBoard1_p2";
		else if(getBoard(i) == "YutBoard2_p1") 
			setboard = "YutBoard2_p1";
		else if(getBoard(i) == "YutBoard2_p2") 
		setboard = "YutBoard2_p2";
		return setboard;
	}
	
	//board의 img의 문자열을 return해주는 메소드 
	public static String getBoard(int i) {
		return s;
	}
		
	//이미지를 그려주는 클래스이다.
	class InnerPanel extends JPanel{
		private static final long serialversionUID = 154728190348749556L;
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(img, 0, 0, null);
		}
	}
	
	//img파일을 불러오는 메소드이다.
	public void img(String filename) {
		try {
			img = ImageIO.read(new File("img/" + filename + ".png"));
			repaint();
		}catch (IOException e) {
			System.out.println("이미지 불러오기 실패!");
			System.exit(0);
		}
		repaint();
		
	}
}