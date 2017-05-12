import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class StoryPanel extends JPanel implements Variable {
	static JLabel	label;
	static JButton	button;
	
	EtchedBorder 	border = new EtchedBorder(EtchedBorder.RAISED);

	// form
	public StoryPanel() {
		super();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLayout(null);
		
		label = new JLabel();
		label.setSize(STORY_LABEL_WIDTH, STORY_LABEL_HEIGHT);
		label.setText("스토리 내용 입력");
		label.setBorder(border);
		label.setLocation(STORY_LABEL_WIDTH/6, STORY_LABEL_HEIGHT/5);
		add(label);
		
		button = new JButton();
		button.setText("GO!");
		button.setSize(80, 30);
		button.setLocation(680, 510);
		add(button);
	}
	
	/*
	 * 
	 */
	public Component StoryPanel1() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("학교에 온 눈송이, 윤용익 교수님의 수업을 통해 지식을 쌓으려고 한다.");
		return sp1;
	}
	
	public Component StoryPanel2() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("2번쨰");
		return sp1;
	}
	
	public Component StoryPanel3() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("3번쨰");
		return sp1;
	}
	
	public Component StoryPanel4() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("4번쨰");
		return sp1;
	}
	
	public Component failPanel() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("실패");
		button.setText("Return!");
		return sp1;
	}
	
	public Component clearPanel() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("클리어");
		button.setText("처음으로");
		return sp1;
	}
}