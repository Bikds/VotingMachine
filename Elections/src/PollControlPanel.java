/**
 * The control panel for the Poll program
 * May 25, 2017
 * @author BikDS
 */

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PollControlPanel extends JPanel
                          implements ActionListener
{

private static final long serialVersionUID = 1L;
private JButton button1, button2, button3;
private PollDisplayPanel chartPanel;

  public PollControlPanel(PollDisplayPanel chart)
  {
    chartPanel = chart;
    
    // sets the icon for voting for PRob
    button1 = new JButton("PRob");
    button1.setPreferredSize(new Dimension(80, 30));
    button1.setToolTipText("Vote for PRob");
    button1.addActionListener(this);
    
    // sets the icon for voting for BThom
    button2 = new JButton("BThom");
    button2.setPreferredSize(new Dimension(80, 30));
    button2.setToolTipText("Vote for BThom");
    button2.addActionListener(this);
    
    // sets the icon for voting for KMoni
    button3 = new JButton("KMoni");
    button3.setPreferredSize(new Dimension(80, 30));
    button3.setToolTipText("Vote for KMoni");
    button3.addActionListener(this);

    add(button1);
    add(button2);
    add(button3);
  }

  /**
   * Processes button events
   */
  public void actionPerformed(ActionEvent e)
  {
    JButton button = (JButton)e.getSource();

    if (button == button1)
      chartPanel.vote1();
    else if (button == button2)
      chartPanel.vote2();
    else if (button == button3)
      chartPanel.vote3();
    chartPanel.repaint();
    //counts the vote once a vote has been cast
  }
}
