import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class CourseRegistration {

    int studentId;
    String studentName;
    String courseName;
    String semester;

    CourseRegistration(int studentId, String studentName,
                       String courseName, String semester) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.semester = semester;
    }

    public String toString() {

        return "ID: " + studentId +
               ", Name: " + studentName +
               ", Course: " + courseName +
               ", Semester: " + semester;
    }
}

public class CourseRegistrationAWT extends Frame
        implements ActionListener {

    Label lblId, lblName, lblCourse, lblSemester;

    TextField txtId, txtName, txtCourse, txtSemester;

    Button btnAdd, btnUpdate, btnDelete, btnClear;

    TextArea displayArea;

    ArrayList<CourseRegistration> registrations;

    CourseRegistrationAWT() {

        registrations = new ArrayList<>();

        setTitle("Course Registration System");
        setSize(600, 500);
        setLayout(null);

        // Labels
        lblId = new Label("Student ID");
        lblName = new Label("Student Name");
        lblCourse = new Label("Course Name");
        lblSemester = new Label("Semester");

        // TextFields
        txtId = new TextField();
        txtName = new TextField();
        txtCourse = new TextField();
        txtSemester = new TextField();

        // Buttons
        btnAdd = new Button("Add");
        btnUpdate = new Button("Update");
        btnDelete = new Button("Delete");
        btnClear = new Button("Clear");

        // TextArea
        displayArea = new TextArea();

        // Set Bounds
        lblId.setBounds(50, 50, 100, 30);
        txtId.setBounds(180, 50, 200, 30);

        lblName.setBounds(50, 100, 100, 30);
        txtName.setBounds(180, 100, 200, 30);

        lblCourse.setBounds(50, 150, 100, 30);
        txtCourse.setBounds(180, 150, 200, 30);

        lblSemester.setBounds(50, 200, 100, 30);
        txtSemester.setBounds(180, 200, 200, 30);

        btnAdd.setBounds(50, 260, 80, 40);
        btnUpdate.setBounds(150, 260, 80, 40);
        btnDelete.setBounds(250, 260, 80, 40);
        btnClear.setBounds(350, 260, 80, 40);

        displayArea.setBounds(50, 330, 500, 120);

        // Add Components
        add(lblId);
        add(txtId);

        add(lblName);
        add(txtName);

        add(lblCourse);
        add(txtCourse);

        add(lblSemester);
        add(txtSemester);

        add(btnAdd);
        add(btnUpdate);
        add(btnDelete);
        add(btnClear);

        add(displayArea);

        // Action Listeners
        btnAdd.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnClear.addActionListener(this);

        // Window Closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Display Records
    void displayRecords() {

        displayArea.setText("");

        for (CourseRegistration r : registrations) {
            displayArea.append(r.toString() + "\n");
        }
    }

    // Clear Fields
    void clearFields() {

        txtId.setText("");
        txtName.setText("");
        txtCourse.setText("");
        txtSemester.setText("");
    }

    // Button Actions
    public void actionPerformed(ActionEvent e) {

        String idText = txtId.getText();
        String name = txtName.getText();
        String course = txtCourse.getText();
        String semester = txtSemester.getText();

        // Validation
        if (idText.isEmpty() || name.isEmpty()
                || course.isEmpty() || semester.isEmpty()) {

            displayArea.setText("Please fill all fields!");
            return;
        }

        int id = Integer.parseInt(idText);

        // Add
        if (e.getSource() == btnAdd) {

            registrations.add(
                new CourseRegistration(id, name, course, semester)
            );

            displayRecords();
            clearFields();
        }

        // Update
        else if (e.getSource() == btnUpdate) {

            for (CourseRegistration r : registrations) {

                if (r.studentId == id) {

                    r.studentName = name;
                    r.courseName = course;
                    r.semester = semester;

                    break;
                }
            }

            displayRecords();
            clearFields();
        }

        // Delete
        else if (e.getSource() == btnDelete) {

            registrations.removeIf(r -> r.studentId == id);

            displayRecords();
            clearFields();
        }

        // Clear
        else if (e.getSource() == btnClear) {

            clearFields();
        }
    }

    // Main Method
    public static void main(String[] args) {

        new CourseRegistrationAWT();
    }
        }
