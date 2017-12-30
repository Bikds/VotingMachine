/**
 * Implements a program with a pie chart
 * that shows interactive polling results for three candidates
 * May 25, 2017
 * @author BikDS
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Poll extends JFrame
{

	private static final long serialVersionUID = 1L;

public Poll()
  {
    super("Vote for PRob, BThom, or KMoni");

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    PollDisplayPanel chart = new PollDisplayPanel("PRob", "BThom", "KMoni");
    PollControlPanel controls = new PollControlPanel(chart);
    c.add(chart, BorderLayout.CENTER);
    c.add(controls, BorderLayout.SOUTH);
    
  }

  public static void main(String[] args)
  {
	// creates the window for the poll
    Poll w = new Poll();
    w.setBounds(300, 300, 400, 400);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

