package yut_game;

import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class showboard extends YutBoardPanel {
	
	//윷 보드 하나하나를 담을 패널이다.
	public static YutBoardPanel[] board = new YutBoardPanel[35];
	//윷 보드 하나하나의 위치를 담기 위한 맵이다.
	static HashMap<Integer, Integer> boardx = new HashMap();
	static HashMap<Integer, Integer> boardy = new HashMap();
	
	//showboard() 생성자이다.
	public showboard(){
		super(i, s);
		
		boardPanel.setLayout(null);
		boardPanel.setOpaque(false);
		boardPanel.setBounds(0, 0, 693, 693);
		
		setImg();	    
		setBound();
		boardAdd();
	}
	
	//윷보드 각각의 x,y위치를 담는 메소드이다.
	public static void setpos() {
		  boardx.put(0, 594);
		  boardx.put(1, 594);
		  boardx.put(2, 594);
		  boardx.put(3, 594);
		  boardx.put(4, 594);
		  boardx.put(5, 594);
		  
		  boardx.put(6, 495);
		  boardx.put(7, 396);
		  boardx.put(8, 297);
		  boardx.put(9, 198);
		  boardx.put(10, 99);
		  
		  boardx.put(11, 99);
		  boardx.put(12, 99);
		  boardx.put(13, 99);
		  boardx.put(14, 99);
		  boardx.put(15, 99);
		  
		  boardx.put(16, 198);
		  boardx.put(17, 297);
		  boardx.put(18, 396);
		  boardx.put(19, 495);
		  boardx.put(20, 495);
		  boardx.put(21, 423);
		  boardx.put(22, 348);
		  boardx.put(23, 273);
		  boardx.put(24, 198);
		  boardx.put(25, 198);
		  boardx.put(26, 273);
		  boardx.put(27, 348);
		  boardx.put(28, 423);
		  boardx.put(29, 495);
		  
		  boardy.put(0, 594);
		  boardy.put(1, 495);
		  boardy.put(2, 396);
		  boardy.put(3, 297);
		  boardy.put(4, 198);
		  boardy.put(5, 99);
		  
		  boardy.put(6, 99);
		  boardy.put(7, 99);
		  boardy.put(8, 99);
		  boardy.put(9, 99);
		  boardy.put(10, 99);
		  
		  boardy.put(11, 198);
		  boardy.put(12, 297);
		  boardy.put(13, 396);
		  boardy.put(14, 495);
		  boardy.put(15, 594);
		  
		  boardy.put(16, 594);
		  boardy.put(17, 594);
		  boardy.put(18, 594);
		  boardy.put(19, 594);
		  
		  boardy.put(20, 198);
		  boardy.put(21, 273);		  
		  boardy.put(22, 348);
		  boardy.put(23, 423);
		  boardy.put(24, 495);
		  boardy.put(25, 198);
		  boardy.put(26, 273);
		  boardy.put(27, 348);
		  boardy.put(28, 423);
		  boardy.put(29, 495);
	}
	
	//보드를 움직이는 제어 메소드이다.
	//다음은 p1제어 메소드 
	public static void change() {
		setpos();
		//'뒷도'가 나왔을때
		if(0 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 3) {
			if(i==0) {
				JOptionPane.showMessageDialog(null, "P1, You won!");
				System.exit(0);
			}
			else if(i == 5) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=4;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 10) {  			
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=9;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 15) {  			
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=14;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i==20) {
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=5;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i==22 || i==27) {
				s="YutBoard1";
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i-=1;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 28 || i == 23) {  			
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=27;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i==25) {
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=10;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else {
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i-=1;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
		}
		//'도'가 나왔을때
		else if(4 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 14) {
			if(i == 0 || i==15) {  			
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i+=1;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 5) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=20;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 10) {  			
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=25;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 26 || i==21) {  			
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=27;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 19) {
				JOptionPane.showMessageDialog(null, "P1, You won!");
				System.exit(0);
			}
			else if(i==22 || i == 27) {
				s="YutBoard1";
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=28;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else{
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				change_p1();
				i+=1;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();			 
			}
		}
		//'개'가 나왔을때 
		else if(15 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 49) {
			if(i==0 || i==15) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i+=2;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 5) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=21;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			   
			}
			else if(i == 10) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=26;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 19 || i== 18 || i == 28 || i == 29) {
				JOptionPane.showMessageDialog(null, "P1, You won!");
				System.exit(0);
			}
			else if(i==22 || i==27) {
				s="YutBoard1";
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=29;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i==25 || i==20) {
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=27;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else{
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				change_p1();
				i+=2;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			   
			}
		}
		else if(50 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 84) {
			if(i==0 || i==15) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i+=3;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 5) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=22;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 10) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=27;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 19 || i == 18 || i == 17 || i == 29 || i == 28 || i == 27 || i==22) {
				JOptionPane.showMessageDialog(null, "P1, You won!");
				System.exit(0);
			}
			else {
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				change_p1();
				i+=3;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();			    
			}
		}
		//'윷'이 나왔을때
		else if(85 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 97) {
			if(i == 0 || i==15) {  			
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i+=4;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 5) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=23;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 10) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=28;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 19 || i == 18 || i == 17 || i == 16 || i == 29 || i == 28 || i == 27 || i == 26 || i == 22) {
				JOptionPane.showMessageDialog(null, "P1, You won!");
				System.exit(0);
			}
			else if(i == 21) {
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=15;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();				
			}
			else {
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				change_p1();
				i+=4;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
		}
		//'모'가 나왔을때
		else if(98 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 99) {
			if(i == 0) {  			
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i+=5;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 5) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=24;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 10) {
				s="YutBoard1";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=29;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else if(i == 19 || i == 18 || i == 17 || i == 16 || i == 15 || i == 29 || i == 28 || i == 27 || i == 26 || i == 25 || i==22) {
				JOptionPane.showMessageDialog(null, "P1, You win!");
				System.exit(0);
			}
			else if(i==20) {
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				i=15;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			else {
				s="YutBoard2";
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
				boardPanel.add(board[i]);
				board[i].repaint();
				
				s="YutBoard2_p1";
				change_p1();
				i+=5;
				boardPanel.remove(board[i]);
				board[i] = new YutBoardPanel(i, setboard(i));
				board[i].setBounds(boardx.get(i),boardy.get(i) , 99, 99);
			    boardPanel.add(board[i]);
			    board[i].repaint();
			    boardPanel.repaint();
			}
			
		}
		breaken();
		Hunt();
	}
	
	//다음은 p2 메소드 
	public static void change2() {
		setpos();
		//'뒷도'가 나왔을때 
		if(0 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 3) {
			if(j==0) {
				JOptionPane.showMessageDialog(null, "P2, You won!");
				System.exit(0);
			}
			else if(j == 5) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=4;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 10) {  			
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=9;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 15) {  			
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=14;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j==20) {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=5;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j==22 || j==27) {
				s="YutBoard1";
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j-=1;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 23 || j==28) {  			
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=27;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j==28) {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j-=1;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j==25) {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=10;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j-=1;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
		}
		//'도'가 나왔을때 
		else if(4 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 14) {
			if(j == 0 || j==15) {  			
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j+=1;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 5) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=20;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 10) {  			
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=25;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 19) {
				JOptionPane.showMessageDialog(null, "P2, You won!");
				System.exit(0);
			}
			else if(j==22 || j==27) {
				s="YutBoard1";
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=28;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j==26 || j==21) {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=27;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else{
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				change_p2();
				j+=1;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();			 
			}
		}
		//'개'가 나왔을때 
		else if(15 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 49) {
			if(j==0 || j==15) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j+=2;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 5) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=21;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			   
			}
			else if(j == 10) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=26;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 19 || j== 18 || j == 28 || j == 29) {
				JOptionPane.showMessageDialog(null, "P2, You won!");
				System.exit(0);
			}
			else if(j==25 || j==20) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=27;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j==22 || j==27) {
				s="YutBoard1";
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=29;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else{
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				change_p2();
				j+=2;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			   
			}
		}
		//'걸'이 나왔을때 
		else if(50 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 84) {
			if(j==0 || j==15) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j+=3;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 5) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=22;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 10) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=27;
				boardPanel.remove(board[22]);
				boardPanel.remove(board[27]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 19 || j == 18 || j == 17 || j == 29 || j == 28 || j == 27 || j==22) {
				JOptionPane.showMessageDialog(null, "P2, You won!");
				System.exit(0);
			}
			else {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				change_p2();
				j+=3;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();			    
			}
		}
		//'윷'이 나왔을때 
		else if(85 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 97) {
			if(j == 0 || j==15) {  			
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j+=4;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 5) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=23;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 10) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=28;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 19 || j == 18 || j == 17 || j == 16 || j == 29 || j == 28 || j == 27 || j == 26 || j == 22) {
				JOptionPane.showMessageDialog(null, "P2, You won!");
				System.exit(0);
			}
			else if(j == 21) {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=15;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();				
			}
			else {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				change_p2();
				j+=4;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
		}
		//'모'가 나왔을때 
		else if(98 <= ThrowYutButton.randomYut && ThrowYutButton.randomYut <= 99) {
			if(j == 0) {  			
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j+=5;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 5) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=24;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 10) {
				s="YutBoard1";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=29;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else if(j == 19 || j == 18 || j == 17 || j == 16 || j == 15 || j == 29 || j == 28 || j == 27 || j == 26 || j == 25 || j==22) {
				JOptionPane.showMessageDialog(null, "P2, You won!");
				System.exit(0);
			}
			else if(j==20) {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				j=15;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			else {
				s="YutBoard2";
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
				boardPanel.add(board[j]);
				board[j].repaint();
				
				s="YutBoard2_p2";
				change_p2();
				j+=5;
				boardPanel.remove(board[j]);
				board[j] = new YutBoardPanel(j, setboard(j));
				board[j].setBounds(boardx.get(j),boardy.get(j) , 99, 99);
			    boardPanel.add(board[j]);
			    board[j].repaint();
			    boardPanel.repaint();
			}
			
		}
		breaken();
		Hunt2();
	}
	
	//전체 패널인 boardPanel에다가 윷놀이판 각각의 위치에 대응하는 panel을 넣어주는 메소드 
	public void boardAdd() {
		int i = 0;
		for(i=0;i<27;i++) {
			boardPanel.add(board[i]);
		}
		for(i=28;i<30;i++) {
			boardPanel.add(board[i]);
		}
	}
	
	//각각의 위치에 대응하는 panel에 이미지를 삽입하는 메소드 
	public void setImg() {
		int i = 0;	
		for(i=0;i<30;i++) {
			if(i==0||i==5||i==10||i==15||i==27||i==22) {
				s="YutBoard1";
				board[i] = new YutBoardPanel(i ,setboard(i));
			}
			else{
				s="YutBoard2";
				board[i] = new YutBoardPanel(i, setboard(i));
			}
		}		
	}
	
	//처음 보드가 만들어질때 각각의 위치를 입력해주는 메소 
	public void setBound() {
		int posX = 594, posY = 594;
		int i=0;
		board[i].setBounds(posX, posY, 99, 99);
	    posY -= 99;
	    
		for (i = 1; i < 5; i++) {
		    board[i].setBounds(posX, posY, 99, 99);
		    posY -= 99;
		}
		
		i=5;
	    board[i].setBounds(posX, posY, 99, 99);
	    posX = 495;
		
		for (i = 6; i < 10; i++) {
		    board[i].setBounds(posX, posY, 99, 99);
		    posX -= 99;
		    
		}
		
		i=10;
		board[i].setBounds(posX, posY, 99, 99);
	    posY = 198;
	    
	    
	    for (i = 11; i < 15; i++) {
		    board[i].setBounds(posX, posY, 99, 99);
		    posY += 99;
		    
		}
	    
	    i=15;
	    board[i].setBounds(posX, posY, 99, 99);
	    posX = 198;
	    
	    
	    for (i = 16; i < 20; i++) {
		    board[i].setBounds(posX, posY, 99, 99);
		    posX += 99;
		    
		}
	   
	   
	    i = 20;
	    posX = 495;
	    posY = 198;
	    board[i].setBounds(posX, posY, 99, 99);
	    
	    
	    i = 21;
	    posX -= 75;
	    posY += 75;
	    board[i].setBounds(posX, posY, 99, 99);
	    
	    i = 23;
	    posX -= 150;
	    posY += 150;
	    board[i].setBounds(posX, posY, 99, 99);
	    
	   
	    i = 24;
	    posX -= 75;
	    posY += 75;
	    board[i].setBounds(posX, posY, 99, 99);	    
	   
	    
	    posX = 198;
	    posY = 198;
	    
	    i = 25;
	    board[i].setBounds(posX, posY, 99, 99);
	    
	    
	    i = 26;
	    posX += 75;
	    posY += 75;
	    board[i].setBounds(posX, posY, 99, 99);
	   
	    i = 22;  //22는 어떻게 하지  
	    posX += 75;
	    posY += 75;
	    board[i].setBounds(posX, posY, 99, 99);
	    
	    i = 27;
	    board[i].setBounds(posX, posY, 99, 99);
	    
	    i = 28;
	    posX += 75;
	    posY += 75;
	    board[i].setBounds(posX, posY, 99, 99);
	    	    
	    i = 29;
	    posX += 75;
	    posY += 75;
	    board[i].setBounds(posX, posY, 99, 99);
	    
	}
	
	//p1이 특정위치에 올때 위치를 바꿔주는 메소드 
	public static void change_p1() {
		if(i==24) {
			i-=10;
		}
		else if(i==23) {
			if(14<ThrowYutButton.randomYut &&ThrowYutButton.randomYut<=99) {
				i-=10;
			}
		}
	}
	
	//p2가 특정위치에 올때 위치를 바꿔주는 메소
	public static void change_p2() {
		if(j==24) {
			j-=10;
		}
		else if(j==23) {
			if(14<ThrowYutButton.randomYut &&ThrowYutButton.randomYut<=99) {
				j-=10;
			}
		}
	}
	
	//말이 시작위치에 돌아왔을때 게임을 끝내는 메소드 
	public static void breaken() {
		if(i>=30) {
			JOptionPane.showMessageDialog(null, "P1, You won!");
			System.exit(0);
		}
		if(j>=30) {
			JOptionPane.showMessageDialog(null, "P2, You won!");
			System.exit(0);
		}
	}
	
	//p1말이 p2말을 잡았을 경우에 p2말을 시작위치로 보내는 메소드 
	public static void Hunt() {
		if(i==j) {
			j=0;
		}
	}
	
	//p2말이 p1말을 잡았을 경우에 p1말을 시작위치로 보내는 메소드 
	public static void Hunt2() {
		if(i==j) {
			i=0;
		}
	}
}
