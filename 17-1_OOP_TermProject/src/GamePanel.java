import java.awt.*;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class GamePanel extends JPanel implements Variable {
	static JPanel gPanel;
	static JLabel gLabel; // 임시로 만들어둠
	
	static JLabel  stageTitleLabel;
	static JPanel  stageExplPanel;
	static JLabel  stageExplLabel;
	
	EtchedBorder border = new EtchedBorder(EtchedBorder.RAISED);
	
	// form
	public GamePanel(int stage, String gametitle ) {
		super();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLayout(null);
		/*
		 * sub panel
		 */
		JPanel subPanel	= new JPanel();
		subPanel.setSize(GAME_PANEL_WIDTH, GAME_PANEL_HEIGHT);
		subPanel.setLocation(FRAME_WIDTH-GAME_PANEL_WIDTH-35, FRAME_HEIGHT-GAME_PANEL_HEIGHT-70);
		subPanel.setLayout(null);
		subPanel.setBorder(border);
		
		/* stage num ********************** */
		JLabel  stageNumLabel = new JLabel();
		stageNumLabel.setText("STAGE " + stage);
		stageNumLabel.setSize(300, 50);
		stageNumLabel.setLocation(25, 10);
		stageNumLabel.setBorder(border);
		/* stage title ******************** */
		stageTitleLabel = new JLabel();
		stageTitleLabel.setText(gametitle);
		stageTitleLabel.setSize(300, 50);
		stageTitleLabel.setLocation(25, 60);
		stageTitleLabel.setBorder(border);
		/* explanation label ************** */
		stageExplLabel = new JLabel();
		stageExplLabel.setText("게임 설명 등등");
		stageExplLabel.setSize(250, 280);
		stageExplLabel.setLocation(25, 10);
		stageExplLabel.setBorder(border);
		/* start button ******************* */
		JButton start = new JButton();
		start.setText("START");
		start.setSize(250, 50);
		start.setLocation(25, 300);
		/* explanation panel ************** */
		stageExplPanel = new JPanel();
		stageExplPanel.setSize(300, 370);
		stageExplPanel.setLocation(25, 110);
		stageExplPanel.setLayout(null);
		stageExplPanel.setBorder(border);
		stageExplPanel.add(stageExplLabel);
		stageExplPanel.add(start);
		
		subPanel.add(stageNumLabel);
		subPanel.add(stageTitleLabel);
		subPanel.add(stageExplPanel);
		
		this.add(subPanel);
		
		/*
		 * game_main panel
		 */
		JPanel mainPanel = new JPanel();
		mainPanel.setSize(GAME_PANEL_WIDTH, GAME_PANEL_HEIGHT);
		mainPanel.setLocation(30, FRAME_HEIGHT-GAME_PANEL_HEIGHT-70);
		mainPanel.setLayout(null);
		mainPanel.setBorder(border);
		
		gPanel = new JPanel();
		gLabel = new JLabel();
		gLabel.setSize(300, 100);
		gLabel.setLocation(25, 25);
		
		mainPanel.add(gPanel);
		mainPanel.add(gLabel);
		
		this.add(mainPanel);
	}
	
	/*
	 * 
	 */
	public Component GamePanel1() {
		GamePanel gp1 = new GamePanel(1, "테트리스");
		gLabel.setText("테트리스 들어갈 공간");
		return gp1;
	}
	
	public Component GamePanel2() {
		GamePanel gp2 = new GamePanel(2, "조약돌 건너기");
		gLabel.setText("조약돌 건너기 들어갈 공간");
		return gp2;
	}
	
	public Component GamePanel3() {
		GamePanel gp3 = new GamePanel(3, "지폐를 주워라!");
		gLabel.setText("지폐를 주워라 들어갈 공간");
		return gp3;
	}
	
	public Component GamePanel4() {
		GamePanel gp4 = new GamePanel(4, "눈을 피하라!");
		gLabel.setText("눈을 피하라 들어갈 공간");
		return gp4;
	}
}