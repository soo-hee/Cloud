import javax.swing.*;

public class MainPanel extends StoryPanel {

	public MainPanel() {
		super();
		
		JLabel mainLabel = new JLabel();
		
		mainLabel.setSize(STORY_LABEL_WIDTH, STORY_LABEL_HEIGHT);
		super.label.setText("메인 화면");
		this.add(mainLabel);
	}
	
}	