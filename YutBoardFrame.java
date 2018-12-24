package yut_game;

import java.awt.*;
import javax.swing.*;

public class YutBoardFrame extends JFrame {
	
	public YutBoardFrame(JPanel boardPanel, DownPanel d) {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(boardPanel, BorderLayout.CENTER);
		cp.add(d, BorderLayout.SOUTH);
		cp.setBackground(Color.WHITE);
		
		setTitle("윷놀이");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
