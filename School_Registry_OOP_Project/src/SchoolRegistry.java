import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SchoolRegistry {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolRegistry window = new SchoolRegistry();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SchoolRegistry() {
		initialize();
	}
   
	private String[] header= {"Name","Age","Gender","Grade","Salary","Type"};
	private DefaultTableModel dtm=new DefaultTableModel(null,header);
	private JTextField teacherName;
	private JTextField teacherAge;
	private JTextField teacherSalary;
	private JTextField studentName;
	private JTextField studentAge;
	private JTextField studentGrade;
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTable table=new JTable(dtm);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		
		JLabel TeacherLabel = new JLabel("Teacher Infromation");
		TeacherLabel.setForeground(Color.BLUE);
		TeacherLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		teacherName = new JTextField();
		teacherName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Age:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		teacherAge = new JTextField();
		teacherAge.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Salary:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		teacherSalary = new JTextField();
		teacherSalary.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Gender:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton teacherMale = new JRadioButton("Male");
		
		JRadioButton teacherFemale = new JRadioButton("Female");
		
		JButton teacherBtn = new JButton("Add");
		teacherBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(teacherMale.isSelected()) {
					addTeacher("Male");
				}
				else if(teacherFemale.isSelected()) {
					addTeacher("Female");
				}
			
			}
		});
		teacherBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		
		JLabel StudentLabel = new JLabel("Student Information");
		StudentLabel.setForeground(Color.BLUE);
		StudentLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_1_2 = new JLabel("Age:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Grade:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Gender:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton studentMale = new JRadioButton("Male");
		
		studentName = new JTextField();
		studentName.setColumns(10);
		
		studentAge = new JTextField();
		studentAge.setColumns(10);
		
		studentGrade = new JTextField();
		studentGrade.setColumns(10);
		
		JRadioButton studentFemale = new JRadioButton("Female");
		
		JButton studentBtn = new JButton("Add");
		studentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(studentMale.isSelected()) {
					addStudent("Male");
				}
				else if(studentFemale.isSelected()) {
					addStudent("Female");
				}
			}
		});
		studentBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 173, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(StudentLabel)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1_1_2)
										.addComponent(lblNewLabel_1_1_1_1))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(studentMale)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(studentName, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
												.addComponent(studentAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addComponent(studentGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(studentFemale, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(57)
							.addComponent(studentBtn)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 561, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(StudentLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(studentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(studentAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(studentGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(studentMale))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(studentFemale)
					.addGap(18)
					.addComponent(studentBtn)
					.addContainerGap(327, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(TeacherLabel)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1_1)
										.addComponent(lblNewLabel_1_1_1))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(teacherMale)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(teacherName, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
												.addComponent(teacherAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addComponent(teacherSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(teacherFemale, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(57)
							.addComponent(teacherBtn))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(TeacherLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(teacherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(teacherAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(teacherSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(teacherMale))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(teacherFemale)
					.addGap(18)
					.addComponent(teacherBtn)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 561, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	public void addTeacher(String gender) {
		Teacher teacher=new Teacher();
		teacher.setName(teacherName.getText());
		teacher.setAge(Integer.parseInt(teacherAge.getText()));
		teacher.setSalary(Integer.parseInt(teacherSalary.getText()));
		teacher.setGender(gender);
		
		dtm.addRow(new Object[] {
				teacher.getName(),
				teacher.getAge(),
				teacher.getGender(),
				"N/A",
				teacher.getSalary(),
				teacher.myType()
				});
	}
	
	public void addStudent(String gender) {
		Student student=new Student();
		student.setName(studentName.getText());
		student.setAge(Integer.parseInt(studentAge.getText()));
		student.setGrade(Integer.parseInt(studentGrade.getText()));
		student.setGender(gender);
		
		dtm.addRow(new Object[] {
				student.getName(),
				student.getAge(),
				student.getGender(),
				student.getGrade(),
			    "N/A",
				student.myType()
				});
	}
	
}
