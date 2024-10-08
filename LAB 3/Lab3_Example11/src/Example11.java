import java.util.ArrayList;
import java.util.List;

public class Example11 {
    class Student {
        String name;
        List<Course> courses;

        Student(String name) {
            this.name = name;
            this.courses = new ArrayList<>();
        }

        void EnrollInCourse(Course course) {
            courses.add(course);
        }

        public void show_courses() {
            for (Course course : courses) {
                System.out.println("Enrolled in: " + course.courseName);
            }
        }
    }

    class Course {
        String courseName;
        List<Student> students;

        Course(String courseName) {
            this.courseName = courseName;
            this.students = new ArrayList<>();
        }

        void addStudent(Student student) {
            students.add(student);
        }

        public void show_all_detail() {
            System.out.println("Course: " + courseName);
            for (Student student : students) {
                System.out.println("Student: " + student.name);
            }
        }
    }

    public static void main(String[] args) {
        Example11 example11 = new Example11();

        Student student1 = example11.new Student("Khizar");
        Student student2 = example11.new Student("Hassan");

        Course course1 = example11.new Course("AI");
        Course course2 = example11.new Course("SDC");


        student1.EnrollInCourse(course1);
        student2.EnrollInCourse(course2);


        student1.show_courses();
        student2.show_courses();


        course1.addStudent(student1);
        course2.addStudent(student2);


        course1.show_all_detail();
        course2.show_all_detail();
    }
}
