package guiVoting;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class GUIVoting extends JFrame 
{
	boolean pres1 = false, pres2 = false, pres3 = false, vp1 = false, vp2 = false, vp3 = false, s1 = false, s2 = false, s3 = false, s4 = false
			, s5 = false, s6 = false;
	int senCount = 0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					GUIVoting frame = new GUIVoting();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIVoting() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel president1 = new JLabel("Red Normal Guy");
		president1.setLabelFor(president1);
		president1.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523153150.png")));
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		president1.setBorder(border);
		president1.setBounds(54, 97, 100, 100);
		contentPane.add(president1);
		
		JLabel president2 = new JLabel("Orange Cowboy");
		president2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		president2.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523153402.png")));
		president2.setBorder(border);
		president2.setBounds(189, 97, 100, 100);
		contentPane.add(president2);
		
		JLabel president3 = new JLabel("Yellow Angel");
		president3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		president3.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523153451.png")));
		president3.setBorder(border);
		president3.setBounds(318, 97, 100, 100);
		contentPane.add(president3);
		
		JLabel lblNewLabel = new JLabel("PRESIDENTS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(54, 55, 121, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblVicePresidents = new JLabel("VICE PRESIDENTS");
		lblVicePresidents.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVicePresidents.setBounds(54, 222, 197, 25);
		contentPane.add(lblVicePresidents);
		
		JLabel vice3 = new JLabel("Purple Duke");
		vice3.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523153820.png")));
		vice3.setBorder(border);
		vice3.setBounds(318, 264, 100, 100);
		contentPane.add(vice3);
		
		JLabel vice1 = new JLabel("Green Sir");
		vice1.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523153615.png")));
		vice1.setBorder(border);
		vice1.setBounds(54, 264, 100, 100);
		contentPane.add(vice1);
		
		JLabel vice2 = new JLabel("Cyan Business");
		vice2.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523153708.png")));
		vice2.setBorder(border);
		vice2.setBounds(189, 264, 100, 100);
		contentPane.add(vice2);
		
		JLabel lblNewLabel_1_1 = new JLabel("SENATORS");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(512, 55, 175, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel sen3 = new JLabel("Mr. Dark Green");
		sen3.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523154151.png")));
		sen3.setBorder(border);
		sen3.setBounds(776, 97, 100, 100);
		contentPane.add(sen3);
		
		JLabel sen1 = new JLabel("Mr. Brown");
		sen1.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523154109.png")));
		sen1.setBorder(border);
		sen1.setBounds(512, 97, 100, 100);
		contentPane.add(sen1);
		
		JLabel sen2 = new JLabel("Mr. Dark Pink");
		sen2.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523154124.png")));
		sen2.setBorder(border);
		sen2.setBounds(647, 97, 100, 100);
		contentPane.add(sen2);
		
		JLabel sen6 = new JLabel("Mr. Gray");
		sen6.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523154316.png")));
		sen6.setBorder(border);
		sen6.setBounds(776, 222, 100, 100);
		contentPane.add(sen6);
		
		JLabel sen4 = new JLabel("Mr. Dark Blue");
		sen4.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523154231.png")));
		sen4.setBorder(border);
		sen4.setBounds(512, 222, 100, 100);
		contentPane.add(sen4);
		
		JLabel sen5 = new JLabel("Mr. Maroon");
		sen5.setIcon(new ImageIcon(GUIVoting.class.getResource("/guiVoting/Untitled129_20220523154259.png")));
		sen5.setBorder(border);
		sen5.setBounds(647, 222, 100, 100);
		contentPane.add(sen5);
		
		JButton btnNewButton = new JButton("Submit Vote");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(357, 399, 209, 59);
		contentPane.add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(20, 478, 856, 79);
		contentPane.add(textPane);
		
		Border border_selected = BorderFactory.createLineBorder(Color.YELLOW, 3);
		
		president1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (pres1)
				{
					president1.setBorder(border);
					pres1 = false;
				}
				else if (!pres2 && !pres3)
				{
					president1.setBorder(border_selected);
					pres1 = true;
				}
			}
		});
		president2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (pres2)
				{
					president2.setBorder(border);
					pres2 = false;
				}
				else if (!pres1 && !pres3)
				{
					president2.setBorder(border_selected);
					pres2 = true;
				}
			}
		});
		president3.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (pres3)
				{
					president3.setBorder(border);
					pres3 = false;
				}
				else if (!pres1 && !pres2)
				{
					president3.setBorder(border_selected);
					pres3 = true;
				}
			}
		});
		vice1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (vp1)
				{
					vice1.setBorder(border);
					vp1 = false;
				}
				else if (!vp2 && !vp3)
				{
					vice1.setBorder(border_selected);
					vp1 = true;
				}
			}
		});
		vice2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (vp2)
				{
					vice2.setBorder(border);
					vp2 = false;
				}
				else if (!vp1 && !vp3)
				{
					vice2.setBorder(border_selected);
					vp2 = true;
				}
			}
		});
		vice3.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (vp3)
				{
					vice3.setBorder(border);
					vp3 = false;
				}
				else if (!vp1 && !vp2)
				{
					vice3.setBorder(border_selected);
					vp3 = true;
				}
			}
		});
		sen1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (s1)
				{
					sen1.setBorder(border);
					s1 = false;
					senCount -= 1;
				}
				else if (senCount < 3)
				{
					sen1.setBorder(border_selected);
					s1 = true;
					senCount += 1;
				}
			}
		});
		sen2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (s2)
				{
					sen2.setBorder(border);
					s2 = false;
					senCount-=1;
				}
				else if (senCount < 3)
				{
					sen2.setBorder(border_selected);
					s2 = true;
					senCount += 1;
				}
			}
		});
		sen3.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (s3)
				{
					sen3.setBorder(border);
					s3 = false;
					senCount-=1;
				}
				else if (senCount < 3)
				{
					sen3.setBorder(border_selected);
					s3 = true;
					senCount += 1;
				}
			}
		});
		sen4.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (s4)
				{
					sen4.setBorder(border);
					s4 = false;
					senCount-=1;
				}
				else if (senCount < 3)
				{
					sen4.setBorder(border_selected);
					s4 = true;
					senCount += 1;
				}
			}
		});
		sen5.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (s5)
				{
					sen5.setBorder(border);
					s5 = false;
					senCount -= 1;
				}
				else if (senCount < 3)
				{
					sen5.setBorder(border_selected);
					s5 = true;
					senCount += 1;
				}
			}
		});
		sen6.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (s6)
				{
					sen6.setBorder(border);
					s6 = false;
					senCount -= 1;
				}
				else if (senCount < 3)
				{
					sen6.setBorder(border_selected);
					s6 = true;
					senCount += 1;
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String vote = "THANKS FOR VOTING\n";
				String pres = "Voted President: ";
				if (pres1)
				{
					pres += president1.getText();
				}
				else if (pres2)
				{
					pres += president2.getText();
				}
				else if (pres3)
				{
					pres += president3.getText();
				}
				pres += "\n";
				
				String vp = "Voted Vice President: ";
				if (vp1)
				{
					vp += vice1.getText();
				}
				else if (vp2)
				{
					vp += vice2.getText();
				}
				else if (vp3)
				{
					vp += vice3.getText();
				}
				vp += "\n";
				String senator = "Voted Senators: ";
				if (s1)
				{
					senator += sen1.getText() + ", ";
				}
				if (s2)
				{
					senator += sen2.getText() + ", ";
				}
				if (s3)
				{
					senator += sen3.getText() + ", ";
				}
				if (s4)
				{
					senator += sen4.getText() + ", ";
				}
				if (s5)
				{
					senator += sen5.getText() + ", ";
				}
				if (s6)
				{
					senator += sen6.getText() + ", ";
				}
				senator += "\n";
				textPane.setText(vote + pres + vp + senator);
			}
		});
	}
}
