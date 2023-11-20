package newGUIEdic;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GGUIframe extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JRadioButton rdbtnNewRadioButton_1;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GGUIframe frame = new GGUIframe();
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
	public GGUIframe() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 541);
		contentPane = new JPanel();
		contentPane.setEnabled(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(400, 68, 243, 13);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox<Object>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setEnabled(false);
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		comboBox.setBounds(211, 48, 55, 37);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Happy");
		rdbtnNewRadioButton.setEnabled(false);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(52, 151, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Neutral");
		rdbtnNewRadioButton_1.setEnabled(false);
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(52, 172, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Sad");
		rdbtnNewRadioButton_2.setEnabled(false);
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(52, 195, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(406, 116, 376, 302);
		contentPane.add(textArea);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Male");
		chckbxNewCheckBox.setEnabled(false);
		buttonGroup_1.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBounds(52, 244, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Female");
		chckbxNewCheckBox_1.setEnabled(false);
		buttonGroup_1.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setBounds(52, 269, 93, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Neither");
		chckbxNewCheckBox_2.setEnabled(false);
		buttonGroup_1.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setBounds(52, 292, 93, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(25, 333, 208, 85);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JList list = new JList();
		list.setEnabled(false);
		list.setName("help");
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Student", "Teacher", "Parent", "None"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(0);
		list.setBounds(200, 121, 151, 173);
		contentPane.add(list);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(276, 48, 55, 37);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				lblNewLabel.setText("Marianne Edic");
				comboBox.setEnabled(true);
				rdbtnNewRadioButton.setEnabled(false);
				rdbtnNewRadioButton_1.setEnabled(false);
				rdbtnNewRadioButton_2.setEnabled(false);
				chckbxNewCheckBox.setEnabled(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				comboBox.setEnabled(false);
				comboBox_1.setEnabled(false);
				textField.setEnabled(false);
				list.setEnabled(false);
				
				String s = "Date: " + comboBox.getSelectedItem() + " " + comboBox_1.getSelectedItem(); 
				String a = "Info: (" + list.getSelectedValue() + ") " + textField.getText();
				String n = "Gender/s: ", d = "";
				if(chckbxNewCheckBox.isSelected())
				{
					n += chckbxNewCheckBox.getText();
				}
				if(chckbxNewCheckBox_1.isSelected())
				{
					n += chckbxNewCheckBox.getText();
				}
				if(chckbxNewCheckBox_2.isSelected())
				{
					n += chckbxNewCheckBox.getText();
				}
				if(rdbtnNewRadioButton.isSelected())
				{
					d = "Mood: " + rdbtnNewRadioButton.getText();
				}
				else if(rdbtnNewRadioButton_1.isSelected())
				{
					d = "Mood: " + rdbtnNewRadioButton_1.getText();
				}
				else if(rdbtnNewRadioButton_2.isSelected())
				{
					d = "Mood: " + rdbtnNewRadioButton_2.getText();
				}
				String output = s + "\n" + a + "\n" + n + "\n" + d;
				textArea.setText(output);
			}
		});
		btnNewButton_2.setBounds(39, 428, 116, 44);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				lblNewLabel.setText("INPUT");
				comboBox.setEnabled(true);
				rdbtnNewRadioButton.setEnabled(true);
				rdbtnNewRadioButton_1.setEnabled(true);
				rdbtnNewRadioButton_2.setEnabled(true);
				chckbxNewCheckBox.setEnabled(true);
				chckbxNewCheckBox_1.setEnabled(true);
				chckbxNewCheckBox_2.setEnabled(true);
				btnNewButton_2.setEnabled(true);
				comboBox.setEnabled(true);
				comboBox_1.setEnabled(true);
				textField.setEnabled(true);
				list.setEnabled(true);
			}
		});
		btnNewButton.setBounds(25, 37, 112, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("");
				textArea.setText("");
				comboBox.setSelectedIndex(-1);
				comboBox_1.setSelectedIndex(-1);
				list.setSelectedIndex(-1);
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				btnNewButton_2.setSelected(false);
			}
		});
		btnNewButton_1.setBounds(25, 91, 112, 44);
		contentPane.add(btnNewButton_1);	
	}
}
