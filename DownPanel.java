package yut_game;

import javax.swing.*;
import java.awt.*;

public class DownPanel extends JPanel {
	//P1,P2를 담을 JLabel
	public static JLabel p = new JLabel("P1");
	
	//맨아래 버튼 및 p1,p2이 담겨있 패널
	public DownPanel(){
		add(p, BorderLayout.WEST);
		ThrowYutButton btn = new ThrowYutButton();
		btn.ThrowYutButton("윷 던지기");
		add(btn);
	}
	
	//p1,p2를 받아오는 메소드 
	public static String get_P() {
		return p.getText(); 
	}
	//p1,p2를 입력하는 메소드 
	public static void set_P(String s) {
		p.setText(s);
	}
}