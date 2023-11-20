package guiregistration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class GUIRegistration extends JFrame 
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private String output = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRegistration frame = new GUIRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1133, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(22, 20, 57, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(22, 39, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMi = new JLabel("M.I.");
		lblMi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMi.setBounds(118, 20, 37, 13);
		contentPane.add(lblMi);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 39, 37, 24);
		contentPane.add(textField_1);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLastName.setBounds(165, 20, 57, 13);
		contentPane.add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(165, 39, 86, 24);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Month");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(22, 76, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		comboBox.setBounds(22, 93, 86, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Day");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(115, 76, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(115, 93, 40, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Year");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(165, 76, 45, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990"}));
		comboBox_2.setBounds(165, 93, 86, 21);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(22, 124, 57, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Civil Status");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(153, 124, 69, 13);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(22, 143, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(22, 166, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Unknown");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(22, 189, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Single");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBounds(148, 143, 103, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Married");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_4.setBounds(148, 166, 103, 21);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Separated");
		buttonGroup_1.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_5.setBounds(148, 190, 103, 21);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Widow");
		buttonGroup_1.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_6.setBounds(148, 213, 103, 21);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JLabel lblNewLabel_4 = new JLabel("Contact #");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(21, 231, 69, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(22, 247, 152, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Address");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(22, 272, 69, 13);
		contentPane.add(lblNewLabel_4_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(23, 288, 152, 21);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_5 = new JLabel("Skills");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(22, 319, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programming");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(22, 335, 103, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Hardware");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setBounds(22, 358, 93, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Design");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_2.setBounds(22, 381, 93, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Animation");
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_3.setBounds(148, 336, 93, 21);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Video");
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_4.setBounds(148, 358, 93, 21);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Gaming");
		chckbxNewCheckBox_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_5.setBounds(148, 381, 93, 21);
		contentPane.add(chckbxNewCheckBox_5);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(262, 20, 857, 429);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int age = 2022 - Integer.parseInt(comboBox_2.getSelectedItem().toString());
				String gender = "N/A";
				if (rdbtnNewRadioButton.isSelected())
				{
					gender = rdbtnNewRadioButton.getText();
				}
				else if (rdbtnNewRadioButton_1.isSelected())
				{
					gender = rdbtnNewRadioButton_1.getText();
				}
				else if (rdbtnNewRadioButton_2.isSelected())
				{
					gender = rdbtnNewRadioButton_2.getText();
				}
				String civstat = "N/A";
				if (rdbtnNewRadioButton_3.isSelected())
				{
					civstat = rdbtnNewRadioButton_3.getText();
				}
				else if (rdbtnNewRadioButton_4.isSelected())
				{
					civstat = rdbtnNewRadioButton_4.getText();
				}
				else if (rdbtnNewRadioButton_5.isSelected())
				{
					civstat = rdbtnNewRadioButton_5.getText();
				}
				else if (rdbtnNewRadioButton_6.isSelected())
				{
					civstat = rdbtnNewRadioButton_6.getText();
				}
				String skills = "";
				if (chckbxNewCheckBox.isSelected())
				{
					skills += chckbxNewCheckBox.getText() + ", ";
				}
				if (chckbxNewCheckBox_1.isSelected())
				{
					skills += chckbxNewCheckBox_1.getText() + ", ";
				}
				if (chckbxNewCheckBox_2.isSelected())
				{
					skills += chckbxNewCheckBox_2.getText() + ", ";
				}
				if (chckbxNewCheckBox_3.isSelected())
				{
					skills += chckbxNewCheckBox_3.getText() + ", ";
				}
				if (chckbxNewCheckBox_4.isSelected())
				{
					skills += chckbxNewCheckBox_4.getText() + ", ";
				}
				if (chckbxNewCheckBox_5.isSelected())
				{
					skills += chckbxNewCheckBox_5.getText() + ", ";
				}
				output += "Name: " + textField_2.getText() + ", " + textField.getText() + " " + textField_1.getText() + "/"
						+ "Age: " + age + "/Gender: " + gender + "/Status: " + civstat + "/Contact #: " + textField_3.getText() + "/Add: " 
						+ textField_4.getText() + "/Skills: " + skills + "\n";
				textPane.setText(output);
			}	
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(40, 408, 182, 30);
		contentPane.add(btnNewButton);
	}
}
