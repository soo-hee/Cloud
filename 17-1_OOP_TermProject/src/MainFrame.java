import javax.swing.*;

public class MainFrame implements Variable  {

	public MainFrame() {
		JFrame jf = new JFrame("눈송아, 집에 가자!");
		
		jf.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		//jf.add(new MainPanel());
		jf.add(new StoryPanel().StoryPanel1());
		//jf.add(new StoryPanel().StoryPanel2());
		//jf.add(new StoryPanel().StoryPanel3());
		//jf.add(new StoryPanel().StoryPanel4());
		//jf.add(new StoryPanel().failPanel());
		//jf.add(new StoryPanel().clearPanel());
		//jf.add(new GamePanel(0, null).GamePanel1());
		//jf.add(new GamePanel(0, null).GamePanel2());
		//jf.add(new GamePanel(0, null).GamePanel3());
		//jf.add(new GamePanel(0, null).GamePanel4());
		jf.setVisible(true);

	}
}
