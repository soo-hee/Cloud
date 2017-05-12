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
		label.setText("���丮 ���� �Է�");
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
		label.setText("�б��� �� ������, ������ �������� ������ ���� ������ �������� �Ѵ�.");
		return sp1;
	}
	
	public Component StoryPanel2() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("2����");
		return sp1;
	}
	
	public Component StoryPanel3() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("3����");
		return sp1;
	}
	
	public Component StoryPanel4() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("4����");
		return sp1;
	}
	
	public Component failPanel() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("����");
		button.setText("Return!");
		return sp1;
	}
	
	public Component clearPanel() {
		StoryPanel sp1 = new StoryPanel();
		label.setText("Ŭ����");
		button.setText("ó������");
		return sp1;
	}
}