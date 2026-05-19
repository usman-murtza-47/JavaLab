import java.util.ArrayList;
import java.util.Scanner;

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

    void display() {

        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name : " + courseName);
        System.out.println("Semester : " + semester);
    }
}

public class CourseRegistrationSystem {

    static ArrayList<CourseRegistration> registrations = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addRegistration() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Semester: ");
        String semester = sc.nextLine();

        registrations.add(
            new CourseRegistration(id, name, course, semester)
        );

        System.out.println("Registration Added Successfully!");
    }

    static void viewRegistrations() {

        if (registrations.isEmpty()) {
            System.out.println("No Records Found!");
            return;
        }

        for (CourseRegistration r : registrations) {
            r.display();
        }
    }

    static void updateRegistration() {

        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (CourseRegistration r : registrations) {

            if (r.studentId == id) {

                System.out.print("Enter New Name: ");
                r.studentName = sc.nextLine();

                System.out.print("Enter New Course: ");
                r.courseName = sc.nextLine();

                System.out.print("Enter New Semester: ");
                r.semester = sc.nextLine();

                System.out.println("Record Updated!");
                return;
            }
        }

        System.out.println("Record Not Found!");
    }

    static void deleteRegistration() {

        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();

        for (CourseRegistration r : registrations) {

            if (r.studentId == id) {

                registrations.remove(r);
                System.out.println("Record Deleted!");
                return;
            }
        }

        System.out.println("Record Not Found!");
    }

    static void searchRegistration() {

        System.out.print("Enter Student ID to Search: ");
        int id = sc.nextInt();

        for (CourseRegistration r : registrations) {

            if (r.studentId == id) {
                r.display();
                return;
            }
        }

        System.out.println("Record Not Found!");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Course Registration System =====");
            System.out.println("1. Add Registration");
            System.out.println("2. View Registrations");
            System.out.println("3. Update Registration");
            System.out.println("4. Delete Registration");
            System.out.println("5. Search Registration");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addRegistration();
                    break;

                case 2:
                    viewRegistrations();
                    break;

                case 3:
                    updateRegistration();
                    break;

                case 4:
                    deleteRegistration();
                    break;

                case 5:
                    searchRegistration();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
}
