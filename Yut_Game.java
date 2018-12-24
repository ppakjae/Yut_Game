package yut_game;

import javax.swing.JPanel;

public class Yut_Game {
	public static void main(String[] args) {
		YutBoardPanel p = new YutBoardPanel(0, null);
		DownPanel d = new DownPanel();
		YutBoardFrame f = new YutBoardFrame(p.boardPanel, d);
	}
}