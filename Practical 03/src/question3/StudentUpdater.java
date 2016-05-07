package question3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class StudentUpdater extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3235118938505575600L;
	private JPanel contentPane;
	private JTextField nameField;
	private JTextField birthField;
	private JTextField test1Field;
	private JTextField test2Field;
	private JTextField test3Field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentUpdater frame = new StudentUpdater();
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
	public StudentUpdater() {
		FileController f1 = new FileController("testing.txt");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAdminNo = new JLabel("Admin No:");
		lblAdminNo.setBounds(29, 24, 74, 14);
		contentPane.add(lblAdminNo);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(145, 21, 95, 20);
		contentPane.add(comboBox);
		comboBox.addItem("");
		ArrayList<Student> recsReturn=Student.readStudent("testing.txt");
		for(int i=0;i<recsReturn.size();i++ ){
			comboBox.addItem(recsReturn.get(i).getAdminNo());
		}
		comboBox.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<recsReturn.size();i++){
					if(comboBox.getSelectedItem().equals(recsReturn.get(i).getAdminNo())){
						nameField.setText(recsReturn.get(i).getName());
						birthField.setText(Student.formatDate(recsReturn.get(i).getBirthDate()));
						test1Field.setText(Integer.toString(recsReturn.get(i).getTest1()));
						test2Field.setText(Integer.toString(recsReturn.get(i).getTest2()));
						test3Field.setText(Integer.toString(recsReturn.get(i).getTest3()));
					}
					else if(comboBox.getSelectedItem().equals("")){
						nameField.setText("");
						birthField.setText("");
						test1Field.setText("");
						test2Field.setText("");
						test3Field.setText("");
					}
				}
			}
		});

		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(29, 50, 46, 14);
		contentPane.add(lblName);


		nameField = new JTextField();
		nameField.setBounds(145, 47, 95, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);

		JLabel lblBirthdate = new JLabel("BirthDate:");
		lblBirthdate.setBounds(29, 75, 74, 14);
		contentPane.add(lblBirthdate);

		birthField = new JTextField();
		birthField.setBounds(145, 72, 95, 20);
		contentPane.add(birthField);
		birthField.setColumns(10);

		JLabel lblTest_1 = new JLabel("Test 1");
		lblTest_1.setBounds(29, 102, 46, 14);
		contentPane.add(lblTest_1);

		test1Field = new JTextField();
		test1Field.setBounds(145, 99, 95, 20);
		contentPane.add(test1Field);
		test1Field.setColumns(10);

		JLabel lblTest_2 = new JLabel("Test 2");
		lblTest_2.setBounds(29, 127, 46, 14);
		contentPane.add(lblTest_2);

		test2Field = new JTextField();
		test2Field.setBounds(145, 124, 95, 20);
		contentPane.add(test2Field);
		test2Field.setColumns(10);

		JLabel lblTest_3 = new JLabel("Test 3");
		lblTest_3.setBounds(29, 152, 46, 14);
		contentPane.add(lblTest_3);


		test3Field = new JTextField();
		test3Field.setBounds(145, 149, 95, 20);
		contentPane.add(test3Field);
		test3Field.setColumns(10);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(38, 200, 89, 23);
		contentPane.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("")){
				JOptionPane.showMessageDialog(null, "Please Select a Student Record");
				}else{
				for(int i=0;i<recsReturn.size();i++){
					Student s = new Student();
					s.setAdminNo(comboBox.getSelectedItem().toString());
					s.setName(nameField.getText());
					s.setBirthDate(Student.convertDate(birthField.getText()));
					s.setTest1(Integer.parseInt(test1Field.getText()));
					s.setTest2(Integer.parseInt(test2Field.getText()));
					s.setTest3(Integer.parseInt(test3Field.getText()));
					System.out.println(s.getAdminNo());
					if(comboBox.getSelectedItem().equals(recsReturn.get(i).getAdminNo())){
						recsReturn.set(i,s);	
						f1.writeObject(recsReturn);
					}
				}
				JOptionPane.showMessageDialog(null, "Record has been updated");
			}
			}
		});

					JButton btnExit = new JButton("Exit");
					btnExit.setBounds(174, 200, 89, 23);
					contentPane.add(btnExit);
					btnExit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							 System.exit(0);
						}
					});
	}
}
